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

import org.eclipse.uml2.uml.OpaqueAction;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ManualTask;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Manual Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ManualTaskImpl#getBase_OpaqueAction <em>Base Opaque Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ManualTaskImpl extends TaskImpl implements ManualTask {
	/**
	 * The cached value of the '{@link #getBase_OpaqueAction() <em>Base Opaque Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_OpaqueAction()
	 * @generated
	 * @ordered
	 */
	protected OpaqueAction base_OpaqueAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ManualTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getManualTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction getBase_OpaqueAction() {
		if (base_OpaqueAction != null && base_OpaqueAction.eIsProxy()) {
			InternalEObject oldBase_OpaqueAction = (InternalEObject)base_OpaqueAction;
			base_OpaqueAction = (OpaqueAction)eResolveProxy(oldBase_OpaqueAction);
			if (base_OpaqueAction != oldBase_OpaqueAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.MANUAL_TASK__BASE_OPAQUE_ACTION, oldBase_OpaqueAction, base_OpaqueAction));
			}
		}
		return base_OpaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction basicGetBase_OpaqueAction() {
		return base_OpaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_OpaqueAction(OpaqueAction newBase_OpaqueAction) {
		OpaqueAction oldBase_OpaqueAction = base_OpaqueAction;
		base_OpaqueAction = newBase_OpaqueAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.MANUAL_TASK__BASE_OPAQUE_ACTION, oldBase_OpaqueAction, base_OpaqueAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.MANUAL_TASK__BASE_OPAQUE_ACTION:
				if (resolve) return getBase_OpaqueAction();
				return basicGetBase_OpaqueAction();
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
			case BpmnprofPackage.MANUAL_TASK__BASE_OPAQUE_ACTION:
				setBase_OpaqueAction((OpaqueAction)newValue);
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
			case BpmnprofPackage.MANUAL_TASK__BASE_OPAQUE_ACTION:
				setBase_OpaqueAction((OpaqueAction)null);
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
			case BpmnprofPackage.MANUAL_TASK__BASE_OPAQUE_ACTION:
				return base_OpaqueAction != null;
		}
		return super.eIsSet(featureID);
	}

} //ManualTaskImpl
