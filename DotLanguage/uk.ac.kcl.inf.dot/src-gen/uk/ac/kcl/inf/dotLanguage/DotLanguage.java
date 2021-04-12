/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.dotLanguage;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dot Language</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link uk.ac.kcl.inf.dotLanguage.DotLanguage#getGraphs <em>Graphs</em>}</li>
 * </ul>
 *
 * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage#getDotLanguage()
 * @model
 * @generated
 */
public interface DotLanguage extends EObject
{
  /**
   * Returns the value of the '<em><b>Graphs</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Graphs</em>' containment reference list.
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage#getDotLanguage_Graphs()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getGraphs();

} // DotLanguage