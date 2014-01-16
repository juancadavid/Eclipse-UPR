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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

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
 * @see org.eclipse.upr.utp.UTPFactory
 * @model kind="package"
 * @generated
 */
public interface UTPPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "utp";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.omg.org/spec/UTP/20120801/utp.xmi";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "utp";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	UTPPackage eINSTANCE = org.eclipse.upr.utp.impl.UTPPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestComponentImpl <em>Test Component</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestComponentImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestComponent()
	 * @generated
	 */
	int TEST_COMPONENT = 0;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMPONENT__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Zone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMPONENT__ZONE = 1;

	/**
	 * The number of structural features of the '<em>Test Component</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_COMPONENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.SUTImpl <em>SUT</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.SUTImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getSUT()
	 * @generated
	 */
	int SUT = 1;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT__BASE_PROPERTY = 0;

	/**
	 * The number of structural features of the '<em>SUT</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestContextImpl <em>Test Context</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestContextImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestContext()
	 * @generated
	 */
	int TEST_CONTEXT = 2;

	/**
	 * The feature id for the '<em><b>Base Behaviored Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Base Structured Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER = 1;

	/**
	 * The feature id for the '<em><b>Test Level</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTEXT__TEST_LEVEL = 2;

	/**
	 * The feature id for the '<em><b>Arbiter</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTEXT__ARBITER = 3;

	/**
	 * The number of structural features of the '<em>Test Context</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CONTEXT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.DetermAltImpl <em>Determ Alt</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.DetermAltImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDetermAlt()
	 * @generated
	 */
	int DETERM_ALT = 3;

	/**
	 * The feature id for the '<em><b>Base Combined Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERM_ALT__BASE_COMBINED_FRAGMENT = 0;

	/**
	 * The number of structural features of the '<em>Determ Alt</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DETERM_ALT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.FinishActionImpl <em>Finish Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.FinishActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getFinishAction()
	 * @generated
	 */
	int FINISH_ACTION = 4;

	/**
	 * The feature id for the '<em><b>Base Opaque Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISH_ACTION__BASE_OPAQUE_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Base Invocation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISH_ACTION__BASE_INVOCATION_ACTION = 1;

	/**
	 * The number of structural features of the '<em>Finish Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FINISH_ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.LogActionImpl <em>Log Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.LogActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getLogAction()
	 * @generated
	 */
	int LOG_ACTION = 5;

	/**
	 * The feature id for the '<em><b>Base Send Object Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION__BASE_SEND_OBJECT_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Log Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOG_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestCaseImpl <em>Test Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestCaseImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestCase()
	 * @generated
	 */
	int TEST_CASE = 6;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__BASE_OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__BASE_BEHAVIOR = 1;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__PRIORITY = 2;

	/**
	 * The feature id for the '<em><b>Test Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE__TEST_TYPE = 3;

	/**
	 * The number of structural features of the '<em>Test Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_CASE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.ValidationActionImpl <em>Validation Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.ValidationActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getValidationAction()
	 * @generated
	 */
	int VALIDATION_ACTION = 7;

	/**
	 * The feature id for the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION = 0;

	/**
	 * The feature id for the '<em><b>Reason</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ACTION__REASON = 1;

	/**
	 * The number of structural features of the '<em>Validation Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALIDATION_ACTION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.DefaultImpl <em>Default</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.DefaultImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDefault()
	 * @generated
	 */
	int DEFAULT = 8;

	/**
	 * The feature id for the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT__BASE_BEHAVIOR = 0;

	/**
	 * The number of structural features of the '<em>Default</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.DefaultApplicationImpl <em>Default Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.DefaultApplicationImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDefaultApplication()
	 * @generated
	 */
	int DEFAULT_APPLICATION = 9;

	/**
	 * The feature id for the '<em><b>Repetition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_APPLICATION__REPETITION = 0;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_APPLICATION__BASE_DEPENDENCY = 1;

	/**
	 * The number of structural features of the '<em>Default Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEFAULT_APPLICATION_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TimeOutImpl <em>Time Out</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TimeOutImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimeOut()
	 * @generated
	 */
	int TIME_OUT = 10;

	/**
	 * The feature id for the '<em><b>Base Time Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OUT__BASE_TIME_EVENT = 0;

	/**
	 * The number of structural features of the '<em>Time Out</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OUT_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TimeOutMessageImpl <em>Time Out Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TimeOutMessageImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimeOutMessage()
	 * @generated
	 */
	int TIME_OUT_MESSAGE = 11;

	/**
	 * The feature id for the '<em><b>Base Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OUT_MESSAGE__BASE_MESSAGE = 0;

	/**
	 * The number of structural features of the '<em>Time Out Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OUT_MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TimeOutActionImpl <em>Time Out Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TimeOutActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimeOutAction()
	 * @generated
	 */
	int TIME_OUT_ACTION = 12;

	/**
	 * The feature id for the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OUT_ACTION__BASE_ACCEPT_EVENT_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Time Out Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIME_OUT_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.ReadTimerActionImpl <em>Read Timer Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.ReadTimerActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getReadTimerAction()
	 * @generated
	 */
	int READ_TIMER_ACTION = 13;

	/**
	 * The feature id for the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_TIMER_ACTION__BASE_CALL_OPERATION_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Read Timer Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int READ_TIMER_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.StartTimerActionImpl <em>Start Timer Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.StartTimerActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getStartTimerAction()
	 * @generated
	 */
	int START_TIMER_ACTION = 14;

	/**
	 * The feature id for the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER_ACTION__BASE_CALL_OPERATION_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Start Timer Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int START_TIMER_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.StopTimerActionImpl <em>Stop Timer Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.StopTimerActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getStopTimerAction()
	 * @generated
	 */
	int STOP_TIMER_ACTION = 15;

	/**
	 * The feature id for the '<em><b>Base Call Operation Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER_ACTION__BASE_CALL_OPERATION_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Stop Timer Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STOP_TIMER_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TimerRunningActionImpl <em>Timer Running Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TimerRunningActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimerRunningAction()
	 * @generated
	 */
	int TIMER_RUNNING_ACTION = 16;

	/**
	 * The feature id for the '<em><b>Base Read Structural Feature Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Timer Running Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMER_RUNNING_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.GetTimezoneActionImpl <em>Get Timezone Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.GetTimezoneActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getGetTimezoneAction()
	 * @generated
	 */
	int GET_TIMEZONE_ACTION = 17;

	/**
	 * The feature id for the '<em><b>Base Read Structural Feature Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TIMEZONE_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Get Timezone Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GET_TIMEZONE_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.SetTimezoneActionImpl <em>Set Timezone Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.SetTimezoneActionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getSetTimezoneAction()
	 * @generated
	 */
	int SET_TIMEZONE_ACTION = 18;

	/**
	 * The feature id for the '<em><b>Base Write Structural Feature Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION = 0;

	/**
	 * The number of structural features of the '<em>Set Timezone Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SET_TIMEZONE_ACTION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.DataPartitionImpl <em>Data Partition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.DataPartitionImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDataPartition()
	 * @generated
	 */
	int DATA_PARTITION = 19;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARTITION__BASE_CLASSIFIER = 0;

	/**
	 * The number of structural features of the '<em>Data Partition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_PARTITION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.DataPoolImpl <em>Data Pool</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.DataPoolImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDataPool()
	 * @generated
	 */
	int DATA_POOL = 20;

	/**
	 * The feature id for the '<em><b>Base Classifier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__BASE_CLASSIFIER = 0;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL__BASE_PROPERTY = 1;

	/**
	 * The number of structural features of the '<em>Data Pool</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_POOL_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.DataSelectorImpl <em>Data Selector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.DataSelectorImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDataSelector()
	 * @generated
	 */
	int DATA_SELECTOR = 21;

	/**
	 * The feature id for the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR__BASE_OPERATION = 0;

	/**
	 * The number of structural features of the '<em>Data Selector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_SELECTOR_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.CodingRuleImpl <em>Coding Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.CodingRuleImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getCodingRule()
	 * @generated
	 */
	int CODING_RULE = 22;

	/**
	 * The feature id for the '<em><b>Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_RULE__CODING = 0;

	/**
	 * The feature id for the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_RULE__BASE_NAMESPACE = 1;

	/**
	 * The feature id for the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_RULE__BASE_VALUE_SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_RULE__BASE_PROPERTY = 3;

	/**
	 * The number of structural features of the '<em>Coding Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODING_RULE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.ModificationImpl <em>Modification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.ModificationImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getModification()
	 * @generated
	 */
	int MODIFICATION = 23;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Modification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODIFICATION_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.LiteralAnyImpl <em>Literal Any</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.LiteralAnyImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getLiteralAny()
	 * @generated
	 */
	int LITERAL_ANY = 24;

	/**
	 * The feature id for the '<em><b>Base Literal Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ANY__BASE_LITERAL_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Literal Any</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ANY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.LiteralAnyOrNullImpl <em>Literal Any Or Null</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.LiteralAnyOrNullImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getLiteralAnyOrNull()
	 * @generated
	 */
	int LITERAL_ANY_OR_NULL = 25;

	/**
	 * The feature id for the '<em><b>Base Literal Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION = 0;

	/**
	 * The number of structural features of the '<em>Literal Any Or Null</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_ANY_OR_NULL_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestObjectiveSpecificationImpl <em>Test Objective Specification</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestObjectiveSpecificationImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestObjectiveSpecification()
	 * @generated
	 */
	int TEST_OBJECTIVE_SPECIFICATION = 26;

	/**
	 * The feature id for the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE_SPECIFICATION__BASE_CLASS = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE_SPECIFICATION__ID = 1;

	/**
	 * The feature id for the '<em><b>Specification</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE_SPECIFICATION__SPECIFICATION = 2;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE_SPECIFICATION__PRIORITY = 3;

	/**
	 * The feature id for the '<em><b>References</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE_SPECIFICATION__REFERENCES = 4;

	/**
	 * The number of structural features of the '<em>Test Objective Specification</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE_SPECIFICATION_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestLogImpl <em>Test Log</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestLogImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestLog()
	 * @generated
	 */
	int TEST_LOG = 27;

	/**
	 * The feature id for the '<em><b>Tester</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG__TESTER = 0;

	/**
	 * The feature id for the '<em><b>Execution At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG__EXECUTION_AT = 1;

	/**
	 * The feature id for the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG__DURATION = 2;

	/**
	 * The feature id for the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG__VERDICT = 3;

	/**
	 * The feature id for the '<em><b>Verdict Reason</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG__VERDICT_REASON = 4;

	/**
	 * The number of structural features of the '<em>Test Log</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestLogApplicationImpl <em>Test Log Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestLogApplicationImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestLogApplication()
	 * @generated
	 */
	int TEST_LOG_APPLICATION = 28;

	/**
	 * The number of structural features of the '<em>Test Log Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG_APPLICATION_FEATURE_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestLogEntryImpl <em>Test Log Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestLogEntryImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestLogEntry()
	 * @generated
	 */
	int TEST_LOG_ENTRY = 29;

	/**
	 * The feature id for the '<em><b>Timestamp</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG_ENTRY__TIMESTAMP = 0;

	/**
	 * The number of structural features of the '<em>Test Log Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_LOG_ENTRY_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.eclipse.upr.utp.impl.TestObjectiveImpl <em>Test Objective</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.upr.utp.impl.TestObjectiveImpl
	 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestObjective()
	 * @generated
	 */
	int TEST_OBJECTIVE = 30;

	/**
	 * The feature id for the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE__BASE_DEPENDENCY = 0;

	/**
	 * The number of structural features of the '<em>Test Objective</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEST_OBJECTIVE_FEATURE_COUNT = 1;


	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestComponent <em>Test Component</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Component</em>'.
	 * @see org.eclipse.upr.utp.TestComponent
	 * @generated
	 */
	EClass getTestComponent();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestComponent#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.utp.TestComponent#getBase_Class()
	 * @see #getTestComponent()
	 * @generated
	 */
	EReference getTestComponent_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.TestComponent#getZone <em>Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Zone</em>'.
	 * @see org.eclipse.upr.utp.TestComponent#getZone()
	 * @see #getTestComponent()
	 * @generated
	 */
	EAttribute getTestComponent_Zone();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.SUT <em>SUT</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SUT</em>'.
	 * @see org.eclipse.upr.utp.SUT
	 * @generated
	 */
	EClass getSUT();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.SUT#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.upr.utp.SUT#getBase_Property()
	 * @see #getSUT()
	 * @generated
	 */
	EReference getSUT_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestContext <em>Test Context</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Context</em>'.
	 * @see org.eclipse.upr.utp.TestContext
	 * @generated
	 */
	EClass getTestContext();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestContext#getBase_BehavioredClassifier <em>Base Behaviored Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behaviored Classifier</em>'.
	 * @see org.eclipse.upr.utp.TestContext#getBase_BehavioredClassifier()
	 * @see #getTestContext()
	 * @generated
	 */
	EReference getTestContext_Base_BehavioredClassifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestContext#getBase_StructuredClassifier <em>Base Structured Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Structured Classifier</em>'.
	 * @see org.eclipse.upr.utp.TestContext#getBase_StructuredClassifier()
	 * @see #getTestContext()
	 * @generated
	 */
	EReference getTestContext_Base_StructuredClassifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestContext#getTestLevel <em>Test Level</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Test Level</em>'.
	 * @see org.eclipse.upr.utp.TestContext#getTestLevel()
	 * @see #getTestContext()
	 * @generated
	 */
	EReference getTestContext_TestLevel();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestContext#getArbiter <em>Arbiter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Arbiter</em>'.
	 * @see org.eclipse.upr.utp.TestContext#getArbiter()
	 * @see #getTestContext()
	 * @generated
	 */
	EReference getTestContext_Arbiter();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.DetermAlt <em>Determ Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Determ Alt</em>'.
	 * @see org.eclipse.upr.utp.DetermAlt
	 * @generated
	 */
	EClass getDetermAlt();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.DetermAlt#getBase_CombinedFragment <em>Base Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Combined Fragment</em>'.
	 * @see org.eclipse.upr.utp.DetermAlt#getBase_CombinedFragment()
	 * @see #getDetermAlt()
	 * @generated
	 */
	EReference getDetermAlt_Base_CombinedFragment();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.FinishAction <em>Finish Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Finish Action</em>'.
	 * @see org.eclipse.upr.utp.FinishAction
	 * @generated
	 */
	EClass getFinishAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.FinishAction#getBase_OpaqueAction <em>Base Opaque Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Opaque Action</em>'.
	 * @see org.eclipse.upr.utp.FinishAction#getBase_OpaqueAction()
	 * @see #getFinishAction()
	 * @generated
	 */
	EReference getFinishAction_Base_OpaqueAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.FinishAction#getBase_InvocationAction <em>Base Invocation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Invocation Action</em>'.
	 * @see org.eclipse.upr.utp.FinishAction#getBase_InvocationAction()
	 * @see #getFinishAction()
	 * @generated
	 */
	EReference getFinishAction_Base_InvocationAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.LogAction <em>Log Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Log Action</em>'.
	 * @see org.eclipse.upr.utp.LogAction
	 * @generated
	 */
	EClass getLogAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.LogAction#getBase_SendObjectAction <em>Base Send Object Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Send Object Action</em>'.
	 * @see org.eclipse.upr.utp.LogAction#getBase_SendObjectAction()
	 * @see #getLogAction()
	 * @generated
	 */
	EReference getLogAction_Base_SendObjectAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Case</em>'.
	 * @see org.eclipse.upr.utp.TestCase
	 * @generated
	 */
	EClass getTestCase();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestCase#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.upr.utp.TestCase#getBase_Operation()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Base_Operation();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestCase#getBase_Behavior <em>Base Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavior</em>'.
	 * @see org.eclipse.upr.utp.TestCase#getBase_Behavior()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Base_Behavior();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestCase#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority</em>'.
	 * @see org.eclipse.upr.utp.TestCase#getPriority()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_Priority();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.utp.TestCase#getTestTypes <em>Test Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Test Type</em>'.
	 * @see org.eclipse.upr.utp.TestCase#getTestTypes()
	 * @see #getTestCase()
	 * @generated
	 */
	EReference getTestCase_TestType();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.ValidationAction <em>Validation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Validation Action</em>'.
	 * @see org.eclipse.upr.utp.ValidationAction
	 * @generated
	 */
	EClass getValidationAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.ValidationAction#getBase_CallOperationAction <em>Base Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Call Operation Action</em>'.
	 * @see org.eclipse.upr.utp.ValidationAction#getBase_CallOperationAction()
	 * @see #getValidationAction()
	 * @generated
	 */
	EReference getValidationAction_Base_CallOperationAction();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.utp.ValidationAction#getReasons <em>Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Reason</em>'.
	 * @see org.eclipse.upr.utp.ValidationAction#getReasons()
	 * @see #getValidationAction()
	 * @generated
	 */
	EReference getValidationAction_Reason();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.Default <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default</em>'.
	 * @see org.eclipse.upr.utp.Default
	 * @generated
	 */
	EClass getDefault();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.Default#getBase_Behavior <em>Base Behavior</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Behavior</em>'.
	 * @see org.eclipse.upr.utp.Default#getBase_Behavior()
	 * @see #getDefault()
	 * @generated
	 */
	EReference getDefault_Base_Behavior();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.DefaultApplication <em>Default Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Default Application</em>'.
	 * @see org.eclipse.upr.utp.DefaultApplication
	 * @generated
	 */
	EClass getDefaultApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.DefaultApplication#getRepetition <em>Repetition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Repetition</em>'.
	 * @see org.eclipse.upr.utp.DefaultApplication#getRepetition()
	 * @see #getDefaultApplication()
	 * @generated
	 */
	EAttribute getDefaultApplication_Repetition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.DefaultApplication#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.upr.utp.DefaultApplication#getBase_Dependency()
	 * @see #getDefaultApplication()
	 * @generated
	 */
	EReference getDefaultApplication_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TimeOut <em>Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Out</em>'.
	 * @see org.eclipse.upr.utp.TimeOut
	 * @generated
	 */
	EClass getTimeOut();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TimeOut#getBase_TimeEvent <em>Base Time Event</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Time Event</em>'.
	 * @see org.eclipse.upr.utp.TimeOut#getBase_TimeEvent()
	 * @see #getTimeOut()
	 * @generated
	 */
	EReference getTimeOut_Base_TimeEvent();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TimeOutMessage <em>Time Out Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Out Message</em>'.
	 * @see org.eclipse.upr.utp.TimeOutMessage
	 * @generated
	 */
	EClass getTimeOutMessage();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TimeOutMessage#getBase_Message <em>Base Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Message</em>'.
	 * @see org.eclipse.upr.utp.TimeOutMessage#getBase_Message()
	 * @see #getTimeOutMessage()
	 * @generated
	 */
	EReference getTimeOutMessage_Base_Message();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TimeOutAction <em>Time Out Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Time Out Action</em>'.
	 * @see org.eclipse.upr.utp.TimeOutAction
	 * @generated
	 */
	EClass getTimeOutAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TimeOutAction#getBase_AcceptEventAction <em>Base Accept Event Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Accept Event Action</em>'.
	 * @see org.eclipse.upr.utp.TimeOutAction#getBase_AcceptEventAction()
	 * @see #getTimeOutAction()
	 * @generated
	 */
	EReference getTimeOutAction_Base_AcceptEventAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.ReadTimerAction <em>Read Timer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Read Timer Action</em>'.
	 * @see org.eclipse.upr.utp.ReadTimerAction
	 * @generated
	 */
	EClass getReadTimerAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.ReadTimerAction#getBase_CallOperationAction <em>Base Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Call Operation Action</em>'.
	 * @see org.eclipse.upr.utp.ReadTimerAction#getBase_CallOperationAction()
	 * @see #getReadTimerAction()
	 * @generated
	 */
	EReference getReadTimerAction_Base_CallOperationAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.StartTimerAction <em>Start Timer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Start Timer Action</em>'.
	 * @see org.eclipse.upr.utp.StartTimerAction
	 * @generated
	 */
	EClass getStartTimerAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.StartTimerAction#getBase_CallOperationAction <em>Base Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Call Operation Action</em>'.
	 * @see org.eclipse.upr.utp.StartTimerAction#getBase_CallOperationAction()
	 * @see #getStartTimerAction()
	 * @generated
	 */
	EReference getStartTimerAction_Base_CallOperationAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.StopTimerAction <em>Stop Timer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stop Timer Action</em>'.
	 * @see org.eclipse.upr.utp.StopTimerAction
	 * @generated
	 */
	EClass getStopTimerAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.StopTimerAction#getBase_CallOperationAction <em>Base Call Operation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Call Operation Action</em>'.
	 * @see org.eclipse.upr.utp.StopTimerAction#getBase_CallOperationAction()
	 * @see #getStopTimerAction()
	 * @generated
	 */
	EReference getStopTimerAction_Base_CallOperationAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TimerRunningAction <em>Timer Running Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timer Running Action</em>'.
	 * @see org.eclipse.upr.utp.TimerRunningAction
	 * @generated
	 */
	EClass getTimerRunningAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TimerRunningAction#getBase_ReadStructuralFeatureAction <em>Base Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Read Structural Feature Action</em>'.
	 * @see org.eclipse.upr.utp.TimerRunningAction#getBase_ReadStructuralFeatureAction()
	 * @see #getTimerRunningAction()
	 * @generated
	 */
	EReference getTimerRunningAction_Base_ReadStructuralFeatureAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.GetTimezoneAction <em>Get Timezone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Get Timezone Action</em>'.
	 * @see org.eclipse.upr.utp.GetTimezoneAction
	 * @generated
	 */
	EClass getGetTimezoneAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.GetTimezoneAction#getBase_ReadStructuralFeatureAction <em>Base Read Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Read Structural Feature Action</em>'.
	 * @see org.eclipse.upr.utp.GetTimezoneAction#getBase_ReadStructuralFeatureAction()
	 * @see #getGetTimezoneAction()
	 * @generated
	 */
	EReference getGetTimezoneAction_Base_ReadStructuralFeatureAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.SetTimezoneAction <em>Set Timezone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Set Timezone Action</em>'.
	 * @see org.eclipse.upr.utp.SetTimezoneAction
	 * @generated
	 */
	EClass getSetTimezoneAction();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.SetTimezoneAction#getBase_WriteStructuralFeatureAction <em>Base Write Structural Feature Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Write Structural Feature Action</em>'.
	 * @see org.eclipse.upr.utp.SetTimezoneAction#getBase_WriteStructuralFeatureAction()
	 * @see #getSetTimezoneAction()
	 * @generated
	 */
	EReference getSetTimezoneAction_Base_WriteStructuralFeatureAction();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.DataPartition <em>Data Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Partition</em>'.
	 * @see org.eclipse.upr.utp.DataPartition
	 * @generated
	 */
	EClass getDataPartition();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.DataPartition#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.upr.utp.DataPartition#getBase_Classifier()
	 * @see #getDataPartition()
	 * @generated
	 */
	EReference getDataPartition_Base_Classifier();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.DataPool <em>Data Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Pool</em>'.
	 * @see org.eclipse.upr.utp.DataPool
	 * @generated
	 */
	EClass getDataPool();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.DataPool#getBase_Classifier <em>Base Classifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Classifier</em>'.
	 * @see org.eclipse.upr.utp.DataPool#getBase_Classifier()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_Base_Classifier();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.DataPool#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.upr.utp.DataPool#getBase_Property()
	 * @see #getDataPool()
	 * @generated
	 */
	EReference getDataPool_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.DataSelector <em>Data Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data Selector</em>'.
	 * @see org.eclipse.upr.utp.DataSelector
	 * @generated
	 */
	EClass getDataSelector();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.DataSelector#getBase_Operation <em>Base Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Operation</em>'.
	 * @see org.eclipse.upr.utp.DataSelector#getBase_Operation()
	 * @see #getDataSelector()
	 * @generated
	 */
	EReference getDataSelector_Base_Operation();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.CodingRule <em>Coding Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coding Rule</em>'.
	 * @see org.eclipse.upr.utp.CodingRule
	 * @generated
	 */
	EClass getCodingRule();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.CodingRule#getCoding <em>Coding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Coding</em>'.
	 * @see org.eclipse.upr.utp.CodingRule#getCoding()
	 * @see #getCodingRule()
	 * @generated
	 */
	EAttribute getCodingRule_Coding();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.CodingRule#getBase_Namespace <em>Base Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Namespace</em>'.
	 * @see org.eclipse.upr.utp.CodingRule#getBase_Namespace()
	 * @see #getCodingRule()
	 * @generated
	 */
	EReference getCodingRule_Base_Namespace();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.CodingRule#getBase_ValueSpecification <em>Base Value Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Value Specification</em>'.
	 * @see org.eclipse.upr.utp.CodingRule#getBase_ValueSpecification()
	 * @see #getCodingRule()
	 * @generated
	 */
	EReference getCodingRule_Base_ValueSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.CodingRule#getBase_Property <em>Base Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Property</em>'.
	 * @see org.eclipse.upr.utp.CodingRule#getBase_Property()
	 * @see #getCodingRule()
	 * @generated
	 */
	EReference getCodingRule_Base_Property();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.Modification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Modification</em>'.
	 * @see org.eclipse.upr.utp.Modification
	 * @generated
	 */
	EClass getModification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.Modification#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.upr.utp.Modification#getBase_Dependency()
	 * @see #getModification()
	 * @generated
	 */
	EReference getModification_Base_Dependency();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.LiteralAny <em>Literal Any</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Any</em>'.
	 * @see org.eclipse.upr.utp.LiteralAny
	 * @generated
	 */
	EClass getLiteralAny();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.LiteralAny#getBase_LiteralSpecification <em>Base Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Literal Specification</em>'.
	 * @see org.eclipse.upr.utp.LiteralAny#getBase_LiteralSpecification()
	 * @see #getLiteralAny()
	 * @generated
	 */
	EReference getLiteralAny_Base_LiteralSpecification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.LiteralAnyOrNull <em>Literal Any Or Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Any Or Null</em>'.
	 * @see org.eclipse.upr.utp.LiteralAnyOrNull
	 * @generated
	 */
	EClass getLiteralAnyOrNull();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.LiteralAnyOrNull#getBase_LiteralSpecification <em>Base Literal Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Literal Specification</em>'.
	 * @see org.eclipse.upr.utp.LiteralAnyOrNull#getBase_LiteralSpecification()
	 * @see #getLiteralAnyOrNull()
	 * @generated
	 */
	EReference getLiteralAnyOrNull_Base_LiteralSpecification();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestObjectiveSpecification <em>Test Objective Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Objective Specification</em>'.
	 * @see org.eclipse.upr.utp.TestObjectiveSpecification
	 * @generated
	 */
	EClass getTestObjectiveSpecification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getBase_Class <em>Base Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Class</em>'.
	 * @see org.eclipse.upr.utp.TestObjectiveSpecification#getBase_Class()
	 * @see #getTestObjectiveSpecification()
	 * @generated
	 */
	EReference getTestObjectiveSpecification_Base_Class();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.eclipse.upr.utp.TestObjectiveSpecification#getId()
	 * @see #getTestObjectiveSpecification()
	 * @generated
	 */
	EAttribute getTestObjectiveSpecification_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getSpecification <em>Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Specification</em>'.
	 * @see org.eclipse.upr.utp.TestObjectiveSpecification#getSpecification()
	 * @see #getTestObjectiveSpecification()
	 * @generated
	 */
	EAttribute getTestObjectiveSpecification_Specification();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Priority</em>'.
	 * @see org.eclipse.upr.utp.TestObjectiveSpecification#getPriority()
	 * @see #getTestObjectiveSpecification()
	 * @generated
	 */
	EReference getTestObjectiveSpecification_Priority();

	/**
	 * Returns the meta object for the attribute list '{@link org.eclipse.upr.utp.TestObjectiveSpecification#getReferences <em>References</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>References</em>'.
	 * @see org.eclipse.upr.utp.TestObjectiveSpecification#getReferences()
	 * @see #getTestObjectiveSpecification()
	 * @generated
	 */
	EAttribute getTestObjectiveSpecification_References();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestLog <em>Test Log</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Log</em>'.
	 * @see org.eclipse.upr.utp.TestLog
	 * @generated
	 */
	EClass getTestLog();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.utp.TestLog#getTesters <em>Tester</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Tester</em>'.
	 * @see org.eclipse.upr.utp.TestLog#getTesters()
	 * @see #getTestLog()
	 * @generated
	 */
	EReference getTestLog_Tester();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.TestLog#getExecutionAt <em>Execution At</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution At</em>'.
	 * @see org.eclipse.upr.utp.TestLog#getExecutionAt()
	 * @see #getTestLog()
	 * @generated
	 */
	EAttribute getTestLog_ExecutionAt();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.TestLog#getDuration <em>Duration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Duration</em>'.
	 * @see org.eclipse.upr.utp.TestLog#getDuration()
	 * @see #getTestLog()
	 * @generated
	 */
	EAttribute getTestLog_Duration();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.TestLog#getVerdict <em>Verdict</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Verdict</em>'.
	 * @see org.eclipse.upr.utp.TestLog#getVerdict()
	 * @see #getTestLog()
	 * @generated
	 */
	EAttribute getTestLog_Verdict();

	/**
	 * Returns the meta object for the reference list '{@link org.eclipse.upr.utp.TestLog#getVerdictReasons <em>Verdict Reason</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Verdict Reason</em>'.
	 * @see org.eclipse.upr.utp.TestLog#getVerdictReasons()
	 * @see #getTestLog()
	 * @generated
	 */
	EReference getTestLog_VerdictReason();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestLogApplication <em>Test Log Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Log Application</em>'.
	 * @see org.eclipse.upr.utp.TestLogApplication
	 * @generated
	 */
	EClass getTestLogApplication();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestLogEntry <em>Test Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Log Entry</em>'.
	 * @see org.eclipse.upr.utp.TestLogEntry
	 * @generated
	 */
	EClass getTestLogEntry();

	/**
	 * Returns the meta object for the attribute '{@link org.eclipse.upr.utp.TestLogEntry#getTimestamp <em>Timestamp</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Timestamp</em>'.
	 * @see org.eclipse.upr.utp.TestLogEntry#getTimestamp()
	 * @see #getTestLogEntry()
	 * @generated
	 */
	EAttribute getTestLogEntry_Timestamp();

	/**
	 * Returns the meta object for class '{@link org.eclipse.upr.utp.TestObjective <em>Test Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Test Objective</em>'.
	 * @see org.eclipse.upr.utp.TestObjective
	 * @generated
	 */
	EClass getTestObjective();

	/**
	 * Returns the meta object for the reference '{@link org.eclipse.upr.utp.TestObjective#getBase_Dependency <em>Base Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Base Dependency</em>'.
	 * @see org.eclipse.upr.utp.TestObjective#getBase_Dependency()
	 * @see #getTestObjective()
	 * @generated
	 */
	EReference getTestObjective_Base_Dependency();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	UTPFactory getUTPFactory();

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
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestComponentImpl <em>Test Component</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestComponentImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestComponent()
		 * @generated
		 */
		EClass TEST_COMPONENT = eINSTANCE.getTestComponent();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_COMPONENT__BASE_CLASS = eINSTANCE.getTestComponent_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Zone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_COMPONENT__ZONE = eINSTANCE.getTestComponent_Zone();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.SUTImpl <em>SUT</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.SUTImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getSUT()
		 * @generated
		 */
		EClass SUT = eINSTANCE.getSUT();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUT__BASE_PROPERTY = eINSTANCE.getSUT_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestContextImpl <em>Test Context</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestContextImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestContext()
		 * @generated
		 */
		EClass TEST_CONTEXT = eINSTANCE.getTestContext();

		/**
		 * The meta object literal for the '<em><b>Base Behaviored Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER = eINSTANCE.getTestContext_Base_BehavioredClassifier();

		/**
		 * The meta object literal for the '<em><b>Base Structured Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER = eINSTANCE.getTestContext_Base_StructuredClassifier();

		/**
		 * The meta object literal for the '<em><b>Test Level</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CONTEXT__TEST_LEVEL = eINSTANCE.getTestContext_TestLevel();

		/**
		 * The meta object literal for the '<em><b>Arbiter</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CONTEXT__ARBITER = eINSTANCE.getTestContext_Arbiter();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.DetermAltImpl <em>Determ Alt</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.DetermAltImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDetermAlt()
		 * @generated
		 */
		EClass DETERM_ALT = eINSTANCE.getDetermAlt();

		/**
		 * The meta object literal for the '<em><b>Base Combined Fragment</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DETERM_ALT__BASE_COMBINED_FRAGMENT = eINSTANCE.getDetermAlt_Base_CombinedFragment();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.FinishActionImpl <em>Finish Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.FinishActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getFinishAction()
		 * @generated
		 */
		EClass FINISH_ACTION = eINSTANCE.getFinishAction();

		/**
		 * The meta object literal for the '<em><b>Base Opaque Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINISH_ACTION__BASE_OPAQUE_ACTION = eINSTANCE.getFinishAction_Base_OpaqueAction();

		/**
		 * The meta object literal for the '<em><b>Base Invocation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FINISH_ACTION__BASE_INVOCATION_ACTION = eINSTANCE.getFinishAction_Base_InvocationAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.LogActionImpl <em>Log Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.LogActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getLogAction()
		 * @generated
		 */
		EClass LOG_ACTION = eINSTANCE.getLogAction();

		/**
		 * The meta object literal for the '<em><b>Base Send Object Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LOG_ACTION__BASE_SEND_OBJECT_ACTION = eINSTANCE.getLogAction_Base_SendObjectAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestCaseImpl <em>Test Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestCaseImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestCase()
		 * @generated
		 */
		EClass TEST_CASE = eINSTANCE.getTestCase();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__BASE_OPERATION = eINSTANCE.getTestCase_Base_Operation();

		/**
		 * The meta object literal for the '<em><b>Base Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__BASE_BEHAVIOR = eINSTANCE.getTestCase_Base_Behavior();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__PRIORITY = eINSTANCE.getTestCase_Priority();

		/**
		 * The meta object literal for the '<em><b>Test Type</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_CASE__TEST_TYPE = eINSTANCE.getTestCase_TestType();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.ValidationActionImpl <em>Validation Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.ValidationActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getValidationAction()
		 * @generated
		 */
		EClass VALIDATION_ACTION = eINSTANCE.getValidationAction();

		/**
		 * The meta object literal for the '<em><b>Base Call Operation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION = eINSTANCE.getValidationAction_Base_CallOperationAction();

		/**
		 * The meta object literal for the '<em><b>Reason</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VALIDATION_ACTION__REASON = eINSTANCE.getValidationAction_Reason();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.DefaultImpl <em>Default</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.DefaultImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDefault()
		 * @generated
		 */
		EClass DEFAULT = eINSTANCE.getDefault();

		/**
		 * The meta object literal for the '<em><b>Base Behavior</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT__BASE_BEHAVIOR = eINSTANCE.getDefault_Base_Behavior();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.DefaultApplicationImpl <em>Default Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.DefaultApplicationImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDefaultApplication()
		 * @generated
		 */
		EClass DEFAULT_APPLICATION = eINSTANCE.getDefaultApplication();

		/**
		 * The meta object literal for the '<em><b>Repetition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DEFAULT_APPLICATION__REPETITION = eINSTANCE.getDefaultApplication_Repetition();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DEFAULT_APPLICATION__BASE_DEPENDENCY = eINSTANCE.getDefaultApplication_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TimeOutImpl <em>Time Out</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TimeOutImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimeOut()
		 * @generated
		 */
		EClass TIME_OUT = eINSTANCE.getTimeOut();

		/**
		 * The meta object literal for the '<em><b>Base Time Event</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_OUT__BASE_TIME_EVENT = eINSTANCE.getTimeOut_Base_TimeEvent();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TimeOutMessageImpl <em>Time Out Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TimeOutMessageImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimeOutMessage()
		 * @generated
		 */
		EClass TIME_OUT_MESSAGE = eINSTANCE.getTimeOutMessage();

		/**
		 * The meta object literal for the '<em><b>Base Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_OUT_MESSAGE__BASE_MESSAGE = eINSTANCE.getTimeOutMessage_Base_Message();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TimeOutActionImpl <em>Time Out Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TimeOutActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimeOutAction()
		 * @generated
		 */
		EClass TIME_OUT_ACTION = eINSTANCE.getTimeOutAction();

		/**
		 * The meta object literal for the '<em><b>Base Accept Event Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIME_OUT_ACTION__BASE_ACCEPT_EVENT_ACTION = eINSTANCE.getTimeOutAction_Base_AcceptEventAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.ReadTimerActionImpl <em>Read Timer Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.ReadTimerActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getReadTimerAction()
		 * @generated
		 */
		EClass READ_TIMER_ACTION = eINSTANCE.getReadTimerAction();

		/**
		 * The meta object literal for the '<em><b>Base Call Operation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference READ_TIMER_ACTION__BASE_CALL_OPERATION_ACTION = eINSTANCE.getReadTimerAction_Base_CallOperationAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.StartTimerActionImpl <em>Start Timer Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.StartTimerActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getStartTimerAction()
		 * @generated
		 */
		EClass START_TIMER_ACTION = eINSTANCE.getStartTimerAction();

		/**
		 * The meta object literal for the '<em><b>Base Call Operation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference START_TIMER_ACTION__BASE_CALL_OPERATION_ACTION = eINSTANCE.getStartTimerAction_Base_CallOperationAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.StopTimerActionImpl <em>Stop Timer Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.StopTimerActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getStopTimerAction()
		 * @generated
		 */
		EClass STOP_TIMER_ACTION = eINSTANCE.getStopTimerAction();

		/**
		 * The meta object literal for the '<em><b>Base Call Operation Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STOP_TIMER_ACTION__BASE_CALL_OPERATION_ACTION = eINSTANCE.getStopTimerAction_Base_CallOperationAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TimerRunningActionImpl <em>Timer Running Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TimerRunningActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTimerRunningAction()
		 * @generated
		 */
		EClass TIMER_RUNNING_ACTION = eINSTANCE.getTimerRunningAction();

		/**
		 * The meta object literal for the '<em><b>Base Read Structural Feature Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getTimerRunningAction_Base_ReadStructuralFeatureAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.GetTimezoneActionImpl <em>Get Timezone Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.GetTimezoneActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getGetTimezoneAction()
		 * @generated
		 */
		EClass GET_TIMEZONE_ACTION = eINSTANCE.getGetTimezoneAction();

		/**
		 * The meta object literal for the '<em><b>Base Read Structural Feature Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GET_TIMEZONE_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getGetTimezoneAction_Base_ReadStructuralFeatureAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.SetTimezoneActionImpl <em>Set Timezone Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.SetTimezoneActionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getSetTimezoneAction()
		 * @generated
		 */
		EClass SET_TIMEZONE_ACTION = eINSTANCE.getSetTimezoneAction();

		/**
		 * The meta object literal for the '<em><b>Base Write Structural Feature Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION = eINSTANCE.getSetTimezoneAction_Base_WriteStructuralFeatureAction();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.DataPartitionImpl <em>Data Partition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.DataPartitionImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDataPartition()
		 * @generated
		 */
		EClass DATA_PARTITION = eINSTANCE.getDataPartition();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_PARTITION__BASE_CLASSIFIER = eINSTANCE.getDataPartition_Base_Classifier();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.DataPoolImpl <em>Data Pool</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.DataPoolImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDataPool()
		 * @generated
		 */
		EClass DATA_POOL = eINSTANCE.getDataPool();

		/**
		 * The meta object literal for the '<em><b>Base Classifier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POOL__BASE_CLASSIFIER = eINSTANCE.getDataPool_Base_Classifier();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_POOL__BASE_PROPERTY = eINSTANCE.getDataPool_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.DataSelectorImpl <em>Data Selector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.DataSelectorImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getDataSelector()
		 * @generated
		 */
		EClass DATA_SELECTOR = eINSTANCE.getDataSelector();

		/**
		 * The meta object literal for the '<em><b>Base Operation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DATA_SELECTOR__BASE_OPERATION = eINSTANCE.getDataSelector_Base_Operation();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.CodingRuleImpl <em>Coding Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.CodingRuleImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getCodingRule()
		 * @generated
		 */
		EClass CODING_RULE = eINSTANCE.getCodingRule();

		/**
		 * The meta object literal for the '<em><b>Coding</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CODING_RULE__CODING = eINSTANCE.getCodingRule_Coding();

		/**
		 * The meta object literal for the '<em><b>Base Namespace</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING_RULE__BASE_NAMESPACE = eINSTANCE.getCodingRule_Base_Namespace();

		/**
		 * The meta object literal for the '<em><b>Base Value Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING_RULE__BASE_VALUE_SPECIFICATION = eINSTANCE.getCodingRule_Base_ValueSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODING_RULE__BASE_PROPERTY = eINSTANCE.getCodingRule_Base_Property();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.ModificationImpl <em>Modification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.ModificationImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getModification()
		 * @generated
		 */
		EClass MODIFICATION = eINSTANCE.getModification();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODIFICATION__BASE_DEPENDENCY = eINSTANCE.getModification_Base_Dependency();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.LiteralAnyImpl <em>Literal Any</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.LiteralAnyImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getLiteralAny()
		 * @generated
		 */
		EClass LITERAL_ANY = eINSTANCE.getLiteralAny();

		/**
		 * The meta object literal for the '<em><b>Base Literal Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_ANY__BASE_LITERAL_SPECIFICATION = eINSTANCE.getLiteralAny_Base_LiteralSpecification();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.LiteralAnyOrNullImpl <em>Literal Any Or Null</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.LiteralAnyOrNullImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getLiteralAnyOrNull()
		 * @generated
		 */
		EClass LITERAL_ANY_OR_NULL = eINSTANCE.getLiteralAnyOrNull();

		/**
		 * The meta object literal for the '<em><b>Base Literal Specification</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION = eINSTANCE.getLiteralAnyOrNull_Base_LiteralSpecification();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestObjectiveSpecificationImpl <em>Test Objective Specification</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestObjectiveSpecificationImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestObjectiveSpecification()
		 * @generated
		 */
		EClass TEST_OBJECTIVE_SPECIFICATION = eINSTANCE.getTestObjectiveSpecification();

		/**
		 * The meta object literal for the '<em><b>Base Class</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_OBJECTIVE_SPECIFICATION__BASE_CLASS = eINSTANCE.getTestObjectiveSpecification_Base_Class();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OBJECTIVE_SPECIFICATION__ID = eINSTANCE.getTestObjectiveSpecification_Id();

		/**
		 * The meta object literal for the '<em><b>Specification</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OBJECTIVE_SPECIFICATION__SPECIFICATION = eINSTANCE.getTestObjectiveSpecification_Specification();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_OBJECTIVE_SPECIFICATION__PRIORITY = eINSTANCE.getTestObjectiveSpecification_Priority();

		/**
		 * The meta object literal for the '<em><b>References</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_OBJECTIVE_SPECIFICATION__REFERENCES = eINSTANCE.getTestObjectiveSpecification_References();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestLogImpl <em>Test Log</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestLogImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestLog()
		 * @generated
		 */
		EClass TEST_LOG = eINSTANCE.getTestLog();

		/**
		 * The meta object literal for the '<em><b>Tester</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_LOG__TESTER = eINSTANCE.getTestLog_Tester();

		/**
		 * The meta object literal for the '<em><b>Execution At</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_LOG__EXECUTION_AT = eINSTANCE.getTestLog_ExecutionAt();

		/**
		 * The meta object literal for the '<em><b>Duration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_LOG__DURATION = eINSTANCE.getTestLog_Duration();

		/**
		 * The meta object literal for the '<em><b>Verdict</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_LOG__VERDICT = eINSTANCE.getTestLog_Verdict();

		/**
		 * The meta object literal for the '<em><b>Verdict Reason</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_LOG__VERDICT_REASON = eINSTANCE.getTestLog_VerdictReason();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestLogApplicationImpl <em>Test Log Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestLogApplicationImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestLogApplication()
		 * @generated
		 */
		EClass TEST_LOG_APPLICATION = eINSTANCE.getTestLogApplication();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestLogEntryImpl <em>Test Log Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestLogEntryImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestLogEntry()
		 * @generated
		 */
		EClass TEST_LOG_ENTRY = eINSTANCE.getTestLogEntry();

		/**
		 * The meta object literal for the '<em><b>Timestamp</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEST_LOG_ENTRY__TIMESTAMP = eINSTANCE.getTestLogEntry_Timestamp();

		/**
		 * The meta object literal for the '{@link org.eclipse.upr.utp.impl.TestObjectiveImpl <em>Test Objective</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.upr.utp.impl.TestObjectiveImpl
		 * @see org.eclipse.upr.utp.impl.UTPPackageImpl#getTestObjective()
		 * @generated
		 */
		EClass TEST_OBJECTIVE = eINSTANCE.getTestObjective();

		/**
		 * The meta object literal for the '<em><b>Base Dependency</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TEST_OBJECTIVE__BASE_DEPENDENCY = eINSTANCE.getTestObjective_Base_Dependency();

	}

} //UTPPackage
