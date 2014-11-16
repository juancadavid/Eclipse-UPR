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

import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coding Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.CodingRule#getCoding <em>Coding</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.CodingRule#getBase_Namespace <em>Base Namespace</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.CodingRule#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.CodingRule#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getCodingRule()
 * @model
 * @generated
 */
public interface CodingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Coding</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coding</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coding</em>' attribute.
	 * @see #setCoding(String)
	 * @see org.eclipse.upr.utp.UTPPackage#getCodingRule_Coding()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getCoding();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.CodingRule#getCoding <em>Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coding</em>' attribute.
	 * @see #getCoding()
	 * @generated
	 */
	void setCoding(String value);

	/**
	 * Returns the value of the '<em><b>Base Namespace</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Namespace</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Namespace</em>' reference.
	 * @see #setBase_Namespace(Namespace)
	 * @see org.eclipse.upr.utp.UTPPackage#getCodingRule_Base_Namespace()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Namespace getBase_Namespace();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.CodingRule#getBase_Namespace <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Namespace</em>' reference.
	 * @see #getBase_Namespace()
	 * @generated
	 */
	void setBase_Namespace(Namespace value);

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
	 * @see org.eclipse.upr.utp.UTPPackage#getCodingRule_Base_ValueSpecification()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ValueSpecification getBase_ValueSpecification();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.CodingRule#getBase_ValueSpecification <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Value Specification</em>' reference.
	 * @see #getBase_ValueSpecification()
	 * @generated
	 */
	void setBase_ValueSpecification(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.upr.utp.UTPPackage#getCodingRule_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.CodingRule#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

} // CodingRule
