/**
 */
package org.eclipse.upr.bpmnprof.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.eclipse.uml2.uml.UMLPackage;

import org.eclipse.upr.bpmnprof.BpmnprofFactory;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BpmnprofPackageImpl extends EPackageImpl implements BpmnprofPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "bpmnprof.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass nonExclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass gatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass baseElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionAttributeValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionAttributeDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass extensionDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnArtifactEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass auditingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass monitoringEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryValueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass flowElementsContainerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass laneEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sequenceFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventBasedGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parallelGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exclusiveGatewayEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rootElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass definitionsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnExtensionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnRelationshipEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callableElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputSpecificationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemAwareElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStateEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOutputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputSetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnInterfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnOperationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnMessageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputOutputBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnCollaborationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interactionNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversationLinkEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass participantMultiplicityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partnerEntityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass partnerRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageFlowAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageFlowEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversationNodeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationKeyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationPropertyRetrievalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass formalExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationSubscriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass correlationPropertyBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceRoleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceAssignmentExpressionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceParameterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass resourceParameterBindingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalScriptTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalBusinessRuleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compensateEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass eventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass boundaryEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass catchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataOutputAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass assignmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataInputAssociationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass loopCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escalationEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass escalationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timerEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass signalEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bpmnSignalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass endEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass throwEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass startEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conditionalEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass errorEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateCatchEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass intermediateThrowEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass terminateEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass implicitThrowEventEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cancelEventDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass textAnnotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass categoryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass groupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataObjectEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dataStoreReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass taskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass renderingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass humanPerformerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass performerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalUserTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalManualTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass manualTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass potentialOwnerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subConversationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalConversationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callConversationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass conversationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callActivityEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass businessRuleTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass complexBehaviorDefinitionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adHocSubProcessEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass scriptTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sendTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass standardLoopCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass receiveTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass serviceTaskEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass multiInstanceLoopCharacteristicsEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associationDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eventBasedGatewayTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum gatewayDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum relationshipDirectionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum itemKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adHocOrderingEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multiInstanceBehaviorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.upr.bpmnprof.BpmnprofPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BpmnprofPackageImpl() {
		super(eNS_URI, BpmnprofFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BpmnprofPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static BpmnprofPackage init() {
		if (isInited) return (BpmnprofPackage)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI);

		// Obtain or create and register package
		BpmnprofPackageImpl theBpmnprofPackage = (BpmnprofPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BpmnprofPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BpmnprofPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		UMLPackage.eINSTANCE.eClass();

		// Load packages
		theBpmnprofPackage.loadPackage();

		// Fix loaded packages
		theBpmnprofPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBpmnprofPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BpmnprofValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBpmnprofPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BpmnprofPackage.eNS_URI, theBpmnprofPackage);
		return theBpmnprofPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInclusiveGateway() {
		if (inclusiveGatewayEClass == null) {
			inclusiveGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(0);
		}
		return inclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInclusiveGateway_Default() {
        return (EReference)getInclusiveGateway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInclusiveGateway__InclusiveGatewaydefault__DiagnosticChain_Map() {
        return getInclusiveGateway().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNonExclusiveGateway() {
		if (nonExclusiveGatewayEClass == null) {
			nonExclusiveGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(1);
		}
		return nonExclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonExclusiveGateway_Base_JoinNode() {
        return (EReference)getNonExclusiveGateway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNonExclusiveGateway_Base_ForkNode() {
        return (EReference)getNonExclusiveGateway().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGateway() {
		if (gatewayEClass == null) {
			gatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(2);
		}
		return gatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Base_ControlNode() {
        return (EReference)getGateway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGateway_Base_ActivityGroup() {
        return (EReference)getGateway().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowNode() {
		if (flowNodeEClass == null) {
			flowNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(3);
		}
		return flowNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowNode_Base_ActivityNode() {
        return (EReference)getFlowNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElement() {
		if (flowElementEClass == null) {
			flowElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(4);
		}
		return flowElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElement_Auditing() {
        return (EReference)getFlowElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElement_Monitoring() {
        return (EReference)getFlowElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElement__categoryValueRef() {
        return (EReference)getFlowElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElement_Container() {
        return (EReference)getFlowElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBaseElement() {
		if (baseElementEClass == null) {
			baseElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(5);
		}
		return baseElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBaseElement_Id() {
        return (EAttribute)getBaseElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseElement_ExtensionValues() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseElement_Base_Element() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseElement_Documentation() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseElement_ExtensionDefinitions() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseElement_Outgoing() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBaseElement_Incoming() {
        return (EReference)getBaseElement().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionAttributeValue() {
		if (extensionAttributeValueEClass == null) {
			extensionAttributeValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(6);
		}
		return extensionAttributeValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionAttributeValue_Base_Slot() {
        return (EReference)getExtensionAttributeValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionAttributeValue_ValueRef() {
        return (EReference)getExtensionAttributeValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionAttributeValue_ExtensionAttributeDefinition() {
        return (EReference)getExtensionAttributeValue().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionAttributeDefinition() {
		if (extensionAttributeDefinitionEClass == null) {
			extensionAttributeDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(7);
		}
		return extensionAttributeDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionAttributeDefinition_Base_Property() {
        return (EReference)getExtensionAttributeDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionAttributeDefinition_Type() {
        return (EAttribute)getExtensionAttributeDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExtensionAttributeDefinition_IsReference() {
        return (EAttribute)getExtensionAttributeDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentation() {
		if (documentationEClass == null) {
			documentationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(8);
		}
		return documentationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentation_Base_Comment() {
        return (EReference)getDocumentation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_TextFormat() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentation_Text() {
        return (EAttribute)getDocumentation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExtensionDefinition() {
		if (extensionDefinitionEClass == null) {
			extensionDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(9);
		}
		return extensionDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionDefinition_Base_Stereotype() {
        return (EReference)getExtensionDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExtensionDefinition_ExtensionAttributeDefinitions() {
        return (EReference)getExtensionDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNAssociation() {
		if (bpmnAssociationEClass == null) {
			bpmnAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(10);
		}
		return bpmnAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNAssociation_Base_Dependency() {
        return (EReference)getBPMNAssociation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNAssociation_AssociationDirection() {
        return (EAttribute)getBPMNAssociation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNAssociation_TargetRef() {
        return (EReference)getBPMNAssociation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNAssociation_SourceRef() {
        return (EReference)getBPMNAssociation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNAssociation__AssociationEnd__DiagnosticChain_Map() {
        return getBPMNAssociation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNArtifact() {
		if (bpmnArtifactEClass == null) {
			bpmnArtifactEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(11);
		}
		return bpmnArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuditing() {
		if (auditingEClass == null) {
			auditingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(13);
		}
		return auditingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuditing_Base_Class() {
        return (EReference)getAuditing().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMonitoring() {
		if (monitoringEClass == null) {
			monitoringEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(14);
		}
		return monitoringEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMonitoring_Base_Class() {
        return (EReference)getMonitoring().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategoryValue() {
		if (categoryValueEClass == null) {
			categoryValueEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(15);
		}
		return categoryValueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryValue_Base_EnumerationLiteral() {
        return (EReference)getCategoryValue().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategoryValue_CategorizedFlowElements() {
        return (EReference)getCategoryValue().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFlowElementsContainer() {
		if (flowElementsContainerEClass == null) {
			flowElementsContainerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(16);
		}
		return flowElementsContainerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElementsContainer_LaneSets() {
        return (EReference)getFlowElementsContainer().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFlowElementsContainer_FlowElements() {
        return (EReference)getFlowElementsContainer().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLaneSet() {
		if (laneSetEClass == null) {
			laneSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(17);
		}
		return laneSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaneSet_Base_ActivityPartition() {
        return (EReference)getLaneSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaneSet_Lanes() {
        return (EReference)getLaneSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaneSet_ParentLane() {
        return (EReference)getLaneSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLaneSet_FlowElementsContainer() {
        return (EReference)getLaneSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSet__LaneSetlanes__DiagnosticChain_Map() {
        return getLaneSet().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSet__LaneSetparentLane__DiagnosticChain_Map() {
        return getLaneSet().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSet__LaneSetflowElementsContainer__DiagnosticChain_Map() {
        return getLaneSet().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLaneSet__LaneSet__DiagnosticChain_Map() {
        return getLaneSet().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLane() {
		if (laneEClass == null) {
			laneEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(18);
		}
		return laneEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_Base_ActivityPartition() {
        return (EReference)getLane().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane__partitionElement() {
        return (EReference)getLane().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_FlowNodeRefs() {
        return (EReference)getLane().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_PartitionElementRef() {
        return (EReference)getLane().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_ChildLaneSet() {
        return (EReference)getLane().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLane_LaneSet() {
        return (EReference)getLane().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLane__LanelaneSet__DiagnosticChain_Map() {
        return getLane().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLane__LanechildLaneSet__DiagnosticChain_Map() {
        return getLane().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLane__LanepartitionElementRef__DiagnosticChain_Map() {
        return getLane().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getLane__LaneflowNodeRefs__DiagnosticChain_Map() {
        return getLane().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSequenceFlow() {
		if (sequenceFlowEClass == null) {
			sequenceFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(19);
		}
		return sequenceFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_Base_ControlFlow() {
        return (EReference)getSequenceFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSequenceFlow_IsImmediate() {
        return (EAttribute)getSequenceFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSequenceFlow_ConditionExpression() {
        return (EReference)getSequenceFlow().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlow__SequenceFlowconditionExpression__DiagnosticChain_Map() {
        return getSequenceFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlow__SequenceFlowsourceRef__DiagnosticChain_Map() {
        return getSequenceFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSequenceFlow__SequenceFlowtargetRef__DiagnosticChain_Map() {
        return getSequenceFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNExpression() {
		if (bpmnExpressionEClass == null) {
			bpmnExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(20);
		}
		return bpmnExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNExpression_Base_OpaqueExpression() {
        return (EReference)getBPMNExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventBasedGateway() {
		if (eventBasedGatewayEClass == null) {
			eventBasedGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(21);
		}
		return eventBasedGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBasedGateway_Instantiate() {
        return (EAttribute)getEventBasedGateway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEventBasedGateway_EventGatewayType() {
        return (EAttribute)getEventBasedGateway().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBasedGateway_Base_ForkNode() {
        return (EReference)getEventBasedGateway().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBasedGateway_Base_StructuredActivityNode() {
        return (EReference)getEventBasedGateway().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventBasedGateway_Base_InterruptibleActivityRegion() {
        return (EReference)getEventBasedGateway().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParallelGateway() {
		if (parallelGatewayEClass == null) {
			parallelGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(24);
		}
		return parallelGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexGateway() {
		if (complexGatewayEClass == null) {
			complexGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(25);
		}
		return complexGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexGateway_Default() {
        return (EReference)getComplexGateway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexGateway_ActivationCondition() {
        return (EReference)getComplexGateway().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexGateway__ComplexGatewaydefault__DiagnosticChain_Map() {
        return getComplexGateway().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexGateway__ComplexGatewayactivationCondition__DiagnosticChain_Map() {
        return getComplexGateway().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getComplexGateway__ComplexGatewayjoinSpec__DiagnosticChain_Map() {
        return getComplexGateway().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExclusiveGateway() {
		if (exclusiveGatewayEClass == null) {
			exclusiveGatewayEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(26);
		}
		return exclusiveGatewayEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveGateway_Base_DecisionNode() {
        return (EReference)getExclusiveGateway().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveGateway_Base_MergeNode() {
        return (EReference)getExclusiveGateway().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExclusiveGateway_Default() {
        return (EReference)getExclusiveGateway().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getExclusiveGateway__ExclusiveGatewaydefault__DiagnosticChain_Map() {
        return getExclusiveGateway().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRootElement() {
		if (rootElementEClass == null) {
			rootElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(27);
		}
		return rootElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElement_Base_PackageableElement() {
        return (EReference)getRootElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRootElement_Definition() {
        return (EReference)getRootElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDefinitions() {
		if (definitionsEClass == null) {
			definitionsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(28);
		}
		return definitionsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitions_Base_Package() {
        return (EReference)getDefinitions().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitions_TargetNamespace() {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitions_ExpressionLanguage() {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitions_TypeLanguage() {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitions_Exporter() {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDefinitions_ExporterVersion() {
        return (EAttribute)getDefinitions().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitions_Extensions() {
        return (EReference)getDefinitions().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitions_Imports() {
        return (EReference)getDefinitions().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitions_Relationships() {
        return (EReference)getDefinitions().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDefinitions_RootElements() {
        return (EReference)getDefinitions().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNExtension() {
		if (bpmnExtensionEClass == null) {
			bpmnExtensionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(29);
		}
		return bpmnExtensionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNExtension_Base_Stereotype() {
        return (EReference)getBPMNExtension().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNExtension_MustUnderstand() {
        return (EAttribute)getBPMNExtension().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNExtension_Definition() {
        return (EReference)getBPMNExtension().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImport() {
		if (importEClass == null) {
			importEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(30);
		}
		return importEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_Base_PackageImport() {
        return (EReference)getImport().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_ImportType() {
        return (EAttribute)getImport().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Location() {
        return (EAttribute)getImport().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImport_Namespace() {
        return (EAttribute)getImport().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImport_Definitions() {
        return (EReference)getImport().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNRelationship() {
		if (bpmnRelationshipEClass == null) {
			bpmnRelationshipEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(31);
		}
		return bpmnRelationshipEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNRelationship_Base_Constraint() {
        return (EReference)getBPMNRelationship().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNRelationship_Type() {
        return (EAttribute)getBPMNRelationship().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNRelationship_Direction() {
        return (EAttribute)getBPMNRelationship().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNRelationship_Targets() {
        return (EReference)getBPMNRelationship().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNRelationship_Sources() {
        return (EReference)getBPMNRelationship().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNRelationship_Definition() {
        return (EReference)getBPMNRelationship().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNProcess() {
		if (bpmnProcessEClass == null) {
			bpmnProcessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(33);
		}
		return bpmnProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNProcess_ProcessType() {
        return (EAttribute)getBPMNProcess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNProcess_IsClosed() {
        return (EAttribute)getBPMNProcess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_Auditing() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNProcess_IsExecutable() {
        return (EAttribute)getBPMNProcess().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_DefinitionalCollaborationRef() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_Base_Activity() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_CorrelationSubscriptions() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_Monitoring() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_Supports() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_Properties() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProcess_Resources() {
        return (EReference)getBPMNProcess().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNProcess__ProcesssupportedInterfaceRefs__DiagnosticChain_Map() {
        return getBPMNProcess().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNProcess__Processsupports__DiagnosticChain_Map() {
        return getBPMNProcess().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNProcess__Processproperties__DiagnosticChain_Map() {
        return getBPMNProcess().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNProcess__ProcesslaneSets__DiagnosticChain_Map() {
        return getBPMNProcess().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNProcess__ProcessflowElements__DiagnosticChain_Map() {
        return getBPMNProcess().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallableElement() {
		if (callableElementEClass == null) {
			callableElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(34);
		}
		return callableElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableElement_Base_Behavior() {
        return (EReference)getCallableElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableElement_IoSpecification() {
        return (EReference)getCallableElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableElement_SupportedInterfaceRefs() {
        return (EReference)getCallableElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallableElement_IoBinding() {
        return (EReference)getCallableElement().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallableElement__CallableEelementsupportedInterfaceRefs__DiagnosticChain_Map() {
        return getCallableElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallableElement__CallableElementresources__DiagnosticChain_Map() {
        return getCallableElement().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputOutputSpecification() {
		if (inputOutputSpecificationEClass == null) {
			inputOutputSpecificationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(35);
		}
		return inputOutputSpecificationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputSpecification_Base_Behavior() {
        return (EReference)getInputOutputSpecification().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputSpecification_Base_Action() {
        return (EReference)getInputOutputSpecification().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputSpecification_DataInputs() {
        return (EReference)getInputOutputSpecification().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputSpecification_DataOutputs() {
        return (EReference)getInputOutputSpecification().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputSpecification_InputSets() {
        return (EReference)getInputOutputSpecification().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputSpecification_OutputSets() {
        return (EReference)getInputOutputSpecification().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInput() {
		if (dataInputEClass == null) {
			dataInputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(36);
		}
		return dataInputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataInput_IsCollection() {
        return (EAttribute)getDataInput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInput_Base_InputPin() {
        return (EReference)getDataInput().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInput_Base_Parameter() {
        return (EReference)getDataInput().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInput_Base_ActivityParameterNode() {
        return (EReference)getDataInput().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInput_InputSetRefs() {
        return (EReference)getDataInput().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInput_InputSetWithOptional() {
        return (EReference)getDataInput().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataInput_InputSetWithWhileExecuting() {
        return (EReference)getDataInput().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataInput__DataInputAssociation__DiagnosticChain_Map() {
        return getDataInput().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataInput__DataInputnotation__DiagnosticChain_Map() {
        return getDataInput().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataInput__DataInputitemSubjectRef__DiagnosticChain_Map() {
        return getDataInput().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemAwareElement() {
		if (itemAwareElementEClass == null) {
			itemAwareElementEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(37);
		}
		return itemAwareElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemAwareElement_DataState() {
        return (EReference)getItemAwareElement().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemAwareElement_Base_TypedElement() {
        return (EReference)getItemAwareElement().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemAwareElement_ItemSubjectRef() {
        return (EReference)getItemAwareElement().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemAwareElement__ItemAwareElementdataState__DiagnosticChain_Map() {
        return getItemAwareElement().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataState() {
		if (dataStateEClass == null) {
			dataStateEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(38);
		}
		return dataStateEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataState_Base_State() {
        return (EReference)getDataState().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemDefinition() {
		if (itemDefinitionEClass == null) {
			itemDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(39);
		}
		return itemDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemDefinition_ItemKind() {
        return (EAttribute)getItemDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getItemDefinition_IsCollection() {
        return (EAttribute)getItemDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDefinition_Base_Class() {
        return (EReference)getItemDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDefinition_StructureRef() {
        return (EReference)getItemDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemDefinition_Import() {
        return (EReference)getItemDefinition().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getItemDefinition__ItemDefinitionstructureRef__DiagnosticChain_Map() {
        return getItemDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputSet() {
		if (inputSetEClass == null) {
			inputSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(41);
		}
		return inputSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSet_Base_ParameterSet() {
        return (EReference)getInputSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSet_OptionalInputRefs() {
        return (EReference)getInputSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSet_WhileExecutingInputRefs() {
        return (EReference)getInputSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputSet_DataInputRefs() {
        return (EReference)getInputSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputSet__InputSetdataInputRefs__DiagnosticChain_Map() {
        return getInputSet().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputSet__InputSetoptionalInputRefs__DiagnosticChain_Map() {
        return getInputSet().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getInputSet__InputSetwhileExecutingInputRefs__DiagnosticChain_Map() {
        return getInputSet().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOutput() {
		if (dataOutputEClass == null) {
			dataOutputEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(42);
		}
		return dataOutputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOutput_Base_OutputPin() {
        return (EReference)getDataOutput().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataOutput_IsCollection() {
        return (EAttribute)getDataOutput().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOutput_Base_Parameter() {
        return (EReference)getDataOutput().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOutput_Base_ActivityParameterNode() {
        return (EReference)getDataOutput().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOutput_OutputSetRefs() {
        return (EReference)getDataOutput().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOutput_OutputSetWithOptional() {
        return (EReference)getDataOutput().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataOutput_OutputSetWithWhileExecuting() {
        return (EReference)getDataOutput().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataOutput__DataOutputnotation__DiagnosticChain_Map() {
        return getDataOutput().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataOutput__DataOutputitemSubjectRef__DiagnosticChain_Map() {
        return getDataOutput().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOutputSet() {
		if (outputSetEClass == null) {
			outputSetEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(43);
		}
		return outputSetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSet_Base_ParameterSet() {
        return (EReference)getOutputSet().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSet_OptionalOutputRefs() {
        return (EReference)getOutputSet().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSet_WhileExecutingOutputRefs() {
        return (EReference)getOutputSet().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOutputSet_DataOutputRefs() {
        return (EReference)getOutputSet().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputSet__OutputSetdataOutputRefs__DiagnosticChain_Map() {
        return getOutputSet().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputSet__OutputSetoptionalOutputRefs__DiagnosticChain_Map() {
        return getOutputSet().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getOutputSet__OutputSetwhileExecutingOutputRefs__DiagnosticChain_Map() {
        return getOutputSet().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNInterface() {
		if (bpmnInterfaceEClass == null) {
			bpmnInterfaceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(44);
		}
		return bpmnInterfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNInterface_Base_Interface() {
        return (EReference)getBPMNInterface().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNInterface_ImplementationRef() {
        return (EReference)getBPMNInterface().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNInterface_Operations() {
        return (EReference)getBPMNInterface().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNInterface_CallableElements() {
        return (EReference)getBPMNInterface().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNInterface__Interfaceoperationmultiplicity__DiagnosticChain_Map() {
        return getBPMNInterface().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNInterface__InterfaceownedOperation__DiagnosticChain_Map() {
        return getBPMNInterface().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNInterface__BPMNInterfacecallableElements__DiagnosticChain_Map() {
        return getBPMNInterface().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNInterface__BPMNInterfaceoperations__DiagnosticChain_Map() {
        return getBPMNInterface().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNOperation() {
		if (bpmnOperationEClass == null) {
			bpmnOperationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(45);
		}
		return bpmnOperationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNOperation_Base_Operation() {
        return (EReference)getBPMNOperation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNOperation_ImplementationRef() {
        return (EReference)getBPMNOperation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNOperation_InMessageRef() {
        return (EReference)getBPMNOperation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNOperation_OutMessageRef() {
        return (EReference)getBPMNOperation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNOperation_ErrorRef() {
        return (EReference)getBPMNOperation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNOperation__BPMNOperationowner__DiagnosticChain_Map() {
        return getBPMNOperation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNOperation__BPMNOperationinMessageRef__DiagnosticChain_Map() {
        return getBPMNOperation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNOperation__BPMNOperationoutMessageRef__DiagnosticChain_Map() {
        return getBPMNOperation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNOperation__BPMNOperationerrorRefs__DiagnosticChain_Map() {
        return getBPMNOperation().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNMessage() {
		if (bpmnMessageEClass == null) {
			bpmnMessageEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(46);
		}
		return bpmnMessageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNMessage_ItemRef() {
        return (EReference)getBPMNMessage().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNMessage__MessageitemRef__DiagnosticChain_Map() {
        return getBPMNMessage().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getError() {
		if (errorEClass == null) {
			errorEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(47);
		}
		return errorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getError_ErrorCode() {
        return (EAttribute)getError().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInputOutputBinding() {
		if (inputOutputBindingEClass == null) {
			inputOutputBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(48);
		}
		return inputOutputBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputBinding_InputDataRef() {
        return (EReference)getInputOutputBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputBinding_OutputDataRef() {
        return (EReference)getInputOutputBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputBinding_OperationRef() {
        return (EReference)getInputOutputBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInputOutputBinding_Base_Dependency() {
        return (EReference)getInputOutputBinding().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNCollaboration() {
		if (bpmnCollaborationEClass == null) {
			bpmnCollaborationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(50);
		}
		return bpmnCollaborationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNCollaboration_IsClosed() {
        return (EAttribute)getBPMNCollaboration().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_ParticipantAssociations() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_ConversationLinks() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_MessageFlowAssociations() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_MessageFlows() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_Base_Collaboration() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_Conversations() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_CorrelationKeys() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNCollaboration_Participants() {
        return (EReference)getBPMNCollaboration().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNCollaboration__Collaborationparticipants__DiagnosticChain_Map() {
        return getBPMNCollaboration().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantAssociation() {
		if (participantAssociationEClass == null) {
			participantAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(51);
		}
		return participantAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantAssociation_Base_Dependency() {
        return (EReference)getParticipantAssociation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantAssociation_InnerParticipantRef() {
        return (EReference)getParticipantAssociation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantAssociation_OuterParticipantRef() {
        return (EReference)getParticipantAssociation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipantAssociation__ParticipantAssociationinnerParticipantRef__DiagnosticChain_Map() {
        return getParticipantAssociation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipantAssociation__ParticipantAssociationouterParticipantRef__DiagnosticChain_Map() {
        return getParticipantAssociation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipant() {
		if (participantEClass == null) {
			participantEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(52);
		}
		return participantEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_Base_Property() {
        return (EReference)getParticipant().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_ProcessRef() {
        return (EReference)getParticipant().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_ParticipantMultiplicity() {
        return (EReference)getParticipant().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_PartnerEntityRef() {
        return (EReference)getParticipant().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_PartnerRoleRef() {
        return (EReference)getParticipant().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipant_InterfaceRefs() {
        return (EReference)getParticipant().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__Participantownership__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__Participanttype__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__ParticipantmultiplicityMinimum__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__Participantrealizationsupplier__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__ParticipantprocessRef__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__ParticipantmultiplicityMaximum__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__ParticipantpartnerEntityRef__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__ParticipantpartnerRoleRef__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getParticipant__ParticipantinterfaceRefs__DiagnosticChain_Map() {
        return getParticipant().getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInteractionNode() {
		if (interactionNodeEClass == null) {
			interactionNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(53);
		}
		return interactionNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionNode_Base_Element() {
        return (EReference)getInteractionNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionNode_OutgoingConversationLinks() {
        return (EReference)getInteractionNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInteractionNode_IncomingConversationLinks() {
        return (EReference)getInteractionNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversationLink() {
		if (conversationLinkEClass == null) {
			conversationLinkEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(54);
		}
		return conversationLinkEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationLink_Collaboration() {
        return (EReference)getConversationLink().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationLink_Base_Dependency() {
        return (EReference)getConversationLink().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationLink_TargetRef() {
        return (EReference)getConversationLink().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationLink_SourceRef() {
        return (EReference)getConversationLink().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParticipantMultiplicity() {
		if (participantMultiplicityEClass == null) {
			participantMultiplicityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(55);
		}
		return participantMultiplicityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParticipantMultiplicity_Base_MultiplicityElement() {
        return (EReference)getParticipantMultiplicity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantMultiplicity_Minimum() {
        return (EAttribute)getParticipantMultiplicity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParticipantMultiplicity_Maximum() {
        return (EAttribute)getParticipantMultiplicity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartnerEntity() {
		if (partnerEntityEClass == null) {
			partnerEntityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(56);
		}
		return partnerEntityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartnerEntity_Base_InstanceSpecification() {
        return (EReference)getPartnerEntity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartnerEntity_ParticipantRef() {
        return (EReference)getPartnerEntity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPartnerEntity__PartnerEntityparticipantRef__DiagnosticChain_Map() {
        return getPartnerEntity().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPartnerRole() {
		if (partnerRoleEClass == null) {
			partnerRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(57);
		}
		return partnerRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartnerRole_Base_Class() {
        return (EReference)getPartnerRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPartnerRole_ParticipantRef() {
        return (EReference)getPartnerRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPartnerRole__PartnerRoleparticipantRef__DiagnosticChain_Map() {
        return getPartnerRole().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageFlowAssociation() {
		if (messageFlowAssociationEClass == null) {
			messageFlowAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(58);
		}
		return messageFlowAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlowAssociation_Base_Dependency() {
        return (EReference)getMessageFlowAssociation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlowAssociation_InnerMessageFlowRef() {
        return (EReference)getMessageFlowAssociation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlowAssociation_OuterMessageFlowRef() {
        return (EReference)getMessageFlowAssociation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageFlowAssociation__MessageFlowAssociationinnerMessageFlowRef__DiagnosticChain_Map() {
        return getMessageFlowAssociation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageFlowAssociation__MessageFlowAssociationouterMessageFlowRef__DiagnosticChain_Map() {
        return getMessageFlowAssociation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageFlow() {
		if (messageFlowEClass == null) {
			messageFlowEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(59);
		}
		return messageFlowEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlow_Base_InformationFlow() {
        return (EReference)getMessageFlow().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlow_SourceRef() {
        return (EReference)getMessageFlow().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlow_TargetRef() {
        return (EReference)getMessageFlow().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageFlow_MessageRef() {
        return (EReference)getMessageFlow().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageFlow__MessageFlowsourceRef__DiagnosticChain_Map() {
        return getMessageFlow().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageFlow__MessageFlowtargetRef__DiagnosticChain_Map() {
        return getMessageFlow().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessageFlow__MessageFlowmessageRef__DiagnosticChain_Map() {
        return getMessageFlow().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversationNode() {
		if (conversationNodeEClass == null) {
			conversationNodeEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(60);
		}
		return conversationNodeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationNode_Base_InformationFlow() {
        return (EReference)getConversationNode().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationNode_MessageFlowRefs() {
        return (EReference)getConversationNode().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationNode_CorrelationKeys() {
        return (EReference)getConversationNode().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConversationNode_ParticipantRefs() {
        return (EReference)getConversationNode().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConversationNode__ConversationNodeparticipantRefs__DiagnosticChain_Map() {
        return getConversationNode().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationKey() {
		if (correlationKeyEClass == null) {
			correlationKeyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(61);
		}
		return correlationKeyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationKey_Base_Class() {
        return (EReference)getCorrelationKey().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationKey_CorrelationPropertyRef() {
        return (EReference)getCorrelationKey().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationProperty() {
		if (correlationPropertyEClass == null) {
			correlationPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(62);
		}
		return correlationPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationProperty_Base_Property() {
        return (EReference)getCorrelationProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationProperty_Type() {
        return (EReference)getCorrelationProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationProperty_CorrelationPropertyRetrievalExpression() {
        return (EReference)getCorrelationProperty().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationPropertyRetrievalExpression() {
		if (correlationPropertyRetrievalExpressionEClass == null) {
			correlationPropertyRetrievalExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(63);
		}
		return correlationPropertyRetrievalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationPropertyRetrievalExpression_Base_Dependency() {
        return (EReference)getCorrelationPropertyRetrievalExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationPropertyRetrievalExpression_MessageRef() {
        return (EReference)getCorrelationPropertyRetrievalExpression().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationPropertyRetrievalExpression_MessagePath() {
        return (EReference)getCorrelationPropertyRetrievalExpression().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFormalExpression() {
		if (formalExpressionEClass == null) {
			formalExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(64);
		}
		return formalExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFormalExpression_EvaluatesToTypeRef() {
        return (EReference)getFormalExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFormalExpression__FormalExpressionevaluatesToTypeRef__DiagnosticChain_Map() {
        return getFormalExpression().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationSubscription() {
		if (correlationSubscriptionEClass == null) {
			correlationSubscriptionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(65);
		}
		return correlationSubscriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationSubscription_Base_Class() {
        return (EReference)getCorrelationSubscription().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationSubscription_CorrelationKeyRef() {
        return (EReference)getCorrelationSubscription().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationSubscription_CorrelationPropertyBinding() {
        return (EReference)getCorrelationSubscription().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCorrelationPropertyBinding() {
		if (correlationPropertyBindingEClass == null) {
			correlationPropertyBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(66);
		}
		return correlationPropertyBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationPropertyBinding_Base_Property() {
        return (EReference)getCorrelationPropertyBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationPropertyBinding_DataPath() {
        return (EReference)getCorrelationPropertyBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCorrelationPropertyBinding_CorrelationPropertyRef() {
        return (EReference)getCorrelationPropertyBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNProperty() {
		if (bpmnPropertyEClass == null) {
			bpmnPropertyEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(67);
		}
		return bpmnPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProperty_Base_DataStoreNode() {
        return (EReference)getBPMNProperty().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNProperty_UmlProperty() {
        return (EReference)getBPMNProperty().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNProperty__Propertynotation__DiagnosticChain_Map() {
        return getBPMNProperty().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNProperty__BPMNPropertyapply__DiagnosticChain_Map() {
        return getBPMNProperty().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceRole() {
		if (resourceRoleEClass == null) {
			resourceRoleEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(68);
		}
		return resourceRoleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRole_Base_Property() {
        return (EReference)getResourceRole().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRole_ResourceAssignmentExpression() {
        return (EReference)getResourceRole().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRole_ResourceRef() {
        return (EReference)getResourceRole().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRole_ResourceParameterBindings() {
        return (EReference)getResourceRole().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceRole_Process() {
        return (EReference)getResourceRole().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceRole__ResourceRoleowner__DiagnosticChain_Map() {
        return getResourceRole().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceRole__ResourceRoleresourceRef__DiagnosticChain_Map() {
        return getResourceRole().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceRole__ResourceRoleisRequired__DiagnosticChain_Map() {
        return getResourceRole().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceRole__ResourceRoleprocess__DiagnosticChain_Map() {
        return getResourceRole().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceRole__ResourceRoleresourceParameterBindings__DiagnosticChain_Map() {
        return getResourceRole().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceAssignmentExpression() {
		if (resourceAssignmentExpressionEClass == null) {
			resourceAssignmentExpressionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(69);
		}
		return resourceAssignmentExpressionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceAssignmentExpression_Expression() {
        return (EReference)getResourceAssignmentExpression().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceAssignmentExpression__ResourceAssignmentExpressionexpression__DiagnosticChain_Map() {
        return getResourceAssignmentExpression().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResource() {
		if (resourceEClass == null) {
			resourceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(70);
		}
		return resourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResource_ResourceParameters() {
        return (EReference)getResource().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResource__ResourceresourceParameters__DiagnosticChain_Map() {
        return getResource().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceParameter() {
		if (resourceParameterEClass == null) {
			resourceParameterEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(71);
		}
		return resourceParameterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceParameter_Base_Property() {
        return (EReference)getResourceParameter().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceParameter_Type() {
        return (EReference)getResourceParameter().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResourceParameter_IsRequired() {
        return (EAttribute)getResourceParameter().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceParameter__ResourceParameterowner__DiagnosticChain_Map() {
        return getResourceParameter().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceParameter__ResourceParametertype__DiagnosticChain_Map() {
        return getResourceParameter().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceParameter__ResourceParameterisRequired__DiagnosticChain_Map() {
        return getResourceParameter().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResourceParameterBinding() {
		if (resourceParameterBindingEClass == null) {
			resourceParameterBindingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(72);
		}
		return resourceParameterBindingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceParameterBinding_Base_Slot() {
        return (EReference)getResourceParameterBinding().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceParameterBinding_ParameterRef() {
        return (EReference)getResourceParameterBinding().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResourceParameterBinding_Expression() {
        return (EReference)getResourceParameterBinding().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceParameterBinding__ResourceParameterBindingexpression__DiagnosticChain_Map() {
        return getResourceParameterBinding().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getResourceParameterBinding__ResourceParameterBindingparameterRef__DiagnosticChain_Map() {
        return getResourceParameterBinding().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalScriptTask() {
		if (globalScriptTaskEClass == null) {
			globalScriptTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(73);
		}
		return globalScriptTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalScriptTask_Script() {
        return (EAttribute)getGlobalScriptTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalScriptTask_ScriptFormat() {
        return (EAttribute)getGlobalScriptTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlobalScriptTask__GlobalScriptTaskscriptFormat__DiagnosticChain_Map() {
        return getGlobalScriptTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlobalScriptTask__GlobalScriptTaskscript__DiagnosticChain_Map() {
        return getGlobalScriptTask().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalTask() {
		if (globalTaskEClass == null) {
			globalTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(74);
		}
		return globalTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalTask_Base_OpaqueBehavior() {
        return (EReference)getGlobalTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalTask_Resources() {
        return (EReference)getGlobalTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlobalTask__GlobalTasksupportedInterfaceRefs__DiagnosticChain_Map() {
        return getGlobalTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalBusinessRuleTask() {
		if (globalBusinessRuleTaskEClass == null) {
			globalBusinessRuleTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(75);
		}
		return globalBusinessRuleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalBusinessRuleTask_Implementation() {
        return (EAttribute)getGlobalBusinessRuleTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlobalBusinessRuleTask__GlobalBusinessRuleTaskimplementation__DiagnosticChain_Map() {
        return getGlobalBusinessRuleTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompensateEventDefinition() {
		if (compensateEventDefinitionEClass == null) {
			compensateEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(76);
		}
		return compensateEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompensateEventDefinition_WaitForCompletion() {
        return (EAttribute)getCompensateEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompensateEventDefinition_ActivityRef() {
        return (EReference)getCompensateEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompensateEventDefinition_Base_CallEvent() {
        return (EReference)getCompensateEventDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEventDefinition() {
		if (eventDefinitionEClass == null) {
			eventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(77);
		}
		return eventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEventDefinition_Base_Event() {
        return (EReference)getEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNActivity() {
		if (bpmnActivityEClass == null) {
			bpmnActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(78);
		}
		return bpmnActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNActivity_IsForCompensation() {
        return (EAttribute)getBPMNActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNActivity_StartQuantity() {
        return (EAttribute)getBPMNActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBPMNActivity_CompletionQuantity() {
        return (EAttribute)getBPMNActivity().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_Base_Action() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_ActivityClass() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_Properties() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_Default() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_BoundaryEventRefs() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_DataInputAssociations() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_DataOutputAssociations() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_LoopCharacteristics() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNActivity_Resources() {
        return (EReference)getBPMNActivity().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNActivity__BPMNActivityresources__DiagnosticChain_Map() {
        return getBPMNActivity().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNActivity__BPMNActivitycontainer__DiagnosticChain_Map() {
        return getBPMNActivity().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNActivity__BPMNActivityproperties__DiagnosticChain_Map() {
        return getBPMNActivity().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNActivity__BPMNActivitydefault__DiagnosticChain_Map() {
        return getBPMNActivity().getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNActivity__BPMNActivityboundaryEventsRefs__DiagnosticChain_Map() {
        return getBPMNActivity().getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNActivity__BPMNActivityloopCharacteristics__DiagnosticChain_Map() {
        return getBPMNActivity().getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBoundaryEvent() {
		if (boundaryEventEClass == null) {
			boundaryEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(79);
		}
		return boundaryEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBoundaryEvent_CancelActivity() {
        return (EAttribute)getBoundaryEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBoundaryEvent_AttachedToRef() {
        return (EReference)getBoundaryEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBoundaryEvent__BoundaryEventattachedToRef__DiagnosticChain_Map() {
        return getBoundaryEvent().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCatchEvent() {
		if (catchEventEClass == null) {
			catchEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(80);
		}
		return catchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCatchEvent_ParallelMultiple() {
        return (EAttribute)getCatchEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchEvent_Base_AcceptEventAction() {
        return (EReference)getCatchEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchEvent_Base_InitialNode() {
        return (EReference)getCatchEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCatchEvent_DataOutputAssociation() {
        return (EReference)getCatchEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCatchEvent__CatchEventeventDefinitionsRefs__DiagnosticChain_Map() {
        return getCatchEvent().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNEvent() {
		if (bpmnEventEClass == null) {
			bpmnEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(81);
		}
		return bpmnEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEvent_EventClass() {
        return (EReference)getBPMNEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEvent__eventDefinitions() {
        return (EReference)getBPMNEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEvent_Properties() {
        return (EReference)getBPMNEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBPMNEvent_EventDefinitionRefs() {
        return (EReference)getBPMNEvent().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataOutputAssociation() {
		if (dataOutputAssociationEClass == null) {
			dataOutputAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(82);
		}
		return dataOutputAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataOutputAssociation__DataOutputAssociationsource__DiagnosticChain_Map() {
        return getDataOutputAssociation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataOutputAssociation__DataOutputAssociationtarget__DiagnosticChain_Map() {
        return getDataOutputAssociation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataAssociation() {
		if (dataAssociationEClass == null) {
			dataAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(83);
		}
		return dataAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAssociation_Base_ObjectFlow() {
        return (EReference)getDataAssociation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAssociation_SourceRef() {
        return (EReference)getDataAssociation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAssociation_TargetRef() {
        return (EReference)getDataAssociation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAssociation_Transformation() {
        return (EReference)getDataAssociation().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataAssociation_Assignment() {
        return (EReference)getDataAssociation().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataAssociation__DataAssociationsource__DiagnosticChain_Map() {
        return getDataAssociation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataAssociation__DataAssociationtransformation__DiagnosticChain_Map() {
        return getDataAssociation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataAssociation__DataAssociationtarget__DiagnosticChain_Map() {
        return getDataAssociation().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAssignment() {
		if (assignmentEClass == null) {
			assignmentEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(84);
		}
		return assignmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_Base_Dependency() {
        return (EReference)getAssignment().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_From() {
        return (EReference)getAssignment().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAssignment_To() {
        return (EReference)getAssignment().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataInputAssociation() {
		if (dataInputAssociationEClass == null) {
			dataInputAssociationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(85);
		}
		return dataInputAssociationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataInputAssociation__DataInputAssociationsource__DiagnosticChain_Map() {
        return getDataInputAssociation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataInputAssociation__DataInputAssociationtarget__DiagnosticChain_Map() {
        return getDataInputAssociation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLoopCharacteristics() {
		if (loopCharacteristicsEClass == null) {
			loopCharacteristicsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(86);
		}
		return loopCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLoopCharacteristics_Base_StructuredActivityNode() {
        return (EReference)getLoopCharacteristics().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscalationEventDefinition() {
		if (escalationEventDefinitionEClass == null) {
			escalationEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(87);
		}
		return escalationEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEscalationEventDefinition_EscalationRef() {
        return (EReference)getEscalationEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEscalationEventDefinition_Base_CallEvent() {
        return (EReference)getEscalationEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEscalation() {
		if (escalationEClass == null) {
			escalationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(88);
		}
		return escalationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEscalation_EscalationCode() {
        return (EAttribute)getEscalation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEscalation__EscalationstructureRef__DiagnosticChain_Map() {
        return getEscalation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTimerEventDefinition() {
		if (timerEventDefinitionEClass == null) {
			timerEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(89);
		}
		return timerEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerEventDefinition_TimeCycle() {
        return (EReference)getTimerEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerEventDefinition_TimeDate() {
        return (EReference)getTimerEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerEventDefinition_TimeDuration() {
        return (EReference)getTimerEventDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTimerEventDefinition_Base_ChangeEvent() {
        return (EReference)getTimerEventDefinition().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSignalEventDefinition() {
		if (signalEventDefinitionEClass == null) {
			signalEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(90);
		}
		return signalEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalEventDefinition_SignalRef() {
        return (EReference)getSignalEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSignalEventDefinition_Base_CallEvent() {
        return (EReference)getSignalEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBPMNSignal() {
		if (bpmnSignalEClass == null) {
			bpmnSignalEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(91);
		}
		return bpmnSignalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBPMNSignal__BPMNSignalstructureRef__DiagnosticChain_Map() {
        return getBPMNSignal().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEndEvent() {
		if (endEventEClass == null) {
			endEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(92);
		}
		return endEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEndEvent_Base_FinalNode() {
        return (EReference)getEndEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getThrowEvent() {
		if (throwEventEClass == null) {
			throwEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(93);
		}
		return throwEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowEvent_Base_CallOperationAction() {
        return (EReference)getThrowEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowEvent_Base_FlowFinalNode() {
        return (EReference)getThrowEvent().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getThrowEvent_DataInputAssociation() {
        return (EReference)getThrowEvent().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getThrowEvent__ThrowEventeventDefinitionRefs__DiagnosticChain_Map() {
        return getThrowEvent().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessageEventDefinition() {
		if (messageEventDefinitionEClass == null) {
			messageEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(94);
		}
		return messageEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEventDefinition_MessageRef() {
        return (EReference)getMessageEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEventDefinition_OperationRef() {
        return (EReference)getMessageEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessageEventDefinition_Base_CallEvent() {
        return (EReference)getMessageEventDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStartEvent() {
		if (startEventEClass == null) {
			startEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(95);
		}
		return startEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStartEvent_IsInterrupting() {
        return (EAttribute)getStartEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConditionalEventDefinition() {
		if (conditionalEventDefinitionEClass == null) {
			conditionalEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(96);
		}
		return conditionalEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalEventDefinition_Base_ChangeEvent() {
        return (EReference)getConditionalEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getConditionalEventDefinition_Condition() {
        return (EReference)getConditionalEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getConditionalEventDefinition__ConditionalEventDefinitioncondition__DiagnosticChain_Map() {
        return getConditionalEventDefinition().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkEventDefinition() {
		if (linkEventDefinitionEClass == null) {
			linkEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(97);
		}
		return linkEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEventDefinition__target() {
        return (EReference)getLinkEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEventDefinition_Source() {
        return (EReference)getLinkEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLinkEventDefinition_Base_CallEvent() {
        return (EReference)getLinkEventDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getErrorEventDefinition() {
		if (errorEventDefinitionEClass == null) {
			errorEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(98);
		}
		return errorEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorEventDefinition_ErrorRef() {
        return (EReference)getErrorEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getErrorEventDefinition_Base_CallEvent() {
        return (EReference)getErrorEventDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateCatchEvent() {
		if (intermediateCatchEventEClass == null) {
			intermediateCatchEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(99);
		}
		return intermediateCatchEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIntermediateThrowEvent() {
		if (intermediateThrowEventEClass == null) {
			intermediateThrowEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(100);
		}
		return intermediateThrowEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getIntermediateThrowEvent_Base_SendObjectAction() {
        return (EReference)getIntermediateThrowEvent().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTerminateEventDefinition() {
		if (terminateEventDefinitionEClass == null) {
			terminateEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(101);
		}
		return terminateEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTerminateEventDefinition_Base_CallEvent() {
        return (EReference)getTerminateEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImplicitThrowEvent() {
		if (implicitThrowEventEClass == null) {
			implicitThrowEventEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(102);
		}
		return implicitThrowEventEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCancelEventDefinition() {
		if (cancelEventDefinitionEClass == null) {
			cancelEventDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(103);
		}
		return cancelEventDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCancelEventDefinition_Base_CallEvent() {
        return (EReference)getCancelEventDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTextAnnotation() {
		if (textAnnotationEClass == null) {
			textAnnotationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(104);
		}
		return textAnnotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTextAnnotation_Base_Comment() {
        return (EReference)getTextAnnotation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextAnnotation_TextFormat() {
        return (EAttribute)getTextAnnotation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTextAnnotation_Text() {
        return (EAttribute)getTextAnnotation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCategory() {
		if (categoryEClass == null) {
			categoryEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(105);
		}
		return categoryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_Base_Enumeration() {
        return (EReference)getCategory().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCategory_CategoryValue() {
        return (EReference)getCategory().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGroup() {
		if (groupEClass == null) {
			groupEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(106);
		}
		return groupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup_Base_ActivityPartition() {
        return (EReference)getGroup().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGroup__categoryValueRef() {
        return (EReference)getGroup().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObjectReference() {
		if (dataObjectReferenceEClass == null) {
			dataObjectReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(107);
		}
		return dataObjectReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObjectReference_DataObjectRef() {
        return (EReference)getDataObjectReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObjectReference_Base_DataStoreNode() {
        return (EReference)getDataObjectReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataObjectReference__DataObjectRefsourcetarget__DiagnosticChain_Map() {
        return getDataObjectReference().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataObjectReference__DataObjectRefdataState__DiagnosticChain_Map() {
        return getDataObjectReference().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataObject() {
		if (dataObjectEClass == null) {
			dataObjectEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(108);
		}
		return dataObjectEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataObject_IsCollection() {
        return (EAttribute)getDataObject().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataObject_Base_DataStoreNode() {
        return (EReference)getDataObject().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDataObject__DataObjectdataState__DiagnosticChain_Map() {
        return getDataObject().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStore() {
		if (dataStoreEClass == null) {
			dataStoreEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(109);
		}
		return dataStoreEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStore_Capacity() {
        return (EAttribute)getDataStore().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDataStore_IsUnlimited() {
        return (EAttribute)getDataStore().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStore_Base_Class() {
        return (EReference)getDataStore().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStore_ItemSubjectRef() {
        return (EReference)getDataStore().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDataStoreReference() {
		if (dataStoreReferenceEClass == null) {
			dataStoreReferenceEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(110);
		}
		return dataStoreReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStoreReference__dataStore() {
        return (EReference)getDataStoreReference().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDataStoreReference_Base_DataStoreNode() {
        return (EReference)getDataStoreReference().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTask() {
		if (userTaskEClass == null) {
			userTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(111);
		}
		return userTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Base_OpaqueAction() {
        return (EReference)getUserTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUserTask_Implementation() {
        return (EAttribute)getUserTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUserTask_Renderings() {
        return (EReference)getUserTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTask__UserTaskimplementation__DiagnosticChain_Map() {
        return getUserTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUserTask__UserTaskrenderings__DiagnosticChain_Map() {
        return getUserTask().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTask() {
		if (taskEClass == null) {
			taskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(112);
		}
		return taskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTask_IoSpecification() {
        return (EReference)getTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRendering() {
		if (renderingEClass == null) {
			renderingEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(113);
		}
		return renderingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRendering_Base_Image() {
        return (EReference)getRendering().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHumanPerformer() {
		if (humanPerformerEClass == null) {
			humanPerformerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(114);
		}
		return humanPerformerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPerformer() {
		if (performerEClass == null) {
			performerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(115);
		}
		return performerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalUserTask() {
		if (globalUserTaskEClass == null) {
			globalUserTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(116);
		}
		return globalUserTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getGlobalUserTask_Implementation() {
        return (EAttribute)getGlobalUserTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getGlobalUserTask_Renderings() {
        return (EReference)getGlobalUserTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlobalUserTask__GlobalUserTaskrenderings__DiagnosticChain_Map() {
        return getGlobalUserTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlobalUserTask__GlobalUserTaskimplementation__DiagnosticChain_Map() {
        return getGlobalUserTask().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalManualTask() {
		if (globalManualTaskEClass == null) {
			globalManualTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(117);
		}
		return globalManualTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getManualTask() {
		if (manualTaskEClass == null) {
			manualTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(118);
		}
		return manualTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getManualTask_Base_OpaqueAction() {
        return (EReference)getManualTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPotentialOwner() {
		if (potentialOwnerEClass == null) {
			potentialOwnerEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(119);
		}
		return potentialOwnerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubConversation() {
		if (subConversationEClass == null) {
			subConversationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(120);
		}
		return subConversationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubConversation_ConversationNodes() {
        return (EReference)getSubConversation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubConversation__SubConversationconnectedelements__DiagnosticChain_Map() {
        return getSubConversation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getGlobalConversation() {
		if (globalConversationEClass == null) {
			globalConversationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(121);
		}
		return globalConversationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getGlobalConversation__GlobalConversationcontainedelements__DiagnosticChain_Map() {
        return getGlobalConversation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallConversation() {
		if (callConversationEClass == null) {
			callConversationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(122);
		}
		return callConversationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallConversation__collaborationUse() {
        return (EReference)getCallConversation().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallConversation_CalledCollaborationRef() {
        return (EReference)getCallConversation().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallConversation_ParticipantAssociations() {
        return (EReference)getCallConversation().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallConversation__CallConversationcalledCollaborationRef__DiagnosticChain_Map() {
        return getCallConversation().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallConversation__CallConversationparticipantAssociations__DiagnosticChain_Map() {
        return getCallConversation().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConversation() {
		if (conversationEClass == null) {
			conversationEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(123);
		}
		return conversationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubProcess() {
		if (subProcessEClass == null) {
			subProcessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(124);
		}
		return subProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubProcess_TriggeredByEvent() {
        return (EAttribute)getSubProcess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubProcess_Base_StructuredActivityNode() {
        return (EReference)getSubProcess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubProcess_HasLaneSets() {
        return (EReference)getSubProcess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubProcess__SubProcesstriggeredByEvent__DiagnosticChain_Map() {
        return getSubProcess().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallActivity() {
		if (callActivityEClass == null) {
			callActivityEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(125);
		}
		return callActivityEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActivity_Base_CallBehaviorAction() {
        return (EReference)getCallActivity().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallActivity_CalledElementRef() {
        return (EReference)getCallActivity().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCallActivity__CallActivitycalledElementRefvalues__DiagnosticChain_Map() {
        return getCallActivity().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBusinessRuleTask() {
		if (businessRuleTaskEClass == null) {
			businessRuleTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(126);
		}
		return businessRuleTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBusinessRuleTask_Base_OpaqueAction() {
        return (EReference)getBusinessRuleTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBusinessRuleTask_Implementation() {
        return (EAttribute)getBusinessRuleTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getBusinessRuleTask__BusinessRuleTaskimplementation__DiagnosticChain_Map() {
        return getBusinessRuleTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getComplexBehaviorDefinition() {
		if (complexBehaviorDefinitionEClass == null) {
			complexBehaviorDefinitionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(128);
		}
		return complexBehaviorDefinitionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexBehaviorDefinition_Condition() {
        return (EReference)getComplexBehaviorDefinition().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexBehaviorDefinition_Event() {
        return (EReference)getComplexBehaviorDefinition().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getComplexBehaviorDefinition_Base_ControlFlow() {
        return (EReference)getComplexBehaviorDefinition().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdHocSubProcess() {
		if (adHocSubProcessEClass == null) {
			adHocSubProcessEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(129);
		}
		return adHocSubProcessEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdHocSubProcess_CompletionCondition() {
        return (EReference)getAdHocSubProcess().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdHocSubProcess_Ordering() {
        return (EAttribute)getAdHocSubProcess().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdHocSubProcess_CancelRemainingInstances() {
        return (EAttribute)getAdHocSubProcess().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAdHocSubProcess__AdHocSubProcesscancelRemainingInstances__DiagnosticChain_Map() {
        return getAdHocSubProcess().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getScriptTask() {
		if (scriptTaskEClass == null) {
			scriptTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(130);
		}
		return scriptTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getScriptTask_Base_OpaqueAction() {
        return (EReference)getScriptTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptTask_ScriptFormat() {
        return (EAttribute)getScriptTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getScriptTask_Script() {
        return (EAttribute)getScriptTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScriptTask__ScriptTaskscriptFormat__DiagnosticChain_Map() {
        return getScriptTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getScriptTask__ScriptTaskscript__DiagnosticChain_Map() {
        return getScriptTask().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSendTask() {
		if (sendTaskEClass == null) {
			sendTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(131);
		}
		return sendTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendTask_MessageRef() {
        return (EReference)getSendTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendTask_Base_CallOperationAction() {
        return (EReference)getSendTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSendTask_Implementation() {
        return (EAttribute)getSendTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSendTask_OperationRef() {
        return (EReference)getSendTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSendTask__SendTaskoperationRef__DiagnosticChain_Map() {
        return getSendTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransaction() {
		if (transactionEClass == null) {
			transactionEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(132);
		}
		return transactionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTransaction_Method() {
        return (EAttribute)getTransaction().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getStandardLoopCharacteristics() {
		if (standardLoopCharacteristicsEClass == null) {
			standardLoopCharacteristicsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(133);
		}
		return standardLoopCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardLoopCharacteristics_LoopMaximum() {
        return (EAttribute)getStandardLoopCharacteristics().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardLoopCharacteristics_Base_LoopNode() {
        return (EReference)getStandardLoopCharacteristics().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getStandardLoopCharacteristics_TestBefore() {
        return (EAttribute)getStandardLoopCharacteristics().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getStandardLoopCharacteristics_LoopCondition() {
        return (EReference)getStandardLoopCharacteristics().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStandardLoopCharacteristics__StandardLoopCharacteristicstestBefore__DiagnosticChain_Map() {
        return getStandardLoopCharacteristics().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getStandardLoopCharacteristics__StandardLoopCharacteristicsloopCondition__DiagnosticChain_Map() {
        return getStandardLoopCharacteristics().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReceiveTask() {
		if (receiveTaskEClass == null) {
			receiveTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(135);
		}
		return receiveTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveTask_MessageRef() {
        return (EReference)getReceiveTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveTask_Base_AcceptEventAction() {
        return (EReference)getReceiveTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveTask_Implementation() {
        return (EAttribute)getReceiveTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReceiveTask_Instantiate() {
        return (EAttribute)getReceiveTask().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReceiveTask_OperationRef() {
        return (EReference)getReceiveTask().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getReceiveTask__ReceiveTaskoperationRef__DiagnosticChain_Map() {
        return getReceiveTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getServiceTask() {
		if (serviceTaskEClass == null) {
			serviceTaskEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(136);
		}
		return serviceTaskEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_Base_CallOperationAction() {
        return (EReference)getServiceTask().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getServiceTask_Implementation() {
        return (EAttribute)getServiceTask().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getServiceTask_OperationRef() {
        return (EReference)getServiceTask().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTask__ServiceTaskinputSet__DiagnosticChain_Map() {
        return getServiceTask().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTask__ServiceTaskoutputSet__DiagnosticChain_Map() {
        return getServiceTask().getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getServiceTask__ServiceTaskoperationRef__DiagnosticChain_Map() {
        return getServiceTask().getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMultiInstanceLoopCharacteristics() {
		if (multiInstanceLoopCharacteristicsEClass == null) {
			multiInstanceLoopCharacteristicsEClass = (EClass)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(137);
		}
		return multiInstanceLoopCharacteristicsEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiInstanceLoopCharacteristics_Behavior() {
        return (EAttribute)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_LoopCardinality() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_CompletionCondition() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_Base_ExpansionRegion() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMultiInstanceLoopCharacteristics_IsSequential() {
        return (EAttribute)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_LoopDataInputRef() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_LoopDataOutputRef() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_OutputDataItem() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_InputDataItem() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_OneBehaviorEventRef() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_NoneBehaviorEventRef() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMultiInstanceLoopCharacteristics_ComplexBehaviorDefinition() {
        return (EReference)getMultiInstanceLoopCharacteristics().getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMultiInstanceLoopCharacteristics__MultiinstanceLoopCharacteristicstarget__DiagnosticChain_Map() {
        return getMultiInstanceLoopCharacteristics().getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociationDirection() {
		if (associationDirectionEEnum == null) {
			associationDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(12);
		}
		return associationDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEventBasedGatewayType() {
		if (eventBasedGatewayTypeEEnum == null) {
			eventBasedGatewayTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(22);
		}
		return eventBasedGatewayTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGatewayDirection() {
		if (gatewayDirectionEEnum == null) {
			gatewayDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(23);
		}
		return gatewayDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRelationshipDirection() {
		if (relationshipDirectionEEnum == null) {
			relationshipDirectionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(32);
		}
		return relationshipDirectionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getItemKind() {
		if (itemKindEEnum == null) {
			itemKindEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(40);
		}
		return itemKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessType() {
		if (processTypeEEnum == null) {
			processTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(49);
		}
		return processTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdHocOrdering() {
		if (adHocOrderingEEnum == null) {
			adHocOrderingEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(127);
		}
		return adHocOrderingEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultiInstanceBehavior() {
		if (multiInstanceBehaviorEEnum == null) {
			multiInstanceBehaviorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(BpmnprofPackage.eNS_URI).getEClassifiers().get(134);
		}
		return multiInstanceBehaviorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BpmnprofFactory getBpmnprofFactory() {
		return (BpmnprofFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.eclipse.upr.bpmnprof." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //BpmnprofPackageImpl
