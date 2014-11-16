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

import org.eclipse.uml2.uml.CombinedFragment;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Determ Alt</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.DetermAlt#getBase_CombinedFragment <em>Base Combined Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getDetermAlt()
 * @model
 * @generated
 */
public interface DetermAlt extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Combined Fragment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Combined Fragment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Combined Fragment</em>' reference.
	 * @see #setBase_CombinedFragment(CombinedFragment)
	 * @see org.eclipse.upr.utp.UTPPackage#getDetermAlt_Base_CombinedFragment()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	CombinedFragment getBase_CombinedFragment();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.DetermAlt#getBase_CombinedFragment <em>Base Combined Fragment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Combined Fragment</em>' reference.
	 * @see #getBase_CombinedFragment()
	 * @generated
	 */
	void setBase_CombinedFragment(CombinedFragment value);

} // DetermAlt
