/**
 *
 * $Id$
 */
package AuthenticationLayerPSM.validation;

import RESTfulServicePSM.HTTPActivityHandler;

/**
 * A sample validator interface for {@link AuthenticationLayerPSM.AnnHTTPActivityHandler}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface AnnHTTPActivityHandlerValidator {
	boolean validate();

	boolean validateAnnotatesHTTPActivityHandler(HTTPActivityHandler value);
}
