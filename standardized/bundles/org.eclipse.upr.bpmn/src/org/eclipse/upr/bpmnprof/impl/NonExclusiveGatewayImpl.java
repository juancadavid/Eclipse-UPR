/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.JoinNode;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.NonExclusiveGateway;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Non Exclusive Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.NonExclusiveGatewayImpl#getBase_JoinNode <em>Base Join Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.NonExclusiveGatewayImpl#getBase_ForkNode <em>Base Fork Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class NonExclusiveGatewayImpl extends GatewayImpl implements NonExclusiveGateway {
	/**
	 * The cached value of the '{@link #getBase_JoinNode() <em>Base Join Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_JoinNode()
	 * @generated
	 * @ordered
	 */
	protected JoinNode base_JoinNode;

	/**
	 * The cached value of the '{@link #getBase_ForkNode() <em>Base Fork Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ForkNode()
	 * @generated
	 * @ordered
	 */
	protected ForkNode base_ForkNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NonExclusiveGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getNonExclusiveGateway();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode getBase_JoinNode() {
		if (base_JoinNode != null && base_JoinNode.eIsProxy()) {
			InternalEObject oldBase_JoinNode = (InternalEObject)base_JoinNode;
			base_JoinNode = (JoinNode)eResolveProxy(oldBase_JoinNode);
			if (base_JoinNode != oldBase_JoinNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_JOIN_NODE, oldBase_JoinNode, base_JoinNode));
			}
		}
		return base_JoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JoinNode basicGetBase_JoinNode() {
		return base_JoinNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_JoinNode(JoinNode newBase_JoinNode) {
		JoinNode oldBase_JoinNode = base_JoinNode;
		base_JoinNode = newBase_JoinNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_JOIN_NODE, oldBase_JoinNode, base_JoinNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode getBase_ForkNode() {
		if (base_ForkNode != null && base_ForkNode.eIsProxy()) {
			InternalEObject oldBase_ForkNode = (InternalEObject)base_ForkNode;
			base_ForkNode = (ForkNode)eResolveProxy(oldBase_ForkNode);
			if (base_ForkNode != oldBase_ForkNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_FORK_NODE, oldBase_ForkNode, base_ForkNode));
			}
		}
		return base_ForkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode basicGetBase_ForkNode() {
		return base_ForkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ForkNode(ForkNode newBase_ForkNode) {
		ForkNode oldBase_ForkNode = base_ForkNode;
		base_ForkNode = newBase_ForkNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_FORK_NODE, oldBase_ForkNode, base_ForkNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_JOIN_NODE:
				if (resolve) return getBase_JoinNode();
				return basicGetBase_JoinNode();
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_FORK_NODE:
				if (resolve) return getBase_ForkNode();
				return basicGetBase_ForkNode();
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
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_JOIN_NODE:
				setBase_JoinNode((JoinNode)newValue);
				return;
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_FORK_NODE:
				setBase_ForkNode((ForkNode)newValue);
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
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_JOIN_NODE:
				setBase_JoinNode((JoinNode)null);
				return;
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_FORK_NODE:
				setBase_ForkNode((ForkNode)null);
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
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_JOIN_NODE:
				return base_JoinNode != null;
			case BpmnprofPackage.NON_EXCLUSIVE_GATEWAY__BASE_FORK_NODE:
				return base_ForkNode != null;
		}
		return super.eIsSet(featureID);
	}

} //NonExclusiveGatewayImpl
