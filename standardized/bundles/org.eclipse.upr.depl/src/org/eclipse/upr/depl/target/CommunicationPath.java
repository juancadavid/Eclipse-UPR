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
 * A representation of the model object '<em><b>Communication Path</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The CommunicationPath stereotype extends the UML 2.0 CommunicationPath metaclass (from
 * UML2.0::Deployments::Nodes). A CommunicationPath connects two or more Nodes (as opposed to only two nodes for
 * UML 2.0 Node). A CommunicationPath may be composed of one or more Interconnects and zero or more Bridges.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.CommunicationPath#getBase_CommunicationPath <em>Base Communication Path</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.CommunicationPath#getInterconnect <em>Interconnect</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.CommunicationPath#getBridge <em>Bridge</em>}</li>
 *   <li>{@link org.eclipse.upr.depl.target.CommunicationPath#getConnectedNode <em>Connected Node</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.target.TargetPackage#getCommunicationPath()
 * @model
 * @generated
 */
public interface CommunicationPath extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Communication Path</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Communication Path</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Communication Path</em>' reference.
	 * @see #setBase_CommunicationPath(org.eclipse.uml2.uml.CommunicationPath)
	 * @see org.eclipse.upr.depl.target.TargetPackage#getCommunicationPath_Base_CommunicationPath()
	 * @model required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!CommunicationPath!base_CommunicationPath'"
	 * @generated
	 */
	org.eclipse.uml2.uml.CommunicationPath getBase_CommunicationPath();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.depl.target.CommunicationPath#getBase_CommunicationPath <em>Base Communication Path</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Communication Path</em>' reference.
	 * @see #getBase_CommunicationPath()
	 * @generated
	 */
	void setBase_CommunicationPath(org.eclipse.uml2.uml.CommunicationPath value);

	/**
	 * Returns the value of the '<em><b>Interconnect</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Interconnect}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Interconnect#getCommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of Interconnect contained in the CommunicationPath.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Interconnect</em>' containment reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getCommunicationPath_Interconnect()
	 * @see org.eclipse.upr.depl.target.Interconnect#getCommunicationPath
	 * @model opposite="communicationPath" containment="true" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!CommunicationPath!interconnect'"
	 * @generated
	 */
	EList<Interconnect> getInterconnect();

	/**
	 * Returns the value of the '<em><b>Bridge</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Bridge}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Bridge#getCommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of Bridges contained in the CommunicationPath.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Bridge</em>' containment reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getCommunicationPath_Bridge()
	 * @see org.eclipse.upr.depl.target.Bridge#getCommunicationPath
	 * @model opposite="communicationPath" containment="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!CommunicationPath!bridge'"
	 * @generated
	 */
	EList<Bridge> getBridge();

	/**
	 * Returns the value of the '<em><b>Connected Node</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Node}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Node#getCommunicationPath <em>Communication Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of Nodes that uses the sharedResource. This association is derived from the Interconnect::connectedNode
	 * association.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Connected Node</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getCommunicationPath_ConnectedNode()
	 * @see org.eclipse.upr.depl.target.Node#getCommunicationPath
	 * @model opposite="communicationPath" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='/**\n * self.interconnect.connectedNode->flatten()\n \052/\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.target.CommunicationPath%> self = this;\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.evaluation.DomainEvaluator%> evaluator = new <%org.eclipse.ocl.examples.library.ecore.EcoreExecutorManager%>(this, <%org.eclipse.upr.depl.target.TargetTables%>.LIBRARY);\nfinal /*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.types.IdResolver%> idResolver = evaluator.getIdResolver();\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> interconnect = self.getInterconnect();\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> BOXED_interconnect = idResolver.createSetOfAll(<%org.eclipse.upr.depl.target.TargetTables%>.SET_CLSSid_Interconnect, interconnect);\n/*@NonNull\052/ /*@NonInvalid\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%>.Accumulator accumulator = <%org.eclipse.ocl.examples.domain.values.util.ValuesUtil%>.createBagAccumulatorValue(<%org.eclipse.upr.depl.target.TargetTables%>.BAG_CLSSid_Node);\n/*@Nullable\052/ <%java.util.Iterator%><?> ITERATOR__1 = BOXED_interconnect.iterator();\n/*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> collect;\nwhile (true) {\n    if (!ITERATOR__1.hasNext()) {\n        collect = accumulator;\n        break;\n    }\n    /*@Nullable\052/ /*@NonInvalid\052/ <%org.eclipse.upr.depl.target.Interconnect%> _1 = (<%org.eclipse.upr.depl.target.Interconnect%>)ITERATOR__1.next();\n    /**\n     * connectedNode\n     \052/\n    if (_1 == null) {\n        throw new <%org.eclipse.ocl.examples.domain.values.impl.InvalidValueException%>(\"Null source\");\n    }\n    final /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> connectedNode = _1.getConnectedNode();\n    final /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.SetValue%> BOXED_connectedNode = idResolver.createSetOfAll(<%org.eclipse.upr.depl.target.TargetTables%>.SET_CLSSid_Node, connectedNode);\n    //\n    for (Object value : BOXED_connectedNode.flatten().getElements()) {\n        accumulator.add(value);\n    }\n}\nfinal /*@NonNull\052/ /*@Thrown\052/ <%org.eclipse.ocl.examples.domain.values.BagValue%> flatten = (<%org.eclipse.ocl.examples.domain.values.BagValue%>)<%org.eclipse.ocl.examples.library.collection.CollectionFlattenOperation%>.INSTANCE.evaluate(collect);\nfinal /*@NonNull\052/ /*@Thrown\052/ <%java.util.List%><?> UNBOXED_flatten = flatten.asEcoreObject();\nreturn (<%org.eclipse.emf.common.util.EList<org.eclipse.upr.depl.target.Node>%>)UNBOXED_flatten;'"
	 * @generated
	 */
	EList<Node> getConnectedNode();

} // CommunicationPath
