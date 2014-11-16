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

import org.eclipse.uml2.uml.Element;
import org.eclipse.uml2.uml.Interface;

import org.eclipse.upr.bpmnprof.BPMNInterface;
import org.eclipse.upr.bpmnprof.BPMNOperation;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CallableElement;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNInterfaceImpl#getBase_Interface <em>Base Interface</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNInterfaceImpl#getImplementationRef <em>Implementation Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNInterfaceImpl#getOperations <em>Operations</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNInterfaceImpl#getCallableElements <em>Callable Elements</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNInterfaceImpl extends RootElementImpl implements BPMNInterface {
	/**
	 * The cached value of the '{@link #getBase_Interface() <em>Base Interface</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Interface()
	 * @generated
	 * @ordered
	 */
	protected Interface base_Interface;

	/**
	 * The cached value of the '{@link #getImplementationRef() <em>Implementation Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImplementationRef()
	 * @generated
	 * @ordered
	 */
	protected Element implementationRef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNInterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getBPMNInterface();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface getBase_Interface() {
		if (base_Interface != null && base_Interface.eIsProxy()) {
			InternalEObject oldBase_Interface = (InternalEObject)base_Interface;
			base_Interface = (Interface)eResolveProxy(oldBase_Interface);
			if (base_Interface != oldBase_Interface) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_INTERFACE__BASE_INTERFACE, oldBase_Interface, base_Interface));
			}
		}
		return base_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface basicGetBase_Interface() {
		return base_Interface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Interface(Interface newBase_Interface) {
		Interface oldBase_Interface = base_Interface;
		base_Interface = newBase_Interface;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_INTERFACE__BASE_INTERFACE, oldBase_Interface, base_Interface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element getImplementationRef() {
		if (implementationRef != null && implementationRef.eIsProxy()) {
			InternalEObject oldImplementationRef = (InternalEObject)implementationRef;
			implementationRef = (Element)eResolveProxy(oldImplementationRef);
			if (implementationRef != oldImplementationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_INTERFACE__IMPLEMENTATION_REF, oldImplementationRef, implementationRef));
			}
		}
		return implementationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Element basicGetImplementationRef() {
		return implementationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImplementationRef(Element newImplementationRef) {
		Element oldImplementationRef = implementationRef;
		implementationRef = newImplementationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_INTERFACE__IMPLEMENTATION_REF, oldImplementationRef, implementationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPMNOperation> getOperations() {
		// TODO: implement this method to return the 'Operations' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallableElement> getCallableElements() {
		// TODO: implement this method to return the 'Callable Elements' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Interfaceoperationmultiplicity(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.BPMN_INTERFACE__INTERFACEOPERATIONMULTIPLICITY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Interfaceoperationmultiplicity", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean InterfaceownedOperation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.BPMN_INTERFACE__INTERFACEOWNED_OPERATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "InterfaceownedOperation", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean BPMNInterfacecallableElements(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.BPMN_INTERFACE__BPMN_INTERFACECALLABLE_ELEMENTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNInterfacecallableElements", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean BPMNInterfaceoperations(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.BPMN_INTERFACE__BPMN_INTERFACEOPERATIONS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNInterfaceoperations", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.BPMN_INTERFACE__BASE_INTERFACE:
				if (resolve) return getBase_Interface();
				return basicGetBase_Interface();
			case BpmnprofPackage.BPMN_INTERFACE__IMPLEMENTATION_REF:
				if (resolve) return getImplementationRef();
				return basicGetImplementationRef();
			case BpmnprofPackage.BPMN_INTERFACE__OPERATIONS:
				return getOperations();
			case BpmnprofPackage.BPMN_INTERFACE__CALLABLE_ELEMENTS:
				return getCallableElements();
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
			case BpmnprofPackage.BPMN_INTERFACE__BASE_INTERFACE:
				setBase_Interface((Interface)newValue);
				return;
			case BpmnprofPackage.BPMN_INTERFACE__IMPLEMENTATION_REF:
				setImplementationRef((Element)newValue);
				return;
			case BpmnprofPackage.BPMN_INTERFACE__OPERATIONS:
				getOperations().clear();
				getOperations().addAll((Collection<? extends BPMNOperation>)newValue);
				return;
			case BpmnprofPackage.BPMN_INTERFACE__CALLABLE_ELEMENTS:
				getCallableElements().clear();
				getCallableElements().addAll((Collection<? extends CallableElement>)newValue);
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
			case BpmnprofPackage.BPMN_INTERFACE__BASE_INTERFACE:
				setBase_Interface((Interface)null);
				return;
			case BpmnprofPackage.BPMN_INTERFACE__IMPLEMENTATION_REF:
				setImplementationRef((Element)null);
				return;
			case BpmnprofPackage.BPMN_INTERFACE__OPERATIONS:
				getOperations().clear();
				return;
			case BpmnprofPackage.BPMN_INTERFACE__CALLABLE_ELEMENTS:
				getCallableElements().clear();
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
			case BpmnprofPackage.BPMN_INTERFACE__BASE_INTERFACE:
				return base_Interface != null;
			case BpmnprofPackage.BPMN_INTERFACE__IMPLEMENTATION_REF:
				return implementationRef != null;
			case BpmnprofPackage.BPMN_INTERFACE__OPERATIONS:
				return !getOperations().isEmpty();
			case BpmnprofPackage.BPMN_INTERFACE__CALLABLE_ELEMENTS:
				return !getCallableElements().isEmpty();
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
			case BpmnprofPackage.BPMN_INTERFACE___INTERFACEOPERATIONMULTIPLICITY__DIAGNOSTICCHAIN_MAP:
				return Interfaceoperationmultiplicity((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_INTERFACE___INTERFACEOWNED_OPERATION__DIAGNOSTICCHAIN_MAP:
				return InterfaceownedOperation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_INTERFACE___BPMN_INTERFACECALLABLE_ELEMENTS__DIAGNOSTICCHAIN_MAP:
				return BPMNInterfacecallableElements((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_INTERFACE___BPMN_INTERFACEOPERATIONS__DIAGNOSTICCHAIN_MAP:
				return BPMNInterfaceoperations((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BPMNInterfaceImpl
