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

import org.eclipse.uml2.uml.AcceptEventAction;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Time Out Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.TimeOutAction#getBase_AcceptEventAction <em>Base Accept Event Action</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getTimeOutAction()
 * @model
 * @generated
 */
public interface TimeOutAction extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Accept Event Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Accept Event Action</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #setBase_AcceptEventAction(AcceptEventAction)
	 * @see org.eclipse.upr.utp.UTPPackage#getTimeOutAction_Base_AcceptEventAction()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	AcceptEventAction getBase_AcceptEventAction();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TimeOutAction#getBase_AcceptEventAction <em>Base Accept Event Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Accept Event Action</em>' reference.
	 * @see #getBase_AcceptEventAction()
	 * @generated
	 */
	void setBase_AcceptEventAction(AcceptEventAction value);

} // TimeOutAction
