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

import org.eclipse.uml2.uml.OpaqueBehavior;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.GlobalTask;
import org.eclipse.upr.bpmnprof.ResourceRole;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Global Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.GlobalTaskImpl#getBase_OpaqueBehavior <em>Base Opaque Behavior</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.GlobalTaskImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GlobalTaskImpl extends CallableElementImpl implements GlobalTask {
	/**
	 * The cached value of the '{@link #getBase_OpaqueBehavior() <em>Base Opaque Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_OpaqueBehavior()
	 * @generated
	 * @ordered
	 */
	protected OpaqueBehavior base_OpaqueBehavior;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GlobalTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getGlobalTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior getBase_OpaqueBehavior() {
		if (base_OpaqueBehavior != null && base_OpaqueBehavior.eIsProxy()) {
			InternalEObject oldBase_OpaqueBehavior = (InternalEObject)base_OpaqueBehavior;
			base_OpaqueBehavior = (OpaqueBehavior)eResolveProxy(oldBase_OpaqueBehavior);
			if (base_OpaqueBehavior != oldBase_OpaqueBehavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.GLOBAL_TASK__BASE_OPAQUE_BEHAVIOR, oldBase_OpaqueBehavior, base_OpaqueBehavior));
			}
		}
		return base_OpaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OpaqueBehavior basicGetBase_OpaqueBehavior() {
		return base_OpaqueBehavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_OpaqueBehavior(OpaqueBehavior newBase_OpaqueBehavior) {
		OpaqueBehavior oldBase_OpaqueBehavior = base_OpaqueBehavior;
		base_OpaqueBehavior = newBase_OpaqueBehavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.GLOBAL_TASK__BASE_OPAQUE_BEHAVIOR, oldBase_OpaqueBehavior, base_OpaqueBehavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRole> getResources() {
		// TODO: implement this method to return the 'Resources' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean GlobalTasksupportedInterfaceRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.GLOBAL_TASK__GLOBAL_TASKSUPPORTED_INTERFACE_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GlobalTasksupportedInterfaceRefs", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.GLOBAL_TASK__BASE_OPAQUE_BEHAVIOR:
				if (resolve) return getBase_OpaqueBehavior();
				return basicGetBase_OpaqueBehavior();
			case BpmnprofPackage.GLOBAL_TASK__RESOURCES:
				return getResources();
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
			case BpmnprofPackage.GLOBAL_TASK__BASE_OPAQUE_BEHAVIOR:
				setBase_OpaqueBehavior((OpaqueBehavior)newValue);
				return;
			case BpmnprofPackage.GLOBAL_TASK__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceRole>)newValue);
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
			case BpmnprofPackage.GLOBAL_TASK__BASE_OPAQUE_BEHAVIOR:
				setBase_OpaqueBehavior((OpaqueBehavior)null);
				return;
			case BpmnprofPackage.GLOBAL_TASK__RESOURCES:
				getResources().clear();
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
			case BpmnprofPackage.GLOBAL_TASK__BASE_OPAQUE_BEHAVIOR:
				return base_OpaqueBehavior != null;
			case BpmnprofPackage.GLOBAL_TASK__RESOURCES:
				return !getResources().isEmpty();
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
			case BpmnprofPackage.GLOBAL_TASK___GLOBAL_TASKSUPPORTED_INTERFACE_REFS__DIAGNOSTICCHAIN_MAP:
				return GlobalTasksupportedInterfaceRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //GlobalTaskImpl
