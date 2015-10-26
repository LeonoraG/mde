/**
 */
package AnnotationLayerStack;

import AuthenticationLayerPSM.AnnotationModel;

import RESTfulServicePSM.ServicePSM;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation Stack</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link AnnotationLayerStack.AnnotationStack#getHasAuthenticationLayer <em>Has Authentication Layer</em>}</li>
 *   <li>{@link AnnotationLayerStack.AnnotationStack#isBHasAuthenticationAnnotation <em>BHas Authentication Annotation</em>}</li>
 *   <li>{@link AnnotationLayerStack.AnnotationStack#getHasCorePSM <em>Has Core PSM</em>}</li>
 *   <li>{@link AnnotationLayerStack.AnnotationStack#getHasSearchLayer <em>Has Search Layer</em>}</li>
 *   <li>{@link AnnotationLayerStack.AnnotationStack#isBHasSearchLayer <em>BHas Search Layer</em>}</li>
 *   <li>{@link AnnotationLayerStack.AnnotationStack#isBHasExternalServiceLayer <em>BHas External Service Layer</em>}</li>
 *   <li>{@link AnnotationLayerStack.AnnotationStack#getHasExternalServiceLayer <em>Has External Service Layer</em>}</li>
 * </ul>
 * </p>
 *
 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack()
 * @model
 * @generated
 */
public interface AnnotationStack extends EObject {
	/**
	 * Returns the value of the '<em><b>Has Authentication Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Authentication Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Authentication Layer</em>' reference.
	 * @see #setHasAuthenticationLayer(AnnotationModel)
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack_HasAuthenticationLayer()
	 * @model
	 * @generated
	 */
	AnnotationModel getHasAuthenticationLayer();

	/**
	 * Sets the value of the '{@link AnnotationLayerStack.AnnotationStack#getHasAuthenticationLayer <em>Has Authentication Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Authentication Layer</em>' reference.
	 * @see #getHasAuthenticationLayer()
	 * @generated
	 */
	void setHasAuthenticationLayer(AnnotationModel value);

	/**
	 * Returns the value of the '<em><b>BHas Authentication Annotation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BHas Authentication Annotation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BHas Authentication Annotation</em>' attribute.
	 * @see #setBHasAuthenticationAnnotation(boolean)
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack_BHasAuthenticationAnnotation()
	 * @model required="true"
	 * @generated
	 */
	boolean isBHasAuthenticationAnnotation();

	/**
	 * Sets the value of the '{@link AnnotationLayerStack.AnnotationStack#isBHasAuthenticationAnnotation <em>BHas Authentication Annotation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BHas Authentication Annotation</em>' attribute.
	 * @see #isBHasAuthenticationAnnotation()
	 * @generated
	 */
	void setBHasAuthenticationAnnotation(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Core PSM</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Core PSM</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Core PSM</em>' reference.
	 * @see #setHasCorePSM(ServicePSM)
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack_HasCorePSM()
	 * @model required="true"
	 * @generated
	 */
	ServicePSM getHasCorePSM();

	/**
	 * Sets the value of the '{@link AnnotationLayerStack.AnnotationStack#getHasCorePSM <em>Has Core PSM</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Core PSM</em>' reference.
	 * @see #getHasCorePSM()
	 * @generated
	 */
	void setHasCorePSM(ServicePSM value);

	/**
	 * Returns the value of the '<em><b>Has Search Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Search Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Search Layer</em>' reference.
	 * @see #setHasSearchLayer(SearchLayerPSM.AnnotationModel)
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack_HasSearchLayer()
	 * @model
	 * @generated
	 */
	SearchLayerPSM.AnnotationModel getHasSearchLayer();

	/**
	 * Sets the value of the '{@link AnnotationLayerStack.AnnotationStack#getHasSearchLayer <em>Has Search Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Search Layer</em>' reference.
	 * @see #getHasSearchLayer()
	 * @generated
	 */
	void setHasSearchLayer(SearchLayerPSM.AnnotationModel value);

	/**
	 * Returns the value of the '<em><b>BHas Search Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BHas Search Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BHas Search Layer</em>' attribute.
	 * @see #setBHasSearchLayer(boolean)
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack_BHasSearchLayer()
	 * @model required="true"
	 * @generated
	 */
	boolean isBHasSearchLayer();

	/**
	 * Sets the value of the '{@link AnnotationLayerStack.AnnotationStack#isBHasSearchLayer <em>BHas Search Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BHas Search Layer</em>' attribute.
	 * @see #isBHasSearchLayer()
	 * @generated
	 */
	void setBHasSearchLayer(boolean value);

	/**
	 * Returns the value of the '<em><b>BHas External Service Layer</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>BHas External Service Layer</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>BHas External Service Layer</em>' attribute.
	 * @see #setBHasExternalServiceLayer(boolean)
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack_BHasExternalServiceLayer()
	 * @model required="true"
	 * @generated
	 */
	boolean isBHasExternalServiceLayer();

	/**
	 * Sets the value of the '{@link AnnotationLayerStack.AnnotationStack#isBHasExternalServiceLayer <em>BHas External Service Layer</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BHas External Service Layer</em>' attribute.
	 * @see #isBHasExternalServiceLayer()
	 * @generated
	 */
	void setBHasExternalServiceLayer(boolean value);

	/**
	 * Returns the value of the '<em><b>Has External Service Layer</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has External Service Layer</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has External Service Layer</em>' reference.
	 * @see #setHasExternalServiceLayer(ExternalServiceLayerPSM.AnnotationModel)
	 * @see AnnotationLayerStack.AnnotationLayerStackPackage#getAnnotationStack_HasExternalServiceLayer()
	 * @model
	 * @generated
	 */
	ExternalServiceLayerPSM.AnnotationModel getHasExternalServiceLayer();

	/**
	 * Sets the value of the '{@link AnnotationLayerStack.AnnotationStack#getHasExternalServiceLayer <em>Has External Service Layer</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has External Service Layer</em>' reference.
	 * @see #getHasExternalServiceLayer()
	 * @generated
	 */
	void setHasExternalServiceLayer(ExternalServiceLayerPSM.AnnotationModel value);

} // AnnotationStack
