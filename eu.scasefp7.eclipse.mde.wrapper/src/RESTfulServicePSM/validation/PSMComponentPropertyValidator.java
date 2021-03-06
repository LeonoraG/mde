/**
 *
 * $Id$
 */
package RESTfulServicePSM.validation;

import RESTfulServicePSM.HibernateAnnotation;

import org.eclipse.emf.common.util.EList;

/**
 * A sample validator interface for {@link RESTfulServicePSM.PSMComponentProperty}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface PSMComponentPropertyValidator {
	boolean validate();

	boolean validatePropertyHasHibernateAnnotation(EList<HibernateAnnotation> value);
	boolean validateName(String value);
	boolean validateType(String value);
	boolean validateBIsUnique(boolean value);
	boolean validateBIsNamingProperty(boolean value);
	boolean validateBIsPrimaryIdentifier(boolean value);
}
