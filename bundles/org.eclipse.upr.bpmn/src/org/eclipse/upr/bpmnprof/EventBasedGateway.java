/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 */
package org.eclipse.upr.bpmnprof;

import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.StructuredActivityNode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p>From package BPMNProfile::CoreStructure::Common::Gateways.</p>
 * <p>From package BPMNProfile::CoreStructure::Infrastructure.</p>
 * <p>From package BPMNProfile::Process.</p>
 * <p>From package BPMNProfile (URI {@literal http://www.omg.org/spec/BPMNProfile/20121112/}).</p>
 * <p>From package BPMNProfile::CoreStructure::Common::Events.</p>
 * <p>From package BPMNProfile::CoreStructure::Common::Artifacts.</p>
 * <p>From package BPMNProfile::CoreStructure::Common.</p>
 * <p>From package BPMNProfile::Process::Data.</p>
 * <p>From package BPMNProfile::Process::HumanInteraction.</p>
 * <p>From package BPMNProfile::Collaboration.</p>
 * <p>From package BPMNProfile::CoreStructure::Foundation.</p>
 * <p>From package BPMNProfile::CoreStructure::Service.</p>
 * <p>From package BPMNProfile::Collaboration::Conversation.</p>
 * <p>From package BPMNProfile::CoreStructure.</p>
 * <p>From package BPMNProfile::Process::Activities.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.EventBasedGateway#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getBase_ForkNode <em>Base Fork Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getBase_StructuredActivityNode <em>Base Structured Activity Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getBase_InterruptibleActivityRegion <em>Base Interruptible Activity Region</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEventBasedGateway()
 * @model
 * @generated
 */
public interface EventBasedGateway extends Gateway {
	/**
	 * Returns the value of the '<em><b>Instantiate</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instantiate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instantiate</em>' attribute.
	 * @see #setInstantiate(boolean)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEventBasedGateway_Instantiate()
	 * @model default="false" dataType="org.eclipse.uml2.types.Boolean" required="true" ordered="false"
	 * @generated
	 */
	boolean isInstantiate();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.EventBasedGateway#isInstantiate <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instantiate</em>' attribute.
	 * @see #isInstantiate()
	 * @generated
	 */
	void setInstantiate(boolean value);

	/**
	 * Returns the value of the '<em><b>Event Gateway Type</b></em>' attribute.
	 * The default value is <code>"exclusive"</code>.
	 * The literals are from the enumeration {@link org.eclipse.upr.bpmnprof.EventBasedGatewayType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Event Gateway Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Event Gateway Type</em>' attribute.
	 * @see org.eclipse.upr.bpmnprof.EventBasedGatewayType
	 * @see #setEventGatewayType(EventBasedGatewayType)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEventBasedGateway_EventGatewayType()
	 * @model default="exclusive" required="true" ordered="false"
	 * @generated
	 */
	EventBasedGatewayType getEventGatewayType();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getEventGatewayType <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Event Gateway Type</em>' attribute.
	 * @see org.eclipse.upr.bpmnprof.EventBasedGatewayType
	 * @see #getEventGatewayType()
	 * @generated
	 */
	void setEventGatewayType(EventBasedGatewayType value);

	/**
	 * Returns the value of the '<em><b>Base Fork Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Fork Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Fork Node</em>' reference.
	 * @see #setBase_ForkNode(ForkNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEventBasedGateway_Base_ForkNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	ForkNode getBase_ForkNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getBase_ForkNode <em>Base Fork Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Fork Node</em>' reference.
	 * @see #getBase_ForkNode()
	 * @generated
	 */
	void setBase_ForkNode(ForkNode value);

	/**
	 * Returns the value of the '<em><b>Base Structured Activity Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Structured Activity Node</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Structured Activity Node</em>' reference.
	 * @see #setBase_StructuredActivityNode(StructuredActivityNode)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEventBasedGateway_Base_StructuredActivityNode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	StructuredActivityNode getBase_StructuredActivityNode();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getBase_StructuredActivityNode <em>Base Structured Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Structured Activity Node</em>' reference.
	 * @see #getBase_StructuredActivityNode()
	 * @generated
	 */
	void setBase_StructuredActivityNode(StructuredActivityNode value);

	/**
	 * Returns the value of the '<em><b>Base Interruptible Activity Region</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Interruptible Activity Region</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Interruptible Activity Region</em>' reference.
	 * @see #setBase_InterruptibleActivityRegion(InterruptibleActivityRegion)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getEventBasedGateway_Base_InterruptibleActivityRegion()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	InterruptibleActivityRegion getBase_InterruptibleActivityRegion();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.EventBasedGateway#getBase_InterruptibleActivityRegion <em>Base Interruptible Activity Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Interruptible Activity Region</em>' reference.
	 * @see #getBase_InterruptibleActivityRegion()
	 * @generated
	 */
	void setBase_InterruptibleActivityRegion(InterruptibleActivityRegion value);

} // EventBasedGateway
