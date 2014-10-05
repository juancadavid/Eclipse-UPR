/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ForkNode;
import org.eclipse.uml2.uml.InterruptibleActivityRegion;
import org.eclipse.uml2.uml.StructuredActivityNode;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.EventBasedGateway;
import org.eclipse.upr.bpmnprof.EventBasedGatewayType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Event Based Gateway</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.EventBasedGatewayImpl#isInstantiate <em>Instantiate</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.EventBasedGatewayImpl#getEventGatewayType <em>Event Gateway Type</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.EventBasedGatewayImpl#getBase_ForkNode <em>Base Fork Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.EventBasedGatewayImpl#getBase_StructuredActivityNode <em>Base Structured Activity Node</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.EventBasedGatewayImpl#getBase_InterruptibleActivityRegion <em>Base Interruptible Activity Region</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EventBasedGatewayImpl extends GatewayImpl implements EventBasedGateway {
	/**
	 * The default value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiate()
	 * @generated
	 * @ordered
	 */
	protected static final boolean INSTANTIATE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isInstantiate() <em>Instantiate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isInstantiate()
	 * @generated
	 * @ordered
	 */
	protected boolean instantiate = INSTANTIATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGatewayType()
	 * @generated
	 * @ordered
	 */
	protected static final EventBasedGatewayType EVENT_GATEWAY_TYPE_EDEFAULT = EventBasedGatewayType.EXCLUSIVE;

	/**
	 * The cached value of the '{@link #getEventGatewayType() <em>Event Gateway Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEventGatewayType()
	 * @generated
	 * @ordered
	 */
	protected EventBasedGatewayType eventGatewayType = EVENT_GATEWAY_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_ForkNode() <em>Base Fork Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ForkNode()
	 * @generated
	 * @ordered
	 */
	protected ForkNode base_ForkNode;

	/**
	 * The cached value of the '{@link #getBase_StructuredActivityNode() <em>Base Structured Activity Node</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_StructuredActivityNode()
	 * @generated
	 * @ordered
	 */
	protected StructuredActivityNode base_StructuredActivityNode;

	/**
	 * The cached value of the '{@link #getBase_InterruptibleActivityRegion() <em>Base Interruptible Activity Region</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_InterruptibleActivityRegion()
	 * @generated
	 * @ordered
	 */
	protected InterruptibleActivityRegion base_InterruptibleActivityRegion;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EventBasedGatewayImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getEventBasedGateway();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isInstantiate() {
		return instantiate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInstantiate(boolean newInstantiate) {
		boolean oldInstantiate = instantiate;
		instantiate = newInstantiate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.EVENT_BASED_GATEWAY__INSTANTIATE, oldInstantiate, instantiate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EventBasedGatewayType getEventGatewayType() {
		return eventGatewayType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEventGatewayType(EventBasedGatewayType newEventGatewayType) {
		EventBasedGatewayType oldEventGatewayType = eventGatewayType;
		eventGatewayType = newEventGatewayType == null ? EVENT_GATEWAY_TYPE_EDEFAULT : newEventGatewayType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE, oldEventGatewayType, eventGatewayType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode getBase_ForkNode() {
		if (base_ForkNode != null && base_ForkNode.eIsProxy()) {
			InternalEObject oldBase_ForkNode = (InternalEObject)base_ForkNode;
			base_ForkNode = (ForkNode)eResolveProxy(oldBase_ForkNode);
			if (base_ForkNode != oldBase_ForkNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_FORK_NODE, oldBase_ForkNode, base_ForkNode));
			}
		}
		return base_ForkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ForkNode basicGetBase_ForkNode() {
		return base_ForkNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ForkNode(ForkNode newBase_ForkNode) {
		ForkNode oldBase_ForkNode = base_ForkNode;
		base_ForkNode = newBase_ForkNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_FORK_NODE, oldBase_ForkNode, base_ForkNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode getBase_StructuredActivityNode() {
		if (base_StructuredActivityNode != null && base_StructuredActivityNode.eIsProxy()) {
			InternalEObject oldBase_StructuredActivityNode = (InternalEObject)base_StructuredActivityNode;
			base_StructuredActivityNode = (StructuredActivityNode)eResolveProxy(oldBase_StructuredActivityNode);
			if (base_StructuredActivityNode != oldBase_StructuredActivityNode) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_STRUCTURED_ACTIVITY_NODE, oldBase_StructuredActivityNode, base_StructuredActivityNode));
			}
		}
		return base_StructuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StructuredActivityNode basicGetBase_StructuredActivityNode() {
		return base_StructuredActivityNode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_StructuredActivityNode(StructuredActivityNode newBase_StructuredActivityNode) {
		StructuredActivityNode oldBase_StructuredActivityNode = base_StructuredActivityNode;
		base_StructuredActivityNode = newBase_StructuredActivityNode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_STRUCTURED_ACTIVITY_NODE, oldBase_StructuredActivityNode, base_StructuredActivityNode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion getBase_InterruptibleActivityRegion() {
		if (base_InterruptibleActivityRegion != null && base_InterruptibleActivityRegion.eIsProxy()) {
			InternalEObject oldBase_InterruptibleActivityRegion = (InternalEObject)base_InterruptibleActivityRegion;
			base_InterruptibleActivityRegion = (InterruptibleActivityRegion)eResolveProxy(oldBase_InterruptibleActivityRegion);
			if (base_InterruptibleActivityRegion != oldBase_InterruptibleActivityRegion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_INTERRUPTIBLE_ACTIVITY_REGION, oldBase_InterruptibleActivityRegion, base_InterruptibleActivityRegion));
			}
		}
		return base_InterruptibleActivityRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterruptibleActivityRegion basicGetBase_InterruptibleActivityRegion() {
		return base_InterruptibleActivityRegion;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_InterruptibleActivityRegion(InterruptibleActivityRegion newBase_InterruptibleActivityRegion) {
		InterruptibleActivityRegion oldBase_InterruptibleActivityRegion = base_InterruptibleActivityRegion;
		base_InterruptibleActivityRegion = newBase_InterruptibleActivityRegion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_INTERRUPTIBLE_ACTIVITY_REGION, oldBase_InterruptibleActivityRegion, base_InterruptibleActivityRegion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
				return isInstantiate();
			case BpmnprofPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				return getEventGatewayType();
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_FORK_NODE:
				if (resolve) return getBase_ForkNode();
				return basicGetBase_ForkNode();
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_STRUCTURED_ACTIVITY_NODE:
				if (resolve) return getBase_StructuredActivityNode();
				return basicGetBase_StructuredActivityNode();
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_INTERRUPTIBLE_ACTIVITY_REGION:
				if (resolve) return getBase_InterruptibleActivityRegion();
				return basicGetBase_InterruptibleActivityRegion();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case BpmnprofPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
				setInstantiate((Boolean)newValue);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				setEventGatewayType((EventBasedGatewayType)newValue);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_FORK_NODE:
				setBase_ForkNode((ForkNode)newValue);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_STRUCTURED_ACTIVITY_NODE:
				setBase_StructuredActivityNode((StructuredActivityNode)newValue);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_INTERRUPTIBLE_ACTIVITY_REGION:
				setBase_InterruptibleActivityRegion((InterruptibleActivityRegion)newValue);
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
			case BpmnprofPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
				setInstantiate(INSTANTIATE_EDEFAULT);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				setEventGatewayType(EVENT_GATEWAY_TYPE_EDEFAULT);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_FORK_NODE:
				setBase_ForkNode((ForkNode)null);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_STRUCTURED_ACTIVITY_NODE:
				setBase_StructuredActivityNode((StructuredActivityNode)null);
				return;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_INTERRUPTIBLE_ACTIVITY_REGION:
				setBase_InterruptibleActivityRegion((InterruptibleActivityRegion)null);
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
			case BpmnprofPackage.EVENT_BASED_GATEWAY__INSTANTIATE:
				return instantiate != INSTANTIATE_EDEFAULT;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__EVENT_GATEWAY_TYPE:
				return eventGatewayType != EVENT_GATEWAY_TYPE_EDEFAULT;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_FORK_NODE:
				return base_ForkNode != null;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_STRUCTURED_ACTIVITY_NODE:
				return base_StructuredActivityNode != null;
			case BpmnprofPackage.EVENT_BASED_GATEWAY__BASE_INTERRUPTIBLE_ACTIVITY_REGION:
				return base_InterruptibleActivityRegion != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (instantiate: ");
		result.append(instantiate);
		result.append(", eventGatewayType: ");
		result.append(eventGatewayType);
		result.append(')');
		return result.toString();
	}

} //EventBasedGatewayImpl
