/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Image;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.Rendering;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendering</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.RenderingImpl#getBase_Image <em>Base Image</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RenderingImpl extends BaseElementImpl implements Rendering {
	/**
	 * The cached value of the '{@link #getBase_Image() <em>Base Image</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Image()
	 * @generated
	 * @ordered
	 */
	protected Image base_Image;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getRendering();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image getBase_Image() {
		if (base_Image != null && base_Image.eIsProxy()) {
			InternalEObject oldBase_Image = (InternalEObject)base_Image;
			base_Image = (Image)eResolveProxy(oldBase_Image);
			if (base_Image != oldBase_Image) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.RENDERING__BASE_IMAGE, oldBase_Image, base_Image));
			}
		}
		return base_Image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Image basicGetBase_Image() {
		return base_Image;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Image(Image newBase_Image) {
		Image oldBase_Image = base_Image;
		base_Image = newBase_Image;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.RENDERING__BASE_IMAGE, oldBase_Image, base_Image));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.RENDERING__BASE_IMAGE:
				if (resolve) return getBase_Image();
				return basicGetBase_Image();
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
			case BpmnprofPackage.RENDERING__BASE_IMAGE:
				setBase_Image((Image)newValue);
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
			case BpmnprofPackage.RENDERING__BASE_IMAGE:
				setBase_Image((Image)null);
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
			case BpmnprofPackage.RENDERING__BASE_IMAGE:
				return base_Image != null;
		}
		return super.eIsSet(featureID);
	}

} //RenderingImpl
