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

import org.eclipse.uml2.uml.LiteralSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Literal Any</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.LiteralAny#getBase_LiteralSpecification <em>Base Literal Specification</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getLiteralAny()
 * @model
 * @generated
 */
public interface LiteralAny extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Literal Specification</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Literal Specification</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Literal Specification</em>' reference.
	 * @see #setBase_LiteralSpecification(LiteralSpecification)
	 * @see org.eclipse.upr.utp.UTPPackage#getLiteralAny_Base_LiteralSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	LiteralSpecification getBase_LiteralSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.LiteralAny#getBase_LiteralSpecification <em>Base Literal Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Literal Specification</em>' reference.
	 * @see #getBase_LiteralSpecification()
	 * @generated
	 */
	void setBase_LiteralSpecification(LiteralSpecification value);

} // LiteralAny
