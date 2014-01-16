/**
 * Copyright (c) 2014 Fraunhofer FOKUS
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 * Max Bureck
 * Marc-Florian Wendland
 */
package org.eclipse.upr.depl.target;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Shared Resource</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * The SharedResources stereotype extends the UML 2.0 Class metaclass (from UML2.0::Kernel). It is a specialization of
 * the Resource stereotype.
 * Shared resources are resources that are shared between nodes. They are semantically equivalent to “normal” resources;
 * however, the planner must make sure that a shared resource is not exhausted by using it from multiple nodes in parallel.
 * 
 * Constraints:
 * • The name of the SharedResource must be unique within the domain.
 * • A SharedResource is a type of Resource that can only be associated with Nodes.
 * A SharedRsource can only be associated with Nodes, not Interconnect
 * The name of the SharedResource must be unique within the domain.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.upr.depl.target.SharedResource#getResourceUser <em>Resource User</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.upr.depl.target.TargetPackage#getSharedResource()
 * @model
 * @generated
 */
public interface SharedResource extends Resource {
	/**
	 * Returns the value of the '<em><b>Resource User</b></em>' reference list.
	 * The list contents are of type {@link org.eclipse.upr.depl.target.Node}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.upr.depl.target.Node#getAvailableSharedResource <em>Available Shared Resource</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Set of nodes that have access to the SharedResource.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Resource User</em>' reference list.
	 * @see org.eclipse.upr.depl.target.TargetPackage#getSharedResource_ResourceUser()
	 * @see org.eclipse.upr.depl.target.Node#getAvailableSharedResource
	 * @model opposite="availableSharedResource" ordered="false"
	 *        annotation="http://www.eclipse.org/emf/2002/GenModel get='throw new UnsupportedOperationException();  // FIXME Unimplemented http://www.omg.org/spec/DEPL/4.0/profile/target/1.0!SharedResource!resourceUser'"
	 * @generated
	 */
	EList<Node> getResourceUser();

} // SharedResource
