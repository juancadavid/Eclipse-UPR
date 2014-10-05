/**
 */
package org.eclipse.upr.bpmnprof;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.uml2.uml.Property;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Participant</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
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
 *   <li>{@link org.eclipse.upr.bpmnprof.Participant#getBase_Property <em>Base Property</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Participant#getProcessRef <em>Process Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Participant#getPartnerEntityRef <em>Partner Entity Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Participant#getPartnerRoleRef <em>Partner Role Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.Participant#getInterfaceRefs <em>Interface Refs</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getParticipant()
 * @model
 * @generated
 */
public interface Participant extends BaseElement {
	/**
	 * Returns the value of the '<em><b>Base Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Property</em>' reference.
	 * @see #setBase_Property(Property)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getParticipant_Base_Property()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	Property getBase_Property();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Participant#getBase_Property <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Property</em>' reference.
	 * @see #getBase_Property()
	 * @generated
	 */
	void setBase_Property(Property value);

	/**
	 * Returns the value of the '<em><b>Process Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Process Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Process Ref</em>' reference.
	 * @see #setProcessRef(BPMNProcess)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getParticipant_ProcessRef()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	BPMNProcess getProcessRef();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Participant#getProcessRef <em>Process Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Process Ref</em>' reference.
	 * @see #getProcessRef()
	 * @generated
	 */
	void setProcessRef(BPMNProcess value);

	/**
	 * Returns the value of the '<em><b>Participant Multiplicity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Participant Multiplicity</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participant Multiplicity</em>' reference.
	 * @see #setParticipantMultiplicity(ParticipantMultiplicity)
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getParticipant_ParticipantMultiplicity()
	 * @model transient="true" volatile="true" derived="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='participantMultiplicity '"
	 * @generated
	 */
	ParticipantMultiplicity getParticipantMultiplicity();

	/**
	 * Sets the value of the '{@link org.eclipse.upr.bpmnprof.Participant#getParticipantMultiplicity <em>Participant Multiplicity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Participant Multiplicity</em>' reference.
	 * @see #getParticipantMultiplicity()
	 * @generated
	 */
	void setParticipantMultiplicity(ParticipantMultiplicity value);

	/**
	 * Returns the value of the '<em><b>Partner Entity Ref</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.PartnerEntity}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.PartnerEntity#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Entity Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Entity Ref</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getParticipant_PartnerEntityRef()
	 * @see org.eclipse.upr.bpmnprof.PartnerEntity#getParticipantRef
	 * @model opposite="participantRef" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<PartnerEntity> getPartnerEntityRef();

	/**
	 * Returns the value of the '<em><b>Partner Role Ref</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.PartnerRole}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.bpmnprof.PartnerRole#getParticipantRef <em>Participant Ref</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Partner Role Ref</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partner Role Ref</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getParticipant_PartnerRoleRef()
	 * @see org.eclipse.upr.bpmnprof.PartnerRole#getParticipantRef
	 * @model opposite="participantRef" required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<PartnerRole> getPartnerRoleRef();

	/**
	 * Returns the value of the '<em><b>Interface Refs</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.bpmnprof.BPMNInterface}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Interface Refs</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface Refs</em>' reference list.
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#getParticipant_InterfaceRefs()
	 * @model required="true" transient="true" volatile="true" derived="true" ordered="false"
	 * @generated
	 */
	EList<BPMNInterface> getInterfaceRefs();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant must be owned by BPMN <<Collaboration>>
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Participant.ownership'"
	 * @generated
	 */
	boolean Participantownership(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant must be typed either by UML class or a stereotyped class.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Participant.type'"
	 * @generated
	 */
	boolean Participanttype(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant.multiplicityMaximum : UnlimitedNatural = Property.upper (defined on Multiplicity element)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Participant.multiplicityMinimum'"
	 * @generated
	 */
	boolean ParticipantmultiplicityMinimum(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  The supplier is a UML Interface stereotyped
	 *   by BPMN Interface
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Participant.realization.supplier'"
	 * @generated
	 */
	boolean Participantrealizationsupplier(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant:://processRef : Process [0..1] = Property.type if type is activity, or Property.type.classifierBehavior if type is a BehavioredClassifier that is not Activity
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Participant.processRef'"
	 * @generated
	 */
	boolean ParticipantprocessRef(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant.multiplicityMaximum : Integer = Property.upper (defined on Multiplicity element)
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Participant.multiplicityMaximum'"
	 * @generated
	 */
	boolean ParticipantmultiplicityMaximum(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * participant::/partnerEntityRef : PartnerEntity [*] = inverse of PartnerEntity::/participantRef
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='participant.partnerEntityRef'"
	 * @generated
	 */
	boolean participantpartnerEntityRef(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * participant::/partnerRoleRef : PartnerRole [*] = inverse of PartnerRole::/participantRef
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='participant.partnerRoleRef'"
	 * @generated
	 */
	boolean participantpartnerRoleRef(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Participant:://interfaceRefs : BPMNInterface [*] = Property.type with BPMNInterface stereotype applied
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/2.0.0/UML originalName='Participant.interfaceRefs'"
	 * @generated
	 */
	boolean ParticipantinterfaceRefs(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Participant
