/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage
 * @generated
 */
public interface DotLanguageFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  DotLanguageFactory eINSTANCE = uk.ac.kcl.inf.dotLanguage.impl.DotLanguageFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Dot Language</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Dot Language</em>'.
   * @generated
   */
  DotLanguage createDotLanguage();

  /**
   * Returns a new object of class '<em>Graph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Graph</em>'.
   * @generated
   */
  Graph createGraph();

  /**
   * Returns a new object of class '<em>Digraph</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Digraph</em>'.
   * @generated
   */
  Digraph createDigraph();

  /**
   * Returns a new object of class '<em>Directed Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directed Statement</em>'.
   * @generated
   */
  DirectedStatement createDirectedStatement();

  /**
   * Returns a new object of class '<em>Undirected Statement</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Undirected Statement</em>'.
   * @generated
   */
  UndirectedStatement createUndirectedStatement();

  /**
   * Returns a new object of class '<em>Node Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Declaration</em>'.
   * @generated
   */
  NodeDeclaration createNodeDeclaration();

  /**
   * Returns a new object of class '<em>Node Id</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Node Id</em>'.
   * @generated
   */
  NodeId createNodeId();

  /**
   * Returns a new object of class '<em>Attribute List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute List</em>'.
   * @generated
   */
  AttributeList createAttributeList();

  /**
   * Returns a new object of class '<em>Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Attribute</em>'.
   * @generated
   */
  Attribute createAttribute();

  /**
   * Returns a new object of class '<em>Label Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Label Attribute</em>'.
   * @generated
   */
  LabelAttribute createLabelAttribute();

  /**
   * Returns a new object of class '<em>Color Attribute</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Color Attribute</em>'.
   * @generated
   */
  ColorAttribute createColorAttribute();

  /**
   * Returns a new object of class '<em>Directed Edge Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Directed Edge Declaration</em>'.
   * @generated
   */
  DirectedEdgeDeclaration createDirectedEdgeDeclaration();

  /**
   * Returns a new object of class '<em>Undirected Edge Declaration</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Undirected Edge Declaration</em>'.
   * @generated
   */
  UndirectedEdgeDeclaration createUndirectedEdgeDeclaration();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  DotLanguagePackage getDotLanguagePackage();

} //DotLanguageFactory
