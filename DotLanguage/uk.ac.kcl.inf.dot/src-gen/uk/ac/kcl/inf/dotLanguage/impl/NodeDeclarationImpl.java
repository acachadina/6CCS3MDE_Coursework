/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import uk.ac.kcl.inf.dotLanguage.AttributeList;
import uk.ac.kcl.inf.dotLanguage.DotLanguagePackage;
import uk.ac.kcl.inf.dotLanguage.NodeDeclaration;
import uk.ac.kcl.inf.dotLanguage.NodeId;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Node Declaration</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.NodeDeclarationImpl#getNodeName <em>Node Name</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.impl.NodeDeclarationImpl#getOptionalAttributes <em>Optional Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class NodeDeclarationImpl extends DirectedStatementImpl implements NodeDeclaration
{
  /**
   * The cached value of the '{@link #getNodeName() <em>Node Name</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNodeName()
   * @generated
   * @ordered
   */
  protected NodeId nodeName;

  /**
   * The cached value of the '{@link #getOptionalAttributes() <em>Optional Attributes</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOptionalAttributes()
   * @generated
   * @ordered
   */
  protected AttributeList optionalAttributes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NodeDeclarationImpl()
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
    return DotLanguagePackage.Literals.NODE_DECLARATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeId getNodeName()
  {
    return nodeName;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetNodeName(NodeId newNodeName, NotificationChain msgs)
  {
    NodeId oldNodeName = nodeName;
    nodeName = newNodeName;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotLanguagePackage.NODE_DECLARATION__NODE_NAME, oldNodeName, newNodeName);
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
  public void setNodeName(NodeId newNodeName)
  {
    if (newNodeName != nodeName)
    {
      NotificationChain msgs = null;
      if (nodeName != null)
        msgs = ((InternalEObject)nodeName).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.NODE_DECLARATION__NODE_NAME, null, msgs);
      if (newNodeName != null)
        msgs = ((InternalEObject)newNodeName).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.NODE_DECLARATION__NODE_NAME, null, msgs);
      msgs = basicSetNodeName(newNodeName, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.NODE_DECLARATION__NODE_NAME, newNodeName, newNodeName));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeList getOptionalAttributes()
  {
    return optionalAttributes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetOptionalAttributes(AttributeList newOptionalAttributes, NotificationChain msgs)
  {
    AttributeList oldOptionalAttributes = optionalAttributes;
    optionalAttributes = newOptionalAttributes;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES, oldOptionalAttributes, newOptionalAttributes);
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
  public void setOptionalAttributes(AttributeList newOptionalAttributes)
  {
    if (newOptionalAttributes != optionalAttributes)
    {
      NotificationChain msgs = null;
      if (optionalAttributes != null)
        msgs = ((InternalEObject)optionalAttributes).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES, null, msgs);
      if (newOptionalAttributes != null)
        msgs = ((InternalEObject)newOptionalAttributes).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES, null, msgs);
      msgs = basicSetOptionalAttributes(newOptionalAttributes, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES, newOptionalAttributes, newOptionalAttributes));
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
      case DotLanguagePackage.NODE_DECLARATION__NODE_NAME:
        return basicSetNodeName(null, msgs);
      case DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES:
        return basicSetOptionalAttributes(null, msgs);
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
      case DotLanguagePackage.NODE_DECLARATION__NODE_NAME:
        return getNodeName();
      case DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES:
        return getOptionalAttributes();
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
      case DotLanguagePackage.NODE_DECLARATION__NODE_NAME:
        setNodeName((NodeId)newValue);
        return;
      case DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES:
        setOptionalAttributes((AttributeList)newValue);
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
      case DotLanguagePackage.NODE_DECLARATION__NODE_NAME:
        setNodeName((NodeId)null);
        return;
      case DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES:
        setOptionalAttributes((AttributeList)null);
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
      case DotLanguagePackage.NODE_DECLARATION__NODE_NAME:
        return nodeName != null;
      case DotLanguagePackage.NODE_DECLARATION__OPTIONAL_ATTRIBUTES:
        return optionalAttributes != null;
    }
    return super.eIsSet(featureID);
  }

} //NodeDeclarationImpl
