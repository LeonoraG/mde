/**
 *
 * $Id$
 */
package ServicePSM.validation;

import ServicePSM.HTTPVerb;
import ServicePSM.JavaAlgoResourceController;
import ServicePSM.JavaResourceController;
import ServicePSM.JavaResourceControllerManager;
import ServicePSM.LinkType;

/**
 * A sample validator interface for {@link ServicePSM.PSMHypermediaLink}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PSMHypermediaLinkValidator {
	boolean validate();

	boolean validateHasTargetJavaAlgoController(JavaAlgoResourceController value);
	boolean validateHasTargetJavaRController(JavaResourceController value);
	boolean validateHasTargetRCManager(JavaResourceControllerManager value);
	boolean validateLinkHTTPVerb(HTTPVerb value);
	boolean validateLinkType(LinkType value);
}