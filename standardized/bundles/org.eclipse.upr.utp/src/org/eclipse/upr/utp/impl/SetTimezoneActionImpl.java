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

import org.eclipse.uml2.uml.WriteStructuralFeatureAction;

import org.eclipse.upr.utp.SetTimezoneAction;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Timezone Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.SetTimezoneActionImpl#getBase_WriteStructuralFeatureAction <em>Base Write Structural Feature Action</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SetTimezoneActionImpl extends EObjectImpl implements SetTimezoneAction {
	/**
	 * The cached value of the '{@link #getBase_WriteStructuralFeatureAction() <em>Base Write Structural Feature Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_WriteStructuralFeatureAction()
	 * @generated
	 * @ordered
	 */
	protected WriteStructuralFeatureAction base_WriteStructuralFeatureAction;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SetTimezoneActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.SET_TIMEZONE_ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStructuralFeatureAction getBase_WriteStructuralFeatureAction() {
		if (base_WriteStructuralFeatureAction != null && base_WriteStructuralFeatureAction.eIsProxy()) {
			InternalEObject oldBase_WriteStructuralFeatureAction = (InternalEObject)base_WriteStructuralFeatureAction;
			base_WriteStructuralFeatureAction = (WriteStructuralFeatureAction)eResolveProxy(oldBase_WriteStructuralFeatureAction);
			if (base_WriteStructuralFeatureAction != oldBase_WriteStructuralFeatureAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION, oldBase_WriteStructuralFeatureAction, base_WriteStructuralFeatureAction));
			}
		}
		return base_WriteStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WriteStructuralFeatureAction basicGetBase_WriteStructuralFeatureAction() {
		return base_WriteStructuralFeatureAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_WriteStructuralFeatureAction(WriteStructuralFeatureAction newBase_WriteStructuralFeatureAction) {
		WriteStructuralFeatureAction oldBase_WriteStructuralFeatureAction = base_WriteStructuralFeatureAction;
		base_WriteStructuralFeatureAction = newBase_WriteStructuralFeatureAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION, oldBase_WriteStructuralFeatureAction, base_WriteStructuralFeatureAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION:
				if (resolve) return getBase_WriteStructuralFeatureAction();
				return basicGetBase_WriteStructuralFeatureAction();
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
			case UTPPackage.SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION:
				setBase_WriteStructuralFeatureAction((WriteStructuralFeatureAction)newValue);
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
			case UTPPackage.SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION:
				setBase_WriteStructuralFeatureAction((WriteStructuralFeatureAction)null);
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
			case UTPPackage.SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION:
				return base_WriteStructuralFeatureAction != null;
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
	 * Retrieves the cache adapter for this '<em><b>Set Timezone Action</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Set Timezone Action</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //SetTimezoneActionImpl
