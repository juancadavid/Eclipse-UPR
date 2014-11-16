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

import org.eclipse.uml2.uml.MultiplicityElement;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.ParticipantMultiplicity;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Participant Multiplicity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ParticipantMultiplicityImpl#getBase_MultiplicityElement <em>Base Multiplicity Element</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ParticipantMultiplicityImpl#getMinimum <em>Minimum</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.ParticipantMultiplicityImpl#getMaximum <em>Maximum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParticipantMultiplicityImpl extends BaseElementImpl implements ParticipantMultiplicity {
	/**
	 * The cached value of the '{@link #getBase_MultiplicityElement() <em>Base Multiplicity Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_MultiplicityElement()
	 * @generated
	 * @ordered
	 */
	protected MultiplicityElement base_MultiplicityElement;

	/**
	 * The default value of the '{@link #getMinimum() <em>Minimum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimum()
	 * @generated
	 * @ordered
	 */
	protected static final int MINIMUM_EDEFAULT = 0;

	/**
	 * The default value of the '{@link #getMaximum() <em>Maximum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaximum()
	 * @generated
	 * @ordered
	 */
	protected static final int MAXIMUM_EDEFAULT = 0;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ParticipantMultiplicityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getParticipantMultiplicity();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement getBase_MultiplicityElement() {
		if (base_MultiplicityElement != null && base_MultiplicityElement.eIsProxy()) {
			InternalEObject oldBase_MultiplicityElement = (InternalEObject)base_MultiplicityElement;
			base_MultiplicityElement = (MultiplicityElement)eResolveProxy(oldBase_MultiplicityElement);
			if (base_MultiplicityElement != oldBase_MultiplicityElement) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.PARTICIPANT_MULTIPLICITY__BASE_MULTIPLICITY_ELEMENT, oldBase_MultiplicityElement, base_MultiplicityElement));
			}
		}
		return base_MultiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultiplicityElement basicGetBase_MultiplicityElement() {
		return base_MultiplicityElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_MultiplicityElement(MultiplicityElement newBase_MultiplicityElement) {
		MultiplicityElement oldBase_MultiplicityElement = base_MultiplicityElement;
		base_MultiplicityElement = newBase_MultiplicityElement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.PARTICIPANT_MULTIPLICITY__BASE_MULTIPLICITY_ELEMENT, oldBase_MultiplicityElement, base_MultiplicityElement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMinimum() {
		// TODO: implement this method to return the 'Minimum' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimum(int newMinimum) {
		// TODO: implement this method to set the 'Minimum' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getMaximum() {
		// TODO: implement this method to return the 'Maximum' attribute
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaximum(int newMaximum) {
		// TODO: implement this method to set the 'Maximum' attribute
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
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__BASE_MULTIPLICITY_ELEMENT:
				if (resolve) return getBase_MultiplicityElement();
				return basicGetBase_MultiplicityElement();
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
				return getMinimum();
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
				return getMaximum();
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
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__BASE_MULTIPLICITY_ELEMENT:
				setBase_MultiplicityElement((MultiplicityElement)newValue);
				return;
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
				setMinimum((Integer)newValue);
				return;
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
				setMaximum((Integer)newValue);
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
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__BASE_MULTIPLICITY_ELEMENT:
				setBase_MultiplicityElement((MultiplicityElement)null);
				return;
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
				setMinimum(MINIMUM_EDEFAULT);
				return;
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
				setMaximum(MAXIMUM_EDEFAULT);
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
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__BASE_MULTIPLICITY_ELEMENT:
				return base_MultiplicityElement != null;
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MINIMUM:
				return getMinimum() != MINIMUM_EDEFAULT;
			case BpmnprofPackage.PARTICIPANT_MULTIPLICITY__MAXIMUM:
				return getMaximum() != MAXIMUM_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ParticipantMultiplicityImpl
