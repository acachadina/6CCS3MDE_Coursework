/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.dotLanguage.DotLanguagePackage;
import uk.ac.kcl.inf.dotLanguage.NodeId;
import uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Undirected Edge Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.UndirectedEdgeDeclarationImpl#getFirstNode <em>First Node</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.UndirectedEdgeDeclarationImpl#getUndirectedEdge <em>Undirected Edge</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.UndirectedEdgeDeclarationImpl#getSecondNode <em>Second Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UndirectedEdgeDeclarationImpl extends UndirectedStatementImpl implements UndirectedEdgeDeclaration
{
  /**
   * The cached value of the '{@link #getFirstNode() <em>First Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFirstNode()
   * @generated
   * @ordered
   */
  protected NodeId firstNode;

  /**
   * The default value of the '{@link #getUndirectedEdge() <em>Undirected Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUndirectedEdge()
   * @generated
   * @ordered
   */
  protected static final String UNDIRECTED_EDGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUndirectedEdge() <em>Undirected Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUndirectedEdge()
   * @generated
   * @ordered
   */
  protected String undirectedEdge = UNDIRECTED_EDGE_EDEFAULT;

  /**
   * The cached value of the '{@link #getSecondNode() <em>Second Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSecondNode()
   * @generated
   * @ordered
   */
  protected RightEdgeDeclaration secondNode;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected UndirectedEdgeDeclarationImpl()
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
    return DotLanguagePackage.Literals.UNDIRECTED_EDGE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeId getFirstNode()
  {
    if (firstNode != null && firstNode.eIsProxy())
    {
      InternalEObject oldFirstNode = (InternalEObject)firstNode;
      firstNode = (NodeId)eResolveProxy(oldFirstNode);
      if (firstNode != oldFirstNode)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE, oldFirstNode, firstNode));
      }
    }
    return firstNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NodeId basicGetFirstNode()
  {
    return firstNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFirstNode(NodeId newFirstNode)
  {
    NodeId oldFirstNode = firstNode;
    firstNode = newFirstNode;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE, oldFirstNode, firstNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getUndirectedEdge()
  {
    return undirectedEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setUndirectedEdge(String newUndirectedEdge)
  {
    String oldUndirectedEdge = undirectedEdge;
    undirectedEdge = newUndirectedEdge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__UNDIRECTED_EDGE, oldUndirectedEdge, undirectedEdge));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RightEdgeDeclaration getSecondNode()
  {
    return secondNode;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetSecondNode(RightEdgeDeclaration newSecondNode, NotificationChain msgs)
  {
    RightEdgeDeclaration oldSecondNode = secondNode;
    secondNode = newSecondNode;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE, oldSecondNode, newSecondNode);
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
  public void setSecondNode(RightEdgeDeclaration newSecondNode)
  {
    if (newSecondNode != secondNode)
    {
      NotificationChain msgs = null;
      if (secondNode != null)
        msgs = ((InternalEObject)secondNode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE, null, msgs);
      if (newSecondNode != null)
        msgs = ((InternalEObject)newSecondNode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE, null, msgs);
      msgs = basicSetSecondNode(newSecondNode, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE, newSecondNode, newSecondNode));
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
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE:
        return basicSetSecondNode(null, msgs);
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
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE:
        if (resolve) return getFirstNode();
        return basicGetFirstNode();
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__UNDIRECTED_EDGE:
        return getUndirectedEdge();
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE:
        return getSecondNode();
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
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE:
        setFirstNode((NodeId)newValue);
        return;
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__UNDIRECTED_EDGE:
        setUndirectedEdge((String)newValue);
        return;
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE:
        setSecondNode((RightEdgeDeclaration)newValue);
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
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE:
        setFirstNode((NodeId)null);
        return;
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__UNDIRECTED_EDGE:
        setUndirectedEdge(UNDIRECTED_EDGE_EDEFAULT);
        return;
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE:
        setSecondNode((RightEdgeDeclaration)null);
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
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__FIRST_NODE:
        return firstNode != null;
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__UNDIRECTED_EDGE:
        return UNDIRECTED_EDGE_EDEFAULT == null ? undirectedEdge != null : !UNDIRECTED_EDGE_EDEFAULT.equals(undirectedEdge);
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION__SECOND_NODE:
        return secondNode != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (undirectedEdge: ");
    result.append(undirectedEdge);
    result.append(')');
    return result.toString();
  }

} //UndirectedEdgeDeclarationImpl
