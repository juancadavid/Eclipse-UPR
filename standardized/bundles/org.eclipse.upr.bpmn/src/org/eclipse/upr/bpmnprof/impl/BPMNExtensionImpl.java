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

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.uml2.uml.Stereotype;

import org.eclipse.upr.bpmnprof.BPMNExtension;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ExtensionDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Extension</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNExtensionImpl#getBase_Stereotype <em>Base Stereotype</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNExtensionImpl#isMustUnderstand <em>Must Understand</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNExtensionImpl#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNExtensionImpl extends MinimalEObjectImpl.Container implements BPMNExtension {
	/**
	 * The cached value of the '{@link #getBase_Stereotype() <em>Base Stereotype</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Stereotype()
	 * @generated
	 * @ordered
	 */
	protected Stereotype base_Stereotype;

	/**
	 * The default value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean MUST_UNDERSTAND_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isMustUnderstand() <em>Must Understand</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isMustUnderstand()
	 * @generated
	 * @ordered
	 */
	protected boolean mustUnderstand = MUST_UNDERSTAND_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNExtensionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getBPMNExtension();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype getBase_Stereotype() {
		if (base_Stereotype != null && base_Stereotype.eIsProxy()) {
			InternalEObject oldBase_Stereotype = (InternalEObject)base_Stereotype;
			base_Stereotype = (Stereotype)eResolveProxy(oldBase_Stereotype);
			if (base_Stereotype != oldBase_Stereotype) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_EXTENSION__BASE_STEREOTYPE, oldBase_Stereotype, base_Stereotype));
			}
		}
		return base_Stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Stereotype basicGetBase_Stereotype() {
		return base_Stereotype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Stereotype(Stereotype newBase_Stereotype) {
		Stereotype oldBase_Stereotype = base_Stereotype;
		base_Stereotype = newBase_Stereotype;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_EXTENSION__BASE_STEREOTYPE, oldBase_Stereotype, base_Stereotype));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isMustUnderstand() {
		return mustUnderstand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMustUnderstand(boolean newMustUnderstand) {
		boolean oldMustUnderstand = mustUnderstand;
		mustUnderstand = newMustUnderstand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_EXTENSION__MUST_UNDERSTAND, oldMustUnderstand, mustUnderstand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition getDefinition() {
		ExtensionDefinition definition = basicGetDefinition();
		return definition != null && definition.eIsProxy() ? (ExtensionDefinition)eResolveProxy((InternalEObject)definition) : definition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExtensionDefinition basicGetDefinition() {
		// TODO: implement this method to return the 'Definition' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinition(ExtensionDefinition newDefinition) {
		// TODO: implement this method to set the 'Definition' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_EXTENSION__BASE_STEREOTYPE:
				if (resolve) return getBase_Stereotype();
				return basicGetBase_Stereotype();
			case BpmnprofPackage.BPMN_EXTENSION__MUST_UNDERSTAND:
				return isMustUnderstand();
			case BpmnprofPackage.BPMN_EXTENSION__DEFINITION:
				if (resolve) return getDefinition();
				return basicGetDefinition();
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
			case BpmnprofPackage.BPMN_EXTENSION__BASE_STEREOTYPE:
				setBase_Stereotype((Stereotype)newValue);
				return;
			case BpmnprofPackage.BPMN_EXTENSION__MUST_UNDERSTAND:
				setMustUnderstand((Boolean)newValue);
				return;
			case BpmnprofPackage.BPMN_EXTENSION__DEFINITION:
				setDefinition((ExtensionDefinition)newValue);
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
			case BpmnprofPackage.BPMN_EXTENSION__BASE_STEREOTYPE:
				setBase_Stereotype((Stereotype)null);
				return;
			case BpmnprofPackage.BPMN_EXTENSION__MUST_UNDERSTAND:
				setMustUnderstand(MUST_UNDERSTAND_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_EXTENSION__DEFINITION:
				setDefinition((ExtensionDefinition)null);
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
			case BpmnprofPackage.BPMN_EXTENSION__BASE_STEREOTYPE:
				return base_Stereotype != null;
			case BpmnprofPackage.BPMN_EXTENSION__MUST_UNDERSTAND:
				return mustUnderstand != MUST_UNDERSTAND_EDEFAULT;
			case BpmnprofPackage.BPMN_EXTENSION__DEFINITION:
				return basicGetDefinition() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (mustUnderstand: ");
		result.append(mustUnderstand);
		result.append(')');
		return result.toString();
	}

} //BPMNExtensionImpl
