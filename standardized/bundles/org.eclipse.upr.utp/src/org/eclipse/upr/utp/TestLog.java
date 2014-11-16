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

import org.eclipse.uml2.uml.Type;
import org.eclipse.uml2.uml.ValueSpecification;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Test Log</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.TestLog#getTesters <em>Tester</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestLog#getExecutionAt <em>Execution At</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestLog#getDuration <em>Duration</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestLog#getVerdict <em>Verdict</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.TestLog#getVerdictReasons <em>Verdict Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.utp.UTPPackage#getTestLog()
 * @model
 * @generated
 */
public interface TestLog extends EObject {
	/**
	 * Returns the value of the '<em><b>Tester</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tester</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tester</em>' reference list.
	 * @see org.eclipse.upr.utp.UTPPackage#getTestLog_Tester()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueSpecification> getTesters();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Tester</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getTesters()
	 * @generated
	 */
	ValueSpecification getTester(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Tester</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getTesters()
	 * @generated
	 */
	ValueSpecification getTester(String name, Type type, boolean ignoreCase, EClass eClass);

	/**
	 * Returns the value of the '<em><b>Execution At</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution At</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution At</em>' attribute.
	 * @see #setExecutionAt(Object)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestLog_ExecutionAt()
	 * @model ordered="false"
	 * @generated
	 */
	Object getExecutionAt();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestLog#getExecutionAt <em>Execution At</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution At</em>' attribute.
	 * @see #getExecutionAt()
	 * @generated
	 */
	void setExecutionAt(Object value);

	/**
	 * Returns the value of the '<em><b>Duration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Duration</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Duration</em>' attribute.
	 * @see #setDuration(Object)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestLog_Duration()
	 * @model ordered="false"
	 * @generated
	 */
	Object getDuration();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestLog#getDuration <em>Duration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Duration</em>' attribute.
	 * @see #getDuration()
	 * @generated
	 */
	void setDuration(Object value);

	/**
	 * Returns the value of the '<em><b>Verdict</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verdict</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verdict</em>' attribute.
	 * @see #setVerdict(Object)
	 * @see org.eclipse.upr.utp.UTPPackage#getTestLog_Verdict()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Object getVerdict();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.utp.TestLog#getVerdict <em>Verdict</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Verdict</em>' attribute.
	 * @see #getVerdict()
	 * @generated
	 */
	void setVerdict(Object value);

	/**
	 * Returns the value of the '<em><b>Verdict Reason</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.uml2.uml.ValueSpecification}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Verdict Reason</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Verdict Reason</em>' reference list.
	 * @see org.eclipse.upr.utp.UTPPackage#getTestLog_VerdictReason()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ValueSpecification> getVerdictReasons();

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Verdict Reason</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getVerdictReasons()
	 * @generated
	 */
	ValueSpecification getVerdictReason(String name, Type type);

	/**
	 * Retrieves the first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>' from the '<em><b>Verdict Reason</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name The '<em><b>Name</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param type The '<em><b>Type</b></em>' of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @param ignoreCase Whether to ignore case in {@link java.lang.String} comparisons.
	 * @param eClass The Ecore class of the {@link org.eclipse.uml2.uml.ValueSpecification} to retrieve, or <code>null</code>.
	 * @return The first {@link org.eclipse.uml2.uml.ValueSpecification} with the specified '<em><b>Name</b></em>', and '<em><b>Type</b></em>', or <code>null</code>.
	 * @see #getVerdictReasons()
	 * @generated
	 */
	ValueSpecification getVerdictReason(String name, Type type, boolean ignoreCase, EClass eClass);

} // TestLog
