/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ActivityGroup;
import org.eclipse.uml2.uml.ControlNode;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.Gateway;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.GatewayImpl#getBase_ControlNode <em>Base Control Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.GatewayImpl#getBase_ActivityGroup <em>Base Activity Group</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class GatewayImpl extends FlowNodeImpl implements Gateway {
	/**
	 * The cached value of the '{@link #getBase_ControlNode() <em>Base Control Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ControlNode()
	 * @generated
	 * @ordered
	 */
	protected ControlNode base_ControlNode;

	/**
	 * The cached value of the '{@link #getBase_ActivityGroup() <em>Base Activity Group</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ActivityGroup()
	 * @generated
	 * @ordered
	 */
	protected ActivityGroup base_ActivityGroup;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getGateway();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode getBase_ControlNode() {
		if (base_ControlNode != null && base_ControlNode.eIsProxy()) {
			InternalEObject oldBase_ControlNode = (InternalEObject)base_ControlNode;
			base_ControlNode = (ControlNode)eResolveProxy(oldBase_ControlNode);
			if (base_ControlNode != oldBase_ControlNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.GATEWAY__BASE_CONTROL_NODE, oldBase_ControlNode, base_ControlNode));
			}
		}
		return base_ControlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlNode basicGetBase_ControlNode() {
		return base_ControlNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ControlNode(ControlNode newBase_ControlNode) {
		ControlNode oldBase_ControlNode = base_ControlNode;
		base_ControlNode = newBase_ControlNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.GATEWAY__BASE_CONTROL_NODE, oldBase_ControlNode, base_ControlNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup getBase_ActivityGroup() {
		if (base_ActivityGroup != null && base_ActivityGroup.eIsProxy()) {
			InternalEObject oldBase_ActivityGroup = (InternalEObject)base_ActivityGroup;
			base_ActivityGroup = (ActivityGroup)eResolveProxy(oldBase_ActivityGroup);
			if (base_ActivityGroup != oldBase_ActivityGroup) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.GATEWAY__BASE_ACTIVITY_GROUP, oldBase_ActivityGroup, base_ActivityGroup));
			}
		}
		return base_ActivityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActivityGroup basicGetBase_ActivityGroup() {
		return base_ActivityGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ActivityGroup(ActivityGroup newBase_ActivityGroup) {
		ActivityGroup oldBase_ActivityGroup = base_ActivityGroup;
		base_ActivityGroup = newBase_ActivityGroup;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.GATEWAY__BASE_ACTIVITY_GROUP, oldBase_ActivityGroup, base_ActivityGroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.GATEWAY__BASE_CONTROL_NODE:
				if (resolve) return getBase_ControlNode();
				return basicGetBase_ControlNode();
			case BpmnprofPackage.GATEWAY__BASE_ACTIVITY_GROUP:
				if (resolve) return getBase_ActivityGroup();
				return basicGetBase_ActivityGroup();
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
			case BpmnprofPackage.GATEWAY__BASE_CONTROL_NODE:
				setBase_ControlNode((ControlNode)newValue);
				return;
			case BpmnprofPackage.GATEWAY__BASE_ACTIVITY_GROUP:
				setBase_ActivityGroup((ActivityGroup)newValue);
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
			case BpmnprofPackage.GATEWAY__BASE_CONTROL_NODE:
				setBase_ControlNode((ControlNode)null);
				return;
			case BpmnprofPackage.GATEWAY__BASE_ACTIVITY_GROUP:
				setBase_ActivityGroup((ActivityGroup)null);
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
			case BpmnprofPackage.GATEWAY__BASE_CONTROL_NODE:
				return base_ControlNode != null;
			case BpmnprofPackage.GATEWAY__BASE_ACTIVITY_GROUP:
				return base_ActivityGroup != null;
		}
		return super.eIsSet(featureID);
	}

} //GatewayImpl
