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
package org.eclipse.upr.utp;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.upr.utp.UTPPackage
 * @generated
 */
public interface UTPFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UTPFactory eINSTANCE = org.eclipse.upr.utp.impl.UTPFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Test Component</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Component</em>'.
	 * @generated
	 */
	TestComponent createTestComponent();

	/**
	 * Returns a new object of class '<em>SUT</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>SUT</em>'.
	 * @generated
	 */
	SUT createSUT();

	/**
	 * Returns a new object of class '<em>Test Context</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Context</em>'.
	 * @generated
	 */
	TestContext createTestContext();

	/**
	 * Returns a new object of class '<em>Determ Alt</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Determ Alt</em>'.
	 * @generated
	 */
	DetermAlt createDetermAlt();

	/**
	 * Returns a new object of class '<em>Finish Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Finish Action</em>'.
	 * @generated
	 */
	FinishAction createFinishAction();

	/**
	 * Returns a new object of class '<em>Log Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Log Action</em>'.
	 * @generated
	 */
	LogAction createLogAction();

	/**
	 * Returns a new object of class '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Case</em>'.
	 * @generated
	 */
	TestCase createTestCase();

	/**
	 * Returns a new object of class '<em>Validation Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Validation Action</em>'.
	 * @generated
	 */
	ValidationAction createValidationAction();

	/**
	 * Returns a new object of class '<em>Default</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default</em>'.
	 * @generated
	 */
	Default createDefault();

	/**
	 * Returns a new object of class '<em>Default Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Default Application</em>'.
	 * @generated
	 */
	DefaultApplication createDefaultApplication();

	/**
	 * Returns a new object of class '<em>Time Out</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Out</em>'.
	 * @generated
	 */
	TimeOut createTimeOut();

	/**
	 * Returns a new object of class '<em>Time Out Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Out Message</em>'.
	 * @generated
	 */
	TimeOutMessage createTimeOutMessage();

	/**
	 * Returns a new object of class '<em>Time Out Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Time Out Action</em>'.
	 * @generated
	 */
	TimeOutAction createTimeOutAction();

	/**
	 * Returns a new object of class '<em>Read Timer Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Read Timer Action</em>'.
	 * @generated
	 */
	ReadTimerAction createReadTimerAction();

	/**
	 * Returns a new object of class '<em>Start Timer Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Start Timer Action</em>'.
	 * @generated
	 */
	StartTimerAction createStartTimerAction();

	/**
	 * Returns a new object of class '<em>Stop Timer Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Stop Timer Action</em>'.
	 * @generated
	 */
	StopTimerAction createStopTimerAction();

	/**
	 * Returns a new object of class '<em>Timer Running Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Timer Running Action</em>'.
	 * @generated
	 */
	TimerRunningAction createTimerRunningAction();

	/**
	 * Returns a new object of class '<em>Get Timezone Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Get Timezone Action</em>'.
	 * @generated
	 */
	GetTimezoneAction createGetTimezoneAction();

	/**
	 * Returns a new object of class '<em>Set Timezone Action</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Set Timezone Action</em>'.
	 * @generated
	 */
	SetTimezoneAction createSetTimezoneAction();

	/**
	 * Returns a new object of class '<em>Data Partition</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Partition</em>'.
	 * @generated
	 */
	DataPartition createDataPartition();

	/**
	 * Returns a new object of class '<em>Data Pool</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Pool</em>'.
	 * @generated
	 */
	DataPool createDataPool();

	/**
	 * Returns a new object of class '<em>Data Selector</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Data Selector</em>'.
	 * @generated
	 */
	DataSelector createDataSelector();

	/**
	 * Returns a new object of class '<em>Coding Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coding Rule</em>'.
	 * @generated
	 */
	CodingRule createCodingRule();

	/**
	 * Returns a new object of class '<em>Modification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Modification</em>'.
	 * @generated
	 */
	Modification createModification();

	/**
	 * Returns a new object of class '<em>Literal Any</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Any</em>'.
	 * @generated
	 */
	LiteralAny createLiteralAny();

	/**
	 * Returns a new object of class '<em>Literal Any Or Null</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Literal Any Or Null</em>'.
	 * @generated
	 */
	LiteralAnyOrNull createLiteralAnyOrNull();

	/**
	 * Returns a new object of class '<em>Test Objective Specification</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Objective Specification</em>'.
	 * @generated
	 */
	TestObjectiveSpecification createTestObjectiveSpecification();

	/**
	 * Returns a new object of class '<em>Test Log</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Log</em>'.
	 * @generated
	 */
	TestLog createTestLog();

	/**
	 * Returns a new object of class '<em>Test Log Application</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Log Application</em>'.
	 * @generated
	 */
	TestLogApplication createTestLogApplication();

	/**
	 * Returns a new object of class '<em>Test Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Log Entry</em>'.
	 * @generated
	 */
	TestLogEntry createTestLogEntry();

	/**
	 * Returns a new object of class '<em>Test Objective</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Test Objective</em>'.
	 * @generated
	 */
	TestObjective createTestObjective();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	UTPPackage getUTPPackage();

} //UTPFactory
