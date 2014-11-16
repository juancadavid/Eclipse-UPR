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
package org.eclipse.upr.bpmnprof.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectValidator;

import org.eclipse.uml2.uml.Activity;

import org.eclipse.upr.bpmnprof.Auditing;
import org.eclipse.upr.bpmnprof.BPMNCollaboration;
import org.eclipse.upr.bpmnprof.BPMNProcess;
import org.eclipse.upr.bpmnprof.BPMNProperty;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CorrelationSubscription;
import org.eclipse.upr.bpmnprof.FlowElement;
import org.eclipse.upr.bpmnprof.FlowElementsContainer;
import org.eclipse.upr.bpmnprof.LaneSet;
import org.eclipse.upr.bpmnprof.Monitoring;
import org.eclipse.upr.bpmnprof.ProcessType;
import org.eclipse.upr.bpmnprof.ResourceRole;

import org.eclipse.upr.bpmnprof.util.BpmnprofValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>BPMN Process</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getLaneSets <em>Lane Sets</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getFlowElements <em>Flow Elements</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getProcessType <em>Process Type</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#isClosed <em>Is Closed</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getAuditing <em>Auditing</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#isExecutable <em>Is Executable</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getDefinitionalCollaborationRef <em>Definitional Collaboration Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getBase_Activity <em>Base Activity</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getCorrelationSubscriptions <em>Correlation Subscriptions</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getMonitoring <em>Monitoring</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getSupports <em>Supports</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getProperties <em>Properties</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.BPMNProcessImpl#getResources <em>Resources</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BPMNProcessImpl extends CallableElementImpl implements BPMNProcess {
	/**
	 * The default value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessType()
	 * @generated
	 * @ordered
	 */
	protected static final ProcessType PROCESS_TYPE_EDEFAULT = ProcessType.NONE;

	/**
	 * The cached value of the '{@link #getProcessType() <em>Process Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessType()
	 * @generated
	 * @ordered
	 */
	protected ProcessType processType = PROCESS_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #isClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosed()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CLOSED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosed() <em>Is Closed</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosed()
	 * @generated
	 * @ordered
	 */
	protected boolean isClosed = IS_CLOSED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuditing() <em>Auditing</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuditing()
	 * @generated
	 * @ordered
	 */
	protected Auditing auditing;

	/**
	 * The default value of the '{@link #isExecutable() <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_EXECUTABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isExecutable() <em>Is Executable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isExecutable()
	 * @generated
	 * @ordered
	 */
	protected boolean isExecutable = IS_EXECUTABLE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getDefinitionalCollaborationRef() <em>Definitional Collaboration Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefinitionalCollaborationRef()
	 * @generated
	 * @ordered
	 */
	protected BPMNCollaboration definitionalCollaborationRef;

	/**
	 * The cached value of the '{@link #getBase_Activity() <em>Base Activity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Activity()
	 * @generated
	 * @ordered
	 */
	protected Activity base_Activity;

	/**
	 * The cached value of the '{@link #getCorrelationSubscriptions() <em>Correlation Subscriptions</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCorrelationSubscriptions()
	 * @generated
	 * @ordered
	 */
	protected EList<CorrelationSubscription> correlationSubscriptions;

	/**
	 * The cached value of the '{@link #getMonitoring() <em>Monitoring</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMonitoring()
	 * @generated
	 * @ordered
	 */
	protected Monitoring monitoring;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BPMNProcessImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getBPMNProcess();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LaneSet> getLaneSets() {
		// TODO: implement this method to return the 'Lane Sets' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FlowElement> getFlowElements() {
		// TODO: implement this method to return the 'Flow Elements' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessType getProcessType() {
		return processType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessType(ProcessType newProcessType) {
		ProcessType oldProcessType = processType;
		processType = newProcessType == null ? PROCESS_TYPE_EDEFAULT : newProcessType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROCESS__PROCESS_TYPE, oldProcessType, processType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosed() {
		return isClosed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsClosed(boolean newIsClosed) {
		boolean oldIsClosed = isClosed;
		isClosed = newIsClosed;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROCESS__IS_CLOSED, oldIsClosed, isClosed));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing getAuditing() {
		if (auditing != null && auditing.eIsProxy()) {
			InternalEObject oldAuditing = (InternalEObject)auditing;
			auditing = (Auditing)eResolveProxy(oldAuditing);
			if (auditing != oldAuditing) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_PROCESS__AUDITING, oldAuditing, auditing));
			}
		}
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Auditing basicGetAuditing() {
		return auditing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuditing(Auditing newAuditing) {
		Auditing oldAuditing = auditing;
		auditing = newAuditing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROCESS__AUDITING, oldAuditing, auditing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isExecutable() {
		return isExecutable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsExecutable(boolean newIsExecutable) {
		boolean oldIsExecutable = isExecutable;
		isExecutable = newIsExecutable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROCESS__IS_EXECUTABLE, oldIsExecutable, isExecutable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNCollaboration getDefinitionalCollaborationRef() {
		if (definitionalCollaborationRef != null && definitionalCollaborationRef.eIsProxy()) {
			InternalEObject oldDefinitionalCollaborationRef = (InternalEObject)definitionalCollaborationRef;
			definitionalCollaborationRef = (BPMNCollaboration)eResolveProxy(oldDefinitionalCollaborationRef);
			if (definitionalCollaborationRef != oldDefinitionalCollaborationRef) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_PROCESS__DEFINITIONAL_COLLABORATION_REF, oldDefinitionalCollaborationRef, definitionalCollaborationRef));
			}
		}
		return definitionalCollaborationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNCollaboration basicGetDefinitionalCollaborationRef() {
		return definitionalCollaborationRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefinitionalCollaborationRef(BPMNCollaboration newDefinitionalCollaborationRef) {
		BPMNCollaboration oldDefinitionalCollaborationRef = definitionalCollaborationRef;
		definitionalCollaborationRef = newDefinitionalCollaborationRef;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROCESS__DEFINITIONAL_COLLABORATION_REF, oldDefinitionalCollaborationRef, definitionalCollaborationRef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity getBase_Activity() {
		if (base_Activity != null && base_Activity.eIsProxy()) {
			InternalEObject oldBase_Activity = (InternalEObject)base_Activity;
			base_Activity = (Activity)eResolveProxy(oldBase_Activity);
			if (base_Activity != oldBase_Activity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_PROCESS__BASE_ACTIVITY, oldBase_Activity, base_Activity));
			}
		}
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Activity basicGetBase_Activity() {
		return base_Activity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Activity(Activity newBase_Activity) {
		Activity oldBase_Activity = base_Activity;
		base_Activity = newBase_Activity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROCESS__BASE_ACTIVITY, oldBase_Activity, base_Activity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CorrelationSubscription> getCorrelationSubscriptions() {
		if (correlationSubscriptions == null) {
			correlationSubscriptions = new EObjectResolvingEList<CorrelationSubscription>(CorrelationSubscription.class, this, BpmnprofPackage.BPMN_PROCESS__CORRELATION_SUBSCRIPTIONS);
		}
		return correlationSubscriptions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring getMonitoring() {
		if (monitoring != null && monitoring.eIsProxy()) {
			InternalEObject oldMonitoring = (InternalEObject)monitoring;
			monitoring = (Monitoring)eResolveProxy(oldMonitoring);
			if (monitoring != oldMonitoring) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.BPMN_PROCESS__MONITORING, oldMonitoring, monitoring));
			}
		}
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Monitoring basicGetMonitoring() {
		return monitoring;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMonitoring(Monitoring newMonitoring) {
		Monitoring oldMonitoring = monitoring;
		monitoring = newMonitoring;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.BPMN_PROCESS__MONITORING, oldMonitoring, monitoring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNProcess getSupports() {
		BPMNProcess supports = basicGetSupports();
		return supports != null && supports.eIsProxy() ? (BPMNProcess)eResolveProxy((InternalEObject)supports) : supports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNProcess basicGetSupports() {
		// TODO: implement this method to return the 'Supports' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupports(BPMNProcess newSupports) {
		// TODO: implement this method to set the 'Supports' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BPMNProperty> getProperties() {
		// TODO: implement this method to return the 'Properties' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResourceRole> getResources() {
		// TODO: implement this method to return the 'Resources' reference list
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcesssupportedInterfaceRefs(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_PROCESS__PROCESSSUPPORTED_INTERFACE_REFS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProcesssupportedInterfaceRefs", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Processsupports(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_PROCESS__PROCESSSUPPORTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Processsupports", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean Processproperties(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_PROCESS__PROCESSPROPERTIES,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "Processproperties", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcesslaneSets(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_PROCESS__PROCESSLANE_SETS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProcesslaneSets", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean ProcessflowElements(DiagnosticChain diagnostics, Map<Object, Object> context) {
		// TODO: implement this method
		// -> specify the condition that violates the invariant
		// -> verify the details of the diagnostic, including severity and message
		// Ensure that you remove @generated or mark it @generated NOT
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 BpmnprofValidator.DIAGNOSTIC_SOURCE,
						 BpmnprofValidator.BPMN_PROCESS__PROCESSFLOW_ELEMENTS,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "ProcessflowElements", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_PROCESS__LANE_SETS:
				return getLaneSets();
			case BpmnprofPackage.BPMN_PROCESS__FLOW_ELEMENTS:
				return getFlowElements();
			case BpmnprofPackage.BPMN_PROCESS__PROCESS_TYPE:
				return getProcessType();
			case BpmnprofPackage.BPMN_PROCESS__IS_CLOSED:
				return isClosed();
			case BpmnprofPackage.BPMN_PROCESS__AUDITING:
				if (resolve) return getAuditing();
				return basicGetAuditing();
			case BpmnprofPackage.BPMN_PROCESS__IS_EXECUTABLE:
				return isExecutable();
			case BpmnprofPackage.BPMN_PROCESS__DEFINITIONAL_COLLABORATION_REF:
				if (resolve) return getDefinitionalCollaborationRef();
				return basicGetDefinitionalCollaborationRef();
			case BpmnprofPackage.BPMN_PROCESS__BASE_ACTIVITY:
				if (resolve) return getBase_Activity();
				return basicGetBase_Activity();
			case BpmnprofPackage.BPMN_PROCESS__CORRELATION_SUBSCRIPTIONS:
				return getCorrelationSubscriptions();
			case BpmnprofPackage.BPMN_PROCESS__MONITORING:
				if (resolve) return getMonitoring();
				return basicGetMonitoring();
			case BpmnprofPackage.BPMN_PROCESS__SUPPORTS:
				if (resolve) return getSupports();
				return basicGetSupports();
			case BpmnprofPackage.BPMN_PROCESS__PROPERTIES:
				return getProperties();
			case BpmnprofPackage.BPMN_PROCESS__RESOURCES:
				return getResources();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_PROCESS__LANE_SETS:
				getLaneSets().clear();
				getLaneSets().addAll((Collection<? extends LaneSet>)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				getFlowElements().addAll((Collection<? extends FlowElement>)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__PROCESS_TYPE:
				setProcessType((ProcessType)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__IS_CLOSED:
				setIsClosed((Boolean)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__AUDITING:
				setAuditing((Auditing)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__IS_EXECUTABLE:
				setIsExecutable((Boolean)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__DEFINITIONAL_COLLABORATION_REF:
				setDefinitionalCollaborationRef((BPMNCollaboration)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__BASE_ACTIVITY:
				setBase_Activity((Activity)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__CORRELATION_SUBSCRIPTIONS:
				getCorrelationSubscriptions().clear();
				getCorrelationSubscriptions().addAll((Collection<? extends CorrelationSubscription>)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__MONITORING:
				setMonitoring((Monitoring)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__SUPPORTS:
				setSupports((BPMNProcess)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__PROPERTIES:
				getProperties().clear();
				getProperties().addAll((Collection<? extends BPMNProperty>)newValue);
				return;
			case BpmnprofPackage.BPMN_PROCESS__RESOURCES:
				getResources().clear();
				getResources().addAll((Collection<? extends ResourceRole>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_PROCESS__LANE_SETS:
				getLaneSets().clear();
				return;
			case BpmnprofPackage.BPMN_PROCESS__FLOW_ELEMENTS:
				getFlowElements().clear();
				return;
			case BpmnprofPackage.BPMN_PROCESS__PROCESS_TYPE:
				setProcessType(PROCESS_TYPE_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_PROCESS__IS_CLOSED:
				setIsClosed(IS_CLOSED_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_PROCESS__AUDITING:
				setAuditing((Auditing)null);
				return;
			case BpmnprofPackage.BPMN_PROCESS__IS_EXECUTABLE:
				setIsExecutable(IS_EXECUTABLE_EDEFAULT);
				return;
			case BpmnprofPackage.BPMN_PROCESS__DEFINITIONAL_COLLABORATION_REF:
				setDefinitionalCollaborationRef((BPMNCollaboration)null);
				return;
			case BpmnprofPackage.BPMN_PROCESS__BASE_ACTIVITY:
				setBase_Activity((Activity)null);
				return;
			case BpmnprofPackage.BPMN_PROCESS__CORRELATION_SUBSCRIPTIONS:
				getCorrelationSubscriptions().clear();
				return;
			case BpmnprofPackage.BPMN_PROCESS__MONITORING:
				setMonitoring((Monitoring)null);
				return;
			case BpmnprofPackage.BPMN_PROCESS__SUPPORTS:
				setSupports((BPMNProcess)null);
				return;
			case BpmnprofPackage.BPMN_PROCESS__PROPERTIES:
				getProperties().clear();
				return;
			case BpmnprofPackage.BPMN_PROCESS__RESOURCES:
				getResources().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case BpmnprofPackage.BPMN_PROCESS__LANE_SETS:
				return !getLaneSets().isEmpty();
			case BpmnprofPackage.BPMN_PROCESS__FLOW_ELEMENTS:
				return !getFlowElements().isEmpty();
			case BpmnprofPackage.BPMN_PROCESS__PROCESS_TYPE:
				return processType != PROCESS_TYPE_EDEFAULT;
			case BpmnprofPackage.BPMN_PROCESS__IS_CLOSED:
				return isClosed != IS_CLOSED_EDEFAULT;
			case BpmnprofPackage.BPMN_PROCESS__AUDITING:
				return auditing != null;
			case BpmnprofPackage.BPMN_PROCESS__IS_EXECUTABLE:
				return isExecutable != IS_EXECUTABLE_EDEFAULT;
			case BpmnprofPackage.BPMN_PROCESS__DEFINITIONAL_COLLABORATION_REF:
				return definitionalCollaborationRef != null;
			case BpmnprofPackage.BPMN_PROCESS__BASE_ACTIVITY:
				return base_Activity != null;
			case BpmnprofPackage.BPMN_PROCESS__CORRELATION_SUBSCRIPTIONS:
				return correlationSubscriptions != null && !correlationSubscriptions.isEmpty();
			case BpmnprofPackage.BPMN_PROCESS__MONITORING:
				return monitoring != null;
			case BpmnprofPackage.BPMN_PROCESS__SUPPORTS:
				return basicGetSupports() != null;
			case BpmnprofPackage.BPMN_PROCESS__PROPERTIES:
				return !getProperties().isEmpty();
			case BpmnprofPackage.BPMN_PROCESS__RESOURCES:
				return !getResources().isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (derivedFeatureID) {
				case BpmnprofPackage.BPMN_PROCESS__LANE_SETS: return BpmnprofPackage.FLOW_ELEMENTS_CONTAINER__LANE_SETS;
				case BpmnprofPackage.BPMN_PROCESS__FLOW_ELEMENTS: return BpmnprofPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == FlowElementsContainer.class) {
			switch (baseFeatureID) {
				case BpmnprofPackage.FLOW_ELEMENTS_CONTAINER__LANE_SETS: return BpmnprofPackage.BPMN_PROCESS__LANE_SETS;
				case BpmnprofPackage.FLOW_ELEMENTS_CONTAINER__FLOW_ELEMENTS: return BpmnprofPackage.BPMN_PROCESS__FLOW_ELEMENTS;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case BpmnprofPackage.BPMN_PROCESS___PROCESSSUPPORTED_INTERFACE_REFS__DIAGNOSTICCHAIN_MAP:
				return ProcesssupportedInterfaceRefs((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_PROCESS___PROCESSSUPPORTS__DIAGNOSTICCHAIN_MAP:
				return Processsupports((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_PROCESS___PROCESSPROPERTIES__DIAGNOSTICCHAIN_MAP:
				return Processproperties((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_PROCESS___PROCESSLANE_SETS__DIAGNOSTICCHAIN_MAP:
				return ProcesslaneSets((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
			case BpmnprofPackage.BPMN_PROCESS___PROCESSFLOW_ELEMENTS__DIAGNOSTICCHAIN_MAP:
				return ProcessflowElements((DiagnosticChain)arguments.get(0), (Map<Object, Object>)arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (processType: ");
		result.append(processType);
		result.append(", isClosed: ");
		result.append(isClosed);
		result.append(", isExecutable: ");
		result.append(isExecutable);
		result.append(')');
		return result.toString();
	}

} //BPMNProcessImpl
