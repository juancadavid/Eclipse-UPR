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

import org.eclipse.uml2.uml.CombinedFragment;

import org.eclipse.upr.utp.DetermAlt;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Determ Alt</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.DetermAltImpl#getBase_CombinedFragment <em>Base Combined Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DetermAltImpl extends EObjectImpl implements DetermAlt {
	/**
	 * The cached value of the '{@link #getBase_CombinedFragment() <em>Base Combined Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CombinedFragment()
	 * @generated
	 * @ordered
	 */
	protected CombinedFragment base_CombinedFragment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DetermAltImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.DETERM_ALT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment getBase_CombinedFragment() {
		if (base_CombinedFragment != null && base_CombinedFragment.eIsProxy()) {
			InternalEObject oldBase_CombinedFragment = (InternalEObject)base_CombinedFragment;
			base_CombinedFragment = (CombinedFragment)eResolveProxy(oldBase_CombinedFragment);
			if (base_CombinedFragment != oldBase_CombinedFragment) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.DETERM_ALT__BASE_COMBINED_FRAGMENT, oldBase_CombinedFragment, base_CombinedFragment));
			}
		}
		return base_CombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CombinedFragment basicGetBase_CombinedFragment() {
		return base_CombinedFragment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CombinedFragment(CombinedFragment newBase_CombinedFragment) {
		CombinedFragment oldBase_CombinedFragment = base_CombinedFragment;
		base_CombinedFragment = newBase_CombinedFragment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.DETERM_ALT__BASE_COMBINED_FRAGMENT, oldBase_CombinedFragment, base_CombinedFragment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.DETERM_ALT__BASE_COMBINED_FRAGMENT:
				if (resolve) return getBase_CombinedFragment();
				return basicGetBase_CombinedFragment();
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
			case UTPPackage.DETERM_ALT__BASE_COMBINED_FRAGMENT:
				setBase_CombinedFragment((CombinedFragment)newValue);
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
			case UTPPackage.DETERM_ALT__BASE_COMBINED_FRAGMENT:
				setBase_CombinedFragment((CombinedFragment)null);
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
			case UTPPackage.DETERM_ALT__BASE_COMBINED_FRAGMENT:
				return base_CombinedFragment != null;
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
	 * Retrieves the cache adapter for this '<em><b>Determ Alt</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Determ Alt</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //DetermAltImpl
