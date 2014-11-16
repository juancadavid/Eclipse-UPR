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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.upr.utp.TestCase;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.TestCaseImpl#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestCaseImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestCaseImpl#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestCaseImpl#getTestTypes <em>Test Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestCaseImpl extends EObjectImpl implements TestCase {
	/**
	 * The cached value of the '{@link #getBase_Operation() <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Operation()
	 * @generated
	 * @ordered
	 */
	protected Operation base_Operation;

	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * The cached value of the '{@link #getPriority() <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriority()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification priority;

	/**
	 * The cached value of the '{@link #getTestTypes() <em>Test Type</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<ValueSpecification> testTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestCaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.TEST_CASE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getBase_Operation() {
		if (base_Operation != null && base_Operation.eIsProxy()) {
			InternalEObject oldBase_Operation = (InternalEObject)base_Operation;
			base_Operation = (Operation)eResolveProxy(oldBase_Operation);
			if (base_Operation != oldBase_Operation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TEST_CASE__BASE_OPERATION, oldBase_Operation, base_Operation));
			}
		}
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetBase_Operation() {
		return base_Operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Operation(Operation newBase_Operation) {
		Operation oldBase_Operation = base_Operation;
		base_Operation = newBase_Operation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_CASE__BASE_OPERATION, oldBase_Operation, base_Operation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TEST_CASE__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_CASE__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getPriority() {
		if (priority != null && priority.eIsProxy()) {
			InternalEObject oldPriority = (InternalEObject)priority;
			priority = (ValueSpecification)eResolveProxy(oldPriority);
			if (priority != oldPriority) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TEST_CASE__PRIORITY, oldPriority, priority));
			}
		}
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetPriority() {
		return priority;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriority(ValueSpecification newPriority) {
		ValueSpecification oldPriority = priority;
		priority = newPriority;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_CASE__PRIORITY, oldPriority, priority));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ValueSpecification> getTestTypes() {
		if (testTypes == null) {
			testTypes = new EObjectResolvingEList<ValueSpecification>(ValueSpecification.class, this, UTPPackage.TEST_CASE__TEST_TYPE);
		}
		return testTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getTestType(String name, Type type) {
		return getTestType(name, type, false, null);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getTestType(String name, Type type, boolean ignoreCase, EClass eClass) {
		testTypeLoop: for (ValueSpecification testType : getTestTypes()) {
			if (eClass != null && !eClass.isInstance(testType))
				continue testTypeLoop;
			if (name != null && !(ignoreCase ? name.equalsIgnoreCase(testType.getName()) : name.equals(testType.getName())))
				continue testTypeLoop;
			if (type != null && !type.equals(testType.getType()))
				continue testTypeLoop;
			return testType;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.TEST_CASE__BASE_OPERATION:
				if (resolve) return getBase_Operation();
				return basicGetBase_Operation();
			case UTPPackage.TEST_CASE__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
			case UTPPackage.TEST_CASE__PRIORITY:
				if (resolve) return getPriority();
				return basicGetPriority();
			case UTPPackage.TEST_CASE__TEST_TYPE:
				return getTestTypes();
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
			case UTPPackage.TEST_CASE__BASE_OPERATION:
				setBase_Operation((Operation)newValue);
				return;
			case UTPPackage.TEST_CASE__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
				return;
			case UTPPackage.TEST_CASE__PRIORITY:
				setPriority((ValueSpecification)newValue);
				return;
			case UTPPackage.TEST_CASE__TEST_TYPE:
				getTestTypes().clear();
				getTestTypes().addAll((Collection<? extends ValueSpecification>)newValue);
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
			case UTPPackage.TEST_CASE__BASE_OPERATION:
				setBase_Operation((Operation)null);
				return;
			case UTPPackage.TEST_CASE__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
				return;
			case UTPPackage.TEST_CASE__PRIORITY:
				setPriority((ValueSpecification)null);
				return;
			case UTPPackage.TEST_CASE__TEST_TYPE:
				getTestTypes().clear();
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
			case UTPPackage.TEST_CASE__BASE_OPERATION:
				return base_Operation != null;
			case UTPPackage.TEST_CASE__BASE_BEHAVIOR:
				return base_Behavior != null;
			case UTPPackage.TEST_CASE__PRIORITY:
				return priority != null;
			case UTPPackage.TEST_CASE__TEST_TYPE:
				return testTypes != null && !testTypes.isEmpty();
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
	 * Retrieves the cache adapter for this '<em><b>Test Case</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Test Case</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //TestCaseImpl
