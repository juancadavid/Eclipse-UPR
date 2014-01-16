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
 * A representation of the model object '<em><b>Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The Node stereotype extends the UML 2.0 Node metaclass (from UML2.0::Deployments::Nodes).
 * Nodes are connected to zero or more CommunicationPaths that enable components that are instantiated on this node to
 * communicate with components on other nodes. Nodes may own resources and may have access to shared resources that
 * are shared between nodes.
 * 
 * Constraints:
 * • The name of the Node must be unique within the Domain (see above).
 * The name of the Node must be unique within the Domain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.Node#getBase_Node <em>Base Node</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Node#getAvailableSharedResource <em>Available Shared Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Node#getCommunicationPath <em>Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Node#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Node#getLabel <em>Label</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Node#getOwnedResource <em>Owned Resource</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.Node#getNodeConnector <em>Node Connector</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.target.TargetPackage#getNode()
 * @model
 * @generated
 */
public interface Node extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Node</em>' reference.
	 * @see #setBase_Node(org.eclipse.uml2.uml.Node)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getNode_Base_Node()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Node!base_Node'"
	 * @generated
	 */
	org.eclipse.uml2.uml.Node getBase_Node();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Node#getBase_Node <em>Base Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Node</em>' reference.
	 * @see #getBase_Node()
	 * @generated
	 */
	void setBase_Node(org.eclipse.uml2.uml.Node value);

	/**
	 * Returns the value of the '<em><b>Available Shared Resource</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.SharedResource}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.SharedResource#getResourceUser <em>Resource User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of SharedResources that the Node has access to.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Available Shared Resource</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getNode_AvailableSharedResource()
	 * @see org.eclipse.upr.depl.target.SharedResource#getResourceUser
	 * @model opposite="resourceUser" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Node!availableSharedResource'"
	 * @generated
	 */
	EList<SharedResource> getAvailableSharedResource();

	/**
	 * Returns the value of the '<em><b>Communication Path</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.CommunicationPath}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.CommunicationPath#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of CommunicationPath to which the node is connected. This association is derived from the
	 * Interconnect::communicationPath association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Communication Path</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getNode_CommunicationPath()
	 * @see org.eclipse.upr.depl.target.CommunicationPath#getConnectedNode
	 * @model opposite="connectedNode" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * self.nodeConnector.communicationPath->flatten()\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.target.Node%> self = this;\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.upr.depl.target.TargetTables%>.LIBRARY);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> nodeConnector = self.getNodeConnector();\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> BOXED_nodeConnector = idResolver.createSetOfAll(<%org.eclipse.upr.depl.target.TargetTables%>.SET_CLSSid_Interconnect, nodeConnector);\n/*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.eclipse.upr.depl.target.TargetTables%>.BAG_CLSSid_CommunicationPath);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_nodeConnector.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        collect = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.target.Interconnect%> _1 = (<%org.eclipse.upr.depl.target.Interconnect%>)ITERATOR__1.next();\n    /**\n     * communicationPath\n     \052/\n    if (_1 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.upr.depl.target.CommunicationPath%> communicationPath = _1.getCommunicationPath();\n    //\n    accumulator.add(communicationPath);\n}\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> flatten = (<%org.eclipse.ocl.examples.domain.values.BagValue%>)<%org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation%>.INSTANCE.evaluate(collect);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> UNBOXED_flatten = flatten.asEcoreObject();\nreturn (<%org.eclipse.emf.common.util.EList<org.eclipse.upr.depl.target.CommunicationPath>%>)UNBOXED_flatten;'"
	 * @generated
	 */
	EList<CommunicationPath> getCommunicationPath();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The node’s name.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getNode_Name()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Node!name'"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Node#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * An optional human readable label for the node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getNode_Label()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Node!label'"
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.Node#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Owned Resource</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Resource}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of resources owned by the Node.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Owned Resource</em>' containment reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getNode_OwnedResource()
	 * @model containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Node!ownedResource'"
	 * @generated
	 */
	EList<Resource> getOwnedResource();

	/**
	 * Returns the value of the '<em><b>Node Connector</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Interconnect}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Interconnect#getConnectedNode <em>Connected Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of Interconnect to which the node is connected.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Node Connector</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getNode_NodeConnector()
	 * @see org.eclipse.upr.depl.target.Interconnect#getConnectedNode
	 * @model opposite="connectedNode" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!Node!nodeConnector'"
	 * @generated
	 */
	EList<Interconnect> getNodeConnector();

} // Node
