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

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.GlobalUserTask;
import org.eclipse.upr.bpmnprof.Rendering;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global User Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.GlobalUserTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.GlobalUserTaskImpl#getRenderings <em>Renderings</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalUserTaskImpl extends GlobalTaskImpl implements GlobalUserTask {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalUserTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getGlobalUserTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getImplementation() {
		// TODO: implement this method to return the 'Implementation' attribute list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Rendering> getRenderings() {
		// TODO: implement this method to return the 'Renderings' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GlobalUserTaskrenderings(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.GLOBAL_USER_TASK__GLOBAL_USER_TASKRENDERINGS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GlobalUserTaskrenderings", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean GlobalUserTaskimplementation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.GLOBAL_USER_TASK__GLOBAL_USER_TASKIMPLEMENTATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GlobalUserTaskimplementation", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.GLOBAL_USER_TASK__IMPLEMENTATION:
				return getImplementation();
			case BpmnprofPackage.GLOBAL_USER_TASK__RENDERINGS:
				return getRenderings();
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
			case BpmnprofPackage.GLOBAL_USER_TASK__IMPLEMENTATION:
				getImplementation().clear();
				getImplementation().addAll((Collection<? extends String>)newValue);
				return;
			case BpmnprofPackage.GLOBAL_USER_TASK__RENDERINGS:
				getRenderings().clear();
				getRenderings().addAll((Collection<? extends Rendering>)newValue);
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
			case BpmnprofPackage.GLOBAL_USER_TASK__IMPLEMENTATION:
				getImplementation().clear();
				return;
			case BpmnprofPackage.GLOBAL_USER_TASK__RENDERINGS:
				getRenderings().clear();
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
			case BpmnprofPackage.GLOBAL_USER_TASK__IMPLEMENTATION:
				return !getImplementation().isEmpty();
			case BpmnprofPackage.GLOBAL_USER_TASK__RENDERINGS:
				return !getRenderings().isEmpty();
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
			case BpmnprofPackage.GLOBAL_USER_TASK___GLOBAL_USER_TASKRENDERINGS__DIAGNOSTICCHAIN_MAP:
				return GlobalUserTaskrenderings((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.GLOBAL_USER_TASK___GLOBAL_USER_TASKIMPLEMENTATION__DIAGNOSTICCHAIN_MAP:
				return GlobalUserTaskimplementation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GlobalUserTaskImpl
