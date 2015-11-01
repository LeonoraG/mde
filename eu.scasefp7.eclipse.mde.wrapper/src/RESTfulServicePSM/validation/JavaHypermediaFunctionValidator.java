/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.PSMHypermediaLink;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link RESTfulServicePSM.JavaHypermediaFunction}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface JavaHypermediaFunctionValidator {
	boolean validate();

	boolean validateHasPSMHypermediaLink(EList<PSMHypermediaLink> value);
}