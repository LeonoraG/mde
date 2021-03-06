/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.JAXBAnnotation;
import RESTfulServicePSM.JavaAlgoResourceModel;
import RESTfulServicePSM.JavaGetterFunction;
import RESTfulServicePSM.JavaSetterFunction;
import RESTfulServicePSM.PSMComponentProperty;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link RESTfulServicePSM.JavaAlgoResourceModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaAlgoResourceModelValidator {
	boolean validate();

	boolean validateJavaAlgoModelHasJAXBAnnotation(JAXBAnnotation value);
	boolean validateJavaAlgoModelHasProperty(PSMComponentProperty value);
	boolean validateJavaAlgoModelHasSetterFunction(JavaSetterFunction value);
	boolean validateJavaAlgoModelHasGetterFunction(JavaGetterFunction value);
	boolean validateName(String value);
	boolean validateParentName(String value);
	boolean validateHasRelatedAlgoModel(EList<JavaAlgoResourceModel> value);
	boolean validateIsRelatedAlgoModel(EList<JavaAlgoResourceModel> value);
}
