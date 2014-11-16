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

import org.eclipse.emf.ecore.EObject;

import org.eclipse.uml2.uml.PackageImport;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Import</b></em>'.
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
 *   <li>{@link org.eclipse.upr.bpmnprof.Import#getBase_PackageImport <em>Base Package Import</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Import#getImportType <em>Import Type</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Import#getLocation <em>Location</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Import#getNamespace <em>Namespace</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Import#getDefinitions <em>Definitions</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getImport()
 * @model
 * @generated
 */
public interface Import extends EObject {
	/**
	 * Returns the value of the '<em><b>Base Package Import</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Package Import</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Package Import</em>' reference.
	 * @see #setBase_PackageImport(PackageImport)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getImport_Base_PackageImport()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	PackageImport getBase_PackageImport();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Import#getBase_PackageImport <em>Base Package Import</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Package Import</em>' reference.
	 * @see #getBase_PackageImport()
	 * @generated
	 */
	void setBase_PackageImport(PackageImport value);

	/**
	 * Returns the value of the '<em><b>Import Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Import Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Import Type</em>' attribute.
	 * @see #setImportType(String)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getImport_ImportType()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getImportType();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Import#getImportType <em>Import Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Import Type</em>' attribute.
	 * @see #getImportType()
	 * @generated
	 */
	void setImportType(String value);

	/**
	 * Returns the value of the '<em><b>Location</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Location</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Location</em>' attribute.
	 * @see #setLocation(String)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getImport_Location()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getLocation();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Import#getLocation <em>Location</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Location</em>' attribute.
	 * @see #getLocation()
	 * @generated
	 */
	void setLocation(String value);

	/**
	 * Returns the value of the '<em><b>Namespace</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespace</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespace</em>' attribute.
	 * @see #setNamespace(String)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getImport_Namespace()
	 * @model dataType="org.eclipse.uml2.types.String" required="true" ordered="false"
	 * @generated
	 */
	String getNamespace();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Import#getNamespace <em>Namespace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Namespace</em>' attribute.
	 * @see #getNamespace()
	 * @generated
	 */
	void setNamespace(String value);

	/**
	 * Returns the value of the '<em><b>Definitions</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Definitions</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Definitions</em>' reference.
	 * @see #setDefinitions(Definitions)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getImport_Definitions()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	Definitions getDefinitions();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Import#getDefinitions <em>Definitions</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Definitions</em>' reference.
	 * @see #getDefinitions()
	 * @generated
	 */
	void setDefinitions(Definitions value);

} // Import
