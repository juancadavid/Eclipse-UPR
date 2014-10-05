/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.OpaqueExpression;

import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNExpressionImpl#getBase_OpaqueExpression <em>Base Opaque Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNExpressionImpl extends BaseElementImpl implements BPMNExpression {
	/**
	 * The cached value of the '{@link #getBase_OpaqueExpression() <em>Base Opaque Expression</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_OpaqueExpression()
	 * @generated
	 * @ordered
	 */
	protected OpaqueExpression base_OpaqueExpression;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getBPMNExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression getBase_OpaqueExpression() {
		if (base_OpaqueExpression != null && base_OpaqueExpression.eIsProxy()) {
			InternalEObject oldBase_OpaqueExpression = (InternalEObject)base_OpaqueExpression;
			base_OpaqueExpression = (OpaqueExpression)eResolveProxy(oldBase_OpaqueExpression);
			if (base_OpaqueExpression != oldBase_OpaqueExpression) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_EXPRESSION__BASE_OPAQUE_EXPRESSION, oldBase_OpaqueExpression, base_OpaqueExpression));
			}
		}
		return base_OpaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueExpression basicGetBase_OpaqueExpression() {
		return base_OpaqueExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_OpaqueExpression(OpaqueExpression newBase_OpaqueExpression) {
		OpaqueExpression oldBase_OpaqueExpression = base_OpaqueExpression;
		base_OpaqueExpression = newBase_OpaqueExpression;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_EXPRESSION__BASE_OPAQUE_EXPRESSION, oldBase_OpaqueExpression, base_OpaqueExpression));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_EXPRESSION__BASE_OPAQUE_EXPRESSION:
				if (resolve) return getBase_OpaqueExpression();
				return basicGetBase_OpaqueExpression();
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
			case BpmnprofPackage.BPMN_EXPRESSION__BASE_OPAQUE_EXPRESSION:
				setBase_OpaqueExpression((OpaqueExpression)newValue);
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
			case BpmnprofPackage.BPMN_EXPRESSION__BASE_OPAQUE_EXPRESSION:
				setBase_OpaqueExpression((OpaqueExpression)null);
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
			case BpmnprofPackage.BPMN_EXPRESSION__BASE_OPAQUE_EXPRESSION:
				return base_OpaqueExpression != null;
		}
		return super.eIsSet(featureID);
	}

} //BPMNExpressionImpl
