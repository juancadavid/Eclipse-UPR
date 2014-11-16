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

import org.eclipse.uml2.uml.PackageableElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
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
 *   <li>{@link org.eclipse.upr.bpmnprof.RootElement#getBase_PackageableElement <em>Base Packageable Element</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.RootElement#getDefinition <em>Definition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getRootElement()
 * @model abstract="true"
 * @generated
 */
public interface RootElement extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Base Packageable Element</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Packageable Element</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Packageable Element</em>' reference.
	 * @see #setBase_PackageableElement(PackageableElement)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getRootElement_Base_PackageableElement()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageableElement getBase_PackageableElement();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.RootElement#getBase_PackageableElement <em>Base Packageable Element</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Packageable Element</em>' reference.
	 * @see #getBase_PackageableElement()
	 * @generated
	 */
	void setBase_PackageableElement(PackageableElement value);

	/**
	 * Returns the value of the '<em><b>Definition</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.Definitions#getRootElements <em>Root Elements</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definition</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definition</em>' reference.
	 * @see #setDefinition(Definitions)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getRootElement_Definition()
	 * @see org.eclipse.upr.bpmnprof.Definitions#getRootElements
	 * @model opposite="rootElements" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Definitions getDefinition();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.RootElement#getDefinition <em>Definition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definition</em>' reference.
	 * @see #getDefinition()
	 * @generated
	 */
	void setDefinition(Definitions value);

} // RootElement
