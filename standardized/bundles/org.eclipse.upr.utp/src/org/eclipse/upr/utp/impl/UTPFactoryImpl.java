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
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.upr.utp.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UTPFactoryImpl extends EFactoryImpl implements UTPFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UTPFactory init() {
		try {
			UTPFactory theUTPFactory = (UTPFactory)EPackage.Registry.INSTANCE.getEFactory(UTPPackage.eNS_URI);
			if (theUTPFactory != null) {
				return theUTPFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new UTPFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTPFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case UTPPackage.TEST_COMPONENT: return createTestComponent();
			case UTPPackage.SUT: return createSUT();
			case UTPPackage.TEST_CONTEXT: return createTestContext();
			case UTPPackage.DETERM_ALT: return createDetermAlt();
			case UTPPackage.FINISH_ACTION: return createFinishAction();
			case UTPPackage.LOG_ACTION: return createLogAction();
			case UTPPackage.TEST_CASE: return createTestCase();
			case UTPPackage.VALIDATION_ACTION: return createValidationAction();
			case UTPPackage.DEFAULT: return createDefault();
			case UTPPackage.DEFAULT_APPLICATION: return createDefaultApplication();
			case UTPPackage.TIME_OUT: return createTimeOut();
			case UTPPackage.TIME_OUT_MESSAGE: return createTimeOutMessage();
			case UTPPackage.TIME_OUT_ACTION: return createTimeOutAction();
			case UTPPackage.READ_TIMER_ACTION: return createReadTimerAction();
			case UTPPackage.START_TIMER_ACTION: return createStartTimerAction();
			case UTPPackage.STOP_TIMER_ACTION: return createStopTimerAction();
			case UTPPackage.TIMER_RUNNING_ACTION: return createTimerRunningAction();
			case UTPPackage.GET_TIMEZONE_ACTION: return createGetTimezoneAction();
			case UTPPackage.SET_TIMEZONE_ACTION: return createSetTimezoneAction();
			case UTPPackage.DATA_PARTITION: return createDataPartition();
			case UTPPackage.DATA_POOL: return createDataPool();
			case UTPPackage.DATA_SELECTOR: return createDataSelector();
			case UTPPackage.CODING_RULE: return createCodingRule();
			case UTPPackage.MODIFICATION: return createModification();
			case UTPPackage.LITERAL_ANY: return createLiteralAny();
			case UTPPackage.LITERAL_ANY_OR_NULL: return createLiteralAnyOrNull();
			case UTPPackage.TEST_OBJECTIVE_SPECIFICATION: return createTestObjectiveSpecification();
			case UTPPackage.TEST_LOG: return createTestLog();
			case UTPPackage.TEST_LOG_APPLICATION: return createTestLogApplication();
			case UTPPackage.TEST_LOG_ENTRY: return createTestLogEntry();
			case UTPPackage.TEST_OBJECTIVE: return createTestObjective();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestComponent createTestComponent() {
		TestComponentImpl testComponent = new TestComponentImpl();
		return testComponent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SUT createSUT() {
		SUTImpl sut = new SUTImpl();
		return sut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestContext createTestContext() {
		TestContextImpl testContext = new TestContextImpl();
		return testContext;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DetermAlt createDetermAlt() {
		DetermAltImpl determAlt = new DetermAltImpl();
		return determAlt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinishAction createFinishAction() {
		FinishActionImpl finishAction = new FinishActionImpl();
		return finishAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogAction createLogAction() {
		LogActionImpl logAction = new LogActionImpl();
		return logAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestCase createTestCase() {
		TestCaseImpl testCase = new TestCaseImpl();
		return testCase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValidationAction createValidationAction() {
		ValidationActionImpl validationAction = new ValidationActionImpl();
		return validationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Default createDefault() {
		DefaultImpl default_ = new DefaultImpl();
		return default_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DefaultApplication createDefaultApplication() {
		DefaultApplicationImpl defaultApplication = new DefaultApplicationImpl();
		return defaultApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOut createTimeOut() {
		TimeOutImpl timeOut = new TimeOutImpl();
		return timeOut;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOutMessage createTimeOutMessage() {
		TimeOutMessageImpl timeOutMessage = new TimeOutMessageImpl();
		return timeOutMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimeOutAction createTimeOutAction() {
		TimeOutActionImpl timeOutAction = new TimeOutActionImpl();
		return timeOutAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReadTimerAction createReadTimerAction() {
		ReadTimerActionImpl readTimerAction = new ReadTimerActionImpl();
		return readTimerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StartTimerAction createStartTimerAction() {
		StartTimerActionImpl startTimerAction = new StartTimerActionImpl();
		return startTimerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopTimerAction createStopTimerAction() {
		StopTimerActionImpl stopTimerAction = new StopTimerActionImpl();
		return stopTimerAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimerRunningAction createTimerRunningAction() {
		TimerRunningActionImpl timerRunningAction = new TimerRunningActionImpl();
		return timerRunningAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GetTimezoneAction createGetTimezoneAction() {
		GetTimezoneActionImpl getTimezoneAction = new GetTimezoneActionImpl();
		return getTimezoneAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SetTimezoneAction createSetTimezoneAction() {
		SetTimezoneActionImpl setTimezoneAction = new SetTimezoneActionImpl();
		return setTimezoneAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPartition createDataPartition() {
		DataPartitionImpl dataPartition = new DataPartitionImpl();
		return dataPartition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataPool createDataPool() {
		DataPoolImpl dataPool = new DataPoolImpl();
		return dataPool;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataSelector createDataSelector() {
		DataSelectorImpl dataSelector = new DataSelectorImpl();
		return dataSelector;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodingRule createCodingRule() {
		CodingRuleImpl codingRule = new CodingRuleImpl();
		return codingRule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Modification createModification() {
		ModificationImpl modification = new ModificationImpl();
		return modification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralAny createLiteralAny() {
		LiteralAnyImpl literalAny = new LiteralAnyImpl();
		return literalAny;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralAnyOrNull createLiteralAnyOrNull() {
		LiteralAnyOrNullImpl literalAnyOrNull = new LiteralAnyOrNullImpl();
		return literalAnyOrNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestObjectiveSpecification createTestObjectiveSpecification() {
		TestObjectiveSpecificationImpl testObjectiveSpecification = new TestObjectiveSpecificationImpl();
		return testObjectiveSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestLog createTestLog() {
		TestLogImpl testLog = new TestLogImpl();
		return testLog;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestLogApplication createTestLogApplication() {
		TestLogApplicationImpl testLogApplication = new TestLogApplicationImpl();
		return testLogApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestLogEntry createTestLogEntry() {
		TestLogEntryImpl testLogEntry = new TestLogEntryImpl();
		return testLogEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TestObjective createTestObjective() {
		TestObjectiveImpl testObjective = new TestObjectiveImpl();
		return testObjective;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTPPackage getUTPPackage() {
		return (UTPPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static UTPPackage getPackage() {
		return UTPPackage.eINSTANCE;
	}

} //UTPFactoryImpl
