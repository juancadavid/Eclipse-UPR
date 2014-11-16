/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Marc-Florian Wendland
 */
package org.eclipse.upr.utp.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

import org.eclipse.uml2.common.util.CacheAdapter;

import org.eclipse.uml2.uml.Namespace;
import org.eclipse.uml2.uml.Property;
import org.eclipse.uml2.uml.ValueSpecification;

import org.eclipse.upr.utp.CodingRule;
import org.eclipse.upr.utp.UTPPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coding Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.upr.utp.impl.CodingRuleImpl#getCoding <em>Coding</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.CodingRuleImpl#getBase_Namespace <em>Base Namespace</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.CodingRuleImpl#getBase_ValueSpecification <em>Base Value Specification</em>}</li>
 *   <li>{@link org.eclipse.upr.utp.impl.CodingRuleImpl#getBase_Property <em>Base Property</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CodingRuleImpl extends EObjectImpl implements CodingRule {
	/**
	 * The default value of the '{@link #getCoding() <em>Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoding()
	 * @generated
	 * @ordered
	 */
	protected static final String CODING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCoding() <em>Coding</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoding()
	 * @generated
	 * @ordered
	 */
	protected String coding = CODING_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBase_Namespace() <em>Base Namespace</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Namespace()
	 * @generated
	 * @ordered
	 */
	protected Namespace base_Namespace;

	/**
	 * The cached value of the '{@link #getBase_ValueSpecification() <em>Base Value Specification</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_ValueSpecification()
	 * @generated
	 * @ordered
	 */
	protected ValueSpecification base_ValueSpecification;

	/**
	 * The cached value of the '{@link #getBase_Property() <em>Base Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBase_Property()
	 * @generated
	 * @ordered
	 */
	protected Property base_Property;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CodingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return UTPPackage.Literals.CODING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCoding() {
		return coding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoding(String newCoding) {
		String oldCoding = coding;
		coding = newCoding;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.CODING_RULE__CODING, oldCoding, coding));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace getBase_Namespace() {
		if (base_Namespace != null && base_Namespace.eIsProxy()) {
			InternalEObject oldBase_Namespace = (InternalEObject)base_Namespace;
			base_Namespace = (Namespace)eResolveProxy(oldBase_Namespace);
			if (base_Namespace != oldBase_Namespace) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.CODING_RULE__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
			}
		}
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Namespace basicGetBase_Namespace() {
		return base_Namespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Namespace(Namespace newBase_Namespace) {
		Namespace oldBase_Namespace = base_Namespace;
		base_Namespace = newBase_Namespace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.CODING_RULE__BASE_NAMESPACE, oldBase_Namespace, base_Namespace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification getBase_ValueSpecification() {
		if (base_ValueSpecification != null && base_ValueSpecification.eIsProxy()) {
			InternalEObject oldBase_ValueSpecification = (InternalEObject)base_ValueSpecification;
			base_ValueSpecification = (ValueSpecification)eResolveProxy(oldBase_ValueSpecification);
			if (base_ValueSpecification != oldBase_ValueSpecification) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.CODING_RULE__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
			}
		}
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ValueSpecification basicGetBase_ValueSpecification() {
		return base_ValueSpecification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_ValueSpecification(ValueSpecification newBase_ValueSpecification) {
		ValueSpecification oldBase_ValueSpecification = base_ValueSpecification;
		base_ValueSpecification = newBase_ValueSpecification;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.CODING_RULE__BASE_VALUE_SPECIFICATION, oldBase_ValueSpecification, base_ValueSpecification));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property getBase_Property() {
		if (base_Property != null && base_Property.eIsProxy()) {
			InternalEObject oldBase_Property = (InternalEObject)base_Property;
			base_Property = (Property)eResolveProxy(oldBase_Property);
			if (base_Property != oldBase_Property) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, UTPPackage.CODING_RULE__BASE_PROPERTY, oldBase_Property, base_Property));
			}
		}
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Property basicGetBase_Property() {
		return base_Property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBase_Property(Property newBase_Property) {
		Property oldBase_Property = base_Property;
		base_Property = newBase_Property;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, UTPPackage.CODING_RULE__BASE_PROPERTY, oldBase_Property, base_Property));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case UTPPackage.CODING_RULE__CODING:
				return getCoding();
			case UTPPackage.CODING_RULE__BASE_NAMESPACE:
				if (resolve) return getBase_Namespace();
				return basicGetBase_Namespace();
			case UTPPackage.CODING_RULE__BASE_VALUE_SPECIFICATION:
				if (resolve) return getBase_ValueSpecification();
				return basicGetBase_ValueSpecification();
			case UTPPackage.CODING_RULE__BASE_PROPERTY:
				if (resolve) return getBase_Property();
				return basicGetBase_Property();
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
			case UTPPackage.CODING_RULE__CODING:
				setCoding((String)newValue);
				return;
			case UTPPackage.CODING_RULE__BASE_NAMESPACE:
				setBase_Namespace((Namespace)newValue);
				return;
			case UTPPackage.CODING_RULE__BASE_VALUE_SPECIFICATION:
				setBase_ValueSpecification((ValueSpecification)newValue);
				return;
			case UTPPackage.CODING_RULE__BASE_PROPERTY:
				setBase_Property((Property)newValue);
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
			case UTPPackage.CODING_RULE__CODING:
				setCoding(CODING_EDEFAULT);
				return;
			case UTPPackage.CODING_RULE__BASE_NAMESPACE:
				setBase_Namespace((Namespace)null);
				return;
			case UTPPackage.CODING_RULE__BASE_VALUE_SPECIFICATION:
				setBase_ValueSpecification((ValueSpecification)null);
				return;
			case UTPPackage.CODING_RULE__BASE_PROPERTY:
				setBase_Property((Property)null);
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
			case UTPPackage.CODING_RULE__CODING:
				return CODING_EDEFAULT == null ? coding != null : !CODING_EDEFAULT.equals(coding);
			case UTPPackage.CODING_RULE__BASE_NAMESPACE:
				return base_Namespace != null;
			case UTPPackage.CODING_RULE__BASE_VALUE_SPECIFICATION:
				return base_ValueSpecification != null;
			case UTPPackage.CODING_RULE__BASE_PROPERTY:
				return base_Property != null;
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
		result.append(" (coding: ");
		result.append(coding);
		result.append(')');
		return result.toString();
	}

	/**
	 * Creates a new instance of the specified Ecore class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param eClass The Ecore class of the instance to create.
	 * @return The new instance.
	 * @generated
	 */
	protected EObject create(EClass eClass) {
		return EcoreUtil.create(eClass);
	}

	/**
	 * Retrieves the cache adapter for this '<em><b>Coding Rule</b></em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return The cache adapter for this '<em><b>Coding Rule</b></em>'.
	 * @generated
	 */
	protected CacheAdapter getCacheAdapter() {
		return CacheAdapter.getCacheAdapter(this);
	}

} //CodingRuleImpl
