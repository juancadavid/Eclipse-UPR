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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.upr.utp.CodingRule;
import org.eclipse.upr.utp.DataPartition;
import org.eclipse.upr.utp.DataPool;
import org.eclipse.upr.utp.DataSelector;
import org.eclipse.upr.utp.Default;
import org.eclipse.upr.utp.DefaultApplication;
import org.eclipse.upr.utp.DetermAlt;
import org.eclipse.upr.utp.FinishAction;
import org.eclipse.upr.utp.GetTimezoneAction;
import org.eclipse.upr.utp.LiteralAny;
import org.eclipse.upr.utp.LiteralAnyOrNull;
import org.eclipse.upr.utp.LogAction;
import org.eclipse.upr.utp.Modification;
import org.eclipse.upr.utp.ReadTimerAction;
import org.eclipse.upr.utp.SetTimezoneAction;
import org.eclipse.upr.utp.StartTimerAction;
import org.eclipse.upr.utp.StopTimerAction;
import org.eclipse.upr.utp.TestCase;
import org.eclipse.upr.utp.TestComponent;
import org.eclipse.upr.utp.TestContext;
import org.eclipse.upr.utp.TestLog;
import org.eclipse.upr.utp.TestLogApplication;
import org.eclipse.upr.utp.TestLogEntry;
import org.eclipse.upr.utp.TestObjective;
import org.eclipse.upr.utp.TestObjectiveSpecification;
import org.eclipse.upr.utp.TimeOut;
import org.eclipse.upr.utp.TimeOutAction;
import org.eclipse.upr.utp.TimeOutMessage;
import org.eclipse.upr.utp.TimerRunningAction;
import org.eclipse.upr.utp.UTPFactory;
import org.eclipse.upr.utp.UTPPackage;
import org.eclipse.upr.utp.ValidationAction;

