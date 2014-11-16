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
package org.eclipse.upr.soaml;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Free Form Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.soaml.FreeFormValue#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.soaml.SoaMLPackage#getFreeFormValue()
 * @model
 * @generated
 */
public interface FreeFormValue extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Value Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Value Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Value Specification</em>' reference.
	 * @see #setBase_ValueSpecification(ValueSpecification)
	 * @see org.eclipse.upr.soaml.SoaMLPackage#getFreeFormValue_Base_ValueSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getBase_ValueSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.soaml.FreeFormValue#getBase_ValueSpecification <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Value Specification</em>' reference.
	 * @see #getBase_ValueSpecification()
	 * @generated
	 */
	void setBase_ValueSpecification(ValueSpecification value);

} // FreeFormValue
