/**
 */
package ServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link ServicePSM.FunctionParameter#getName <em>Name</em>}</li>
 *   <li>{@link ServicePSM.FunctionParameter#getType <em>Type</em>}</li>
 *   <li>{@link ServicePSM.FunctionParameter#isBIsUnique <em>BIs Unique</em>}</li>
 *   <li>{@link ServicePSM.FunctionParameter#isBIsReturnParameter <em>BIs Return Parameter</em>}</li>
 * </ul>
 * </p>
 *
 * @see ServicePSM.ServicePSMPackage#getFunctionParameter()
 * @model
 * @generated
 */
public interface FunctionParameter extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see ServicePSM.ServicePSMPackage#getFunctionParameter_Name()
	 * @model required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link ServicePSM.FunctionParameter#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see ServicePSM.ServicePSMPackage#getFunctionParameter_Type()
	 * @model required="true"
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link ServicePSM.FunctionParameter#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

	/**
	 * Returns the value of the '<em><b>BIs Unique</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Unique</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Unique</em>' attribute.
	 * @see #setBIsUnique(boolean)
	 * @see ServicePSM.ServicePSMPackage#getFunctionParameter_BIsUnique()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsUnique();

	/**
	 * Sets the value of the '{@link ServicePSM.FunctionParameter#isBIsUnique <em>BIs Unique</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Unique</em>' attribute.
	 * @see #isBIsUnique()
	 * @generated
	 */
	void setBIsUnique(boolean value);

	/**
	 * Returns the value of the '<em><b>BIs Return Parameter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BIs Return Parameter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BIs Return Parameter</em>' attribute.
	 * @see #setBIsReturnParameter(boolean)
	 * @see ServicePSM.ServicePSMPackage#getFunctionParameter_BIsReturnParameter()
	 * @model required="true"
	 * @generated
	 */
	boolean isBIsReturnParameter();

	/**
	 * Sets the value of the '{@link ServicePSM.FunctionParameter#isBIsReturnParameter <em>BIs Return Parameter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BIs Return Parameter</em>' attribute.
	 * @see #isBIsReturnParameter()
	 * @generated
	 */
	void setBIsReturnParameter(boolean value);

} // FunctionParameter
