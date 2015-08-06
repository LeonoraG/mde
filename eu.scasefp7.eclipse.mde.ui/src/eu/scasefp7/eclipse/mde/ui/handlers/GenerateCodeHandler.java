/**
 * Copyright 2015 S-CASE Consortium
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package eu.scasefp7.eclipse.mde.ui.handlers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.Command;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.commands.IParameter;
import org.eclipse.core.commands.NotEnabledException;
import org.eclipse.core.commands.NotHandledException;
import org.eclipse.core.commands.Parameterization;
import org.eclipse.core.commands.ParameterizedCommand;
import org.eclipse.core.commands.common.NotDefinedException;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.ProjectScope;
import org.eclipse.core.resources.WorkspaceJob;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.IScopeContext;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.commands.ICommandService;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.ui.handlers.IHandlerService;
import org.eclipse.ui.preferences.ScopedPreferenceStore;
import org.eclipse.ui.progress.WorkbenchJob;
import org.eclipse.ui.services.IServiceLocator;

import eu.scasefp7.eclipse.mde.ui.Activator;
import eu.scasefp7.eclipse.mde.ui.preferences.PreferenceConstants;

/**
 * @author emaorli
 *
 */
public class GenerateCodeHandler extends AbstractHandler {

    // Command IDs
    public static final String CMD_CIMGEN = "eu.scasefp7.eclipse.mde.cimgen.commands.CIMGeneratorCommand";
    public static final String CMD_M2M = "eu.scasefp7.eclipse.mde.m2m.commands.ExecuteModelToModelTransformations";
    public static final String CMD_ANN = "AnnotationStackPopulator.commands.PopulateAnnotationStack";
    public static final String CMD_M2T = "eu.scasefp7.eclipse.mde.m2t.commands.executeModelToTextTransformation";
    
    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {

        // Get the currently selected project
        IResource resource = extractSelection(HandlerUtil.getCurrentSelection(event));
        if(resource == null) {
            return null;
        }
        
        IProject project = resource.getProject();
        if(project == null) {
            return null;
        }
        
        // Get the preferences
        Map<String, String> mdePreferences = getCoreMDEPreferences(project);

        // Roll the commands
        IServiceLocator serviceLocator = PlatformUI.getWorkbench();
        ICommandService commandService = (ICommandService) serviceLocator.getService(ICommandService.class);
        IHandlerService handlerService = (IHandlerService) serviceLocator.getService(IHandlerService.class);

        try {
            Command commandCIM = commandService.getCommand(CMD_CIMGEN);
            Command commandM2M = commandService.getCommand(CMD_M2M);
            Command commandANN = commandService.getCommand(CMD_ANN);
            Command commandM2T = commandService.getCommand(CMD_M2T);

            ArrayList<Parameterization> params = new ArrayList<Parameterization>();
            for(Map.Entry<String, String> entry : mdePreferences.entrySet()) {
                IParameter p = commandCIM.getParameter(entry.getKey());
                if(p != null) {
                    Parameterization param = new Parameterization(p, entry.getValue());
                    params.add(param);
                } else {
                    System.out.println("Cannot find parameter: " + entry.getKey() + " of command " + commandCIM);
                }
            }
            
            ParameterizedCommand parametrizedCommandCIM = new ParameterizedCommand(commandCIM, params.toArray(new Parameterization[params.size()]));
            ParameterizedCommand parametrizedCommandM2M = new ParameterizedCommand(commandM2M, params.toArray(new Parameterization[params.size()]));
            ParameterizedCommand parametrizedCommandANN = new ParameterizedCommand(commandANN, params.toArray(new Parameterization[params.size()]));
            ParameterizedCommand parametrizedCommandM2T = new ParameterizedCommand(commandM2T, params.toArray(new Parameterization[params.size()]));

            WorkspaceJob job = new WorkspaceJob("Generating code for " + mdePreferences.get("WebServiceName")) { //TODO
                @Override
                public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                    monitor.beginTask(this.getName(), 4);
                    
                    // Setup CIM job
                    Job jCim = new WorkbenchJob("Generating CIM") {
                        @Override
                        public IStatus runInUIThread(IProgressMonitor monitor) {
                            monitor.beginTask("Preparing the specification", 1);
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandCIM, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                e.printStackTrace();
                                return errorStatus(e);
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };                        
                                            
                    // Setup M2M job
                    Job jM2M = new WorkspaceJob("Generating models") {                            
                        @Override
                        public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                            monitor.beginTask("Preparing the models", 1);
                    
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandM2M, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                e.printStackTrace();
                                return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to generate models.", e);
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };
                    
                    // Setup annotations job
                    Job jAnn = new WorkspaceJob("Generating annotations") {                            
                        @Override
                        public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                            monitor.beginTask("Preparing the annotations", 1);
                            
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandANN, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                e.printStackTrace();
                                return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to generate annotations.", e);
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };
                                            
                    // Setup annotations job
                    Job jM2T = new WorkspaceJob("Generating code") {                            
                        @Override
                        public IStatus runInWorkspace(IProgressMonitor monitor) throws CoreException {
                            monitor.beginTask("Preparing code generation", 1);
                            
                            if(monitor.isCanceled()) {
                                return Status.CANCEL_STATUS;
                            }
                            
                            try {
                                handlerService.executeCommand(parametrizedCommandM2T, null);
                            } catch (ExecutionException | NotDefinedException | NotEnabledException | NotHandledException e) {
                                e.printStackTrace();
                                return new Status(Status.ERROR, Activator.PLUGIN_ID, "Failed to generate code.", e);
                            } finally {
                                monitor.done();
                            }
                            return Status.OK_STATUS;
                        }  
                    };

                    IProgressMonitor pm = Job.getJobManager().createProgressGroup();
                    try {
                        pm.beginTask("Generating code for " + mdePreferences.get("WebServiceName"), 402);
                        pm.worked(1);
                        
                        jCim.setRule(project);
                        jCim.setProgressGroup(pm, 100);
                        jCim.schedule();                        

                        jM2M.setRule(project);
                        jM2M.setProgressGroup(pm, 100);
                        jM2M.schedule();                        

                        jAnn.setRule(project);
                        jAnn.setProgressGroup(pm, 100);
                        jAnn.schedule();                        

                        jM2T.setRule(project);
                        jM2T.setProgressGroup(pm, 100);
                        jM2T.schedule();                        

                        jCim.join();
                        monitor.worked(1);
                        jM2M.join();
                        monitor.worked(1);
                        jAnn.join();
                        monitor.worked(1);
                        jM2T.join();
                        monitor.worked(1);
                        
                        pm.worked(1);
                    } catch(InterruptedException e) {
                        return Status.CANCEL_STATUS;
                    } finally {
                        pm.done();
                    }
                    
                    monitor.done();
                    return Status.OK_STATUS;                        
                }
            };

            job.schedule();

        } catch (NotDefinedException e) {
            e.printStackTrace();
        }
        
        return null;
    }
    
