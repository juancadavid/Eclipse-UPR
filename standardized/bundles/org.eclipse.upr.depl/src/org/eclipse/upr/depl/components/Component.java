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
 * A representation of the model object '<em><b>Component</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Component metaclass extends the UML Component metaclass (from UML2.0::Components). In UML 2.0, a
 * component is defined in terms of its set of ports and has references to its realizations.
 * The Component stereotype is defined as “required,” which means that every instance of the Component metaclass must
 * be associated with an instance of the Component stereotype.
 * Note: Definition. Component (from UML2.0::Components): A component represents a modular part of a system that
 * encapsulates its contents and whose manifestation is replaceable within its environment. A component defines its
 * behavior in terms of provided and required interfaces. As such, a component serves as a type, whose conformance is
 * defined by these provided and required interfaces (encompassing both their static as well as dynamic semantics). One
 * component may therefore be substituted by another only if the two are type conformant. Larger pieces of a system's
 * functionality may be assembled by reusing components as parts in an encompassing component or assembly of
 * components, and wiring together their required and provided interfaces. A component is modeled throughout the
 * development life cycle and successively refined into deployment and run-time. A component may be manifest by one or
 * more artifacts, and in turn, that artifact may be deployed to its execution environment. A deployment specification may
 * define values that parameterize the component’s execution.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.Component#getBase_Component <em>Base Component</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Component#getOwnedPort <em>Owned Port</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Component#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Component#getUUID <em>UUID</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Component#getImplementation <em>Implementation</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.Component#getConfigProperty <em>Config Property</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponent()
 * @model
 * @generated
 */
public interface Component extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Component</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Component</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Component</em>' reference.
	 * @see #setBase_Component(org.eclipse.uml2.uml.Component)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponent_Base_Component()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Component!base_Component'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Component getBase_Component();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Component#getBase_Component <em>Base Component</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Component</em>' reference.
	 * @see #getBase_Component()
	 * @generated
	 */
	void setBase_Component(org.eclipse.uml2.uml.Component value);

	/**
	 * Returns the value of the '<em><b>Owned Port</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the set of ports of the component.These configuration properties are used to configure the component once
	 * instantiated. This allows the definition of configuration properties in a package regardless of which implementation is
	 * chosen. ownedPort is a renaming of the ownedPort association of Component (inherited from
	 * UML2.0::CompositeStructures::Ports::EncapsulatedClassifier).
	 * 
	 * Note: Definition. Component (from UML2.0::Components): A component represents a modular part of a system that
	 * encapsulates its contents and whose manifestation is replaceable within its environment. A component defines its
	 * behavior in terms of provided and required interfaces. As such, a component serves as a type, whose conformance is
	 * defined by these provided and required interfaces (encompassing both their static as well as dynamic semantics). One
	 * component may therefore be substituted by another only if the two are type conformant. Larger pieces of a system's
	 * functionality may be assembled by reusing components as parts in an encompassing component or assembly of
	 * components, and wiring together their required and provided interfaces. A component is modeled throughout the
	 * development life cycle and successively refined into deployment and run-time. A component may be manifest by one or
	 * more artifacts, and in turn, that artifact may be deployed to its execution environment. A deployment specification may
	 * define values that parameterize the component’s execution.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port</em>' containment reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponent_OwnedPort()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Component!ownedPort'"
	 * @generated
	 */
	EList<Port> getOwnedPort();

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional human-readable label for the component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponent_Label()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Component!label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Component#getLabel <em>Label</em>}' attribute.
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
	 * An optional unique identifier for this component.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>UUID</em>' attribute.
	 * @see #setUUID(String)
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponent_UUID()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Component!UUID'"
	 * @generated
	 */
	String getUUID();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.components.Component#getUUID <em>UUID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>UUID</em>' attribute.
	 * @see #getUUID()
	 * @generated
	 */
	void setUUID(String value);

	/**
	 * Returns the value of the '<em><b>Implementation</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.ComponentImplementation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * References the Classifiers of which the Component is an abstraction, i.e., that realize its behavior. This association
	 * renames the “realization” association owned by Component (from UML2.0::Components::Component).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Implementation</em>' reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponent_Implementation()
	 * @model ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Component!implementation'"
	 * @generated
	 */
	EList<ComponentImplementation> getImplementation();

	/**
	 * Returns the value of the '<em><b>Config Property</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the set of configurable properties of the component. These configuration properties are used to configure the
	 * component once instantiated. This allows the definition of configuration properties in a package regardless of which
	 * implementation is chosen. configProperty is a subset of the ownedAttribute association of Component (inherited from
	 * UML2.0::CompositeStructures::InternalStructures::StructuredClassifier).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Config Property</em>' containment reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponent_ConfigProperty()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!Component!configProperty'"
	 * @generated
	 */
	EList<Property> getConfigProperty();

} // Component
