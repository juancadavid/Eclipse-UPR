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

import org.eclipse.uml2.uml.BehavioredClassifier;
import org.eclipse.uml2.uml.StructuredClassifier;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.upr.utp.TestContext;
import org.eclipse.upr.utp.UTPPackage;

import org.eclipse.upr.utptypes.Arbiter;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Context</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.TestContextImpl#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestContextImpl#getBase_StructuredClassifier <em>Base Structured Classifier</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestContextImpl#getTestLevel <em>Test Level</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.TestContextImpl#getArbiter <em>Arbiter</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TestContextImpl extends EObjectImpl implements TestContext {
	/**
	 * The cached value of the '{@link #getBase_BehavioredClassifier() <em>Base Behaviored Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_BehavioredClassifier()
	 * @generated
	 * @ordered
	 */
	protected BehavioredClassifier base_BehavioredClassifier;

	/**
	 * The cached value of the '{@link #getBase_StructuredClassifier() <em>Base Structured Classifier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StructuredClassifier()
	 * @generated
	 * @ordered
	 */
	protected StructuredClassifier base_StructuredClassifier;

	/**
	 * The cached value of the '{@link #getTestLevel() <em>Test Level</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTestLevel()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification testLevel;

	/**
	 * The cached value of the '{@link #getArbiter() <em>Arbiter</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getArbiter()
	 * @generated
	 * @ordered
	 */
	protected Arbiter arbiter;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestContextImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.TEST_CONTEXT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier getBase_BehavioredClassifier() {
		if (base_BehavioredClassifier != null && base_BehavioredClassifier.eIsProxy()) {
			InternalEObject oldBase_BehavioredClassifier = (InternalEObject)base_BehavioredClassifier;
			base_BehavioredClassifier = (BehavioredClassifier)eResolveProxy(oldBase_BehavioredClassifier);
			if (base_BehavioredClassifier != oldBase_BehavioredClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER, oldBase_BehavioredClassifier, base_BehavioredClassifier));
			}
		}
		return base_BehavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehavioredClassifier basicGetBase_BehavioredClassifier() {
		return base_BehavioredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_BehavioredClassifier(BehavioredClassifier newBase_BehavioredClassifier) {
		BehavioredClassifier oldBase_BehavioredClassifier = base_BehavioredClassifier;
		base_BehavioredClassifier = newBase_BehavioredClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER, oldBase_BehavioredClassifier, base_BehavioredClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifier getBase_StructuredClassifier() {
		if (base_StructuredClassifier != null && base_StructuredClassifier.eIsProxy()) {
			InternalEObject oldBase_StructuredClassifier = (InternalEObject)base_StructuredClassifier;
			base_StructuredClassifier = (StructuredClassifier)eResolveProxy(oldBase_StructuredClassifier);
			if (base_StructuredClassifier != oldBase_StructuredClassifier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER, oldBase_StructuredClassifier, base_StructuredClassifier));
			}
		}
		return base_StructuredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredClassifier basicGetBase_StructuredClassifier() {
		return base_StructuredClassifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_StructuredClassifier(StructuredClassifier newBase_StructuredClassifier) {
		StructuredClassifier oldBase_StructuredClassifier = base_StructuredClassifier;
		base_StructuredClassifier = newBase_StructuredClassifier;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER, oldBase_StructuredClassifier, base_StructuredClassifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getTestLevel() {
		if (testLevel != null && testLevel.eIsProxy()) {
			InternalEObject oldTestLevel = (InternalEObject)testLevel;
			testLevel = (ValueSpecification)eResolveProxy(oldTestLevel);
			if (testLevel != oldTestLevel) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TEST_CONTEXT__TEST_LEVEL, oldTestLevel, testLevel));
			}
		}
		return testLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetTestLevel() {
		return testLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTestLevel(ValueSpecification newTestLevel) {
		ValueSpecification oldTestLevel = testLevel;
		testLevel = newTestLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_CONTEXT__TEST_LEVEL, oldTestLevel, testLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arbiter getArbiter() {
		if (arbiter != null && arbiter.eIsProxy()) {
			InternalEObject oldArbiter = (InternalEObject)arbiter;
			arbiter = (Arbiter)eResolveProxy(oldArbiter);
			if (arbiter != oldArbiter) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.TEST_CONTEXT__ARBITER, oldArbiter, arbiter));
			}
		}
		return arbiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Arbiter basicGetArbiter() {
		return arbiter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setArbiter(Arbiter newArbiter) {
		Arbiter oldArbiter = arbiter;
		arbiter = newArbiter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.TEST_CONTEXT__ARBITER, oldArbiter, arbiter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER:
				if (resolve) return getBase_BehavioredClassifier();
				return basicGetBase_BehavioredClassifier();
			case UTPPackage.TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER:
				if (resolve) return getBase_StructuredClassifier();
				return basicGetBase_StructuredClassifier();
			case UTPPackage.TEST_CONTEXT__TEST_LEVEL:
				if (resolve) return getTestLevel();
				return basicGetTestLevel();
			case UTPPackage.TEST_CONTEXT__ARBITER:
				if (resolve) return getArbiter();
				return basicGetArbiter();
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
			case UTPPackage.TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER:
				setBase_BehavioredClassifier((BehavioredClassifier)newValue);
				return;
			case UTPPackage.TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER:
				setBase_StructuredClassifier((StructuredClassifier)newValue);
				return;
			case UTPPackage.TEST_CONTEXT__TEST_LEVEL:
				setTestLevel((ValueSpecification)newValue);
				return;
			case UTPPackage.TEST_CONTEXT__ARBITER:
				setArbiter((Arbiter)newValue);
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
			case UTPPackage.TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER:
				setBase_BehavioredClassifier((BehavioredClassifier)null);
				return;
			case UTPPackage.TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER:
				setBase_StructuredClassifier((StructuredClassifier)null);
				return;
			case UTPPackage.TEST_CONTEXT__TEST_LEVEL:
				setTestLevel((ValueSpecification)null);
				return;
			case UTPPackage.TEST_CONTEXT__ARBITER:
				setArbiter((Arbiter)null);
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
			case UTPPackage.TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER:
				return base_BehavioredClassifier != null;
			case UTPPackage.TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER:
				return base_StructuredClassifier != null;
			case UTPPackage.TEST_CONTEXT__TEST_LEVEL:
				return testLevel != null;
			case UTPPackage.TEST_CONTEXT__ARBITER:
				return arbiter != null;
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
	 * Retrieves the cache adapter for this '<em><b>Test Context</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Test Context</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //TestContextImpl
