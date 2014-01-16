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

import org.eclipse.uml2.uml.ConnectableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ExternalReference stereotype is an extension of the UML 2.0 ConnectableElement metaclass (from
 * UML2.0::CompositeStructures::InternalStructures). It identifies a location outside the assembly as an endpoint of a
 * PortConnector. Whether the endpoint is a provider or user port is implied by the URL, and its type is assumed to be
 * compatible with the connection.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.ExternalReference#getBase_ConnectableElement <em>Base Connectable Element</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.ExternalReference#getLocation <em>Location</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getExternalReference()
 * @model
 * @generated
 */
public interface ExternalReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Connectable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Connectable Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Connectable Element</em>' reference.
	 * @see #setBase_ConnectableElement(ConnectableElement)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getExternalReference_Base_ConnectableElement()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ExternalReference!base_ConnectableElement'"
	 * @generated
	 */
	ConnectableElement getBase_ConnectableElement();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.ExternalReference#getBase_ConnectableElement <em>Base Connectable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Connectable Element</em>' reference.
	 * @see #getBase_ConnectableElement()
	 * @generated
	 */
	void setBase_ConnectableElement(ConnectableElement value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * URL which references a port outside of the assembly that is to be an endpoint of this connection, which is resolved at execution
	 * time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getExternalReference_Location()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ExternalReference!location'"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.ExternalReference#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

} // ExternalReference