import org.eclipse.upr.utptypes.UTPLibPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UTPPackageImpl extends EPackageImpl implements UTPPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testComponentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testContextEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass determAltEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass finishActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass logActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testCaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass validationActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass defaultApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOutEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOutMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timeOutActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass readTimerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startTimerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass stopTimerActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerRunningActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass getTimezoneActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass setTimezoneActionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPartitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataPoolEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataSelectorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass modificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalAnyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalAnyOrNullEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testObjectiveSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testLogEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testLogApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testLogEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass testObjectiveEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.upr.utp.UTPPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UTPPackageImpl() {
		super(eNS_URI, UTPFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link UTPPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UTPPackage init() {
		if (isInited) return (UTPPackage)EPackage.Registry.INSTANCE.getEPackage(UTPPackage.eNS_URI);

		// Obtain or create and register package
		UTPPackageImpl theUTPPackage = (UTPPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UTPPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UTPPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();
		UTPLibPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUTPPackage.createPackageContents();

		// Initialize created meta-data
		theUTPPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUTPPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UTPPackage.eNS_URI, theUTPPackage);
		return theUTPPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestComponent() {
		return testComponentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestComponent_Base_Class() {
		return (EReference)testComponentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestComponent_Zone() {
		return (EAttribute)testComponentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSUT() {
		return sutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSUT_Base_Property() {
		return (EReference)sutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestContext() {
		return testContextEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestContext_Base_BehavioredClassifier() {
		return (EReference)testContextEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestContext_Base_StructuredClassifier() {
		return (EReference)testContextEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestContext_TestLevel() {
		return (EReference)testContextEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestContext_Arbiter() {
		return (EReference)testContextEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDetermAlt() {
		return determAltEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDetermAlt_Base_CombinedFragment() {
		return (EReference)determAltEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFinishAction() {
		return finishActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinishAction_Base_OpaqueAction() {
		return (EReference)finishActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFinishAction_Base_InvocationAction() {
		return (EReference)finishActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLogAction() {
		return logActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLogAction_Base_SendObjectAction() {
		return (EReference)logActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestCase() {
		return testCaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Base_Operation() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Base_Behavior() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_Priority() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestCase_TestType() {
		return (EReference)testCaseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getValidationAction() {
		return validationActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationAction_Base_CallOperationAction() {
		return (EReference)validationActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getValidationAction_Reason() {
		return (EReference)validationActionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefault() {
		return defaultEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefault_Base_Behavior() {
		return (EReference)defaultEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefaultApplication() {
		return defaultApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefaultApplication_Repetition() {
		return (EAttribute)defaultApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefaultApplication_Base_Dependency() {
		return (EReference)defaultApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOut() {
		return timeOutEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOut_Base_TimeEvent() {
		return (EReference)timeOutEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOutMessage() {
		return timeOutMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOutMessage_Base_Message() {
		return (EReference)timeOutMessageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimeOutAction() {
		return timeOutActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimeOutAction_Base_AcceptEventAction() {
		return (EReference)timeOutActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReadTimerAction() {
		return readTimerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReadTimerAction_Base_CallOperationAction() {
		return (EReference)readTimerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartTimerAction() {
		return startTimerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStartTimerAction_Base_CallOperationAction() {
		return (EReference)startTimerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStopTimerAction() {
		return stopTimerActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStopTimerAction_Base_CallOperationAction() {
		return (EReference)stopTimerActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerRunningAction() {
		return timerRunningActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerRunningAction_Base_ReadStructuralFeatureAction() {
		return (EReference)timerRunningActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGetTimezoneAction() {
		return getTimezoneActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGetTimezoneAction_Base_ReadStructuralFeatureAction() {
		return (EReference)getTimezoneActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSetTimezoneAction() {
		return setTimezoneActionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSetTimezoneAction_Base_WriteStructuralFeatureAction() {
		return (EReference)setTimezoneActionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPartition() {
		return dataPartitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPartition_Base_Classifier() {
		return (EReference)dataPartitionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataPool() {
		return dataPoolEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPool_Base_Classifier() {
		return (EReference)dataPoolEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataPool_Base_Property() {
		return (EReference)dataPoolEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataSelector() {
		return dataSelectorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataSelector_Base_Operation() {
		return (EReference)dataSelectorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCodingRule() {
		return codingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCodingRule_Coding() {
		return (EAttribute)codingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodingRule_Base_Namespace() {
		return (EReference)codingRuleEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodingRule_Base_ValueSpecification() {
		return (EReference)codingRuleEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCodingRule_Base_Property() {
		return (EReference)codingRuleEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getModification() {
		return modificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getModification_Base_Dependency() {
		return (EReference)modificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralAny() {
		return literalAnyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralAny_Base_LiteralSpecification() {
		return (EReference)literalAnyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralAnyOrNull() {
		return literalAnyOrNullEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLiteralAnyOrNull_Base_LiteralSpecification() {
		return (EReference)literalAnyOrNullEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestObjectiveSpecification() {
		return testObjectiveSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestObjectiveSpecification_Base_Class() {
		return (EReference)testObjectiveSpecificationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestObjectiveSpecification_Id() {
		return (EAttribute)testObjectiveSpecificationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestObjectiveSpecification_Specification() {
		return (EAttribute)testObjectiveSpecificationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestObjectiveSpecification_Priority() {
		return (EReference)testObjectiveSpecificationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestObjectiveSpecification_References() {
		return (EAttribute)testObjectiveSpecificationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestLog() {
		return testLogEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestLog_Tester() {
		return (EReference)testLogEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestLog_ExecutionAt() {
		return (EAttribute)testLogEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestLog_Duration() {
		return (EAttribute)testLogEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestLog_Verdict() {
		return (EAttribute)testLogEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestLog_VerdictReason() {
		return (EReference)testLogEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestLogApplication() {
		return testLogApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestLogEntry() {
		return testLogEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTestLogEntry_Timestamp() {
		return (EAttribute)testLogEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTestObjective() {
		return testObjectiveEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTestObjective_Base_Dependency() {
		return (EReference)testObjectiveEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTPFactory getUTPFactory() {
		return (UTPFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		testComponentEClass = createEClass(TEST_COMPONENT);
		createEReference(testComponentEClass, TEST_COMPONENT__BASE_CLASS);
		createEAttribute(testComponentEClass, TEST_COMPONENT__ZONE);

		sutEClass = createEClass(SUT);
		createEReference(sutEClass, SUT__BASE_PROPERTY);

		testContextEClass = createEClass(TEST_CONTEXT);
		createEReference(testContextEClass, TEST_CONTEXT__BASE_BEHAVIORED_CLASSIFIER);
		createEReference(testContextEClass, TEST_CONTEXT__BASE_STRUCTURED_CLASSIFIER);
		createEReference(testContextEClass, TEST_CONTEXT__TEST_LEVEL);
		createEReference(testContextEClass, TEST_CONTEXT__ARBITER);

		determAltEClass = createEClass(DETERM_ALT);
		createEReference(determAltEClass, DETERM_ALT__BASE_COMBINED_FRAGMENT);

		finishActionEClass = createEClass(FINISH_ACTION);
		createEReference(finishActionEClass, FINISH_ACTION__BASE_OPAQUE_ACTION);
		createEReference(finishActionEClass, FINISH_ACTION__BASE_INVOCATION_ACTION);

		logActionEClass = createEClass(LOG_ACTION);
		createEReference(logActionEClass, LOG_ACTION__BASE_SEND_OBJECT_ACTION);

		testCaseEClass = createEClass(TEST_CASE);
		createEReference(testCaseEClass, TEST_CASE__BASE_OPERATION);
		createEReference(testCaseEClass, TEST_CASE__BASE_BEHAVIOR);
		createEReference(testCaseEClass, TEST_CASE__PRIORITY);
		createEReference(testCaseEClass, TEST_CASE__TEST_TYPE);

		validationActionEClass = createEClass(VALIDATION_ACTION);
		createEReference(validationActionEClass, VALIDATION_ACTION__BASE_CALL_OPERATION_ACTION);
		createEReference(validationActionEClass, VALIDATION_ACTION__REASON);

		defaultEClass = createEClass(DEFAULT);
		createEReference(defaultEClass, DEFAULT__BASE_BEHAVIOR);

		defaultApplicationEClass = createEClass(DEFAULT_APPLICATION);
		createEAttribute(defaultApplicationEClass, DEFAULT_APPLICATION__REPETITION);
		createEReference(defaultApplicationEClass, DEFAULT_APPLICATION__BASE_DEPENDENCY);

		timeOutEClass = createEClass(TIME_OUT);
		createEReference(timeOutEClass, TIME_OUT__BASE_TIME_EVENT);

		timeOutMessageEClass = createEClass(TIME_OUT_MESSAGE);
		createEReference(timeOutMessageEClass, TIME_OUT_MESSAGE__BASE_MESSAGE);

		timeOutActionEClass = createEClass(TIME_OUT_ACTION);
		createEReference(timeOutActionEClass, TIME_OUT_ACTION__BASE_ACCEPT_EVENT_ACTION);

		readTimerActionEClass = createEClass(READ_TIMER_ACTION);
		createEReference(readTimerActionEClass, READ_TIMER_ACTION__BASE_CALL_OPERATION_ACTION);

		startTimerActionEClass = createEClass(START_TIMER_ACTION);
		createEReference(startTimerActionEClass, START_TIMER_ACTION__BASE_CALL_OPERATION_ACTION);

		stopTimerActionEClass = createEClass(STOP_TIMER_ACTION);
		createEReference(stopTimerActionEClass, STOP_TIMER_ACTION__BASE_CALL_OPERATION_ACTION);

		timerRunningActionEClass = createEClass(TIMER_RUNNING_ACTION);
		createEReference(timerRunningActionEClass, TIMER_RUNNING_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION);

		getTimezoneActionEClass = createEClass(GET_TIMEZONE_ACTION);
		createEReference(getTimezoneActionEClass, GET_TIMEZONE_ACTION__BASE_READ_STRUCTURAL_FEATURE_ACTION);

		setTimezoneActionEClass = createEClass(SET_TIMEZONE_ACTION);
		createEReference(setTimezoneActionEClass, SET_TIMEZONE_ACTION__BASE_WRITE_STRUCTURAL_FEATURE_ACTION);

		dataPartitionEClass = createEClass(DATA_PARTITION);
		createEReference(dataPartitionEClass, DATA_PARTITION__BASE_CLASSIFIER);

		dataPoolEClass = createEClass(DATA_POOL);
		createEReference(dataPoolEClass, DATA_POOL__BASE_CLASSIFIER);
		createEReference(dataPoolEClass, DATA_POOL__BASE_PROPERTY);

		dataSelectorEClass = createEClass(DATA_SELECTOR);
		createEReference(dataSelectorEClass, DATA_SELECTOR__BASE_OPERATION);

		codingRuleEClass = createEClass(CODING_RULE);
		createEAttribute(codingRuleEClass, CODING_RULE__CODING);
		createEReference(codingRuleEClass, CODING_RULE__BASE_NAMESPACE);
		createEReference(codingRuleEClass, CODING_RULE__BASE_VALUE_SPECIFICATION);
		createEReference(codingRuleEClass, CODING_RULE__BASE_PROPERTY);

		modificationEClass = createEClass(MODIFICATION);
		createEReference(modificationEClass, MODIFICATION__BASE_DEPENDENCY);

		literalAnyEClass = createEClass(LITERAL_ANY);
		createEReference(literalAnyEClass, LITERAL_ANY__BASE_LITERAL_SPECIFICATION);

		literalAnyOrNullEClass = createEClass(LITERAL_ANY_OR_NULL);
		createEReference(literalAnyOrNullEClass, LITERAL_ANY_OR_NULL__BASE_LITERAL_SPECIFICATION);

		testObjectiveSpecificationEClass = createEClass(TEST_OBJECTIVE_SPECIFICATION);
		createEReference(testObjectiveSpecificationEClass, TEST_OBJECTIVE_SPECIFICATION__BASE_CLASS);
		createEAttribute(testObjectiveSpecificationEClass, TEST_OBJECTIVE_SPECIFICATION__ID);
		createEAttribute(testObjectiveSpecificationEClass, TEST_OBJECTIVE_SPECIFICATION__SPECIFICATION);
		createEReference(testObjectiveSpecificationEClass, TEST_OBJECTIVE_SPECIFICATION__PRIORITY);
		createEAttribute(testObjectiveSpecificationEClass, TEST_OBJECTIVE_SPECIFICATION__REFERENCES);

		testLogEClass = createEClass(TEST_LOG);
		createEReference(testLogEClass, TEST_LOG__TESTER);
		createEAttribute(testLogEClass, TEST_LOG__EXECUTION_AT);
		createEAttribute(testLogEClass, TEST_LOG__DURATION);
		createEAttribute(testLogEClass, TEST_LOG__VERDICT);
		createEReference(testLogEClass, TEST_LOG__VERDICT_REASON);

		testLogApplicationEClass = createEClass(TEST_LOG_APPLICATION);

		testLogEntryEClass = createEClass(TEST_LOG_ENTRY);
		createEAttribute(testLogEntryEClass, TEST_LOG_ENTRY__TIMESTAMP);

		testObjectiveEClass = createEClass(TEST_OBJECTIVE);
		createEReference(testObjectiveEClass, TEST_OBJECTIVE__BASE_DEPENDENCY);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		UMLPackage theUMLPackage = (UMLPackage)EPackage.Registry.INSTANCE.getEPackage(UMLPackage.eNS_URI);
		UTPLibPackage theUTPLibPackage = (UTPLibPackage)EPackage.Registry.INSTANCE.getEPackage(UTPLibPackage.eNS_URI);
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(testComponentEClass, TestComponent.class, "TestComponent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestComponent_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, TestComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestComponent_Zone(), theUTPLibPackage.getTimezone(), "zone", null, 0, 1, TestComponent.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(sutEClass, org.eclipse.upr.utp.SUT.class, "SUT", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSUT_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, org.eclipse.upr.utp.SUT.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testContextEClass, TestContext.class, "TestContext", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestContext_Base_BehavioredClassifier(), theUMLPackage.getBehavioredClassifier(), null, "base_BehavioredClassifier", null, 1, 1, TestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestContext_Base_StructuredClassifier(), theUMLPackage.getStructuredClassifier(), null, "base_StructuredClassifier", null, 1, 1, TestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestContext_TestLevel(), theUMLPackage.getValueSpecification(), null, "testLevel", null, 0, 1, TestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestContext_Arbiter(), theUTPLibPackage.getArbiter(), null, "arbiter", null, 1, 1, TestContext.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(determAltEClass, DetermAlt.class, "DetermAlt", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDetermAlt_Base_CombinedFragment(), theUMLPackage.getCombinedFragment(), null, "base_CombinedFragment", null, 1, 1, DetermAlt.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(finishActionEClass, FinishAction.class, "FinishAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFinishAction_Base_OpaqueAction(), theUMLPackage.getOpaqueAction(), null, "base_OpaqueAction", null, 1, 1, FinishAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFinishAction_Base_InvocationAction(), theUMLPackage.getInvocationAction(), null, "base_InvocationAction", null, 1, 1, FinishAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(logActionEClass, LogAction.class, "LogAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLogAction_Base_SendObjectAction(), theUMLPackage.getSendObjectAction(), null, "base_SendObjectAction", null, 1, 1, LogAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testCaseEClass, TestCase.class, "TestCase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestCase_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestCase_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 1, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestCase_Priority(), theUMLPackage.getValueSpecification(), null, "priority", null, 0, 1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestCase_TestType(), theUMLPackage.getValueSpecification(), null, "testType", null, 0, -1, TestCase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(validationActionEClass, ValidationAction.class, "ValidationAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getValidationAction_Base_CallOperationAction(), theUMLPackage.getCallOperationAction(), null, "base_CallOperationAction", null, 1, 1, ValidationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getValidationAction_Reason(), theUMLPackage.getValueSpecification(), null, "reason", null, 0, -1, ValidationAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(defaultEClass, Default.class, "Default", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDefault_Base_Behavior(), theUMLPackage.getBehavior(), null, "base_Behavior", null, 1, 1, Default.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(defaultApplicationEClass, DefaultApplication.class, "DefaultApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDefaultApplication_Repetition(), theTypesPackage.getUnlimitedNatural(), "repetition", "0", 1, 1, DefaultApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDefaultApplication_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, DefaultApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeOutEClass, TimeOut.class, "TimeOut", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeOut_Base_TimeEvent(), theUMLPackage.getTimeEvent(), null, "base_TimeEvent", null, 1, 1, TimeOut.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeOutMessageEClass, TimeOutMessage.class, "TimeOutMessage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeOutMessage_Base_Message(), theUMLPackage.getMessage(), null, "base_Message", null, 1, 1, TimeOutMessage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timeOutActionEClass, TimeOutAction.class, "TimeOutAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimeOutAction_Base_AcceptEventAction(), theUMLPackage.getAcceptEventAction(), null, "base_AcceptEventAction", null, 1, 1, TimeOutAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(readTimerActionEClass, ReadTimerAction.class, "ReadTimerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReadTimerAction_Base_CallOperationAction(), theUMLPackage.getCallOperationAction(), null, "base_CallOperationAction", null, 1, 1, ReadTimerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(startTimerActionEClass, StartTimerAction.class, "StartTimerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStartTimerAction_Base_CallOperationAction(), theUMLPackage.getCallOperationAction(), null, "base_CallOperationAction", null, 1, 1, StartTimerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(stopTimerActionEClass, StopTimerAction.class, "StopTimerAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getStopTimerAction_Base_CallOperationAction(), theUMLPackage.getCallOperationAction(), null, "base_CallOperationAction", null, 1, 1, StopTimerAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(timerRunningActionEClass, TimerRunningAction.class, "TimerRunningAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTimerRunningAction_Base_ReadStructuralFeatureAction(), theUMLPackage.getReadStructuralFeatureAction(), null, "base_ReadStructuralFeatureAction", null, 1, 1, TimerRunningAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(getTimezoneActionEClass, GetTimezoneAction.class, "GetTimezoneAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGetTimezoneAction_Base_ReadStructuralFeatureAction(), theUMLPackage.getReadStructuralFeatureAction(), null, "base_ReadStructuralFeatureAction", null, 1, 1, GetTimezoneAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(setTimezoneActionEClass, SetTimezoneAction.class, "SetTimezoneAction", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSetTimezoneAction_Base_WriteStructuralFeatureAction(), theUMLPackage.getWriteStructuralFeatureAction(), null, "base_WriteStructuralFeatureAction", null, 1, 1, SetTimezoneAction.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPartitionEClass, DataPartition.class, "DataPartition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPartition_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, DataPartition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataPoolEClass, DataPool.class, "DataPool", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataPool_Base_Classifier(), theUMLPackage.getClassifier(), null, "base_Classifier", null, 1, 1, DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDataPool_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, DataPool.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(dataSelectorEClass, DataSelector.class, "DataSelector", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDataSelector_Base_Operation(), theUMLPackage.getOperation(), null, "base_Operation", null, 1, 1, DataSelector.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(codingRuleEClass, CodingRule.class, "CodingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCodingRule_Coding(), theTypesPackage.getString(), "coding", null, 1, 1, CodingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCodingRule_Base_Namespace(), theUMLPackage.getNamespace(), null, "base_Namespace", null, 1, 1, CodingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCodingRule_Base_ValueSpecification(), theUMLPackage.getValueSpecification(), null, "base_ValueSpecification", null, 1, 1, CodingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCodingRule_Base_Property(), theUMLPackage.getProperty(), null, "base_Property", null, 1, 1, CodingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(modificationEClass, Modification.class, "Modification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getModification_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, Modification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalAnyEClass, LiteralAny.class, "LiteralAny", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralAny_Base_LiteralSpecification(), theUMLPackage.getLiteralSpecification(), null, "base_LiteralSpecification", null, 1, 1, LiteralAny.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(literalAnyOrNullEClass, LiteralAnyOrNull.class, "LiteralAnyOrNull", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getLiteralAnyOrNull_Base_LiteralSpecification(), theUMLPackage.getLiteralSpecification(), null, "base_LiteralSpecification", null, 1, 1, LiteralAnyOrNull.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testObjectiveSpecificationEClass, TestObjectiveSpecification.class, "TestObjectiveSpecification", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestObjectiveSpecification_Base_Class(), theUMLPackage.getClass_(), null, "base_Class", null, 1, 1, TestObjectiveSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestObjectiveSpecification_Id(), theTypesPackage.getString(), "id", null, 1, 1, TestObjectiveSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestObjectiveSpecification_Specification(), theTypesPackage.getString(), "specification", null, 1, 1, TestObjectiveSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestObjectiveSpecification_Priority(), theUMLPackage.getValueSpecification(), null, "priority", null, 0, 1, TestObjectiveSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestObjectiveSpecification_References(), theTypesPackage.getString(), "references", null, 0, -1, TestObjectiveSpecification.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testLogEClass, TestLog.class, "TestLog", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestLog_Tester(), theUMLPackage.getValueSpecification(), null, "tester", null, 0, -1, TestLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestLog_ExecutionAt(), ecorePackage.getEJavaObject(), "executionAt", null, 0, 1, TestLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestLog_Duration(), ecorePackage.getEJavaObject(), "duration", null, 0, 1, TestLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getTestLog_Verdict(), ecorePackage.getEJavaObject(), "verdict", null, 1, 1, TestLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTestLog_VerdictReason(), theUMLPackage.getValueSpecification(), null, "verdictReason", null, 0, -1, TestLog.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testLogApplicationEClass, TestLogApplication.class, "TestLogApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(testLogEntryEClass, TestLogEntry.class, "TestLogEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTestLogEntry_Timestamp(), ecorePackage.getEJavaObject(), "timestamp", null, 1, 1, TestLogEntry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(testObjectiveEClass, TestObjective.class, "TestObjective", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTestObjective_Base_Dependency(), theUMLPackage.getDependency(), null, "base_Dependency", null, 1, 1, TestObjective.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //UTPPackageImpl
