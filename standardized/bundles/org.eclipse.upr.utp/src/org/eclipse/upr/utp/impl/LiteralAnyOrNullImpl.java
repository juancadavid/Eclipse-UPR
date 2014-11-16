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

import org.eclipse.uml2.uml.LiteralSpecification;

import org.eclipse.upr.utp.LiteralAnyOrNull;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Literal Any Or Null</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.LiteralAnyOrNullImpl#getBase_LiteralSpecification <em>Base Literal Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LiteralAnyOrNullImpl extends EObjectImpl implements LiteralAnyOrNull {
	/**
	 * The cached value of the '{@link #getBase_LiteralSpecification() <em>Base Literal Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_LiteralSpecification()
	 * @generated
	 * @ordered
	 */
	protected LiteralSpecification base_LiteralSpecification;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LiteralAnyOrNullImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.LITERAL_ANY_OR_NULL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralSpecification getBase_LiteralSpecification() {
		if (base_LiteralSpecification != null && base_LiteralSpecification.eIsProxy()) {
			InternalEObject oldBase_LiteralSpecification = (InternalEObject)base_LiteralSpecification;
			base_LiteralSpecification = (LiteralSpecification)eResolveProxy(oldBase_LiteralSpecification);
			if (base_LiteralSpecification != oldBase_LiteralSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION, oldBase_LiteralSpecification, base_LiteralSpecification));
			}
		}
		return base_LiteralSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralSpecification basicGetBase_LiteralSpecification() {
		return base_LiteralSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_LiteralSpecification(LiteralSpecification newBase_LiteralSpecification) {
		LiteralSpecification oldBase_LiteralSpecification = base_LiteralSpecification;
		base_LiteralSpecification = newBase_LiteralSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION, oldBase_LiteralSpecification, base_LiteralSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION:
				if (resolve) return getBase_LiteralSpecification();
				return basicGetBase_LiteralSpecification();
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
			case UTPPackage.LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION:
				setBase_LiteralSpecification((LiteralSpecification)newValue);
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
			case UTPPackage.LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION:
				setBase_LiteralSpecification((LiteralSpecification)null);
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
			case UTPPackage.LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION:
				return base_LiteralSpecification != null;
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
	 * Retrieves the cache adapter for this '<em><b>Literal Any Or Null</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Literal Any Or Null</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //LiteralAnyOrNullImpl
