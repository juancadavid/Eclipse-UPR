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

import org.eclipse.uml2.uml.CallOperationAction;

import org.eclipse.upr.bpmnprof.BPMNOperation;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ServiceTask;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ServiceTaskImpl#getBase_CallOperationAction <em>Base Call Operation Action</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ServiceTaskImpl#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ServiceTaskImpl#getOperationRef <em>Operation Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceTaskImpl extends TaskImpl implements ServiceTask {
	/**
	 * The cached value of the '{@link #getBase_CallOperationAction() <em>Base Call Operation Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CallOperationAction()
	 * @generated
	 * @ordered
	 */
	protected CallOperationAction base_CallOperationAction;

	/**
	 * The default value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPLEMENTATION_EDEFAULT = "##webService";

	/**
	 * The cached value of the '{@link #getImplementation() <em>Implementation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementation()
	 * @generated
	 * @ordered
	 */
	protected String implementation = IMPLEMENTATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceTaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getServiceTask();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction getBase_CallOperationAction() {
		if (base_CallOperationAction != null && base_CallOperationAction.eIsProxy()) {
			InternalEObject oldBase_CallOperationAction = (InternalEObject)base_CallOperationAction;
			base_CallOperationAction = (CallOperationAction)eResolveProxy(oldBase_CallOperationAction);
			if (base_CallOperationAction != oldBase_CallOperationAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.SERVICE_TASK__BASE_CALL_OPERATION_ACTION, oldBase_CallOperationAction, base_CallOperationAction));
			}
		}
		return base_CallOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallOperationAction basicGetBase_CallOperationAction() {
		return base_CallOperationAction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CallOperationAction(CallOperationAction newBase_CallOperationAction) {
		CallOperationAction oldBase_CallOperationAction = base_CallOperationAction;
		base_CallOperationAction = newBase_CallOperationAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.SERVICE_TASK__BASE_CALL_OPERATION_ACTION, oldBase_CallOperationAction, base_CallOperationAction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImplementation() {
		return implementation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementation(String newImplementation) {
		String oldImplementation = implementation;
		implementation = newImplementation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.SERVICE_TASK__IMPLEMENTATION, oldImplementation, implementation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNOperation getOperationRef() {
		BPMNOperation operationRef = basicGetOperationRef();
		return operationRef != null && operationRef.eIsProxy() ? (BPMNOperation)eResolveProxy((InternalEObject)operationRef) : operationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNOperation basicGetOperationRef() {
		// TODO: implement this method to return the 'Operation Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOperationRef(BPMNOperation newOperationRef) {
		// TODO: implement this method to set the 'Operation Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ServiceTaskinputSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SERVICE_TASK__SERVICE_TASKINPUT_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ServiceTaskinputSet", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ServiceTaskoutputSet(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SERVICE_TASK__SERVICE_TASKOUTPUT_SET,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ServiceTaskoutputSet", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean ServiceTaskoperationRef(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.SERVICE_TASK__SERVICE_TASKOPERATION_REF,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ServiceTaskoperationRef", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.SERVICE_TASK__BASE_CALL_OPERATION_ACTION:
				if (resolve) return getBase_CallOperationAction();
				return basicGetBase_CallOperationAction();
			case BpmnprofPackage.SERVICE_TASK__IMPLEMENTATION:
				return getImplementation();
			case BpmnprofPackage.SERVICE_TASK__OPERATION_REF:
				if (resolve) return getOperationRef();
				return basicGetOperationRef();
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
			case BpmnprofPackage.SERVICE_TASK__BASE_CALL_OPERATION_ACTION:
				setBase_CallOperationAction((CallOperationAction)newValue);
				return;
			case BpmnprofPackage.SERVICE_TASK__IMPLEMENTATION:
				setImplementation((String)newValue);
				return;
			case BpmnprofPackage.SERVICE_TASK__OPERATION_REF:
				setOperationRef((BPMNOperation)newValue);
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
			case BpmnprofPackage.SERVICE_TASK__BASE_CALL_OPERATION_ACTION:
				setBase_CallOperationAction((CallOperationAction)null);
				return;
			case BpmnprofPackage.SERVICE_TASK__IMPLEMENTATION:
				setImplementation(IMPLEMENTATION_EDEFAULT);
				return;
			case BpmnprofPackage.SERVICE_TASK__OPERATION_REF:
				setOperationRef((BPMNOperation)null);
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
			case BpmnprofPackage.SERVICE_TASK__BASE_CALL_OPERATION_ACTION:
				return base_CallOperationAction != null;
			case BpmnprofPackage.SERVICE_TASK__IMPLEMENTATION:
				return IMPLEMENTATION_EDEFAULT == null ? implementation != null : !IMPLEMENTATION_EDEFAULT.equals(implementation);
			case BpmnprofPackage.SERVICE_TASK__OPERATION_REF:
				return basicGetOperationRef() != null;
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
			case BpmnprofPackage.SERVICE_TASK___SERVICE_TASKINPUT_SET__DIAGNOSTICCHAIN_MAP:
				return ServiceTaskinputSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.SERVICE_TASK___SERVICE_TASKOUTPUT_SET__DIAGNOSTICCHAIN_MAP:
				return ServiceTaskoutputSet((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.SERVICE_TASK___SERVICE_TASKOPERATION_REF__DIAGNOSTICCHAIN_MAP:
				return ServiceTaskoperationRef((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
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
		result.append(" (implementation: ");
		result.append(implementation);
		result.append(')');
		return result.toString();
	}

} //ServiceTaskImpl
