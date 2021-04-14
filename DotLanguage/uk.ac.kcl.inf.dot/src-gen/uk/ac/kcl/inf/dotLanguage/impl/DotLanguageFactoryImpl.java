/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import uk.ac.kcl.inf.dotLanguage.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotLanguageFactoryImpl extends EFactoryImpl implements DotLanguageFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static DotLanguageFactory init()
  {
    try
    {
      DotLanguageFactory theDotLanguageFactory = (DotLanguageFactory)EPackage.Registry.INSTANCE.getEFactory(DotLanguagePackage.eNS_URI);
      if (theDotLanguageFactory != null)
      {
        return theDotLanguageFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new DotLanguageFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotLanguageFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case DotLanguagePackage.DOT_LANGUAGE: return createDotLanguage();
      case DotLanguagePackage.GRAPH: return createGraph();
      case DotLanguagePackage.DIGRAPH: return createDigraph();
      case DotLanguagePackage.DIRECTED_STATEMENT: return createDirectedStatement();
      case DotLanguagePackage.UNDIRECTED_STATEMENT: return createUndirectedStatement();
      case DotLanguagePackage.NODE_DECLARATION: return createNodeDeclaration();
      case DotLanguagePackage.NODE_ID: return createNodeId();
      case DotLanguagePackage.ATTRIBUTE_LIST: return createAttributeList();
      case DotLanguagePackage.ATTRIBUTE: return createAttribute();
      case DotLanguagePackage.DIRECTED_EDGE_DECLARATION: return createDirectedEdgeDeclaration();
      case DotLanguagePackage.UNDIRECTED_EDGE_DECLARATION: return createUndirectedEdgeDeclaration();
      case DotLanguagePackage.RIGHT_EDGE_DECLARATION: return createRightEdgeDeclaration();
      case DotLanguagePackage.NODE_LIST: return createNodeList();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object createFromString(EDataType eDataType, String initialValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DotLanguagePackage.COLOR:
        return createColorFromString(eDataType, initialValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String convertToString(EDataType eDataType, Object instanceValue)
  {
    switch (eDataType.getClassifierID())
    {
      case DotLanguagePackage.COLOR:
        return convertColorToString(eDataType, instanceValue);
      default:
        throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DotLanguage createDotLanguage()
  {
    DotLanguageImpl dotLanguage = new DotLanguageImpl();
    return dotLanguage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Graph createGraph()
  {
    GraphImpl graph = new GraphImpl();
    return graph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Digraph createDigraph()
  {
    DigraphImpl digraph = new DigraphImpl();
    return digraph;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DirectedStatement createDirectedStatement()
  {
    DirectedStatementImpl directedStatement = new DirectedStatementImpl();
    return directedStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UndirectedStatement createUndirectedStatement()
  {
    UndirectedStatementImpl undirectedStatement = new UndirectedStatementImpl();
    return undirectedStatement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeDeclaration createNodeDeclaration()
  {
    NodeDeclarationImpl nodeDeclaration = new NodeDeclarationImpl();
    return nodeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeId createNodeId()
  {
    NodeIdImpl nodeId = new NodeIdImpl();
    return nodeId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public AttributeList createAttributeList()
  {
    AttributeListImpl attributeList = new AttributeListImpl();
    return attributeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Attribute createAttribute()
  {
    AttributeImpl attribute = new AttributeImpl();
    return attribute;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DirectedEdgeDeclaration createDirectedEdgeDeclaration()
  {
    DirectedEdgeDeclarationImpl directedEdgeDeclaration = new DirectedEdgeDeclarationImpl();
    return directedEdgeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public UndirectedEdgeDeclaration createUndirectedEdgeDeclaration()
  {
    UndirectedEdgeDeclarationImpl undirectedEdgeDeclaration = new UndirectedEdgeDeclarationImpl();
    return undirectedEdgeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public RightEdgeDeclaration createRightEdgeDeclaration()
  {
    RightEdgeDeclarationImpl rightEdgeDeclaration = new RightEdgeDeclarationImpl();
    return rightEdgeDeclaration;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NodeList createNodeList()
  {
    NodeListImpl nodeList = new NodeListImpl();
    return nodeList;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Color createColorFromString(EDataType eDataType, String initialValue)
  {
    Color result = Color.get(initialValue);
    if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
    return result;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String convertColorToString(EDataType eDataType, Object instanceValue)
  {
    return instanceValue == null ? null : instanceValue.toString();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DotLanguagePackage getDotLanguagePackage()
  {
    return (DotLanguagePackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static DotLanguagePackage getPackage()
  {
    return DotLanguagePackage.eINSTANCE;
  }

} //DotLanguageFactoryImpl
