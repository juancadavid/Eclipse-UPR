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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Property stereotype is an extension of the UML 2.0 Property metaclass (from
 * UML2.0::CompositeStructures::InternalStructures). A Property has a name and a typed value. It is used to carry named
 * and typed values in various places. In the context of D&C, components have configuration properties.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.Property#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getProperty()
 * @model
 * @generated
 */
public interface Property extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(org.eclipse.uml2.uml.Property)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getProperty_Base_Property()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Property!base_Property'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Property#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(org.eclipse.uml2.uml.Property value);

} // Property
