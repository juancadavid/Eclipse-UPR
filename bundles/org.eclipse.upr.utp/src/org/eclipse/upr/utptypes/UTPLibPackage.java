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
package org.eclipse.upr.utptypes;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.upr.utptypes.UTPLibFactory
 * @model kind="package"
 * @generated
 */
public interface UTPLibPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utptypes";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/UTP/20120801/utptypes.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "utptypes";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UTPLibPackage eINSTANCE = org.eclipse.upr.utptypes.impl.UTPLibPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utptypes.Arbiter <em>Arbiter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utptypes.Arbiter
	 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getArbiter()
	 * @generated
	 */
	int ARBITER = 0;

	/**
	 * The number of structural features of the '<em>Arbiter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARBITER_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utptypes.Timer <em>Timer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utptypes.Timer
	 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getTimer()
	 * @generated
	 */
	int TIMER = 1;

	/**
	 * The feature id for the '<em><b>Is Running</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER__IS_RUNNING = 0;

	/**
	 * The number of structural features of the '<em>Timer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utptypes.Verdict <em>Verdict</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utptypes.Verdict
	 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getVerdict()
	 * @generated
	 */
	int VERDICT = 2;

	/**
	 * The meta object id for the '<em>Timepoint</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getTimepoint()
	 * @generated
	 */
	int TIMEPOINT = 3;

	/**
	 * The meta object id for the '<em>Duration</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getDuration()
	 * @generated
	 */
	int DURATION = 4;

	/**
	 * The meta object id for the '<em>Timezone</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getTimezone()
	 * @generated
	 */
	int TIMEZONE = 5;


	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utptypes.Arbiter <em>Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arbiter</em>'.
	 * @see org.eclipse.upr.utptypes.Arbiter
	 * @generated
	 */
	EClass getArbiter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utptypes.Timer <em>Timer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer</em>'.
	 * @see org.eclipse.upr.utptypes.Timer
	 * @generated
	 */
	EClass getTimer();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utptypes.Timer#isRunning <em>Is Running</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Running</em>'.
	 * @see org.eclipse.upr.utptypes.Timer#isRunning()
	 * @see #getTimer()
	 * @generated
	 */
	EAttribute getTimer_IsRunning();

	/**
	 * Returns the meta object for enum '{@link org.eclipse.upr.utptypes.Verdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Verdict</em>'.
	 * @see org.eclipse.upr.utptypes.Verdict
	 * @generated
	 */
	EEnum getVerdict();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Timepoint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timepoint</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getTimepoint();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Duration</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getDuration();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>Timezone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Timezone</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getTimezone();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UTPLibFactory getUTPLibFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utptypes.Arbiter <em>Arbiter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utptypes.Arbiter
		 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getArbiter()
		 * @generated
		 */
		EClass ARBITER = eINSTANCE.getArbiter();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utptypes.Timer <em>Timer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utptypes.Timer
		 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getTimer()
		 * @generated
		 */
		EClass TIMER = eINSTANCE.getTimer();

		/**
		 * The meta object literal for the '<em><b>Is Running</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMER__IS_RUNNING = eINSTANCE.getTimer_IsRunning();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utptypes.Verdict <em>Verdict</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utptypes.Verdict
		 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getVerdict()
		 * @generated
		 */
		EEnum VERDICT = eINSTANCE.getVerdict();

		/**
		 * The meta object literal for the '<em>Timepoint</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getTimepoint()
		 * @generated
		 */
		EDataType TIMEPOINT = eINSTANCE.getTimepoint();

		/**
		 * The meta object literal for the '<em>Duration</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getDuration()
		 * @generated
		 */
		EDataType DURATION = eINSTANCE.getDuration();

		/**
		 * The meta object literal for the '<em>Timezone</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see org.eclipse.upr.utptypes.impl.UTPLibPackageImpl#getTimezone()
		 * @generated
		 */
		EDataType TIMEZONE = eINSTANCE.getTimezone();

	}

} //UTPLibPackage
