/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 */
package org.eclipse.upr.bpmnprof.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.ParameterSet;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.DataInput;
import org.eclipse.upr.bpmnprof.InputSet;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Set</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputSetImpl#getBase_ParameterSet <em>Base Parameter Set</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputSetImpl#getOptionalInputRefs <em>Optional Input Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputSetImpl#getWhileExecutingInputRefs <em>While Executing Input Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.InputSetImpl#getDataInputRefs <em>Data Input Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InputSetImpl extends BaseElementImpl implements InputSet {
	/**
	 * The cached value of the '{@link #getBase_ParameterSet() <em>Base Parameter Set</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ParameterSet()
	 * @generated
	 * @ordered
	 */
	protected ParameterSet base_ParameterSet;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputSetImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getInputSet();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet getBase_ParameterSet() {
		if (base_ParameterSet != null && base_ParameterSet.eIsProxy()) {
			InternalEObject oldBase_ParameterSet = (InternalEObject)base_ParameterSet;
			base_ParameterSet = (ParameterSet)eResolveProxy(oldBase_ParameterSet);
			if (base_ParameterSet != oldBase_ParameterSet) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.INPUT_SET__BASE_PARAMETER_SET, oldBase_ParameterSet, base_ParameterSet));
			}
		}
		return base_ParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterSet basicGetBase_ParameterSet() {
		return base_ParameterSet;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ParameterSet(ParameterSet newBase_ParameterSet) {
		ParameterSet oldBase_ParameterSet = base_ParameterSet;
		base_ParameterSet = newBase_ParameterSet;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.INPUT_SET__BASE_PARAMETER_SET, oldBase_ParameterSet, base_ParameterSet));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataInput> getOptionalInputRefs() {
		// TODO: implement this method to return the 'Optional Input Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataInput> getWhileExecutingInputRefs() {
		// TODO: implement this method to return the 'While Executing Input Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DataInput> getDataInputRefs() {
		// TODO: implement this method to return the 'Data Input Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean InputSetdataInputRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.INPUT_SET__INPUT_SETDATA_INPUT_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InputSetdataInputRefs", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean InputSetoptionalInputRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.INPUT_SET__INPUT_SETOPTIONAL_INPUT_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InputSetoptionalInputRefs", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean InputSetwhileExecutingInputRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.INPUT_SET__INPUT_SETWHILE_EXECUTING_INPUT_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InputSetwhileExecutingInputRefs", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.INPUT_SET__BASE_PARAMETER_SET:
				if (resolve) return getBase_ParameterSet();
				return basicGetBase_ParameterSet();
			case BpmnprofPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
				return getOptionalInputRefs();
			case BpmnprofPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				return getWhileExecutingInputRefs();
			case BpmnprofPackage.INPUT_SET__DATA_INPUT_REFS:
				return getDataInputRefs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.INPUT_SET__BASE_PARAMETER_SET:
				setBase_ParameterSet((ParameterSet)newValue);
				return;
			case BpmnprofPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
				getOptionalInputRefs().clear();
				getOptionalInputRefs().addAll((Collection<? extends DataInput>)newValue);
				return;
			case BpmnprofPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				getWhileExecutingInputRefs().clear();
				getWhileExecutingInputRefs().addAll((Collection<? extends DataInput>)newValue);
				return;
			case BpmnprofPackage.INPUT_SET__DATA_INPUT_REFS:
				getDataInputRefs().clear();
				getDataInputRefs().addAll((Collection<? extends DataInput>)newValue);
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
			case BpmnprofPackage.INPUT_SET__BASE_PARAMETER_SET:
				setBase_ParameterSet((ParameterSet)null);
				return;
			case BpmnprofPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
				getOptionalInputRefs().clear();
				return;
			case BpmnprofPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				getWhileExecutingInputRefs().clear();
				return;
			case BpmnprofPackage.INPUT_SET__DATA_INPUT_REFS:
				getDataInputRefs().clear();
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
			case BpmnprofPackage.INPUT_SET__BASE_PARAMETER_SET:
				return base_ParameterSet != null;
			case BpmnprofPackage.INPUT_SET__OPTIONAL_INPUT_REFS:
				return !getOptionalInputRefs().isEmpty();
			case BpmnprofPackage.INPUT_SET__WHILE_EXECUTING_INPUT_REFS:
				return !getWhileExecutingInputRefs().isEmpty();
			case BpmnprofPackage.INPUT_SET__DATA_INPUT_REFS:
				return !getDataInputRefs().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BpmnprofPackage.INPUT_SET___INPUT_SETDATA_INPUT_REFS__DIAGNOSTICCHAIN_MAP:
				return InputSetdataInputRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.INPUT_SET___INPUT_SETOPTIONAL_INPUT_REFS__DIAGNOSTICCHAIN_MAP:
				return InputSetoptionalInputRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.INPUT_SET___INPUT_SETWHILE_EXECUTING_INPUT_REFS__DIAGNOSTICCHAIN_MAP:
				return InputSetwhileExecutingInputRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //InputSetImpl
