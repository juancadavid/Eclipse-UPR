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

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Component Assembly</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * In spite of the fact that UML 2.0 allows for the recursive definition of components in terms of subcomponents (based on
 * the fact that a UML 2.0 Component is a specialization of UML2.0::StructuredClass::Class ), the concept of component
 * assembly is not explicitly defined in UML 2.0. The ComponentAssembly stereotype specializes the UML 2.0 Class
 * metaclass from StructuredClasses (UML2.0::CompositeStructures::StructuredClasses). It is a subclass of the
 * ComponentImplementation stereotype.
 * A ComponentAssembly is a classifier whose behavior is fully described by the collaboration of a set of components. A
 * ComponentAssembly is defined in terms of a set of components (subcomponents) and the set of connections that connect
 * components.
 * A ComponentAssembly is defined as an implementation of a Component.
 * A ComponentAssembly also has a two derived attributes: ports, that contains the set of external ports of the assembly
 * implements, and properties, that contains the set of properties of the assembly. These two attributes are derived from the
 * component the assembly implements. The ports and properties of the implemented component must be allocated to ports
 * and properties of sub-components contained in the ComponentAssembly.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentAssembly#getContainedComponent <em>Contained Component</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentAssembly#getOwnedPropertyConnector <em>Owned Property Connector</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentAssembly#getAssemblyProperty <em>Assembly Property</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentAssembly#getExternalPort <em>External Port</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.components.ComponentAssembly#getOwnedPortConnector <em>Owned Port Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentAssembly()
 * @model
 * @generated
 */
public interface ComponentAssembly extends ComponentImplementation {
	/**
	 * Returns the value of the '<em><b>Contained Component</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Component}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the set of Components contained in the ComponentAssembly (i.e., subcomponents). This association is a
	 * subset of the “role” association owned by the StructuredClassifier
	 * (UML2.0::CompositeStructures::InternalStructures::StructuredClassifier).
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Contained Component</em>' reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentAssembly_ContainedComponent()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ComponentAssembly!containedComponent'"
	 * @generated
	 */
	EList<Component> getContainedComponent();

	/**
	 * Returns the value of the '<em><b>Owned Property Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.PropertyConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Maps the external properties of the component that is implemented by the assembly to properties of subcomponent
	 * instances. Describes the set of PropertyConnectors owned by the ComponentAssembly. This association is a subset of
	 * the ownedConnector association owned by UML2.0::CompositeStructures::InternalStructures::StructuredClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Property Connector</em>' containment reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentAssembly_OwnedPropertyConnector()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ComponentAssembly!ownedPropertyConnector'"
	 * @generated
	 */
	EList<PropertyConnector> getOwnedPropertyConnector();

	/**
	 * Returns the value of the '<em><b>Assembly Property</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Property}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the set of properties of the assembly. This association is derived from the Component the assembly
	 * implements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Assembly Property</em>' reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentAssembly_AssemblyProperty()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * \n * Component.allInstances()\n * ->select(c | c.implementation->includes(self))\n * .configProperty->flatten()\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.components.ComponentAssembly%> self = this;\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.upr.depl.components.ComponentsTables%>.LIBRARY);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_UMLProfileForDC_c_c_components_c_c_Component = idResolver.getType(<%org.eclipse.upr.depl.components.ComponentsTables%>.CLSSid_Component_0, null);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances = <%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_Component, TYP_UMLProfileForDC_c_c_components_c_c_Component);\n/*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_Component);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_c = allInstances.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> select;\nwhile (true) {\n    if (!ITERATOR_c.hasNext()) {\n        select = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.components.Component%> c = (<%org.eclipse.upr.depl.components.Component%>)ITERATOR_c.next();\n    /**\n     * c.implementation->includes(self)\n     \052/\n    if (c == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> implementation = c.getImplementation();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> BOXED_implementation = idResolver.createSetOfAll(<%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_ComponentImplementation, implementation);\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.Boolean%> includes = <%org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_implementation, self);\n    //\n    if (includes == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n        accumulator.add(c);\n    }\n}\n/*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.eclipse.upr.depl.components.ComponentsTables%>.BAG_CLSSid_Property);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = select.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        collect = accumulator_0;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.components.Component%> _1 = (<%org.eclipse.upr.depl.components.Component%>)ITERATOR__1.next();\n    /**\n     * configProperty\n     \052/\n    if (_1 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> configProperty = _1.getConfigProperty();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> BOXED_configProperty = idResolver.createSetOfAll(<%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_Property, configProperty);\n    //\n    for (Object value : BOXED_configProperty.flatten().getElements()) {\n        accumulator_0.add(value);\n    }\n}\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> flatten = (<%org.eclipse.ocl.examples.domain.values.BagValue%>)<%org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation%>.INSTANCE.evaluate(collect);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> UNBOXED_flatten = flatten.asEcoreObject();\nreturn (<%org.eclipse.emf.common.util.EList<org.eclipse.upr.depl.components.Property>%>)UNBOXED_flatten;'"
	 * @generated
	 */
	EList<Property> getAssemblyProperty();

