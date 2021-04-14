/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.DotLanguagePackage;
import uk.ac.kcl.inf.dotLanguage.NodeId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Directed Edge Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.DirectedEdgeDeclarationImpl#getFirstNode <em>First Node</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.DirectedEdgeDeclarationImpl#getDirectedEdge <em>Directed Edge</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.DirectedEdgeDeclarationImpl#getSecondNode <em>Second Node</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DirectedEdgeDeclarationImpl extends DirectedStatementImpl implements DirectedEdgeDeclaration
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
   * The default value of the '{@link #getDirectedEdge() <em>Directed Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectedEdge()
   * @generated
   * @ordered
   */
  protected static final String DIRECTED_EDGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDirectedEdge() <em>Directed Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDirectedEdge()
   * @generated
   * @ordered
   */
  protected String directedEdge = DIRECTED_EDGE_EDEFAULT;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DirectedEdgeDeclarationImpl()
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
    return DotLanguagePackage.Literals.DIRECTED_EDGE_DECLARATION;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DotLanguagePackage.DIRECTED_EDGE_DECLARATION__FIRST_NODE, oldFirstNode, firstNode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.DIRECTED_EDGE_DECLARATION__FIRST_NODE, oldFirstNode, firstNode));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getDirectedEdge()
  {
    return directedEdge;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setDirectedEdge(String newDirectedEdge)
  {
    String oldDirectedEdge = directedEdge;
    directedEdge = newDirectedEdge;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.DIRECTED_EDGE_DECLARATION__DIRECTED_EDGE, oldDirectedEdge, directedEdge));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, DotLanguagePackage.DIRECTED_EDGE_DECLARATION__SECOND_NODE, oldSecondNode, secondNode));
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
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.DIRECTED_EDGE_DECLARATION__SECOND_NODE, oldSecondNode, secondNode));
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
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__FIRST_NODE:
        if (resolve) return getFirstNode();
        return basicGetFirstNode();
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__DIRECTED_EDGE:
        return getDirectedEdge();
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__SECOND_NODE:
        if (resolve) return getSecondNode();
        return basicGetSecondNode();
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
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__FIRST_NODE:
        setFirstNode((NodeId)newValue);
        return;
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__DIRECTED_EDGE:
        setDirectedEdge((String)newValue);
        return;
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__SECOND_NODE:
        setSecondNode((NodeId)newValue);
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
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__FIRST_NODE:
        setFirstNode((NodeId)null);
        return;
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__DIRECTED_EDGE:
        setDirectedEdge(DIRECTED_EDGE_EDEFAULT);
        return;
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__SECOND_NODE:
        setSecondNode((NodeId)null);
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
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__FIRST_NODE:
        return firstNode != null;
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__DIRECTED_EDGE:
        return DIRECTED_EDGE_EDEFAULT == null ? directedEdge != null : !DIRECTED_EDGE_EDEFAULT.equals(directedEdge);
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION__SECOND_NODE:
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
    result.append(" (directedEdge: ");
    result.append(directedEdge);
    result.append(')');
    return result.toString();
  }

} //DirectedEdgeDeclarationImpl
