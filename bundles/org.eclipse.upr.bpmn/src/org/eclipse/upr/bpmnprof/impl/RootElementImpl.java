/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.PackageableElement;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.Definitions;
import org.eclipse.upr.bpmnprof.RootElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Root Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.RootElementImpl#getBase_PackageableElement <em>Base Packageable Element</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.RootElementImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RootElementImpl extends BaseElementImpl implements RootElement {
	/**
	 * The cached value of the '{@link #getBase_PackageableElement() <em>Base Packageable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_PackageableElement()
	 * @generated
	 * @ordered
	 */
	protected PackageableElement base_PackageableElement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RootElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getRootElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement getBase_PackageableElement() {
		if (base_PackageableElement != null && base_PackageableElement.eIsProxy()) {
			InternalEObject oldBase_PackageableElement = (InternalEObject)base_PackageableElement;
			base_PackageableElement = (PackageableElement)eResolveProxy(oldBase_PackageableElement);
			if (base_PackageableElement != oldBase_PackageableElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.ROOT_ELEMENT__BASE_PACKAGEABLE_ELEMENT, oldBase_PackageableElement, base_PackageableElement));
			}
		}
		return base_PackageableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PackageableElement basicGetBase_PackageableElement() {
		return base_PackageableElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_PackageableElement(PackageableElement newBase_PackageableElement) {
		PackageableElement oldBase_PackageableElement = base_PackageableElement;
		base_PackageableElement = newBase_PackageableElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.ROOT_ELEMENT__BASE_PACKAGEABLE_ELEMENT, oldBase_PackageableElement, base_PackageableElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions getDefinition() {
		Definitions definition = basicGetDefinition();
		return definition != null && definition.eIsProxy() ? (Definitions)eResolveProxy((InternalEObject)definition) : definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Definitions basicGetDefinition() {
		// TODO: implement this method to return the 'Definition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(Definitions newDefinition) {
		// TODO: implement this method to set the 'Definition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.ROOT_ELEMENT__BASE_PACKAGEABLE_ELEMENT:
				if (resolve) return getBase_PackageableElement();
				return basicGetBase_PackageableElement();
			case BpmnprofPackage.ROOT_ELEMENT__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case BpmnprofPackage.ROOT_ELEMENT__BASE_PACKAGEABLE_ELEMENT:
				setBase_PackageableElement((PackageableElement)newValue);
				return;
			case BpmnprofPackage.ROOT_ELEMENT__DEFINITION:
				setDefinition((Definitions)newValue);
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
			case BpmnprofPackage.ROOT_ELEMENT__BASE_PACKAGEABLE_ELEMENT:
				setBase_PackageableElement((PackageableElement)null);
				return;
			case BpmnprofPackage.ROOT_ELEMENT__DEFINITION:
				setDefinition((Definitions)null);
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
			case BpmnprofPackage.ROOT_ELEMENT__BASE_PACKAGEABLE_ELEMENT:
				return base_PackageableElement != null;
			case BpmnprofPackage.ROOT_ELEMENT__DEFINITION:
				return basicGetDefinition() != null;
		}
		return super.eIsSet(featureID);
	}

} //RootElementImpl