	/**
	 * Returns the value of the '<em><b>External Port</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.Port}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Contains the set of external ports of the assembly. This association is derived from the Component the assembly
	 * implements.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>External Port</em>' reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentAssembly_ExternalPort()
	 * @model transient="true" changeable="false" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * \n * Component.allInstances()\n * ->select(c | c.implementation->includes(self))\n * .ownedPort->flatten()\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.components.ComponentAssembly%> self = this;\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.upr.depl.components.ComponentsTables%>.LIBRARY);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.elements.DomainType%> TYP_UMLProfileForDC_c_c_components_c_c_Component = idResolver.getType(<%org.eclipse.upr.depl.components.ComponentsTables%>.CLSSid_Component_0, null);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> allInstances = <%org.eclipse.ocl.examples.library.classifier.ClassifierAllInstancesOperation%>.INSTANCE.evaluate(evaluator, <%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_Component, TYP_UMLProfileForDC_c_c_components_c_c_Component);\n/*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createSetAccumulatorValue(<%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_Component);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR_c = allInstances.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> select;\nwhile (true) {\n    if (!ITERATOR_c.hasNext()) {\n        select = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.components.Component%> c = (<%org.eclipse.upr.depl.components.Component%>)ITERATOR_c.next();\n    /**\n     * c.implementation->includes(self)\n     \052/\n    if (c == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> implementation = c.getImplementation();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> BOXED_implementation = idResolver.createSetOfAll(<%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_ComponentImplementation, implementation);\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.lang.Boolean%> includes = <%org.eclipse.ocl.examples.library.collection.CollectionIncludesOperation%>.INSTANCE.evaluate(BOXED_implementation, self);\n    //\n    if (includes == <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.TRUE_VALUE) {\n        accumulator.add(c);\n    }\n}\n/*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator_0 = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.eclipse.upr.depl.components.ComponentsTables%>.BAG_CLSSid_Port);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = select.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        collect = accumulator_0;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.components.Component%> _1 = (<%org.eclipse.upr.depl.components.Component%>)ITERATOR__1.next();\n    /**\n     * ownedPort\n     \052/\n    if (_1 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> ownedPort = _1.getOwnedPort();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> BOXED_ownedPort = idResolver.createSetOfAll(<%org.eclipse.upr.depl.components.ComponentsTables%>.SET_CLSSid_Port, ownedPort);\n    //\n    for (Object value : BOXED_ownedPort.flatten().getElements()) {\n        accumulator_0.add(value);\n    }\n}\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> flatten = (<%org.eclipse.ocl.examples.domain.values.BagValue%>)<%org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation%>.INSTANCE.evaluate(collect);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> UNBOXED_flatten = flatten.asEcoreObject();\nreturn (<%org.eclipse.emf.common.util.EList<org.eclipse.upr.depl.components.Port>%>)UNBOXED_flatten;'"
	 * @generated
	 */
	EList<Port> getExternalPort();

	/**
	 * Returns the value of the '<em><b>Owned Port Connector</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.components.PortConnector}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Describes the set of PortConnectors owned by the ComponentAssembly. This association is a subset of the
	 * ownedConnector association owned by UML2.0::CompositeStructures::InternalStructures::StructuredClassifier.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Port Connector</em>' containment reference list.
	 * @see org.eclipse.upr.depl.components.ComponentsPackage#getComponentAssembly_OwnedPortConnector()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/components/1.0!ComponentAssembly!ownedPortConnector'"
	 * @generated
	 */
	EList<PortConnector> getOwnedPortConnector();

} // ComponentAssembly
