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
package org.eclipse.upr.soaml.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.upr.soaml.CollaborationUse;
import org.eclipse.upr.soaml.SoaMLPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Collaboration Use</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.soaml.impl.CollaborationUseImpl#getBase_CollaborationUse <em>Base Collaboration Use</em>}</li>
 *   <li>{@link org.eclipse.upr.soaml.impl.CollaborationUseImpl#isStrict <em>Is Strict</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CollaborationUseImpl extends EObjectImpl implements CollaborationUse {
	/**
	 * The cached value of the '{@link #getBase_CollaborationUse() <em>Base Collaboration Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CollaborationUse()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.CollaborationUse base_CollaborationUse;

	/**
	 * The default value of the '{@link #isStrict() <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_STRICT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isStrict() <em>Is Strict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isStrict()
	 * @generated
	 * @ordered
	 */
	protected boolean isStrict = IS_STRICT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CollaborationUseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SoaMLPackage.Literals.COLLABORATION_USE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.CollaborationUse getBase_CollaborationUse() {
		if (base_CollaborationUse != null && base_CollaborationUse.eIsProxy()) {
			InternalEObject oldBase_CollaborationUse = (InternalEObject)base_CollaborationUse;
			base_CollaborationUse = (org.eclipse.uml2.uml.CollaborationUse)eResolveProxy(oldBase_CollaborationUse);
			if (base_CollaborationUse != oldBase_CollaborationUse) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SoaMLPackage.COLLABORATION_USE__BASE_COLLABORATION_USE, oldBase_CollaborationUse, base_CollaborationUse));
			}
		}
		return base_CollaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.CollaborationUse basicGetBase_CollaborationUse() {
		return base_CollaborationUse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CollaborationUse(org.eclipse.uml2.uml.CollaborationUse newBase_CollaborationUse) {
		org.eclipse.uml2.uml.CollaborationUse oldBase_CollaborationUse = base_CollaborationUse;
		base_CollaborationUse = newBase_CollaborationUse;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoaMLPackage.COLLABORATION_USE__BASE_COLLABORATION_USE, oldBase_CollaborationUse, base_CollaborationUse));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isStrict() {
		return isStrict;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsStrict(boolean newIsStrict) {
		boolean oldIsStrict = isStrict;
		isStrict = newIsStrict;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SoaMLPackage.COLLABORATION_USE__IS_STRICT, oldIsStrict, isStrict));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SoaMLPackage.COLLABORATION_USE__BASE_COLLABORATION_USE:
				if (resolve) return getBase_CollaborationUse();
				return basicGetBase_CollaborationUse();
			case SoaMLPackage.COLLABORATION_USE__IS_STRICT:
				return isStrict();
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
			case SoaMLPackage.COLLABORATION_USE__BASE_COLLABORATION_USE:
				setBase_CollaborationUse((org.eclipse.uml2.uml.CollaborationUse)newValue);
				return;
			case SoaMLPackage.COLLABORATION_USE__IS_STRICT:
				setIsStrict((Boolean)newValue);
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
			case SoaMLPackage.COLLABORATION_USE__BASE_COLLABORATION_USE:
				setBase_CollaborationUse((org.eclipse.uml2.uml.CollaborationUse)null);
				return;
			case SoaMLPackage.COLLABORATION_USE__IS_STRICT:
				setIsStrict(IS_STRICT_EDEFAULT);
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
			case SoaMLPackage.COLLABORATION_USE__BASE_COLLABORATION_USE:
				return base_CollaborationUse != null;
			case SoaMLPackage.COLLABORATION_USE__IS_STRICT:
				return isStrict != IS_STRICT_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isStrict: ");
		result.append(isStrict);
		result.append(')');
		return result.toString();
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
	 * Retrieves the cache adapter for this '<em><b>Collaboration Use</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Collaboration Use</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //CollaborationUseImpl
