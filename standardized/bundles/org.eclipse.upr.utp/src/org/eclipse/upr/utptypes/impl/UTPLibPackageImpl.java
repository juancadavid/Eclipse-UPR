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
package org.eclipse.upr.utptypes.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.uml2.types.TypesPackage;

import org.eclipse.upr.utptypes.Arbiter;
import org.eclipse.upr.utptypes.Timer;
import org.eclipse.upr.utptypes.UTPLibFactory;
import org.eclipse.upr.utptypes.UTPLibPackage;
import org.eclipse.upr.utptypes.Verdict;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class UTPLibPackageImpl extends EPackageImpl implements UTPLibPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass arbiterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum verdictEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timepointEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType durationEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timezoneEDataType = null;

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
	 * @see org.eclipse.upr.utptypes.UTPLibPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private UTPLibPackageImpl() {
		super(eNS_URI, UTPLibFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link UTPLibPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static UTPLibPackage init() {
		if (isInited) return (UTPLibPackage)EPackage.Registry.INSTANCE.getEPackage(UTPLibPackage.eNS_URI);

		// Obtain or create and register package
		UTPLibPackageImpl theUTPLibPackage = (UTPLibPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof UTPLibPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new UTPLibPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypesPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theUTPLibPackage.createPackageContents();

		// Initialize created meta-data
		theUTPLibPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theUTPLibPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(UTPLibPackage.eNS_URI, theUTPLibPackage);
		return theUTPLibPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArbiter() {
		return arbiterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimer() {
		return timerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTimer_IsRunning() {
		return (EAttribute)timerEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVerdict() {
		return verdictEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimepoint() {
		return timepointEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getDuration() {
		return durationEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getTimezone() {
		return timezoneEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UTPLibFactory getUTPLibFactory() {
		return (UTPLibFactory)getEFactoryInstance();
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
		arbiterEClass = createEClass(ARBITER);

		timerEClass = createEClass(TIMER);
		createEAttribute(timerEClass, TIMER__IS_RUNNING);

		// Create enums
		verdictEEnum = createEEnum(VERDICT);

		// Create data types
		timepointEDataType = createEDataType(TIMEPOINT);
		durationEDataType = createEDataType(DURATION);
		timezoneEDataType = createEDataType(TIMEZONE);
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
		TypesPackage theTypesPackage = (TypesPackage)EPackage.Registry.INSTANCE.getEPackage(TypesPackage.eNS_URI);

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(arbiterEClass, Arbiter.class, "Arbiter", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		addEOperation(arbiterEClass, this.getVerdict(), "getVerdict", 1, 1, IS_UNIQUE, !IS_ORDERED);

		EOperation op = addEOperation(arbiterEClass, null, "setVerdict");
		addEParameter(op, this.getVerdict(), "v", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(timerEClass, Timer.class, "Timer", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimer_IsRunning(), theTypesPackage.getBoolean(), "isRunning", null, 1, 1, Timer.class, !IS_TRANSIENT, !IS_VOLATILE, !IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		op = addEOperation(timerEClass, null, "start");
		addEParameter(op, this.getTimepoint(), "expire", 1, 1, IS_UNIQUE, !IS_ORDERED);

		op = addEOperation(timerEClass, null, "start2");
		addEParameter(op, this.getDuration(), "expire", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(timerEClass, null, "stop");

		addEOperation(timerEClass, this.getDuration(), "read", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(verdictEEnum, Verdict.class, "Verdict");
		addEEnumLiteral(verdictEEnum, Verdict.NONE_LITERAL);
		addEEnumLiteral(verdictEEnum, Verdict.PASS_LITERAL);
		addEEnumLiteral(verdictEEnum, Verdict.INCONCLUSIVE_LITERAL);
		addEEnumLiteral(verdictEEnum, Verdict.FAIL_LITERAL);
		addEEnumLiteral(verdictEEnum, Verdict.ERROR_LITERAL);

		// Initialize data types
		initEDataType(timepointEDataType, String.class, "Timepoint", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(durationEDataType, String.class, "Duration", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timezoneEDataType, String.class, "Timezone", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EOperation addEOperation(EClass owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EOperation o = addEOperation(owner, type, name, lowerBound, upperBound);
		o.setUnique(isUnique);
		o.setOrdered(isOrdered);
		return o;
	}
	
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EParameter addEParameter(EOperation owner, EClassifier type, String name, int lowerBound, int upperBound, boolean isUnique, boolean isOrdered) {
		EParameter p = ecoreFactory.createEParameter();
		p.setEType(type);
		p.setName(name);
		p.setLowerBound(lowerBound);
		p.setUpperBound(upperBound);
		p.setUnique(isUnique);
		p.setOrdered(isOrdered);
		owner.getEParameters().add(p);
		return p;
	}
	
} //UTPLibPackageImpl
