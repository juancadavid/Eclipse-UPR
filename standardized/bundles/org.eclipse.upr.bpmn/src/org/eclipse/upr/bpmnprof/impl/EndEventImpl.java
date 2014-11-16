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

import org.eclipse.uml2.uml.FinalNode;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.EndEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>End Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.EndEventImpl#getBase_FinalNode <em>Base Final Node</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EndEventImpl extends ThrowEventImpl implements EndEvent {
	/**
	 * The cached value of the '{@link #getBase_FinalNode() <em>Base Final Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_FinalNode()
	 * @generated
	 * @ordered
	 */
	protected FinalNode base_FinalNode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EndEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getEndEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode getBase_FinalNode() {
		if (base_FinalNode != null && base_FinalNode.eIsProxy()) {
			InternalEObject oldBase_FinalNode = (InternalEObject)base_FinalNode;
			base_FinalNode = (FinalNode)eResolveProxy(oldBase_FinalNode);
			if (base_FinalNode != oldBase_FinalNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.END_EVENT__BASE_FINAL_NODE, oldBase_FinalNode, base_FinalNode));
			}
		}
		return base_FinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalNode basicGetBase_FinalNode() {
		return base_FinalNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_FinalNode(FinalNode newBase_FinalNode) {
		FinalNode oldBase_FinalNode = base_FinalNode;
		base_FinalNode = newBase_FinalNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.END_EVENT__BASE_FINAL_NODE, oldBase_FinalNode, base_FinalNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.END_EVENT__BASE_FINAL_NODE:
				if (resolve) return getBase_FinalNode();
				return basicGetBase_FinalNode();
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
			case BpmnprofPackage.END_EVENT__BASE_FINAL_NODE:
				setBase_FinalNode((FinalNode)newValue);
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
			case BpmnprofPackage.END_EVENT__BASE_FINAL_NODE:
				setBase_FinalNode((FinalNode)null);
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
			case BpmnprofPackage.END_EVENT__BASE_FINAL_NODE:
				return base_FinalNode != null;
		}
		return super.eIsSet(featureID);
	}

} //EndEventImpl
