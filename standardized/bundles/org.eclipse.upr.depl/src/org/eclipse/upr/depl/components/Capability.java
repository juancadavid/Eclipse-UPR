/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 * Marc-Florian Wendland
 */
package org.eclipse.upr.depl.components;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Capability</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Capability is used to describe an implementation’s capabilities, which are matched against selection requirements.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.Capability#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Capability#getResourceType <em>Resource Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getCapability()
 * @model
 * @generated
 */
public interface Capability extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional name for the requirement satisfier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getCapability_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Capability!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Capability#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Resource Type</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The resource types that can be satisfied by this satisfier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource Type</em>' attribute list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getCapability_ResourceType()
	 * @model dataType="org.eclipse.uml2.types.String"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Capability!resourceType'"
	 * @generated
	 */
	EList<String> getResourceType();

} // Capability