    /**
     * Get the resource from the current selection.
     * @param selection
     * @return selected IResource
     */
    private IResource extractSelection(ISelection sel) {
        if (sel instanceof IStructuredSelection) {
            IStructuredSelection ss = (IStructuredSelection) sel;
            Object element = ss.getFirstElement();
            if (element instanceof IResource) {
               return (IResource) element;
            }
            if (element instanceof IAdaptable) {  
                IAdaptable adaptable = (IAdaptable)element;
                IResource adapter = (IResource) adaptable.getAdapter(IResource.class);
        
                return adapter;
            }
        }
        return null;
    }
    
    private IPreferenceStore getPreferenceStore(IProject project) {
        // Get a preference store with the search path project, instance
        ProjectScope ps = new ProjectScope(project);
        ScopedPreferenceStore scoped = new ScopedPreferenceStore(ps, Activator.PLUGIN_ID);
        scoped.setSearchContexts(new IScopeContext[] { ps, InstanceScope.INSTANCE });
        
        return scoped;
    }
    
    private Map<String, String> getCoreMDEPreferences(IProject project) {

        IPreferenceStore store = getPreferenceStore(project);
        Map<String, String> mapMDEPreferences = new HashMap<String, String>();

        // Get preferences
        String yamlFilePath = project.getFile(store.getString(PreferenceConstants.P_INPUT_FILE)).getLocation().toString();
        String wsName = store.getString(PreferenceConstants.P_SERVICE_NAME);
        String outputFolder = store.getString(PreferenceConstants.P_OUTPUT_PATH);
        String dbAddress = store.getString(PreferenceConstants.P_DATABASE_ADDRESS);
        String dbPort = store.getString(PreferenceConstants.P_DATABASE_PORT);
        String dbUsername = store.getString(PreferenceConstants.P_DATABASE_USER);
        String dbPassword = store.getString(PreferenceConstants.P_DATABASE_PASSWORD);
        String authentication = (store.getBoolean(PreferenceConstants.P_FACET_BASIC_AUTHENTICATION) ? "yes" : "no");
        String authorization = (store.getBoolean(PreferenceConstants.P_FACET_ABAC_AUTHORIZATION) ? "yes" : "no");
        String searching = (store.getBoolean(PreferenceConstants.P_FACET_SEARCH) ? "yes" : "no");
        String extComposition = (store.getBoolean(PreferenceConstants.P_FACET_EXT_COMPOSITIONS) ? "yes" : "no");
        
        mapMDEPreferences.put("YamlFilePath", yamlFilePath); // TODO replace with parameters read from commands
        mapMDEPreferences.put("WebServiceName", wsName);
        mapMDEPreferences.put("MDEOutputFolder", outputFolder);
        mapMDEPreferences.put("DatabaseIP", dbAddress);
        mapMDEPreferences.put("DatabasePort", dbPort);
        mapMDEPreferences.put("DatabaseUsername", dbUsername);
        mapMDEPreferences.put("DatabasePassword", dbPassword);
        mapMDEPreferences.put("Authentication", authentication);
        mapMDEPreferences.put("Authorization", authorization);
        mapMDEPreferences.put("DatabaseSearching", searching);
        mapMDEPreferences.put("ExternalComposition", extComposition);
        
        return mapMDEPreferences;
    }
    
}