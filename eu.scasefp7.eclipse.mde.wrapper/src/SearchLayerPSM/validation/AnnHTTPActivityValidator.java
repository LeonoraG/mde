/**
 *
 * $Id$
 */
package SearchLayerPSM.validation;

import RESTfulServicePSM.HTTPActivity;

/**
 * A sample validator interface for {@link SearchLayerPSM.AnnHTTPActivity}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AnnHTTPActivityValidator {
	boolean validate();

	boolean validateAnnotatesHTTPActivity(HTTPActivity value);
}
