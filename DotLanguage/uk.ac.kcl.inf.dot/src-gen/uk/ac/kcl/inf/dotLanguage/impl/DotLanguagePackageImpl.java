/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import uk.ac.kcl.inf.dotLanguage.Attribute;
import uk.ac.kcl.inf.dotLanguage.AttributeList;
import uk.ac.kcl.inf.dotLanguage.Digraph;
import uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.DirectedStatement;
import uk.ac.kcl.inf.dotLanguage.DotLanguage;
import uk.ac.kcl.inf.dotLanguage.DotLanguageFactory;
import uk.ac.kcl.inf.dotLanguage.DotLanguagePackage;
import uk.ac.kcl.inf.dotLanguage.Graph;
import uk.ac.kcl.inf.dotLanguage.NodeDeclaration;
import uk.ac.kcl.inf.dotLanguage.NodeId;
import uk.ac.kcl.inf.dotLanguage.NodeList;
import uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.UndirectedStatement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DotLanguagePackageImpl extends EPackageImpl implements DotLanguagePackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass dotLanguageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass graphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass digraphEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directedStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass undirectedStatementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeIdEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeListEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass attributeEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass directedEdgeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass undirectedEdgeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rightEdgeDeclarationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass nodeListEClass = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage#eNS_URI
   * @see #init()
   * @generated
   */
  private DotLanguagePackageImpl()
  {
    super(eNS_URI, DotLanguageFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   *
   * <p>This method is used to initialize {@link DotLanguagePackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static DotLanguagePackage init()
  {
    if (isInited) return (DotLanguagePackage)EPackage.Registry.INSTANCE.getEPackage(DotLanguagePackage.eNS_URI);

    // Obtain or create and register package
    Object registeredDotLanguagePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
    DotLanguagePackageImpl theDotLanguagePackage = registeredDotLanguagePackage instanceof DotLanguagePackageImpl ? (DotLanguagePackageImpl)registeredDotLanguagePackage : new DotLanguagePackageImpl();

    isInited = true;

    // Create package meta-data objects
    theDotLanguagePackage.createPackageContents();

    // Initialize created meta-data
    theDotLanguagePackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theDotLanguagePackage.freeze();

    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(DotLanguagePackage.eNS_URI, theDotLanguagePackage);
    return theDotLanguagePackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDotLanguage()
  {
    return dotLanguageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDotLanguage_Graphs()
  {
    return (EReference)dotLanguageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getGraph()
  {
    return graphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getGraph_Name()
  {
    return (EAttribute)graphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getGraph_Statements()
  {
    return (EReference)graphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDigraph()
  {
    return digraphEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDigraph_Name()
  {
    return (EAttribute)digraphEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDigraph_Statements()
  {
    return (EReference)digraphEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDirectedStatement()
  {
    return directedStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUndirectedStatement()
  {
    return undirectedStatementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNodeDeclaration()
  {
    return nodeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodeDeclaration_NodeName()
  {
    return (EReference)nodeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodeDeclaration_OptionalAttributes()
  {
    return (EReference)nodeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNodeId()
  {
    return nodeIdEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getNodeId_Name()
  {
    return (EAttribute)nodeIdEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttributeList()
  {
    return attributeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getAttributeList_Attr()
  {
    return (EReference)attributeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getAttribute()
  {
    return attributeEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_AttributeName()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getAttribute_AttributeValue()
  {
    return (EAttribute)attributeEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getDirectedEdgeDeclaration()
  {
    return directedEdgeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDirectedEdgeDeclaration_FirstNode()
  {
    return (EReference)directedEdgeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getDirectedEdgeDeclaration_Edge()
  {
    return (EAttribute)directedEdgeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getDirectedEdgeDeclaration_SecondNode()
  {
    return (EReference)directedEdgeDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getUndirectedEdgeDeclaration()
  {
    return undirectedEdgeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUndirectedEdgeDeclaration_FirstNode()
  {
    return (EReference)undirectedEdgeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EAttribute getUndirectedEdgeDeclaration_Edge()
  {
    return (EAttribute)undirectedEdgeDeclarationEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getUndirectedEdgeDeclaration_SecondNode()
  {
    return (EReference)undirectedEdgeDeclarationEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getRightEdgeDeclaration()
  {
    return rightEdgeDeclarationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getRightEdgeDeclaration_SecondNode()
  {
    return (EReference)rightEdgeDeclarationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EClass getNodeList()
  {
    return nodeListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EReference getNodeList_Nodes()
  {
    return (EReference)nodeListEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public DotLanguageFactory getDotLanguageFactory()
  {
    return (DotLanguageFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    dotLanguageEClass = createEClass(DOT_LANGUAGE);
    createEReference(dotLanguageEClass, DOT_LANGUAGE__GRAPHS);

    graphEClass = createEClass(GRAPH);
    createEAttribute(graphEClass, GRAPH__NAME);
    createEReference(graphEClass, GRAPH__STATEMENTS);

    digraphEClass = createEClass(DIGRAPH);
    createEAttribute(digraphEClass, DIGRAPH__NAME);
    createEReference(digraphEClass, DIGRAPH__STATEMENTS);

    directedStatementEClass = createEClass(DIRECTED_STATEMENT);

    undirectedStatementEClass = createEClass(UNDIRECTED_STATEMENT);

    nodeDeclarationEClass = createEClass(NODE_DECLARATION);
    createEReference(nodeDeclarationEClass, NODE_DECLARATION__NODE_NAME);
    createEReference(nodeDeclarationEClass, NODE_DECLARATION__OPTIONAL_ATTRIBUTES);

    nodeIdEClass = createEClass(NODE_ID);
    createEAttribute(nodeIdEClass, NODE_ID__NAME);

    attributeListEClass = createEClass(ATTRIBUTE_LIST);
    createEReference(attributeListEClass, ATTRIBUTE_LIST__ATTR);

    attributeEClass = createEClass(ATTRIBUTE);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_NAME);
    createEAttribute(attributeEClass, ATTRIBUTE__ATTRIBUTE_VALUE);

    directedEdgeDeclarationEClass = createEClass(DIRECTED_EDGE_DECLARATION);
    createEReference(directedEdgeDeclarationEClass, DIRECTED_EDGE_DECLARATION__FIRST_NODE);
    createEAttribute(directedEdgeDeclarationEClass, DIRECTED_EDGE_DECLARATION__EDGE);
    createEReference(directedEdgeDeclarationEClass, DIRECTED_EDGE_DECLARATION__SECOND_NODE);

    undirectedEdgeDeclarationEClass = createEClass(UNDIRECTED_EDGE_DECLARATION);
    createEReference(undirectedEdgeDeclarationEClass, UNDIRECTED_EDGE_DECLARATION__FIRST_NODE);
    createEAttribute(undirectedEdgeDeclarationEClass, UNDIRECTED_EDGE_DECLARATION__EDGE);
    createEReference(undirectedEdgeDeclarationEClass, UNDIRECTED_EDGE_DECLARATION__SECOND_NODE);

    rightEdgeDeclarationEClass = createEClass(RIGHT_EDGE_DECLARATION);
    createEReference(rightEdgeDeclarationEClass, RIGHT_EDGE_DECLARATION__SECOND_NODE);

    nodeListEClass = createEClass(NODE_LIST);
    createEReference(nodeListEClass, NODE_LIST__NODES);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    nodeDeclarationEClass.getESuperTypes().add(this.getDirectedStatement());
    nodeDeclarationEClass.getESuperTypes().add(this.getUndirectedStatement());
    directedEdgeDeclarationEClass.getESuperTypes().add(this.getDirectedStatement());
    undirectedEdgeDeclarationEClass.getESuperTypes().add(this.getUndirectedStatement());
    nodeListEClass.getESuperTypes().add(this.getRightEdgeDeclaration());

    // Initialize classes and features; add operations and parameters
    initEClass(dotLanguageEClass, DotLanguage.class, "DotLanguage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDotLanguage_Graphs(), ecorePackage.getEObject(), null, "graphs", null, 0, -1, DotLanguage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(graphEClass, Graph.class, "Graph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGraph_Statements(), this.getUndirectedStatement(), null, "statements", null, 0, -1, Graph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(digraphEClass, Digraph.class, "Digraph", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDigraph_Name(), ecorePackage.getEString(), "name", null, 0, 1, Digraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDigraph_Statements(), this.getDirectedStatement(), null, "statements", null, 0, -1, Digraph.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directedStatementEClass, DirectedStatement.class, "DirectedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(undirectedStatementEClass, UndirectedStatement.class, "UndirectedStatement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(nodeDeclarationEClass, NodeDeclaration.class, "NodeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeDeclaration_NodeName(), this.getNodeId(), null, "nodeName", null, 0, 1, NodeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getNodeDeclaration_OptionalAttributes(), this.getAttributeList(), null, "optionalAttributes", null, 0, 1, NodeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeIdEClass, NodeId.class, "NodeId", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getNodeId_Name(), ecorePackage.getEString(), "name", null, 0, 1, NodeId.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeListEClass, AttributeList.class, "AttributeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getAttributeList_Attr(), this.getAttribute(), null, "attr", null, 0, -1, AttributeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAttribute_AttributeName(), ecorePackage.getEString(), "attributeName", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getAttribute_AttributeValue(), ecorePackage.getEString(), "attributeValue", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(directedEdgeDeclarationEClass, DirectedEdgeDeclaration.class, "DirectedEdgeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getDirectedEdgeDeclaration_FirstNode(), this.getNodeId(), null, "firstNode", null, 0, 1, DirectedEdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getDirectedEdgeDeclaration_Edge(), ecorePackage.getEString(), "edge", null, 0, 1, DirectedEdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDirectedEdgeDeclaration_SecondNode(), this.getRightEdgeDeclaration(), null, "secondNode", null, 0, 1, DirectedEdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(undirectedEdgeDeclarationEClass, UndirectedEdgeDeclaration.class, "UndirectedEdgeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getUndirectedEdgeDeclaration_FirstNode(), this.getNodeId(), null, "firstNode", null, 0, 1, UndirectedEdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getUndirectedEdgeDeclaration_Edge(), ecorePackage.getEString(), "edge", null, 0, 1, UndirectedEdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getUndirectedEdgeDeclaration_SecondNode(), this.getRightEdgeDeclaration(), null, "secondNode", null, 0, 1, UndirectedEdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rightEdgeDeclarationEClass, RightEdgeDeclaration.class, "RightEdgeDeclaration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRightEdgeDeclaration_SecondNode(), this.getNodeId(), null, "secondNode", null, 0, 1, RightEdgeDeclaration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(nodeListEClass, NodeList.class, "NodeList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getNodeList_Nodes(), this.getNodeId(), null, "nodes", null, 0, -1, NodeList.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);
  }

} //DotLanguagePackageImpl
