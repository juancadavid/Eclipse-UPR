/**
 */
package org.eclipse.upr.bpmnprof.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.uml2.uml.CallEvent;

import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.LinkEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Link Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LinkEventDefinitionImpl#get_target <em>target</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LinkEventDefinitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.LinkEventDefinitionImpl#getBase_CallEvent <em>Base Call Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LinkEventDefinitionImpl extends EventDefinitionImpl implements LinkEventDefinition {
	/**
	 * The cached value of the '{@link #get_target() <em>target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #get_target()
	 * @generated
	 * @ordered
	 */
	protected LinkEventDefinition _target;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected EList<LinkEventDefinition> source;

	/**
	 * The cached value of the '{@link #getBase_CallEvent() <em>Base Call Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_CallEvent()
	 * @generated
	 * @ordered
	 */
	protected CallEvent base_CallEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LinkEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getLinkEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEventDefinition get_target() {
		if (_target != null && _target.eIsProxy()) {
			InternalEObject old_target = (InternalEObject)_target;
			_target = (LinkEventDefinition)eResolveProxy(old_target);
			if (_target != old_target) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET, old_target, _target));
			}
		}
		return _target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkEventDefinition basicGet_target() {
		return _target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSet_target(LinkEventDefinition new_target, NotificationChain msgs) {
		LinkEventDefinition old_target = _target;
		_target = new_target;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET, old_target, new_target);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void set_target(LinkEventDefinition new_target) {
		if (new_target != _target) {
			NotificationChain msgs = null;
			if (_target != null)
				msgs = ((InternalEObject)_target).eInverseRemove(this, BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE, LinkEventDefinition.class, msgs);
			if (new_target != null)
				msgs = ((InternalEObject)new_target).eInverseAdd(this, BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE, LinkEventDefinition.class, msgs);
			msgs = basicSet_target(new_target, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET, new_target, new_target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<LinkEventDefinition> getSource() {
		if (source == null) {
			source = new EObjectWithInverseResolvingEList<LinkEventDefinition>(LinkEventDefinition.class, this, BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE, BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET);
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEvent getBase_CallEvent() {
		if (base_CallEvent != null && base_CallEvent.eIsProxy()) {
			InternalEObject oldBase_CallEvent = (InternalEObject)base_CallEvent;
			base_CallEvent = (CallEvent)eResolveProxy(oldBase_CallEvent);
			if (base_CallEvent != oldBase_CallEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.LINK_EVENT_DEFINITION__BASE_CALL_EVENT, oldBase_CallEvent, base_CallEvent));
			}
		}
		return base_CallEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallEvent basicGetBase_CallEvent() {
		return base_CallEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_CallEvent(CallEvent newBase_CallEvent) {
		CallEvent oldBase_CallEvent = base_CallEvent;
		base_CallEvent = newBase_CallEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.LINK_EVENT_DEFINITION__BASE_CALL_EVENT, oldBase_CallEvent, base_CallEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET:
				if (_target != null)
					msgs = ((InternalEObject)_target).eInverseRemove(this, BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE, LinkEventDefinition.class, msgs);
				return basicSet_target((LinkEventDefinition)otherEnd, msgs);
			case BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getSource()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET:
				return basicSet_target(null, msgs);
			case BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE:
				return ((InternalEList<?>)getSource()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET:
				if (resolve) return get_target();
				return basicGet_target();
			case BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE:
				return getSource();
			case BpmnprofPackage.LINK_EVENT_DEFINITION__BASE_CALL_EVENT:
				if (resolve) return getBase_CallEvent();
				return basicGetBase_CallEvent();
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
			case BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET:
				set_target((LinkEventDefinition)newValue);
				return;
			case BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE:
				getSource().clear();
				getSource().addAll((Collection<? extends LinkEventDefinition>)newValue);
				return;
			case BpmnprofPackage.LINK_EVENT_DEFINITION__BASE_CALL_EVENT:
				setBase_CallEvent((CallEvent)newValue);
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
			case BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET:
				set_target((LinkEventDefinition)null);
				return;
			case BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE:
				getSource().clear();
				return;
			case BpmnprofPackage.LINK_EVENT_DEFINITION__BASE_CALL_EVENT:
				setBase_CallEvent((CallEvent)null);
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
			case BpmnprofPackage.LINK_EVENT_DEFINITION__TARGET:
				return _target != null;
			case BpmnprofPackage.LINK_EVENT_DEFINITION__SOURCE:
				return source != null && !source.isEmpty();
			case BpmnprofPackage.LINK_EVENT_DEFINITION__BASE_CALL_EVENT:
				return base_CallEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //LinkEventDefinitionImpl
