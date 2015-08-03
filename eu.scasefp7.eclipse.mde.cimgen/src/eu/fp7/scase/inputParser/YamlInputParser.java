/*
 * ARISTOSTLE UNIVERSITY OF THESSALONIKI
 * Copyright (C) 2014
 * Aristotle University of Thessaloniki
 * Department of Electrical & Computer Engineering
 * Division of Electronics & Computer Engineering
 * Intelligent Systems & Software Engineering Lab
 *
 * Project             : S-CASE
 * WorkFile            : 
 * Compiler            : 
 * File Description    :
 * Document Description:
* Related Documents	   :
* Note				   :
* Programmer		   : Christoforos Zolotas
* Contact			   : christopherzolotas@issel.ee.auth.gr
*/

package eu.fp7.scase.inputParser;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.yaml.snakeyaml.Yaml;

public class YamlInputParser {

	private String strYamlFilePath;
	private Yaml   oYamlHandler;
	private InputStream oInputStreamHandler;
	private ArrayList<YamlResource> listOfYamlResources;
	private static MessageConsole myConsole = findConsole("SCASE-UI");
	private static MessageConsoleStream out = myConsole.newMessageStream();
	
	public YamlInputParser(String strYamlFilePath){
		
		this.strYamlFilePath = strYamlFilePath;
		this.listOfYamlResources = new ArrayList<YamlResource>();
		oYamlHandler = new Yaml();
		try {
			oInputStreamHandler = new FileInputStream(new File(strYamlFilePath));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public ArrayList<YamlResource> parseYamlInputFile(){
		
		this.listOfYamlResources = (ArrayList<YamlResource>) oYamlHandler.load(oInputStreamHandler);
		for( YamlResource oYamlResource : listOfYamlResources){
			out.println(oYamlResource + "\n");
		}
		return this.listOfYamlResources;
	}

	private static MessageConsole findConsole(String name) {
		ConsolePlugin plugin = ConsolePlugin.getDefault();
		IConsoleManager conMan = plugin.getConsoleManager();
		IConsole[] existing = conMan.getConsoles();
		for (int i = 0; i < existing.length; i++){
		    if (name.equals(existing[i].getName())){
		    	return (MessageConsole) existing[i];
		    }
		}
		//no console found, so create a new one
		MessageConsole myConsole = new MessageConsole(name, null);
		conMan.addConsoles(new IConsole[]{myConsole});
		return myConsole;
	}
}