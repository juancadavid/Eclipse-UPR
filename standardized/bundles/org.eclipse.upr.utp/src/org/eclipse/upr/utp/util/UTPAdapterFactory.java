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

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.upr.utp.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.upr.utp.UTPPackage
 * @generated
 */
public class UTPAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static UTPPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTPAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = UTPPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UTPSwitch<Adapter> modelSwitch =
		new UTPSwitch<Adapter>() {
			@Override
			public Adapter caseTestComponent(TestComponent object) {
				return createTestComponentAdapter();
			}
			@Override
			public Adapter caseSUT(SUT object) {
				return createSUTAdapter();
			}
			@Override
			public Adapter caseTestContext(TestContext object) {
				return createTestContextAdapter();
			}
			@Override
			public Adapter caseDetermAlt(DetermAlt object) {
				return createDetermAltAdapter();
			}
			@Override
			public Adapter caseFinishAction(FinishAction object) {
				return createFinishActionAdapter();
			}
			@Override
			public Adapter caseLogAction(LogAction object) {
				return createLogActionAdapter();
			}
			@Override
			public Adapter caseTestCase(TestCase object) {
				return createTestCaseAdapter();
			}
			@Override
			public Adapter caseValidationAction(ValidationAction object) {
				return createValidationActionAdapter();
			}
			@Override
			public Adapter caseDefault(Default object) {
				return createDefaultAdapter();
			}
			@Override
			public Adapter caseDefaultApplication(DefaultApplication object) {
				return createDefaultApplicationAdapter();
			}
			@Override
			public Adapter caseTimeOut(TimeOut object) {
				return createTimeOutAdapter();
			}
			@Override
			public Adapter caseTimeOutMessage(TimeOutMessage object) {
				return createTimeOutMessageAdapter();
			}
			@Override
			public Adapter caseTimeOutAction(TimeOutAction object) {
				return createTimeOutActionAdapter();
			}
			@Override
			public Adapter caseReadTimerAction(ReadTimerAction object) {
				return createReadTimerActionAdapter();
			}
			@Override
			public Adapter caseStartTimerAction(StartTimerAction object) {
				return createStartTimerActionAdapter();
			}
			@Override
			public Adapter caseStopTimerAction(StopTimerAction object) {
				return createStopTimerActionAdapter();
			}
			@Override
			public Adapter caseTimerRunningAction(TimerRunningAction object) {
				return createTimerRunningActionAdapter();
			}
			@Override
			public Adapter caseGetTimezoneAction(GetTimezoneAction object) {
				return createGetTimezoneActionAdapter();
			}
			@Override
			public Adapter caseSetTimezoneAction(SetTimezoneAction object) {
				return createSetTimezoneActionAdapter();
			}
			@Override
			public Adapter caseDataPartition(DataPartition object) {
				return createDataPartitionAdapter();
			}
			@Override
			public Adapter caseDataPool(DataPool object) {
				return createDataPoolAdapter();
			}
			@Override
			public Adapter caseDataSelector(DataSelector object) {
				return createDataSelectorAdapter();
			}
			@Override
			public Adapter caseCodingRule(CodingRule object) {
				return createCodingRuleAdapter();
			}
			@Override
			public Adapter caseModification(Modification object) {
				return createModificationAdapter();
			}
			@Override
			public Adapter caseLiteralAny(LiteralAny object) {
				return createLiteralAnyAdapter();
			}
			@Override
			public Adapter caseLiteralAnyOrNull(LiteralAnyOrNull object) {
				return createLiteralAnyOrNullAdapter();
			}
			@Override
			public Adapter caseTestObjectiveSpecification(TestObjectiveSpecification object) {
				return createTestObjectiveSpecificationAdapter();
			}
			@Override
			public Adapter caseTestLog(TestLog object) {
				return createTestLogAdapter();
			}
			@Override
			public Adapter caseTestLogApplication(TestLogApplication object) {
				return createTestLogApplicationAdapter();
			}
			@Override
			public Adapter caseTestLogEntry(TestLogEntry object) {
				return createTestLogEntryAdapter();
			}
			@Override
			public Adapter caseTestObjective(TestObjective object) {
				return createTestObjectiveAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestComponent <em>Test Component</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestComponent
	 * @generated
	 */
	public Adapter createTestComponentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.SUT <em>SUT</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.SUT
	 * @generated
	 */
	public Adapter createSUTAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestContext <em>Test Context</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestContext
	 * @generated
	 */
	public Adapter createTestContextAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.DetermAlt <em>Determ Alt</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.DetermAlt
	 * @generated
	 */
	public Adapter createDetermAltAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.FinishAction <em>Finish Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.FinishAction
	 * @generated
	 */
	public Adapter createFinishActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.LogAction <em>Log Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.LogAction
	 * @generated
	 */
	public Adapter createLogActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestCase <em>Test Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestCase
	 * @generated
	 */
	public Adapter createTestCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.ValidationAction <em>Validation Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.ValidationAction
	 * @generated
	 */
	public Adapter createValidationActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.Default <em>Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.Default
	 * @generated
	 */
	public Adapter createDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.DefaultApplication <em>Default Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.DefaultApplication
	 * @generated
	 */
	public Adapter createDefaultApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TimeOut <em>Time Out</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TimeOut
	 * @generated
	 */
	public Adapter createTimeOutAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TimeOutMessage <em>Time Out Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TimeOutMessage
	 * @generated
	 */
	public Adapter createTimeOutMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TimeOutAction <em>Time Out Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TimeOutAction
	 * @generated
	 */
	public Adapter createTimeOutActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.ReadTimerAction <em>Read Timer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.ReadTimerAction
	 * @generated
	 */
	public Adapter createReadTimerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.StartTimerAction <em>Start Timer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.StartTimerAction
	 * @generated
	 */
	public Adapter createStartTimerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.StopTimerAction <em>Stop Timer Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.StopTimerAction
	 * @generated
	 */
	public Adapter createStopTimerActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TimerRunningAction <em>Timer Running Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TimerRunningAction
	 * @generated
	 */
	public Adapter createTimerRunningActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.GetTimezoneAction <em>Get Timezone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.GetTimezoneAction
	 * @generated
	 */
	public Adapter createGetTimezoneActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.SetTimezoneAction <em>Set Timezone Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.SetTimezoneAction
	 * @generated
	 */
	public Adapter createSetTimezoneActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.DataPartition <em>Data Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.DataPartition
	 * @generated
	 */
	public Adapter createDataPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.DataPool <em>Data Pool</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.DataPool
	 * @generated
	 */
	public Adapter createDataPoolAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.DataSelector <em>Data Selector</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.DataSelector
	 * @generated
	 */
	public Adapter createDataSelectorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.CodingRule <em>Coding Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.CodingRule
	 * @generated
	 */
	public Adapter createCodingRuleAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.Modification <em>Modification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.Modification
	 * @generated
	 */
	public Adapter createModificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.LiteralAny <em>Literal Any</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.LiteralAny
	 * @generated
	 */
	public Adapter createLiteralAnyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.LiteralAnyOrNull <em>Literal Any Or Null</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.LiteralAnyOrNull
	 * @generated
	 */
	public Adapter createLiteralAnyOrNullAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestObjectiveSpecification <em>Test Objective Specification</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestObjectiveSpecification
	 * @generated
	 */
	public Adapter createTestObjectiveSpecificationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestLog <em>Test Log</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestLog
	 * @generated
	 */
	public Adapter createTestLogAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestLogApplication <em>Test Log Application</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestLogApplication
	 * @generated
	 */
	public Adapter createTestLogApplicationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestLogEntry <em>Test Log Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestLogEntry
	 * @generated
	 */
	public Adapter createTestLogEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.eclipse.upr.utp.TestObjective <em>Test Objective</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.eclipse.upr.utp.TestObjective
	 * @generated
	 */
	public Adapter createTestObjectiveAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //UTPAdapterFactory
