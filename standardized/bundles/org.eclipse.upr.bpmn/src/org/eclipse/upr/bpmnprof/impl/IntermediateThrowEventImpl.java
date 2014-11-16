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

import org.eclipse.uml2.uml.SendObjectAction;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.IntermediateThrowEvent;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Intermediate Throw Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.IntermediateThrowEventImpl#getBase_SendObjectAction <em>Base Send Object Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class IntermediateThrowEventImpl extends ThrowEventImpl implements IntermediateThrowEvent {
	/**
	 * The cached value of the '{@link #getBase_SendObjectAction() <em>Base Send Object Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_SendObjectAction()
	 * @generated
	 * @ordered
	 */
	protected SendObjectAction base_SendObjectAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IntermediateThrowEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getIntermediateThrowEvent();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectAction getBase_SendObjectAction() {
		if (base_SendObjectAction != null && base_SendObjectAction.eIsProxy()) {
			InternalEObject oldBase_SendObjectAction = (InternalEObject)base_SendObjectAction;
			base_SendObjectAction = (SendObjectAction)eResolveProxy(oldBase_SendObjectAction);
			if (base_SendObjectAction != oldBase_SendObjectAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.INTERMEDIATE_THROW_EVENT__BASE_SEND_OBJECT_ACTION, oldBase_SendObjectAction, base_SendObjectAction));
			}
		}
		return base_SendObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SendObjectAction basicGetBase_SendObjectAction() {
		return base_SendObjectAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_SendObjectAction(SendObjectAction newBase_SendObjectAction) {
		SendObjectAction oldBase_SendObjectAction = base_SendObjectAction;
		base_SendObjectAction = newBase_SendObjectAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.INTERMEDIATE_THROW_EVENT__BASE_SEND_OBJECT_ACTION, oldBase_SendObjectAction, base_SendObjectAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.INTERMEDIATE_THROW_EVENT__BASE_SEND_OBJECT_ACTION:
				if (resolve) return getBase_SendObjectAction();
				return basicGetBase_SendObjectAction();
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
			case BpmnprofPackage.INTERMEDIATE_THROW_EVENT__BASE_SEND_OBJECT_ACTION:
				setBase_SendObjectAction((SendObjectAction)newValue);
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
			case BpmnprofPackage.INTERMEDIATE_THROW_EVENT__BASE_SEND_OBJECT_ACTION:
				setBase_SendObjectAction((SendObjectAction)null);
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
			case BpmnprofPackage.INTERMEDIATE_THROW_EVENT__BASE_SEND_OBJECT_ACTION:
				return base_SendObjectAction != null;
		}
		return super.eIsSet(featureID);
	}

} //IntermediateThrowEventImpl
