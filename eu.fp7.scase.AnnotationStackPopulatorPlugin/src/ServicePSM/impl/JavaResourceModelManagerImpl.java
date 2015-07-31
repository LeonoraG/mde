/**
 */
package ServicePSM.impl;

import ServicePSM.JAXBAnnotation;
import ServicePSM.JavaGetterFunction;
import ServicePSM.JavaResourceModel;
import ServicePSM.JavaResourceModelManager;
import ServicePSM.JavaSetterFunction;
import ServicePSM.PSMComponentProperty;
import ServicePSM.ServicePSMPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Java Resource Model Manager</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link ServicePSM.impl.JavaResourceModelManagerImpl#getJavaRMManagerHasJAXBAnnotation <em>Java RM Manager Has JAXB Annotation</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaResourceModelManagerImpl#getJavaRMManagerHasProperty <em>Java RM Manager Has Property</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaResourceModelManagerImpl#getHasRelatedJavaRModel <em>Has Related Java RModel</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaResourceModelManagerImpl#getJavaRMManagerHasSetter <em>Java RM Manager Has Setter</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaResourceModelManagerImpl#getJavaRMManagerHasGetter <em>Java RM Manager Has Getter</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaResourceModelManagerImpl#getName <em>Name</em>}</li>
 *   <li>{@link ServicePSM.impl.JavaResourceModelManagerImpl#getParentName <em>Parent Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class JavaResourceModelManagerImpl extends MinimalEObjectImpl.Container implements JavaResourceModelManager {
	/**
	 * The cached value of the '{@link #getJavaRMManagerHasJAXBAnnotation() <em>Java RM Manager Has JAXB Annotation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRMManagerHasJAXBAnnotation()
	 * @generated
	 * @ordered
	 */
	protected JAXBAnnotation javaRMManagerHasJAXBAnnotation;

	/**
	 * The cached value of the '{@link #getJavaRMManagerHasProperty() <em>Java RM Manager Has Property</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRMManagerHasProperty()
	 * @generated
	 * @ordered
	 */
	protected PSMComponentProperty javaRMManagerHasProperty;

	/**
	 * The cached value of the '{@link #getHasRelatedJavaRModel() <em>Has Related Java RModel</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHasRelatedJavaRModel()
	 * @generated
	 * @ordered
	 */
	protected JavaResourceModel hasRelatedJavaRModel;

	/**
	 * The cached value of the '{@link #getJavaRMManagerHasSetter() <em>Java RM Manager Has Setter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRMManagerHasSetter()
	 * @generated
	 * @ordered
	 */
	protected JavaSetterFunction javaRMManagerHasSetter;

	/**
	 * The cached value of the '{@link #getJavaRMManagerHasGetter() <em>Java RM Manager Has Getter</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJavaRMManagerHasGetter()
	 * @generated
	 * @ordered
	 */
	protected JavaGetterFunction javaRMManagerHasGetter;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARENT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParentName() <em>Parent Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParentName()
	 * @generated
	 * @ordered
	 */
	protected String parentName = PARENT_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected JavaResourceModelManagerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ServicePSMPackage.Literals.JAVA_RESOURCE_MODEL_MANAGER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JAXBAnnotation getJavaRMManagerHasJAXBAnnotation() {
		return javaRMManagerHasJAXBAnnotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaRMManagerHasJAXBAnnotation(JAXBAnnotation newJavaRMManagerHasJAXBAnnotation, NotificationChain msgs) {
		JAXBAnnotation oldJavaRMManagerHasJAXBAnnotation = javaRMManagerHasJAXBAnnotation;
		javaRMManagerHasJAXBAnnotation = newJavaRMManagerHasJAXBAnnotation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION, oldJavaRMManagerHasJAXBAnnotation, newJavaRMManagerHasJAXBAnnotation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaRMManagerHasJAXBAnnotation(JAXBAnnotation newJavaRMManagerHasJAXBAnnotation) {
		if (newJavaRMManagerHasJAXBAnnotation != javaRMManagerHasJAXBAnnotation) {
			NotificationChain msgs = null;
			if (javaRMManagerHasJAXBAnnotation != null)
				msgs = ((InternalEObject)javaRMManagerHasJAXBAnnotation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION, null, msgs);
			if (newJavaRMManagerHasJAXBAnnotation != null)
				msgs = ((InternalEObject)newJavaRMManagerHasJAXBAnnotation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION, null, msgs);
			msgs = basicSetJavaRMManagerHasJAXBAnnotation(newJavaRMManagerHasJAXBAnnotation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION, newJavaRMManagerHasJAXBAnnotation, newJavaRMManagerHasJAXBAnnotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PSMComponentProperty getJavaRMManagerHasProperty() {
		return javaRMManagerHasProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaRMManagerHasProperty(PSMComponentProperty newJavaRMManagerHasProperty, NotificationChain msgs) {
		PSMComponentProperty oldJavaRMManagerHasProperty = javaRMManagerHasProperty;
		javaRMManagerHasProperty = newJavaRMManagerHasProperty;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY, oldJavaRMManagerHasProperty, newJavaRMManagerHasProperty);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaRMManagerHasProperty(PSMComponentProperty newJavaRMManagerHasProperty) {
		if (newJavaRMManagerHasProperty != javaRMManagerHasProperty) {
			NotificationChain msgs = null;
			if (javaRMManagerHasProperty != null)
				msgs = ((InternalEObject)javaRMManagerHasProperty).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY, null, msgs);
			if (newJavaRMManagerHasProperty != null)
				msgs = ((InternalEObject)newJavaRMManagerHasProperty).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY, null, msgs);
			msgs = basicSetJavaRMManagerHasProperty(newJavaRMManagerHasProperty, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY, newJavaRMManagerHasProperty, newJavaRMManagerHasProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel getHasRelatedJavaRModel() {
		if (hasRelatedJavaRModel != null && hasRelatedJavaRModel.eIsProxy()) {
			InternalEObject oldHasRelatedJavaRModel = (InternalEObject)hasRelatedJavaRModel;
			hasRelatedJavaRModel = (JavaResourceModel)eResolveProxy(oldHasRelatedJavaRModel);
			if (hasRelatedJavaRModel != oldHasRelatedJavaRModel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL, oldHasRelatedJavaRModel, hasRelatedJavaRModel));
			}
		}
		return hasRelatedJavaRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaResourceModel basicGetHasRelatedJavaRModel() {
		return hasRelatedJavaRModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasRelatedJavaRModel(JavaResourceModel newHasRelatedJavaRModel) {
		JavaResourceModel oldHasRelatedJavaRModel = hasRelatedJavaRModel;
		hasRelatedJavaRModel = newHasRelatedJavaRModel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL, oldHasRelatedJavaRModel, hasRelatedJavaRModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaSetterFunction getJavaRMManagerHasSetter() {
		return javaRMManagerHasSetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaRMManagerHasSetter(JavaSetterFunction newJavaRMManagerHasSetter, NotificationChain msgs) {
		JavaSetterFunction oldJavaRMManagerHasSetter = javaRMManagerHasSetter;
		javaRMManagerHasSetter = newJavaRMManagerHasSetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER, oldJavaRMManagerHasSetter, newJavaRMManagerHasSetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaRMManagerHasSetter(JavaSetterFunction newJavaRMManagerHasSetter) {
		if (newJavaRMManagerHasSetter != javaRMManagerHasSetter) {
			NotificationChain msgs = null;
			if (javaRMManagerHasSetter != null)
				msgs = ((InternalEObject)javaRMManagerHasSetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER, null, msgs);
			if (newJavaRMManagerHasSetter != null)
				msgs = ((InternalEObject)newJavaRMManagerHasSetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER, null, msgs);
			msgs = basicSetJavaRMManagerHasSetter(newJavaRMManagerHasSetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER, newJavaRMManagerHasSetter, newJavaRMManagerHasSetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JavaGetterFunction getJavaRMManagerHasGetter() {
		return javaRMManagerHasGetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJavaRMManagerHasGetter(JavaGetterFunction newJavaRMManagerHasGetter, NotificationChain msgs) {
		JavaGetterFunction oldJavaRMManagerHasGetter = javaRMManagerHasGetter;
		javaRMManagerHasGetter = newJavaRMManagerHasGetter;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER, oldJavaRMManagerHasGetter, newJavaRMManagerHasGetter);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJavaRMManagerHasGetter(JavaGetterFunction newJavaRMManagerHasGetter) {
		if (newJavaRMManagerHasGetter != javaRMManagerHasGetter) {
			NotificationChain msgs = null;
			if (javaRMManagerHasGetter != null)
				msgs = ((InternalEObject)javaRMManagerHasGetter).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER, null, msgs);
			if (newJavaRMManagerHasGetter != null)
				msgs = ((InternalEObject)newJavaRMManagerHasGetter).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER, null, msgs);
			msgs = basicSetJavaRMManagerHasGetter(newJavaRMManagerHasGetter, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER, newJavaRMManagerHasGetter, newJavaRMManagerHasGetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getParentName() {
		return parentName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentName(String newParentName) {
		String oldParentName = parentName;
		parentName = newParentName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME, oldParentName, parentName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION:
				return basicSetJavaRMManagerHasJAXBAnnotation(null, msgs);
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY:
				return basicSetJavaRMManagerHasProperty(null, msgs);
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER:
				return basicSetJavaRMManagerHasSetter(null, msgs);
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER:
				return basicSetJavaRMManagerHasGetter(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION:
				return getJavaRMManagerHasJAXBAnnotation();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY:
				return getJavaRMManagerHasProperty();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL:
				if (resolve) return getHasRelatedJavaRModel();
				return basicGetHasRelatedJavaRModel();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER:
				return getJavaRMManagerHasSetter();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER:
				return getJavaRMManagerHasGetter();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__NAME:
				return getName();
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				return getParentName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION:
				setJavaRMManagerHasJAXBAnnotation((JAXBAnnotation)newValue);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY:
				setJavaRMManagerHasProperty((PSMComponentProperty)newValue);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL:
				setHasRelatedJavaRModel((JavaResourceModel)newValue);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER:
				setJavaRMManagerHasSetter((JavaSetterFunction)newValue);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER:
				setJavaRMManagerHasGetter((JavaGetterFunction)newValue);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__NAME:
				setName((String)newValue);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				setParentName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION:
				setJavaRMManagerHasJAXBAnnotation((JAXBAnnotation)null);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY:
				setJavaRMManagerHasProperty((PSMComponentProperty)null);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL:
				setHasRelatedJavaRModel((JavaResourceModel)null);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER:
				setJavaRMManagerHasSetter((JavaSetterFunction)null);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER:
				setJavaRMManagerHasGetter((JavaGetterFunction)null);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				setParentName(PARENT_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_JAXB_ANNOTATION:
				return javaRMManagerHasJAXBAnnotation != null;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_PROPERTY:
				return javaRMManagerHasProperty != null;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__HAS_RELATED_JAVA_RMODEL:
				return hasRelatedJavaRModel != null;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_SETTER:
				return javaRMManagerHasSetter != null;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__JAVA_RM_MANAGER_HAS_GETTER:
				return javaRMManagerHasGetter != null;
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ServicePSMPackage.JAVA_RESOURCE_MODEL_MANAGER__PARENT_NAME:
				return PARENT_NAME_EDEFAULT == null ? parentName != null : !PARENT_NAME_EDEFAULT.equals(parentName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", parentName: ");
		result.append(parentName);
		result.append(')');
		return result.toString();
	}

} //JavaResourceModelManagerImpl
