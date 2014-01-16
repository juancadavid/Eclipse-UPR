/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Marc-Florian Wendland
 */
package org.eclipse.upr.utp;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.TimeEvent;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Out</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.TimeOut#getBase_TimeEvent <em>Base Time Event</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getTimeOut()
 * @model
 * @generated
 */
public interface TimeOut extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Time Event</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Time Event</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Time Event</em>' reference.
	 * @see #setBase_TimeEvent(TimeEvent)
	 * @see org.eclipse.upr.utp.UTPPackage#getTimeOut_Base_TimeEvent()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TimeEvent getBase_TimeEvent();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TimeOut#getBase_TimeEvent <em>Base Time Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Time Event</em>' reference.
	 * @see #getBase_TimeEvent()
	 * @generated
	 */
	void setBase_TimeEvent(TimeEvent value);

} // TimeOut
