/**
 *
 * $Id$
 */
package ExternalServiceLayerPSM.validation;

import ExternalServiceLayerPSM.AnnJavaAlgoModel;
import ExternalServiceLayerPSM.JavaInputDataModel;
import ExternalServiceLayerPSM.JavaOutputDataModel;

/**
 * A sample validator interface for {@link ExternalServiceLayerPSM.JavaRESTClientModel}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaRESTClientModelValidator {
	boolean validate();

	boolean validateHasJavaInputModel(JavaInputDataModel value);
	boolean validateHasJavaOutputModel(JavaOutputDataModel value);
	boolean validateIsJavaRESTClientModel(AnnJavaAlgoModel value);
}
