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

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Behavior;

import org.eclipse.upr.bpmnprof.BPMNInterface;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CallableElement;
import org.eclipse.upr.bpmnprof.InputOutputBinding;
import org.eclipse.upr.bpmnprof.InputOutputSpecification;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Callable Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CallableElementImpl#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CallableElementImpl#getIoSpecification <em>Io Specification</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CallableElementImpl#getSupportedInterfaceRefs <em>Supported Interface Refs</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CallableElementImpl#getIoBinding <em>Io Binding</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class CallableElementImpl extends RootElementImpl implements CallableElement {
	/**
	 * The cached value of the '{@link #getBase_Behavior() <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Behavior()
	 * @generated
	 * @ordered
	 */
	protected Behavior base_Behavior;

	/**
	 * The cached value of the '{@link #getIoBinding() <em>Io Binding</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIoBinding()
	 * @generated
	 * @ordered
	 */
	protected EList<InputOutputBinding> ioBinding;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallableElementImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getCallableElement();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior getBase_Behavior() {
		if (base_Behavior != null && base_Behavior.eIsProxy()) {
			InternalEObject oldBase_Behavior = (InternalEObject)base_Behavior;
			base_Behavior = (Behavior)eResolveProxy(oldBase_Behavior);
			if (base_Behavior != oldBase_Behavior) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CALLABLE_ELEMENT__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
			}
		}
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Behavior basicGetBase_Behavior() {
		return base_Behavior;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Behavior(Behavior newBase_Behavior) {
		Behavior oldBase_Behavior = base_Behavior;
		base_Behavior = newBase_Behavior;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CALLABLE_ELEMENT__BASE_BEHAVIOR, oldBase_Behavior, base_Behavior));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification getIoSpecification() {
		InputOutputSpecification ioSpecification = basicGetIoSpecification();
		return ioSpecification != null && ioSpecification.eIsProxy() ? (InputOutputSpecification)eResolveProxy((InternalEObject)ioSpecification) : ioSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputOutputSpecification basicGetIoSpecification() {
		// TODO: implement this method to return the 'Io Specification' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIoSpecification(InputOutputSpecification newIoSpecification) {
		// TODO: implement this method to set the 'Io Specification' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPMNInterface> getSupportedInterfaceRefs() {
		// TODO: implement this method to return the 'Supported Interface Refs' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<InputOutputBinding> getIoBinding() {
		if (ioBinding == null) {
			ioBinding = new EObjectResolvingEList<InputOutputBinding>(InputOutputBinding.class, this, BpmnprofPackage.CALLABLE_ELEMENT__IO_BINDING);
		}
		return ioBinding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean CallableEelementsupportedInterfaceRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.CALLABLE_ELEMENT__CALLABLE_EELEMENTSUPPORTED_INTERFACE_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CallableEelementsupportedInterfaceRefs", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean CallableElementresources(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.CALLABLE_ELEMENT__CALLABLE_ELEMENTRESOURCES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "CallableElementresources", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.CALLABLE_ELEMENT__BASE_BEHAVIOR:
				if (resolve) return getBase_Behavior();
				return basicGetBase_Behavior();
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				if (resolve) return getIoSpecification();
				return basicGetIoSpecification();
			case BpmnprofPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				return getSupportedInterfaceRefs();
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_BINDING:
				return getIoBinding();
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
			case BpmnprofPackage.CALLABLE_ELEMENT__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)newValue);
				return;
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)newValue);
				return;
			case BpmnprofPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				getSupportedInterfaceRefs().clear();
				getSupportedInterfaceRefs().addAll((Collection<? extends BPMNInterface>)newValue);
				return;
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_BINDING:
				getIoBinding().clear();
				getIoBinding().addAll((Collection<? extends InputOutputBinding>)newValue);
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
			case BpmnprofPackage.CALLABLE_ELEMENT__BASE_BEHAVIOR:
				setBase_Behavior((Behavior)null);
				return;
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				setIoSpecification((InputOutputSpecification)null);
				return;
			case BpmnprofPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				getSupportedInterfaceRefs().clear();
				return;
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_BINDING:
				getIoBinding().clear();
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
			case BpmnprofPackage.CALLABLE_ELEMENT__BASE_BEHAVIOR:
				return base_Behavior != null;
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_SPECIFICATION:
				return basicGetIoSpecification() != null;
			case BpmnprofPackage.CALLABLE_ELEMENT__SUPPORTED_INTERFACE_REFS:
				return !getSupportedInterfaceRefs().isEmpty();
			case BpmnprofPackage.CALLABLE_ELEMENT__IO_BINDING:
				return ioBinding != null && !ioBinding.isEmpty();
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
			case BpmnprofPackage.CALLABLE_ELEMENT___CALLABLE_EELEMENTSUPPORTED_INTERFACE_REFS__DIAGNOSTICCHAIN_MAP:
				return CallableEelementsupportedInterfaceRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.CALLABLE_ELEMENT___CALLABLE_ELEMENTRESOURCES__DIAGNOSTICCHAIN_MAP:
				return CallableElementresources((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CallableElementImpl
