/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Undirected Edge Declaration</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getFirstNode <em>First Node</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getUndirectedEdge <em>Undirected Edge</em>}</li>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getSecondNode <em>Second Node</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage#getUndirectedEdgeDeclaration()
 * @model
 * @generated
 */
public interface UndirectedEdgeDeclaration extends UndirectedStatement
{
  /**
   * Returns the value of the '<em><b>First Node</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>First Node</em>' reference.
   * @see #setFirstNode(NodeId)
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage#getUndirectedEdgeDeclaration_FirstNode()
   * @model
   * @generated
   */
  NodeId getFirstNode();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getFirstNode <em>First Node</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>First Node</em>' reference.
   * @see #getFirstNode()
   * @generated
   */
  void setFirstNode(NodeId value);

  /**
   * Returns the value of the '<em><b>Undirected Edge</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Undirected Edge</em>' attribute.
   * @see #setUndirectedEdge(String)
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage#getUndirectedEdgeDeclaration_UndirectedEdge()
   * @model
   * @generated
   */
  String getUndirectedEdge();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getUndirectedEdge <em>Undirected Edge</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Undirected Edge</em>' attribute.
   * @see #getUndirectedEdge()
   * @generated
   */
  void setUndirectedEdge(String value);

  /**
   * Returns the value of the '<em><b>Second Node</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Second Node</em>' containment reference.
   * @see #setSecondNode(RightEdgeDeclaration)
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage#getUndirectedEdgeDeclaration_SecondNode()
   * @model containment="true"
   * @generated
   */
  RightEdgeDeclaration getSecondNode();

  /**
   * Sets the value of the '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration#getSecondNode <em>Second Node</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Second Node</em>' containment reference.
   * @see #getSecondNode()
   * @generated
   */
  void setSecondNode(RightEdgeDeclaration value);

} // UndirectedEdgeDeclaration
