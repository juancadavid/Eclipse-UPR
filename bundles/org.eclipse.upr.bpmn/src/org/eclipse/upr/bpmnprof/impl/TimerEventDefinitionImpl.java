/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.ChangeEvent;

import org.eclipse.upr.bpmnprof.BPMNExpression;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.TimerEventDefinition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Timer Event Definition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.TimerEventDefinitionImpl#getTimeCycle <em>Time Cycle</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.TimerEventDefinitionImpl#getTimeDate <em>Time Date</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.TimerEventDefinitionImpl#getTimeDuration <em>Time Duration</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.TimerEventDefinitionImpl#getBase_ChangeEvent <em>Base Change Event</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TimerEventDefinitionImpl extends EventDefinitionImpl implements TimerEventDefinition {
	/**
	 * The cached value of the '{@link #getTimeCycle() <em>Time Cycle</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeCycle()
	 * @generated
	 * @ordered
	 */
	protected BPMNExpression timeCycle;

	/**
	 * The cached value of the '{@link #getTimeDate() <em>Time Date</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDate()
	 * @generated
	 * @ordered
	 */
	protected BPMNExpression timeDate;

	/**
	 * The cached value of the '{@link #getTimeDuration() <em>Time Duration</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeDuration()
	 * @generated
	 * @ordered
	 */
	protected BPMNExpression timeDuration;

	/**
	 * The cached value of the '{@link #getBase_ChangeEvent() <em>Base Change Event</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ChangeEvent()
	 * @generated
	 * @ordered
	 */
	protected ChangeEvent base_ChangeEvent;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TimerEventDefinitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getTimerEventDefinition();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getTimeCycle() {
		if (timeCycle != null && timeCycle.eIsProxy()) {
			InternalEObject oldTimeCycle = (InternalEObject)timeCycle;
			timeCycle = (BPMNExpression)eResolveProxy(oldTimeCycle);
			if (timeCycle != oldTimeCycle) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE, oldTimeCycle, timeCycle));
			}
		}
		return timeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetTimeCycle() {
		return timeCycle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeCycle(BPMNExpression newTimeCycle) {
		BPMNExpression oldTimeCycle = timeCycle;
		timeCycle = newTimeCycle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE, oldTimeCycle, timeCycle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getTimeDate() {
		if (timeDate != null && timeDate.eIsProxy()) {
			InternalEObject oldTimeDate = (InternalEObject)timeDate;
			timeDate = (BPMNExpression)eResolveProxy(oldTimeDate);
			if (timeDate != oldTimeDate) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DATE, oldTimeDate, timeDate));
			}
		}
		return timeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetTimeDate() {
		return timeDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDate(BPMNExpression newTimeDate) {
		BPMNExpression oldTimeDate = timeDate;
		timeDate = newTimeDate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DATE, oldTimeDate, timeDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression getTimeDuration() {
		if (timeDuration != null && timeDuration.eIsProxy()) {
			InternalEObject oldTimeDuration = (InternalEObject)timeDuration;
			timeDuration = (BPMNExpression)eResolveProxy(oldTimeDuration);
			if (timeDuration != oldTimeDuration) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DURATION, oldTimeDuration, timeDuration));
			}
		}
		return timeDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNExpression basicGetTimeDuration() {
		return timeDuration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTimeDuration(BPMNExpression newTimeDuration) {
		BPMNExpression oldTimeDuration = timeDuration;
		timeDuration = newTimeDuration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DURATION, oldTimeDuration, timeDuration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent getBase_ChangeEvent() {
		if (base_ChangeEvent != null && base_ChangeEvent.eIsProxy()) {
			InternalEObject oldBase_ChangeEvent = (InternalEObject)base_ChangeEvent;
			base_ChangeEvent = (ChangeEvent)eResolveProxy(oldBase_ChangeEvent);
			if (base_ChangeEvent != oldBase_ChangeEvent) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.TIMER_EVENT_DEFINITION__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
			}
		}
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeEvent basicGetBase_ChangeEvent() {
		return base_ChangeEvent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ChangeEvent(ChangeEvent newBase_ChangeEvent) {
		ChangeEvent oldBase_ChangeEvent = base_ChangeEvent;
		base_ChangeEvent = newBase_ChangeEvent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.TIMER_EVENT_DEFINITION__BASE_CHANGE_EVENT, oldBase_ChangeEvent, base_ChangeEvent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
				if (resolve) return getTimeCycle();
				return basicGetTimeCycle();
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
				if (resolve) return getTimeDate();
				return basicGetTimeDate();
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DURATION:
				if (resolve) return getTimeDuration();
				return basicGetTimeDuration();
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				if (resolve) return getBase_ChangeEvent();
				return basicGetBase_ChangeEvent();
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
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
				setTimeCycle((BPMNExpression)newValue);
				return;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
				setTimeDate((BPMNExpression)newValue);
				return;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DURATION:
				setTimeDuration((BPMNExpression)newValue);
				return;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)newValue);
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
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
				setTimeCycle((BPMNExpression)null);
				return;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
				setTimeDate((BPMNExpression)null);
				return;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DURATION:
				setTimeDuration((BPMNExpression)null);
				return;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				setBase_ChangeEvent((ChangeEvent)null);
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
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_CYCLE:
				return timeCycle != null;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DATE:
				return timeDate != null;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__TIME_DURATION:
				return timeDuration != null;
			case BpmnprofPackage.TIMER_EVENT_DEFINITION__BASE_CHANGE_EVENT:
				return base_ChangeEvent != null;
		}
		return super.eIsSet(featureID);
	}

} //TimerEventDefinitionImpl
