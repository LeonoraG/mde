/**
 */
package ServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JAXB Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.JAXBAnnotation#getJAXBAnnotationText <em>JAXB Annotation Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.ServicePSMPackage#getJAXBAnnotation()
 * @model
 * @generated
 */
public interface JAXBAnnotation extends EObject {
	/**
	 * Returns the value of the '<em><b>JAXB Annotation Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>JAXB Annotation Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>JAXB Annotation Text</em>' attribute.
	 * @see #setJAXBAnnotationText(String)
	 * @see ServicePSM.ServicePSMPackage#getJAXBAnnotation_JAXBAnnotationText()
	 * @model required="true"
	 * @generated
	 */
	String getJAXBAnnotationText();

	/**
	 * Sets the value of the '{@link ServicePSM.JAXBAnnotation#getJAXBAnnotationText <em>JAXB Annotation Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>JAXB Annotation Text</em>' attribute.
	 * @see #getJAXBAnnotationText()
	 * @generated
	 */
	void setJAXBAnnotationText(String value);

} // JAXBAnnotation
