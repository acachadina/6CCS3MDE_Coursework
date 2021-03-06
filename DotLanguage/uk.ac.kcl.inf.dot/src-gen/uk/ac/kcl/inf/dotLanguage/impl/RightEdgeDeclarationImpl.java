/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.dotLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import uk.ac.kcl.inf.dotLanguage.DotLanguagePackage;
import uk.ac.kcl.inf.dotLanguage.NodeId;
import uk.ac.kcl.inf.dotLanguage.NodeList;
import uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Right Edge Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.RightEdgeDeclarationImpl#getSecondNode <em>Second Node</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.RightEdgeDeclarationImpl#getNodeList <em>Node List</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RightEdgeDeclarationImpl extends MinimalEObjectImpl.Container implements RightEdgeDeclaration
{
  /**
   * The cached value of the '{@link #getSecondNode() <em>Second Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondNode()
   * @generated
   * @ordered
   */
  protected NodeId secondNode;

  /**
   * The cached value of the '{@link #getNodeList() <em>Node List</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeList()
   * @generated
   * @ordered
   */
  protected NodeList nodeList;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RightEdgeDeclarationImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DotLanguagePackage.Literals.RIGHT_EDGE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeId getSecondNode()
  {
    if (secondNode != null && secondNode.eIsProxy())
    {
      InternalEObject oldSecondNode = (InternalEObject)secondNode;
      secondNode = (NodeId)eResolveProxy(oldSecondNode);
      if (secondNode != oldSecondNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DotLanguagePackage.RIGHT_EDGE_DECLARATION__SECOND_NODE, oldSecondNode, secondNode));
      }
    }
    return secondNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeId basicGetSecondNode()
  {
    return secondNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setSecondNode(NodeId newSecondNode)
  {
    NodeId oldSecondNode = secondNode;
    secondNode = newSecondNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.RIGHT_EDGE_DECLARATION__SECOND_NODE, oldSecondNode, secondNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeList getNodeList()
  {
    return nodeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeList(NodeList newNodeList, NotificationChain msgs)
  {
    NodeList oldNodeList = nodeList;
    nodeList = newNodeList;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST, oldNodeList, newNodeList);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setNodeList(NodeList newNodeList)
  {
    if (newNodeList != nodeList)
    {
      NotificationChain msgs = null;
      if (nodeList != null)
        msgs = ((InternalEObject)nodeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST, null, msgs);
      if (newNodeList != null)
        msgs = ((InternalEObject)newNodeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST, null, msgs);
      msgs = basicSetNodeList(newNodeList, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST, newNodeList, newNodeList));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST:
        return basicSetNodeList(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__SECOND_NODE:
        if (resolve) return getSecondNode();
        return basicGetSecondNode();
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST:
        return getNodeList();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__SECOND_NODE:
        setSecondNode((NodeId)newValue);
        return;
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST:
        setNodeList((NodeList)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__SECOND_NODE:
        setSecondNode((NodeId)null);
        return;
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST:
        setNodeList((NodeList)null);
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__SECOND_NODE:
        return secondNode != null;
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION__NODE_LIST:
        return nodeList != null;
    }
    return super.eIsSet(featureID);
  }

} //RightEdgeDeclarationImpl
