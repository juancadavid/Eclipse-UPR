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

import org.eclipse.uml2.uml.Dependency;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Default Application</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.DefaultApplication#getRepetition <em>Repetition</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.DefaultApplication#getBase_Dependency <em>Base Dependency</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getDefaultApplication()
 * @model
 * @generated
 */
public interface DefaultApplication extends EObject {
	/**
	 * Returns the value of the '<em><b>Repetition</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Repetition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Repetition</em>' attribute.
	 * @see #setRepetition(int)
	 * @see org.eclipse.upr.utp.UTPPackage#getDefaultApplication_Repetition()
	 * @model default="0" dataType="org.eclipse.uml2.types.UnlimitedNatural" required="true" ordered="false"
	 * @generated
	 */
	int getRepetition();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.DefaultApplication#getRepetition <em>Repetition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Repetition</em>' attribute.
	 * @see #getRepetition()
	 * @generated
	 */
	void setRepetition(int value);

	/**
	 * Returns the value of the '<em><b>Base Dependency</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Dependency</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Dependency</em>' reference.
	 * @see #setBase_Dependency(Dependency)
	 * @see org.eclipse.upr.utp.UTPPackage#getDefaultApplication_Base_Dependency()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Dependency getBase_Dependency();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.DefaultApplication#getBase_Dependency <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Dependency</em>' reference.
	 * @see #getBase_Dependency()
	 * @generated
	 */
	void setBase_Dependency(Dependency value);

} // DefaultApplication
