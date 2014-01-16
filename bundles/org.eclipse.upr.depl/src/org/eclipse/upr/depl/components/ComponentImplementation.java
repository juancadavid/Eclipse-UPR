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
 * A representation of the model object '<em><b>Component Implementation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The ComponentImplementation stereotype is an extension of the UML 2.0 Class metaclass (from UML2.0::Kernel). A
 * ComponentImplementation is an abstract class that contains the attributes and associations that are common to the
 * different types of component implementations (MonolithicImplementation and ComponentAssembly).
 * A ComponentImplementation describes a specific implementation of a component interface. This implementation can be
 * either assembly based or monolithic. The ComponentImplementation may contain configuration properties that are used
 * to configure each component instance (“default values”). Implementations may be tagged with user-defined capabilities.
 * Administrators can then select among implementations using selection requirements; Assemblers can place requirements
 * on implementations.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentImplementation#getBase_Class <em>Base Class</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentImplementation#getCapability <em>Capability</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentImplementation#getDeployRequirement <em>Deploy Requirement</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentImplementation()
 * @model abstract="true"
 * @generated
 */
public interface ComponentImplementation extends EObject {
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
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentImplementation_Base_Class()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ComponentImplementation!base_Class'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Class getBase_Class();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.ComponentImplementation#getBase_Class <em>Base Class</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Class</em>' reference.
	 * @see #getBase_Class()
	 * @generated
	 */
	void setBase_Class(org.eclipse.uml2.uml.Class value);

	/**
	 * Returns the value of the '<em><b>Capability</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Capability}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Tags that can be used to discriminate between implementations.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Capability</em>' containment reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentImplementation_Capability()
	 * @model containment="true"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ComponentImplementation!capability'"
	 * @generated
	 */
	EList<Capability> getCapability();

	/**
	 * Returns the value of the '<em><b>Deploy Requirement</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Requirement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Requirements that are matched against node resources at deployment time.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Deploy Requirement</em>' reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentImplementation_DeployRequirement()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ComponentImplementation!deployRequirement'"
	 * @generated
	 */
	EList<Requirement> getDeployRequirement();

} // ComponentImplementation
