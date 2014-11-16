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

import org.eclipse.uml2.uml.OpaqueAction;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ScriptTask;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Script Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ScriptTaskImpl#getBase_OpaqueAction <em>Base Opaque Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ScriptTaskImpl#getScriptFormat <em>Script Format</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ScriptTaskImpl#getScript <em>Script</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ScriptTaskImpl extends TaskImpl implements ScriptTask {
	/**
	 * The cached value of the '{@link #getBase_OpaqueAction() <em>Base Opaque Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_OpaqueAction()
	 * @generated
	 * @ordered
	 */
	protected OpaqueAction base_OpaqueAction;

	/**
	 * The default value of the '{@link #getScriptFormat() <em>Script Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScriptFormat()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_FORMAT_EDEFAULT = null;

	/**
	 * The default value of the '{@link #getScript() <em>Script</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScript()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRIPT_EDEFAULT = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ScriptTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getScriptTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction getBase_OpaqueAction() {
		if (base_OpaqueAction != null && base_OpaqueAction.eIsProxy()) {
			InternalEObject oldBase_OpaqueAction = (InternalEObject)base_OpaqueAction;
			base_OpaqueAction = (OpaqueAction)eResolveProxy(oldBase_OpaqueAction);
			if (base_OpaqueAction != oldBase_OpaqueAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.SCRIPT_TASK__BASE_OPAQUE_ACTION, oldBase_OpaqueAction, base_OpaqueAction));
			}
		}
		return base_OpaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueAction basicGetBase_OpaqueAction() {
		return base_OpaqueAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_OpaqueAction(OpaqueAction newBase_OpaqueAction) {
		OpaqueAction oldBase_OpaqueAction = base_OpaqueAction;
		base_OpaqueAction = newBase_OpaqueAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.SCRIPT_TASK__BASE_OPAQUE_ACTION, oldBase_OpaqueAction, base_OpaqueAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScriptFormat() {
		// TODO: implement this method to return the 'Script Format' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScriptFormat(String newScriptFormat) {
		// TODO: implement this method to set the 'Script Format' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScript() {
		// TODO: implement this method to return the 'Script' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScript(String newScript) {
		// TODO: implement this method to set the 'Script' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ScriptTaskscriptFormat(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SCRIPT_TASK__SCRIPT_TASKSCRIPT_FORMAT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ScriptTaskscriptFormat", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ScriptTaskscript(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SCRIPT_TASK__SCRIPT_TASKSCRIPT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ScriptTaskscript", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.SCRIPT_TASK__BASE_OPAQUE_ACTION:
				if (resolve) return getBase_OpaqueAction();
				return basicGetBase_OpaqueAction();
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT_FORMAT:
				return getScriptFormat();
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT:
				return getScript();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.SCRIPT_TASK__BASE_OPAQUE_ACTION:
				setBase_OpaqueAction((OpaqueAction)newValue);
				return;
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT_FORMAT:
				setScriptFormat((String)newValue);
				return;
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT:
				setScript((String)newValue);
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
			case BpmnprofPackage.SCRIPT_TASK__BASE_OPAQUE_ACTION:
				setBase_OpaqueAction((OpaqueAction)null);
				return;
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT_FORMAT:
				setScriptFormat(SCRIPT_FORMAT_EDEFAULT);
				return;
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT:
				setScript(SCRIPT_EDEFAULT);
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
			case BpmnprofPackage.SCRIPT_TASK__BASE_OPAQUE_ACTION:
				return base_OpaqueAction != null;
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT_FORMAT:
				return SCRIPT_FORMAT_EDEFAULT == null ? getScriptFormat() != null : !SCRIPT_FORMAT_EDEFAULT.equals(getScriptFormat());
			case BpmnprofPackage.SCRIPT_TASK__SCRIPT:
				return SCRIPT_EDEFAULT == null ? getScript() != null : !SCRIPT_EDEFAULT.equals(getScript());
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
			case BpmnprofPackage.SCRIPT_TASK___SCRIPT_TASKSCRIPT_FORMAT__DIAGNOSTICCHAIN_MAP:
				return ScriptTaskscriptFormat((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.SCRIPT_TASK___SCRIPT_TASKSCRIPT__DIAGNOSTICCHAIN_MAP:
				return ScriptTaskscript((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //ScriptTaskImpl
