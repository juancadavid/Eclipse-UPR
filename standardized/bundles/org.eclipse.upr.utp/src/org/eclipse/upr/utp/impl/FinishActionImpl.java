/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Marc-Florian Wendland
 */
package org.eclipse.upr.utp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.InvocationAction;
import org.eclipse.uml2.uml.OpaqueAction;

import org.eclipse.upr.utp.FinishAction;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finish Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.FinishActionImpl#getBase_OpaqueAction <em>Base Opaque Action</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.FinishActionImpl#getBase_InvocationAction <em>Base Invocation Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinishActionImpl extends EObjectImpl implements FinishAction {
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
	 * The cached value of the '{@link #getBase_InvocationAction() <em>Base Invocation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InvocationAction()
	 * @generated
	 * @ordered
	 */
	protected InvocationAction base_InvocationAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinishActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.FINISH_ACTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.FINISH_ACTION__BASE_OPAQUE_ACTION, oldBase_OpaqueAction, base_OpaqueAction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.FINISH_ACTION__BASE_OPAQUE_ACTION, oldBase_OpaqueAction, base_OpaqueAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction getBase_InvocationAction() {
		if (base_InvocationAction != null && base_InvocationAction.eIsProxy()) {
			InternalEObject oldBase_InvocationAction = (InternalEObject)base_InvocationAction;
			base_InvocationAction = (InvocationAction)eResolveProxy(oldBase_InvocationAction);
			if (base_InvocationAction != oldBase_InvocationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.FINISH_ACTION__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
			}
		}
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvocationAction basicGetBase_InvocationAction() {
		return base_InvocationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InvocationAction(InvocationAction newBase_InvocationAction) {
		InvocationAction oldBase_InvocationAction = base_InvocationAction;
		base_InvocationAction = newBase_InvocationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.FINISH_ACTION__BASE_INVOCATION_ACTION, oldBase_InvocationAction, base_InvocationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.FINISH_ACTION__BASE_OPAQUE_ACTION:
				if (resolve) return getBase_OpaqueAction();
				return basicGetBase_OpaqueAction();
			case UTPPackage.FINISH_ACTION__BASE_INVOCATION_ACTION:
				if (resolve) return getBase_InvocationAction();
				return basicGetBase_InvocationAction();
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
			case UTPPackage.FINISH_ACTION__BASE_OPAQUE_ACTION:
				setBase_OpaqueAction((OpaqueAction)newValue);
				return;
			case UTPPackage.FINISH_ACTION__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)newValue);
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
			case UTPPackage.FINISH_ACTION__BASE_OPAQUE_ACTION:
				setBase_OpaqueAction((OpaqueAction)null);
				return;
			case UTPPackage.FINISH_ACTION__BASE_INVOCATION_ACTION:
				setBase_InvocationAction((InvocationAction)null);
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
			case UTPPackage.FINISH_ACTION__BASE_OPAQUE_ACTION:
				return base_OpaqueAction != null;
			case UTPPackage.FINISH_ACTION__BASE_INVOCATION_ACTION:
				return base_InvocationAction != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * Creates a new instance of the specified Ecore class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the instance to create.
	 * @return The new instance.
	 * @generated
	 */
	protected EObject create(EClass eClass) {
		return EcoreUtil.create(eClass);
	}

	/**
	 * Retrieves the cache adapter for this '<em><b>Finish Action</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Finish Action</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //FinishActionImpl
