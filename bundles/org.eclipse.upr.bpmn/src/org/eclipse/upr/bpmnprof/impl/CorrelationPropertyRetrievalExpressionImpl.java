/**
 */
package org.eclipse.upr.bpmnprof.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.uml2.uml.Dependency;

import org.eclipse.upr.bpmnprof.BPMNMessage;
import org.eclipse.upr.bpmnprof.BpmnprofPackage;
import org.eclipse.upr.bpmnprof.CorrelationPropertyRetrievalExpression;
import org.eclipse.upr.bpmnprof.FormalExpression;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Correlation Property Retrieval Expression</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationPropertyRetrievalExpressionImpl#getBase_Dependency <em>Base Dependency</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationPropertyRetrievalExpressionImpl#getMessageRef <em>Message Ref</em>}</li>
 *   <li>{@link org.eclipse.upr.bpmnprof.impl.CorrelationPropertyRetrievalExpressionImpl#getMessagePath <em>Message Path</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CorrelationPropertyRetrievalExpressionImpl extends BaseElementImpl implements CorrelationPropertyRetrievalExpression {
	/**
	 * The cached value of the '{@link #getBase_Dependency() <em>Base Dependency</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Dependency()
	 * @generated
	 * @ordered
	 */
	protected Dependency base_Dependency;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CorrelationPropertyRetrievalExpressionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return BpmnprofPackage.eINSTANCE.getCorrelationPropertyRetrievalExpression();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency getBase_Dependency() {
		if (base_Dependency != null && base_Dependency.eIsProxy()) {
			InternalEObject oldBase_Dependency = (InternalEObject)base_Dependency;
			base_Dependency = (Dependency)eResolveProxy(oldBase_Dependency);
			if (base_Dependency != oldBase_Dependency) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
			}
		}
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dependency basicGetBase_Dependency() {
		return base_Dependency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Dependency(Dependency newBase_Dependency) {
		Dependency oldBase_Dependency = base_Dependency;
		base_Dependency = newBase_Dependency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__BASE_DEPENDENCY, oldBase_Dependency, base_Dependency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNMessage getMessageRef() {
		BPMNMessage messageRef = basicGetMessageRef();
		return messageRef != null && messageRef.eIsProxy() ? (BPMNMessage)eResolveProxy((InternalEObject)messageRef) : messageRef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BPMNMessage basicGetMessageRef() {
		// TODO: implement this method to return the 'Message Ref' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessageRef(BPMNMessage newMessageRef) {
		// TODO: implement this method to set the 'Message Ref' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression getMessagePath() {
		FormalExpression messagePath = basicGetMessagePath();
		return messagePath != null && messagePath.eIsProxy() ? (FormalExpression)eResolveProxy((InternalEObject)messagePath) : messagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormalExpression basicGetMessagePath() {
		// TODO: implement this method to return the 'Message Path' reference
		// -> do not perform proxy resolution
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMessagePath(FormalExpression newMessagePath) {
		// TODO: implement this method to set the 'Message Path' reference
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__BASE_DEPENDENCY:
				if (resolve) return getBase_Dependency();
				return basicGetBase_Dependency();
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				if (resolve) return getMessageRef();
				return basicGetMessageRef();
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				if (resolve) return getMessagePath();
				return basicGetMessagePath();
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
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)newValue);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				setMessageRef((BPMNMessage)newValue);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				setMessagePath((FormalExpression)newValue);
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
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__BASE_DEPENDENCY:
				setBase_Dependency((Dependency)null);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				setMessageRef((BPMNMessage)null);
				return;
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				setMessagePath((FormalExpression)null);
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
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__BASE_DEPENDENCY:
				return base_Dependency != null;
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_REF:
				return basicGetMessageRef() != null;
			case BpmnprofPackage.CORRELATION_PROPERTY_RETRIEVAL_EXPRESSION__MESSAGE_PATH:
				return basicGetMessagePath() != null;
		}
		return super.eIsSet(featureID);
	}

} //CorrelationPropertyRetrievalExpressionImpl
