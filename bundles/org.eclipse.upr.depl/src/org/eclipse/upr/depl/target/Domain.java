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
package org.eclipse.upr.depl.target;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Domain stereotype extends the UML 2.0 Class metaclass (from UML2.0::CompositeStructures::StructuredClasses). A
 * Domain is defined as a set of Nodes, CommunicationPaths, and SharedResources. In a Domain, Nodes are connected
 * using CommunicationPaths. It represents the entire target environment.
 * 
 * Constraints:
 * • The top-level elements in a domain all have name attributes. These names must be unique within the domain.
 * The top-level elements in a domain all have name attributes. These names must be unique within the domain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.Domain#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Domain#getContainedCommunicationPath <em>Contained Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Domain#getContainedNode <em>Contained Node</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Domain#getDomainResource <em>Domain Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Domain#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Domain#getUUID <em>UUID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.target.TargetPackage#getDomain()
 * @model
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Class</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Class</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Class</em>' reference.
	 * @see #setBase_Class(org.eclipse.uml2.uml.Class)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getDomain_Base_Class()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Domain!base_Class'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Domain#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Contained Communication Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.CommunicationPath}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * CommunicationPaths that provide connections between nodes.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Communication Path</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getDomain_ContainedCommunicationPath()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Domain!containedCommunicationPath'"
	 * @generated
	 */
	EList<CommunicationPath> getContainedCommunicationPath();

	/**
	 * Returns the value of the '<em><b>Contained Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Node}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Node elements that belong to the domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Node</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getDomain_ContainedNode()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Domain!containedNode'"
	 * @generated
	 */
	EList<Node> getContainedNode();

	/**
	 * Returns the value of the '<em><b>Domain Resource</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.SharedResource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Shared resources that belong to the domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Domain Resource</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getDomain_DomainResource()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Domain!domainResource'"
	 * @generated
	 */
	EList<SharedResource> getDomainResource();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional human-readable label for the domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getDomain_Label()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Domain!label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Domain#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>UUID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional unique identifier for this domain.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getDomain_UUID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Domain!UUID'"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Domain#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

} // Domain
