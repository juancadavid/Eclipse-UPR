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

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.Behavior;
import org.eclipse.uml2.uml.Operation;
import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.TestCase#getBase_Operation <em>Base Operation</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestCase#getBase_Behavior <em>Base Behavior</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestCase#getPriority <em>Priority</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestCase#getTestTypes <em>Test Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getTestCase()
 * @model
 * @generated
 */
public interface TestCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Operation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Operation</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Operation</em>' reference.
	 * @see #setBase_Operation(Operation)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestCase_Base_Operation()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Operation getBase_Operation();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestCase#getBase_Operation <em>Base Operation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Operation</em>' reference.
	 * @see #getBase_Operation()
	 * @generated
	 */
	void setBase_Operation(Operation value);

	/**
	 * Returns the value of the '<em><b>Base Behavior</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Behavior</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Behavior</em>' reference.
	 * @see #setBase_Behavior(Behavior)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestCase_Base_Behavior()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Behavior getBase_Behavior();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestCase#getBase_Behavior <em>Base Behavior</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Behavior</em>' reference.
	 * @see #getBase_Behavior()
	 * @generated
	 */
	void setBase_Behavior(Behavior value);

	/**
	 * Returns the value of the '<em><b>Priority</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Priority</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Priority</em>' reference.
	 * @see #setPriority(ValueSpecification)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestCase_Priority()
	 * @model ordered="false"
	 * @generated
	 */
	ValueSpecification getPriority();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestCase#getPriority <em>Priority</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Priority</em>' reference.
	 * @see #getPriority()
	 * @generated
	 */
	void setPriority(ValueSpecification value);

	/**
	 * Returns the value of the '<em><b>Test Type</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Test Type</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Test Type</em>' reference list.
	 * @see org.eclipse.upr.utp.UTPPackage#getTestCase_TestType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueSpecification> getTestTypes();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Test Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getTestTypes()
	 * @generated
	 */
	ValueSpecification getTestType(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Test Type</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getTestTypes()
	 * @generated
	 */
	ValueSpecification getTestType(String name, Type type, boolean ignoreCase, EClass eClass);

} // TestCase
