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
package org.eclipse.upr.depl.components.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.upr.depl.components.Capability;
import org.eclipse.upr.depl.components.ComponentImplementation;
import org.eclipse.upr.depl.components.ComponentsPackage;
import org.eclipse.upr.depl.components.Requirement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentImplementationImpl#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentImplementationImpl#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.impl.ComponentImplementationImpl#getDeployRequirement <em>Deploy Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ComponentImplementationImpl extends EObjectImpl implements ComponentImplementation {
	/**
	 * The cached value of the '{@link #getBase_Class() <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Class()
	 * @generated
	 * @ordered
	 */
	protected org.eclipse.uml2.uml.Class base_Class;

	/**
	 * The cached value of the '{@link #getCapability() <em>Capability</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapability()
	 * @generated
	 * @ordered
	 */
	protected EList<Capability> capability;

	/**
	 * The cached value of the '{@link #getDeployRequirement() <em>Deploy Requirement</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDeployRequirement()
	 * @generated
	 * @ordered
	 */
	protected EList<Requirement> deployRequirement;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComponentImplementationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ComponentsPackage.Literals.COMPONENT_IMPLEMENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class getBase_Class() {
		if (base_Class != null && base_Class.eIsProxy()) {
			InternalEObject oldBase_Class = (InternalEObject)base_Class;
			base_Class = (org.eclipse.uml2.uml.Class)eResolveProxy(oldBase_Class);
			if (base_Class != oldBase_Class) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ComponentsPackage.COMPONENT_IMPLEMENTATION__BASE_CLASS, oldBase_Class, base_Class));
			}
		}
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public org.eclipse.uml2.uml.Class basicGetBase_Class() {
		return base_Class;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Class(org.eclipse.uml2.uml.Class newBase_Class) {
		org.eclipse.uml2.uml.Class oldBase_Class = base_Class;
		base_Class = newBase_Class;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ComponentsPackage.COMPONENT_IMPLEMENTATION__BASE_CLASS, oldBase_Class, base_Class));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Capability> getCapability() {
		if (capability == null) {
			capability = new EObjectContainmentEList<Capability>(Capability.class, this, ComponentsPackage.COMPONENT_IMPLEMENTATION__CAPABILITY);
		}
		return capability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Requirement> getDeployRequirement() {
		if (deployRequirement == null) {
			deployRequirement = new EObjectResolvingEList<Requirement>(Requirement.class, this, ComponentsPackage.COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT);
		}
		return deployRequirement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__CAPABILITY:
				return ((InternalEList<?>)getCapability()).basicRemove(otherEnd, msgs);
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
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__BASE_CLASS:
				if (resolve) return getBase_Class();
				return basicGetBase_Class();
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__CAPABILITY:
				return getCapability();
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT:
				return getDeployRequirement();
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
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)newValue);
				return;
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__CAPABILITY:
				getCapability().clear();
				getCapability().addAll((Collection<? extends Capability>)newValue);
				return;
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT:
				getDeployRequirement().clear();
				getDeployRequirement().addAll((Collection<? extends Requirement>)newValue);
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
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__BASE_CLASS:
				setBase_Class((org.eclipse.uml2.uml.Class)null);
				return;
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__CAPABILITY:
				getCapability().clear();
				return;
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT:
				getDeployRequirement().clear();
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
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__BASE_CLASS:
				return base_Class != null;
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__CAPABILITY:
				return capability != null && !capability.isEmpty();
			case ComponentsPackage.COMPONENT_IMPLEMENTATION__DEPLOY_REQUIREMENT:
				return deployRequirement != null && !deployRequirement.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ComponentImplementationImpl
