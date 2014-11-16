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

import org.eclipse.uml2.uml.DataStoreNode;
import org.eclipse.uml2.uml.Property;

import org.eclipse.upr.bpmnprof.BPMNProperty;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNPropertyImpl#getBase_DataStoreNode <em>Base Data Store Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNPropertyImpl#getUmlProperty <em>Uml Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNPropertyImpl extends ItemAwareElementImpl implements BPMNProperty {
	/**
	 * The cached value of the '{@link #getBase_DataStoreNode() <em>Base Data Store Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_DataStoreNode()
	 * @generated
	 * @ordered
	 */
	protected DataStoreNode base_DataStoreNode;

	/**
	 * The cached value of the '{@link #getUmlProperty() <em>Uml Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUmlProperty()
	 * @generated
	 * @ordered
	 */
	protected Property umlProperty;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNPropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getBPMNProperty();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode getBase_DataStoreNode() {
		if (base_DataStoreNode != null && base_DataStoreNode.eIsProxy()) {
			InternalEObject oldBase_DataStoreNode = (InternalEObject)base_DataStoreNode;
			base_DataStoreNode = (DataStoreNode)eResolveProxy(oldBase_DataStoreNode);
			if (base_DataStoreNode != oldBase_DataStoreNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_PROPERTY__BASE_DATA_STORE_NODE, oldBase_DataStoreNode, base_DataStoreNode));
			}
		}
		return base_DataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataStoreNode basicGetBase_DataStoreNode() {
		return base_DataStoreNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_DataStoreNode(DataStoreNode newBase_DataStoreNode) {
		DataStoreNode oldBase_DataStoreNode = base_DataStoreNode;
		base_DataStoreNode = newBase_DataStoreNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROPERTY__BASE_DATA_STORE_NODE, oldBase_DataStoreNode, base_DataStoreNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getUmlProperty() {
		if (umlProperty != null && umlProperty.eIsProxy()) {
			InternalEObject oldUmlProperty = (InternalEObject)umlProperty;
			umlProperty = (Property)eResolveProxy(oldUmlProperty);
			if (umlProperty != oldUmlProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_PROPERTY__UML_PROPERTY, oldUmlProperty, umlProperty));
			}
		}
		return umlProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetUmlProperty() {
		return umlProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUmlProperty(Property newUmlProperty) {
		Property oldUmlProperty = umlProperty;
		umlProperty = newUmlProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROPERTY__UML_PROPERTY, oldUmlProperty, umlProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Propertynotation(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.BPMN_PROPERTY__PROPERTYNOTATION,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Propertynotation", EObjectValidator.getObjectLabel(this, context) }),
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
	public boolean BPMNPropertyapply(DiagnosticChain diagnostics, Map<Object, Object> context) {
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
						 BpmnprofValidator.BPMN_PROPERTY__BPMN_PROPERTYAPPLY,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "BPMNPropertyapply", EObjectValidator.getObjectLabel(this, context) }),
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
			case BpmnprofPackage.BPMN_PROPERTY__BASE_DATA_STORE_NODE:
				if (resolve) return getBase_DataStoreNode();
				return basicGetBase_DataStoreNode();
			case BpmnprofPackage.BPMN_PROPERTY__UML_PROPERTY:
				if (resolve) return getUmlProperty();
				return basicGetUmlProperty();
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
			case BpmnprofPackage.BPMN_PROPERTY__BASE_DATA_STORE_NODE:
				setBase_DataStoreNode((DataStoreNode)newValue);
				return;
			case BpmnprofPackage.BPMN_PROPERTY__UML_PROPERTY:
				setUmlProperty((Property)newValue);
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
			case BpmnprofPackage.BPMN_PROPERTY__BASE_DATA_STORE_NODE:
				setBase_DataStoreNode((DataStoreNode)null);
				return;
			case BpmnprofPackage.BPMN_PROPERTY__UML_PROPERTY:
				setUmlProperty((Property)null);
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
			case BpmnprofPackage.BPMN_PROPERTY__BASE_DATA_STORE_NODE:
				return base_DataStoreNode != null;
			case BpmnprofPackage.BPMN_PROPERTY__UML_PROPERTY:
				return umlProperty != null;
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
			case BpmnprofPackage.BPMN_PROPERTY___PROPERTYNOTATION__DIAGNOSTICCHAIN_MAP:
				return Propertynotation((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_PROPERTY___BPMN_PROPERTYAPPLY__DIAGNOSTICCHAIN_MAP:
				return BPMNPropertyapply((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

} //BPMNPropertyImpl
