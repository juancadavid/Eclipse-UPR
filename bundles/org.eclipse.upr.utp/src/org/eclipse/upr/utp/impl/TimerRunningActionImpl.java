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

import org.eclipse.uml2.uml.ReadStructuralFeatureAction;

import org.eclipse.upr.utp.TimerRunningAction;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Running Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.TimerRunningActionImpl#getBase_ReadStructuralFeatureAction <em>Base Read Structural Feature Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerRunningActionImpl extends EObjectImpl implements TimerRunningAction {
	/**
	 * The cached value of the '{@link #getBase_ReadStructuralFeatureAction() <em>Base Read Structural Feature Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ReadStructuralFeatureAction()
	 * @generated
	 * @ordered
	 */
	protected ReadStructuralFeatureAction base_ReadStructuralFeatureAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerRunningActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.TIMER_RUNNING_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureAction getBase_ReadStructuralFeatureAction() {
		if (base_ReadStructuralFeatureAction != null && base_ReadStructuralFeatureAction.eIsProxy()) {
			InternalEObject oldBase_ReadStructuralFeatureAction = (InternalEObject)base_ReadStructuralFeatureAction;
			base_ReadStructuralFeatureAction = (ReadStructuralFeatureAction)eResolveProxy(oldBase_ReadStructuralFeatureAction);
			if (base_ReadStructuralFeatureAction != oldBase_ReadStructuralFeatureAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION, oldBase_ReadStructuralFeatureAction, base_ReadStructuralFeatureAction));
			}
		}
		return base_ReadStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadStructuralFeatureAction basicGetBase_ReadStructuralFeatureAction() {
		return base_ReadStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ReadStructuralFeatureAction(ReadStructuralFeatureAction newBase_ReadStructuralFeatureAction) {
		ReadStructuralFeatureAction oldBase_ReadStructuralFeatureAction = base_ReadStructuralFeatureAction;
		base_ReadStructuralFeatureAction = newBase_ReadStructuralFeatureAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION, oldBase_ReadStructuralFeatureAction, base_ReadStructuralFeatureAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION:
				if (resolve) return getBase_ReadStructuralFeatureAction();
				return basicGetBase_ReadStructuralFeatureAction();
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
			case UTPPackage.TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION:
				setBase_ReadStructuralFeatureAction((ReadStructuralFeatureAction)newValue);
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
			case UTPPackage.TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION:
				setBase_ReadStructuralFeatureAction((ReadStructuralFeatureAction)null);
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
			case UTPPackage.TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION:
				return base_ReadStructuralFeatureAction != null;
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
	 * Retrieves the cache adapter for this '<em><b>Timer Running Action</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Timer Running Action</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //TimerRunningActionImpl
