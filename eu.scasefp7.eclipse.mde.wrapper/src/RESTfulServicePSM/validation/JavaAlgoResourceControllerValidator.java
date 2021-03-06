/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.HTTPActivity;
import RESTfulServicePSM.JAXRSAnnotation;
import RESTfulServicePSM.JavaAlgoResourceModel;

/**
 * A sample validator interface for {@link RESTfulServicePSM.JavaAlgoResourceController}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaAlgoResourceControllerValidator {
	boolean validate();

	boolean validateHasAssociatedAlgoModel(JavaAlgoResourceModel value);
	boolean validateJavaAlgoRControllerHasHTTPActivity(HTTPActivity value);
	boolean validateName(String value);
	boolean validateControllerURI(String value);
	boolean validateParentName(String value);
	boolean validateAlgoControllerHasJAXRSAnnotation(JAXRSAnnotation value);
}
