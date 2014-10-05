/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.StructuredActivityNode;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.LoopCharacteristics;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Loop Characteristics</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LoopCharacteristicsImpl#getBase_StructuredActivityNode <em>Base Structured Activity Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class LoopCharacteristicsImpl extends BaseElementImpl implements LoopCharacteristics {
	/**
	 * The cached value of the '{@link #getBase_StructuredActivityNode() <em>Base Structured Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StructuredActivityNode()
	 * @generated
	 * @ordered
	 */
	protected StructuredActivityNode base_StructuredActivityNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LoopCharacteristicsImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getLoopCharacteristics();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getBase_StructuredActivityNode() {
		if (base_StructuredActivityNode != null && base_StructuredActivityNode.eIsProxy()) {
			InternalEObject oldBase_StructuredActivityNode = (InternalEObject)base_StructuredActivityNode;
			base_StructuredActivityNode = (StructuredActivityNode)eResolveProxy(oldBase_StructuredActivityNode);
			if (base_StructuredActivityNode != oldBase_StructuredActivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.LOOP_CHARACTERISTICS__BASE_STRUCTURED_ACTIVITY_NODE, oldBase_StructuredActivityNode, base_StructuredActivityNode));
			}
		}
		return base_StructuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetBase_StructuredActivityNode() {
		return base_StructuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_StructuredActivityNode(StructuredActivityNode newBase_StructuredActivityNode) {
		StructuredActivityNode oldBase_StructuredActivityNode = base_StructuredActivityNode;
		base_StructuredActivityNode = newBase_StructuredActivityNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.LOOP_CHARACTERISTICS__BASE_STRUCTURED_ACTIVITY_NODE, oldBase_StructuredActivityNode, base_StructuredActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.LOOP_CHARACTERISTICS__BASE_STRUCTURED_ACTIVITY_NODE:
				if (resolve) return getBase_StructuredActivityNode();
				return basicGetBase_StructuredActivityNode();
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
			case BpmnprofPackage.LOOP_CHARACTERISTICS__BASE_STRUCTURED_ACTIVITY_NODE:
				setBase_StructuredActivityNode((StructuredActivityNode)newValue);
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
			case BpmnprofPackage.LOOP_CHARACTERISTICS__BASE_STRUCTURED_ACTIVITY_NODE:
				setBase_StructuredActivityNode((StructuredActivityNode)null);
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
			case BpmnprofPackage.LOOP_CHARACTERISTICS__BASE_STRUCTURED_ACTIVITY_NODE:
				return base_StructuredActivityNode != null;
		}
		return super.eIsSet(featureID);
	}

} //LoopCharacteristicsImpl
