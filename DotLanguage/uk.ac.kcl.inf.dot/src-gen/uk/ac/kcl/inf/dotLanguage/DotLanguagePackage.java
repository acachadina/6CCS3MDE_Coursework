/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.dotLanguage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.dotLanguage.DotLanguageFactory
 * @model kind="package"
 * @generated
 */
public interface DotLanguagePackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "dotLanguage";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.ac.uk/kcl/inf/DotLanguage";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "dotLanguage";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DotLanguagePackage eINSTANCE = uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl.init();

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DotLanguageImpl <em>Dot Language</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguageImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDotLanguage()
   * @generated
   */
  int DOT_LANGUAGE = 0;

  /**
   * The feature id for the '<em><b>Graphs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_LANGUAGE__GRAPHS = 0;

  /**
   * The number of structural features of the '<em>Dot Language</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOT_LANGUAGE_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.GraphImpl <em>Graph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.GraphImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getGraph()
   * @generated
   */
  int GRAPH = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__NAME = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Graph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GRAPH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DigraphImpl <em>Digraph</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.DigraphImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDigraph()
   * @generated
   */
  int DIGRAPH = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGRAPH__NAME = 0;

  /**
   * The feature id for the '<em><b>Statements</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGRAPH__STATEMENTS = 1;

  /**
   * The number of structural features of the '<em>Digraph</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIGRAPH_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DirectedStatementImpl <em>Directed Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.DirectedStatementImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDirectedStatement()
   * @generated
   */
  int DIRECTED_STATEMENT = 3;

  /**
   * The number of structural features of the '<em>Directed Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.UndirectedStatementImpl <em>Undirected Statement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.UndirectedStatementImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getUndirectedStatement()
   * @generated
   */
  int UNDIRECTED_STATEMENT = 4;

  /**
   * The number of structural features of the '<em>Undirected Statement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_STATEMENT_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.NodeDeclarationImpl <em>Node Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.NodeDeclarationImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getNodeDeclaration()
   * @generated
   */
  int NODE_DECLARATION = 5;

  /**
   * The feature id for the '<em><b>Node Name</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DECLARATION__NODE_NAME = DIRECTED_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Optional Attributes</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DECLARATION__OPTIONAL_ATTRIBUTES = DIRECTED_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Node Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_DECLARATION_FEATURE_COUNT = DIRECTED_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.NodeIdImpl <em>Node Id</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.NodeIdImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getNodeId()
   * @generated
   */
  int NODE_ID = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID__NAME = 0;

  /**
   * The number of structural features of the '<em>Node Id</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_ID_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.AttributeListImpl <em>Attribute List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.AttributeListImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getAttributeList()
   * @generated
   */
  int ATTRIBUTE_LIST = 7;

  /**
   * The feature id for the '<em><b>Attr</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST__ATTR = 0;

  /**
   * The number of structural features of the '<em>Attribute List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_LIST_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.AttributeImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getAttribute()
   * @generated
   */
  int ATTRIBUTE = 8;

  /**
   * The feature id for the '<em><b>Attribute Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_NAME = 0;

  /**
   * The feature id for the '<em><b>Attribute Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE__ATTRIBUTE_VALUE = 1;

  /**
   * The number of structural features of the '<em>Attribute</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ATTRIBUTE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DirectedEdgeDeclarationImpl <em>Directed Edge Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.DirectedEdgeDeclarationImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDirectedEdgeDeclaration()
   * @generated
   */
  int DIRECTED_EDGE_DECLARATION = 9;

  /**
   * The feature id for the '<em><b>First Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE_DECLARATION__FIRST_NODE = DIRECTED_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE_DECLARATION__EDGE = DIRECTED_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Second Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE_DECLARATION__SECOND_NODE = DIRECTED_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Directed Edge Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DIRECTED_EDGE_DECLARATION_FEATURE_COUNT = DIRECTED_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.UndirectedEdgeDeclarationImpl <em>Undirected Edge Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.UndirectedEdgeDeclarationImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getUndirectedEdgeDeclaration()
   * @generated
   */
  int UNDIRECTED_EDGE_DECLARATION = 10;

  /**
   * The feature id for the '<em><b>First Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_EDGE_DECLARATION__FIRST_NODE = UNDIRECTED_STATEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_EDGE_DECLARATION__EDGE = UNDIRECTED_STATEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Second Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_EDGE_DECLARATION__SECOND_NODE = UNDIRECTED_STATEMENT_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Undirected Edge Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int UNDIRECTED_EDGE_DECLARATION_FEATURE_COUNT = UNDIRECTED_STATEMENT_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.RightEdgeDeclarationImpl <em>Right Edge Declaration</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.RightEdgeDeclarationImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getRightEdgeDeclaration()
   * @generated
   */
  int RIGHT_EDGE_DECLARATION = 11;

  /**
   * The feature id for the '<em><b>Second Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_EDGE_DECLARATION__SECOND_NODE = 0;

  /**
   * The feature id for the '<em><b>Node List</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_EDGE_DECLARATION__NODE_LIST = 1;

  /**
   * The number of structural features of the '<em>Right Edge Declaration</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RIGHT_EDGE_DECLARATION_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link uk.ac.kcl.inf.dotLanguage.impl.NodeListImpl <em>Node List</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see uk.ac.kcl.inf.dotLanguage.impl.NodeListImpl
   * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getNodeList()
   * @generated
   */
  int NODE_LIST = 12;

  /**
   * The feature id for the '<em><b>Nodes</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LIST__NODES = 0;

  /**
   * The number of structural features of the '<em>Node List</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NODE_LIST_FEATURE_COUNT = 1;


  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.DotLanguage <em>Dot Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Dot Language</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguage
   * @generated
   */
  EClass getDotLanguage();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.dotLanguage.DotLanguage#getGraphs <em>Graphs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Graphs</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguage#getGraphs()
   * @see #getDotLanguage()
   * @generated
   */
  EReference getDotLanguage_Graphs();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Graph</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Graph
   * @generated
   */
  EClass getGraph();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.dotLanguage.Graph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Graph#getName()
   * @see #getGraph()
   * @generated
   */
  EAttribute getGraph_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.dotLanguage.Graph#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Graph#getStatements()
   * @see #getGraph()
   * @generated
   */
  EReference getGraph_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.Digraph <em>Digraph</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Digraph</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Digraph
   * @generated
   */
  EClass getDigraph();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.dotLanguage.Digraph#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Digraph#getName()
   * @see #getDigraph()
   * @generated
   */
  EAttribute getDigraph_Name();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.dotLanguage.Digraph#getStatements <em>Statements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Statements</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Digraph#getStatements()
   * @see #getDigraph()
   * @generated
   */
  EReference getDigraph_Statements();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.DirectedStatement <em>Directed Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directed Statement</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.DirectedStatement
   * @generated
   */
  EClass getDirectedStatement();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.UndirectedStatement <em>Undirected Statement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Undirected Statement</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.UndirectedStatement
   * @generated
   */
  EClass getUndirectedStatement();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.NodeDeclaration <em>Node Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Declaration</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.NodeDeclaration
   * @generated
   */
  EClass getNodeDeclaration();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.dotLanguage.NodeDeclaration#getNodeName <em>Node Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node Name</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.NodeDeclaration#getNodeName()
   * @see #getNodeDeclaration()
   * @generated
   */
  EReference getNodeDeclaration_NodeName();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.dotLanguage.NodeDeclaration#getOptionalAttributes <em>Optional Attributes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Optional Attributes</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.NodeDeclaration#getOptionalAttributes()
   * @see #getNodeDeclaration()
   * @generated
   */
  EReference getNodeDeclaration_OptionalAttributes();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.NodeId <em>Node Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node Id</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.NodeId
   * @generated
   */
  EClass getNodeId();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.dotLanguage.NodeId#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.NodeId#getName()
   * @see #getNodeId()
   * @generated
   */
  EAttribute getNodeId_Name();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute List</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.AttributeList
   * @generated
   */
  EClass getAttributeList();

  /**
   * Returns the meta object for the containment reference list '{@link uk.ac.kcl.inf.dotLanguage.AttributeList#getAttr <em>Attr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Attr</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.AttributeList#getAttr()
   * @see #getAttributeList()
   * @generated
   */
  EReference getAttributeList_Attr();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Attribute</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Attribute
   * @generated
   */
  EClass getAttribute();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.dotLanguage.Attribute#getAttributeName <em>Attribute Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Name</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Attribute#getAttributeName()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeName();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.dotLanguage.Attribute#getAttributeValue <em>Attribute Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Attribute Value</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.Attribute#getAttributeValue()
   * @see #getAttribute()
   * @generated
   */
  EAttribute getAttribute_AttributeValue();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration <em>Directed Edge Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Directed Edge Declaration</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration
   * @generated
   */
  EClass getDirectedEdgeDeclaration();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration#getFirstNode <em>First Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First Node</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration#getFirstNode()
   * @see #getDirectedEdgeDeclaration()
   * @generated
   */
  EReference getDirectedEdgeDeclaration_FirstNode();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration#getEdge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Edge</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration#getEdge()
   * @see #getDirectedEdgeDeclaration()
   * @generated
   */
  EAttribute getDirectedEdgeDeclaration_Edge();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration#getSecondNode <em>Second Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Node</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration#getSecondNode()
   * @see #getDirectedEdgeDeclaration()
   * @generated
   */
  EReference getDirectedEdgeDeclaration_SecondNode();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration <em>Undirected Edge Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Undirected Edge Declaration</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration
   * @generated
   */
  EClass getUndirectedEdgeDeclaration();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getFirstNode <em>First Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>First Node</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getFirstNode()
   * @see #getUndirectedEdgeDeclaration()
   * @generated
   */
  EReference getUndirectedEdgeDeclaration_FirstNode();

  /**
   * Returns the meta object for the attribute '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getEdge <em>Edge</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Edge</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getEdge()
   * @see #getUndirectedEdgeDeclaration()
   * @generated
   */
  EAttribute getUndirectedEdgeDeclaration_Edge();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getSecondNode <em>Second Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Second Node</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getSecondNode()
   * @see #getUndirectedEdgeDeclaration()
   * @generated
   */
  EReference getUndirectedEdgeDeclaration_SecondNode();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration <em>Right Edge Declaration</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Right Edge Declaration</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration
   * @generated
   */
  EClass getRightEdgeDeclaration();

  /**
   * Returns the meta object for the reference '{@link uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration#getSecondNode <em>Second Node</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Second Node</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration#getSecondNode()
   * @see #getRightEdgeDeclaration()
   * @generated
   */
  EReference getRightEdgeDeclaration_SecondNode();

  /**
   * Returns the meta object for the containment reference '{@link uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration#getNodeList <em>Node List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Node List</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration#getNodeList()
   * @see #getRightEdgeDeclaration()
   * @generated
   */
  EReference getRightEdgeDeclaration_NodeList();

  /**
   * Returns the meta object for class '{@link uk.ac.kcl.inf.dotLanguage.NodeList <em>Node List</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Node List</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.NodeList
   * @generated
   */
  EClass getNodeList();

  /**
   * Returns the meta object for the reference list '{@link uk.ac.kcl.inf.dotLanguage.NodeList#getNodes <em>Nodes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Nodes</em>'.
   * @see uk.ac.kcl.inf.dotLanguage.NodeList#getNodes()
   * @see #getNodeList()
   * @generated
   */
  EReference getNodeList_Nodes();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  DotLanguageFactory getDotLanguageFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DotLanguageImpl <em>Dot Language</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguageImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDotLanguage()
     * @generated
     */
    EClass DOT_LANGUAGE = eINSTANCE.getDotLanguage();

    /**
     * The meta object literal for the '<em><b>Graphs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOT_LANGUAGE__GRAPHS = eINSTANCE.getDotLanguage_Graphs();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.GraphImpl <em>Graph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.GraphImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getGraph()
     * @generated
     */
    EClass GRAPH = eINSTANCE.getGraph();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GRAPH__NAME = eINSTANCE.getGraph_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GRAPH__STATEMENTS = eINSTANCE.getGraph_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DigraphImpl <em>Digraph</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.DigraphImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDigraph()
     * @generated
     */
    EClass DIGRAPH = eINSTANCE.getDigraph();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIGRAPH__NAME = eINSTANCE.getDigraph_Name();

    /**
     * The meta object literal for the '<em><b>Statements</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIGRAPH__STATEMENTS = eINSTANCE.getDigraph_Statements();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DirectedStatementImpl <em>Directed Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.DirectedStatementImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDirectedStatement()
     * @generated
     */
    EClass DIRECTED_STATEMENT = eINSTANCE.getDirectedStatement();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.UndirectedStatementImpl <em>Undirected Statement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.UndirectedStatementImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getUndirectedStatement()
     * @generated
     */
    EClass UNDIRECTED_STATEMENT = eINSTANCE.getUndirectedStatement();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.NodeDeclarationImpl <em>Node Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.NodeDeclarationImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getNodeDeclaration()
     * @generated
     */
    EClass NODE_DECLARATION = eINSTANCE.getNodeDeclaration();

    /**
     * The meta object literal for the '<em><b>Node Name</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_DECLARATION__NODE_NAME = eINSTANCE.getNodeDeclaration_NodeName();

    /**
     * The meta object literal for the '<em><b>Optional Attributes</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_DECLARATION__OPTIONAL_ATTRIBUTES = eINSTANCE.getNodeDeclaration_OptionalAttributes();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.NodeIdImpl <em>Node Id</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.NodeIdImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getNodeId()
     * @generated
     */
    EClass NODE_ID = eINSTANCE.getNodeId();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NODE_ID__NAME = eINSTANCE.getNodeId_Name();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.AttributeListImpl <em>Attribute List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.AttributeListImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getAttributeList()
     * @generated
     */
    EClass ATTRIBUTE_LIST = eINSTANCE.getAttributeList();

    /**
     * The meta object literal for the '<em><b>Attr</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ATTRIBUTE_LIST__ATTR = eINSTANCE.getAttributeList_Attr();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.AttributeImpl <em>Attribute</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.AttributeImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getAttribute()
     * @generated
     */
    EClass ATTRIBUTE = eINSTANCE.getAttribute();

    /**
     * The meta object literal for the '<em><b>Attribute Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_NAME = eINSTANCE.getAttribute_AttributeName();

    /**
     * The meta object literal for the '<em><b>Attribute Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ATTRIBUTE__ATTRIBUTE_VALUE = eINSTANCE.getAttribute_AttributeValue();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.DirectedEdgeDeclarationImpl <em>Directed Edge Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.DirectedEdgeDeclarationImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getDirectedEdgeDeclaration()
     * @generated
     */
    EClass DIRECTED_EDGE_DECLARATION = eINSTANCE.getDirectedEdgeDeclaration();

    /**
     * The meta object literal for the '<em><b>First Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_EDGE_DECLARATION__FIRST_NODE = eINSTANCE.getDirectedEdgeDeclaration_FirstNode();

    /**
     * The meta object literal for the '<em><b>Edge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DIRECTED_EDGE_DECLARATION__EDGE = eINSTANCE.getDirectedEdgeDeclaration_Edge();

    /**
     * The meta object literal for the '<em><b>Second Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DIRECTED_EDGE_DECLARATION__SECOND_NODE = eINSTANCE.getDirectedEdgeDeclaration_SecondNode();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.UndirectedEdgeDeclarationImpl <em>Undirected Edge Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.UndirectedEdgeDeclarationImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getUndirectedEdgeDeclaration()
     * @generated
     */
    EClass UNDIRECTED_EDGE_DECLARATION = eINSTANCE.getUndirectedEdgeDeclaration();

    /**
     * The meta object literal for the '<em><b>First Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNDIRECTED_EDGE_DECLARATION__FIRST_NODE = eINSTANCE.getUndirectedEdgeDeclaration_FirstNode();

    /**
     * The meta object literal for the '<em><b>Edge</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute UNDIRECTED_EDGE_DECLARATION__EDGE = eINSTANCE.getUndirectedEdgeDeclaration_Edge();

    /**
     * The meta object literal for the '<em><b>Second Node</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference UNDIRECTED_EDGE_DECLARATION__SECOND_NODE = eINSTANCE.getUndirectedEdgeDeclaration_SecondNode();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.RightEdgeDeclarationImpl <em>Right Edge Declaration</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.RightEdgeDeclarationImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getRightEdgeDeclaration()
     * @generated
     */
    EClass RIGHT_EDGE_DECLARATION = eINSTANCE.getRightEdgeDeclaration();

    /**
     * The meta object literal for the '<em><b>Second Node</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_EDGE_DECLARATION__SECOND_NODE = eINSTANCE.getRightEdgeDeclaration_SecondNode();

    /**
     * The meta object literal for the '<em><b>Node List</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RIGHT_EDGE_DECLARATION__NODE_LIST = eINSTANCE.getRightEdgeDeclaration_NodeList();

    /**
     * The meta object literal for the '{@link uk.ac.kcl.inf.dotLanguage.impl.NodeListImpl <em>Node List</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see uk.ac.kcl.inf.dotLanguage.impl.NodeListImpl
     * @see uk.ac.kcl.inf.dotLanguage.impl.DotLanguagePackageImpl#getNodeList()
     * @generated
     */
    EClass NODE_LIST = eINSTANCE.getNodeList();

    /**
     * The meta object literal for the '<em><b>Nodes</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NODE_LIST__NODES = eINSTANCE.getNodeList_Nodes();

  }

} //DotLanguagePackage
