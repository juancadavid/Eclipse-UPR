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
package org.eclipse.upr.utp.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.eclipse.upr.utp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.upr.utp.UTPPackage
 * @generated
 */
public class UTPSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UTPPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTPSwitch() {
		if (modelPackage == null) {
			modelPackage = UTPPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case UTPPackage.TEST_COMPONENT: {
				TestComponent testComponent = (TestComponent)theEObject;
				T result = caseTestComponent(testComponent);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.SUT: {
				SUT sut = (SUT)theEObject;
				T result = caseSUT(sut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TEST_CONTEXT: {
				TestContext testContext = (TestContext)theEObject;
				T result = caseTestContext(testContext);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.DETERM_ALT: {
				DetermAlt determAlt = (DetermAlt)theEObject;
				T result = caseDetermAlt(determAlt);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.FINISH_ACTION: {
				FinishAction finishAction = (FinishAction)theEObject;
				T result = caseFinishAction(finishAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.LOG_ACTION: {
				LogAction logAction = (LogAction)theEObject;
				T result = caseLogAction(logAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TEST_CASE: {
				TestCase testCase = (TestCase)theEObject;
				T result = caseTestCase(testCase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.VALIDATION_ACTION: {
				ValidationAction validationAction = (ValidationAction)theEObject;
				T result = caseValidationAction(validationAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.DEFAULT: {
				Default default_ = (Default)theEObject;
				T result = caseDefault(default_);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.DEFAULT_APPLICATION: {
				DefaultApplication defaultApplication = (DefaultApplication)theEObject;
				T result = caseDefaultApplication(defaultApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TIME_OUT: {
				TimeOut timeOut = (TimeOut)theEObject;
				T result = caseTimeOut(timeOut);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TIME_OUT_MESSAGE: {
				TimeOutMessage timeOutMessage = (TimeOutMessage)theEObject;
				T result = caseTimeOutMessage(timeOutMessage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TIME_OUT_ACTION: {
				TimeOutAction timeOutAction = (TimeOutAction)theEObject;
				T result = caseTimeOutAction(timeOutAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.READ_TIMER_ACTION: {
				ReadTimerAction readTimerAction = (ReadTimerAction)theEObject;
				T result = caseReadTimerAction(readTimerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.START_TIMER_ACTION: {
				StartTimerAction startTimerAction = (StartTimerAction)theEObject;
				T result = caseStartTimerAction(startTimerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.STOP_TIMER_ACTION: {
				StopTimerAction stopTimerAction = (StopTimerAction)theEObject;
				T result = caseStopTimerAction(stopTimerAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TIMER_RUNNING_ACTION: {
				TimerRunningAction timerRunningAction = (TimerRunningAction)theEObject;
				T result = caseTimerRunningAction(timerRunningAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.GET_TIMEZONE_ACTION: {
				GetTimezoneAction getTimezoneAction = (GetTimezoneAction)theEObject;
				T result = caseGetTimezoneAction(getTimezoneAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.SET_TIMEZONE_ACTION: {
				SetTimezoneAction setTimezoneAction = (SetTimezoneAction)theEObject;
				T result = caseSetTimezoneAction(setTimezoneAction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.DATA_PARTITION: {
				DataPartition dataPartition = (DataPartition)theEObject;
				T result = caseDataPartition(dataPartition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.DATA_POOL: {
				DataPool dataPool = (DataPool)theEObject;
				T result = caseDataPool(dataPool);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.DATA_SELECTOR: {
				DataSelector dataSelector = (DataSelector)theEObject;
				T result = caseDataSelector(dataSelector);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.CODING_RULE: {
				CodingRule codingRule = (CodingRule)theEObject;
				T result = caseCodingRule(codingRule);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.MODIFICATION: {
				Modification modification = (Modification)theEObject;
				T result = caseModification(modification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.LITERAL_ANY: {
				LiteralAny literalAny = (LiteralAny)theEObject;
				T result = caseLiteralAny(literalAny);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.LITERAL_ANY_OR_NULL: {
				LiteralAnyOrNull literalAnyOrNull = (LiteralAnyOrNull)theEObject;
				T result = caseLiteralAnyOrNull(literalAnyOrNull);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TEST_OBJECTIVE_SPECIFICATION: {
				TestObjectiveSpecification testObjectiveSpecification = (TestObjectiveSpecification)theEObject;
				T result = caseTestObjectiveSpecification(testObjectiveSpecification);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TEST_LOG: {
				TestLog testLog = (TestLog)theEObject;
				T result = caseTestLog(testLog);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TEST_LOG_APPLICATION: {
				TestLogApplication testLogApplication = (TestLogApplication)theEObject;
				T result = caseTestLogApplication(testLogApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TEST_LOG_ENTRY: {
				TestLogEntry testLogEntry = (TestLogEntry)theEObject;
				T result = caseTestLogEntry(testLogEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case UTPPackage.TEST_OBJECTIVE: {
				TestObjective testObjective = (TestObjective)theEObject;
				T result = caseTestObjective(testObjective);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Component</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Component</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestComponent(TestComponent object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SUT</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SUT</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSUT(SUT object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Context</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Context</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestContext(TestContext object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Determ Alt</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Determ Alt</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDetermAlt(DetermAlt object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Finish Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Finish Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFinishAction(FinishAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Log Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Log Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLogAction(LogAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Case</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestCase(TestCase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Validation Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Validation Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseValidationAction(ValidationAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefault(Default object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Default Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Default Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDefaultApplication(DefaultApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Out</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Out</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOut(TimeOut object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Out Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Out Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOutMessage(TimeOutMessage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Time Out Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Time Out Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimeOutAction(TimeOutAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Read Timer Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Read Timer Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReadTimerAction(ReadTimerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Start Timer Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Start Timer Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStartTimerAction(StartTimerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stop Timer Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stop Timer Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStopTimerAction(StopTimerAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Timer Running Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Timer Running Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTimerRunningAction(TimerRunningAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Get Timezone Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Get Timezone Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseGetTimezoneAction(GetTimezoneAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Set Timezone Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Set Timezone Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSetTimezoneAction(SetTimezoneAction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Partition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Partition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPartition(DataPartition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Pool</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Pool</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataPool(DataPool object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data Selector</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data Selector</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDataSelector(DataSelector object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coding Rule</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coding Rule</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCodingRule(CodingRule object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Modification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Modification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModification(Modification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Any</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Any</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralAny(LiteralAny object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Any Or Null</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Any Or Null</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralAnyOrNull(LiteralAnyOrNull object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Objective Specification</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Objective Specification</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestObjectiveSpecification(TestObjectiveSpecification object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Log</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Log</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestLog(TestLog object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Log Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Log Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestLogApplication(TestLogApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Log Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Log Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestLogEntry(TestLogEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Test Objective</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Test Objective</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTestObjective(TestObjective object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //UTPSwitch
