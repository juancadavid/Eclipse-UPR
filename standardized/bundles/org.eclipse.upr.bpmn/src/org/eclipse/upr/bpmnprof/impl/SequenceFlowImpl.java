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

import org.eclipse.uml2.uml.ControlFlow;

import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.SequenceFlow;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sequence Flow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.SequenceFlowImpl#getBase_ControlFlow <em>Base Control Flow</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.SequenceFlowImpl#isImmediate <em>Is Immediate</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.SequenceFlowImpl#getConditionExpression <em>Condition Expression</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SequenceFlowImpl extends FlowElementImpl implements SequenceFlow {
	/**
	 * The cached value of the '{@link #getBase_ControlFlow() <em>Base Control Flow</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ControlFlow()
	 * @generated
	 * @ordered
	 */
	protected ControlFlow base_ControlFlow;

	/**
	 * The default value of the '{@link #isImmediate() <em>Is Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_IMMEDIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isImmediate() <em>Is Immediate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isImmediate()
	 * @generated
	 * @ordered
	 */
	protected boolean isImmediate = IS_IMMEDIATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SequenceFlowImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getSequenceFlow();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow getBase_ControlFlow() {
		if (base_ControlFlow != null && base_ControlFlow.eIsProxy()) {
			InternalEObject oldBase_ControlFlow = (InternalEObject)base_ControlFlow;
			base_ControlFlow = (ControlFlow)eResolveProxy(oldBase_ControlFlow);
			if (base_ControlFlow != oldBase_ControlFlow) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.SEQUENCE_FLOW__BASE_CONTROL_FLOW, oldBase_ControlFlow, base_ControlFlow));
			}
		}
		return base_ControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ControlFlow basicGetBase_ControlFlow() {
		return base_ControlFlow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ControlFlow(ControlFlow newBase_ControlFlow) {
		ControlFlow oldBase_ControlFlow = base_ControlFlow;
		base_ControlFlow = newBase_ControlFlow;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.SEQUENCE_FLOW__BASE_CONTROL_FLOW, oldBase_ControlFlow, base_ControlFlow));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isImmediate() {
		return isImmediate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsImmediate(boolean newIsImmediate) {
		boolean oldIsImmediate = isImmediate;
		isImmediate = newIsImmediate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.SEQUENCE_FLOW__IS_IMMEDIATE, oldIsImmediate, isImmediate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getConditionExpression() {
		BPMNExpression conditionExpression = basicGetConditionExpression();
		return conditionExpression != null && conditionExpression.eIsProxy() ? (BPMNExpression)eResolveProxy((InternalEObject)conditionExpression) : conditionExpression;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetConditionExpression() {
		// TODO: implement this method to return the 'Condition Expression' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionExpression(BPMNExpression newConditionExpression) {
		// TODO: implement this method to set the 'Condition Expression' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean SequenceFlowconditionExpression(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SEQUENCE_FLOW__SEQUENCE_FLOWCONDITION_EXPRESSION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SequenceFlowconditionExpression", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean SequenceFlowsourceRef(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SEQUENCE_FLOW__SEQUENCE_FLOWSOURCE_REF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SequenceFlowsourceRef", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean SequenceFlowtargetRef(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SEQUENCE_FLOW__SEQUENCE_FLOWTARGET_REF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "SequenceFlowtargetRef", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.SEQUENCE_FLOW__BASE_CONTROL_FLOW:
				if (resolve) return getBase_ControlFlow();
				return basicGetBase_ControlFlow();
			case BpmnprofPackage.SEQUENCE_FLOW__IS_IMMEDIATE:
				return isImmediate();
			case BpmnprofPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				if (resolve) return getConditionExpression();
				return basicGetConditionExpression();
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
			case BpmnprofPackage.SEQUENCE_FLOW__BASE_CONTROL_FLOW:
				setBase_ControlFlow((ControlFlow)newValue);
				return;
			case BpmnprofPackage.SEQUENCE_FLOW__IS_IMMEDIATE:
				setIsImmediate((Boolean)newValue);
				return;
			case BpmnprofPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				setConditionExpression((BPMNExpression)newValue);
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
			case BpmnprofPackage.SEQUENCE_FLOW__BASE_CONTROL_FLOW:
				setBase_ControlFlow((ControlFlow)null);
				return;
			case BpmnprofPackage.SEQUENCE_FLOW__IS_IMMEDIATE:
				setIsImmediate(IS_IMMEDIATE_EDEFAULT);
				return;
			case BpmnprofPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				setConditionExpression((BPMNExpression)null);
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
			case BpmnprofPackage.SEQUENCE_FLOW__BASE_CONTROL_FLOW:
				return base_ControlFlow != null;
			case BpmnprofPackage.SEQUENCE_FLOW__IS_IMMEDIATE:
				return isImmediate != IS_IMMEDIATE_EDEFAULT;
			case BpmnprofPackage.SEQUENCE_FLOW__CONDITION_EXPRESSION:
				return basicGetConditionExpression() != null;
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
			case BpmnprofPackage.SEQUENCE_FLOW___SEQUENCE_FLOWCONDITION_EXPRESSION__DIAGNOSTICCHAIN_MAP:
				return SequenceFlowconditionExpression((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.SEQUENCE_FLOW___SEQUENCE_FLOWSOURCE_REF__DIAGNOSTICCHAIN_MAP:
				return SequenceFlowsourceRef((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.SEQUENCE_FLOW___SEQUENCE_FLOWTARGET_REF__DIAGNOSTICCHAIN_MAP:
				return SequenceFlowtargetRef((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (isImmediate: ");
		result.append(isImmediate);
		result.append(')');
		return result.toString();
	}

} //SequenceFlowImpl
