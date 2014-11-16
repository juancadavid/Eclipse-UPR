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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.upr.utp.TestLogApplication;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Test Log Application</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TestLogApplicationImpl extends EObjectImpl implements TestLogApplication {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TestLogApplicationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.TEST_LOG_APPLICATION;
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
	 * Retrieves the cache adapter for this '<em><b>Test Log Application</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Test Log Application</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //TestLogApplicationImpl
