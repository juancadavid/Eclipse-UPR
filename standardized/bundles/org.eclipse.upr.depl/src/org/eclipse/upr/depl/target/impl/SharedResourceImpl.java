/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 * Marc-Florian Wendland
 */
package org.eclipse.upr.depl.target.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.upr.depl.target.Node;
import org.eclipse.upr.depl.target.SharedResource;
import org.eclipse.upr.depl.target.TargetPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Shared Resource</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.impl.SharedResourceImpl#getResourceUser <em>Resource User</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SharedResourceImpl extends ResourceImpl implements SharedResource {
	/**
	 * The cached value of the '{@link #getResourceUser() <em>Resource User</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResourceUser()
	 * @generated
	 * @ordered
	 */
	protected EList<Node> resourceUser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SharedResourceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TargetPackage.Literals.SHARED_RESOURCE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Node> getResourceUser() {
		if (resourceUser == null) {
			resourceUser = new EObjectWithInverseResolvingEList.ManyInverse<Node>(Node.class, this, TargetPackage.SHARED_RESOURCE__RESOURCE_USER, TargetPackage.NODE__AVAILABLE_SHARED_RESOURCE);
		}
		return resourceUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.SHARED_RESOURCE__RESOURCE_USER:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getResourceUser()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TargetPackage.SHARED_RESOURCE__RESOURCE_USER:
				return ((InternalEList<?>)getResourceUser()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TargetPackage.SHARED_RESOURCE__RESOURCE_USER:
				return getResourceUser();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TargetPackage.SHARED_RESOURCE__RESOURCE_USER:
				getResourceUser().clear();
				getResourceUser().addAll((Collection<? extends Node>)newValue);
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
			case TargetPackage.SHARED_RESOURCE__RESOURCE_USER:
				getResourceUser().clear();
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
			case TargetPackage.SHARED_RESOURCE__RESOURCE_USER:
				return resourceUser != null && !resourceUser.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SharedResourceImpl
