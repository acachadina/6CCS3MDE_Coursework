/**
 * generated by Xtext 2.25.0
 */
package uk.ac.kcl.inf.dotLanguage.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import uk.ac.kcl.inf.dotLanguage.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see uk.ac.kcl.inf.dotLanguage.DotLanguagePackage
 * @generated
 */
public class DotLanguageAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static DotLanguagePackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DotLanguageAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = DotLanguagePackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DotLanguageSwitch<Adapter> modelSwitch =
    new DotLanguageSwitch<Adapter>()
    {
      @Override
      public Adapter caseDotLanguage(DotLanguage object)
      {
        return createDotLanguageAdapter();
      }
      @Override
      public Adapter caseGraph(Graph object)
      {
        return createGraphAdapter();
      }
      @Override
      public Adapter caseDigraph(Digraph object)
      {
        return createDigraphAdapter();
      }
      @Override
      public Adapter caseDirectedStatement(DirectedStatement object)
      {
        return createDirectedStatementAdapter();
      }
      @Override
      public Adapter caseUndirectedStatement(UndirectedStatement object)
      {
        return createUndirectedStatementAdapter();
      }
      @Override
      public Adapter caseNodeDeclaration(NodeDeclaration object)
      {
        return createNodeDeclarationAdapter();
      }
      @Override
      public Adapter caseNodeId(NodeId object)
      {
        return createNodeIdAdapter();
      }
      @Override
      public Adapter caseAttributeList(AttributeList object)
      {
        return createAttributeListAdapter();
      }
      @Override
      public Adapter caseAttribute(Attribute object)
      {
        return createAttributeAdapter();
      }
      @Override
      public Adapter caseDirectedEdgeDeclaration(DirectedEdgeDeclaration object)
      {
        return createDirectedEdgeDeclarationAdapter();
      }
      @Override
      public Adapter caseUndirectedEdgeDeclaration(UndirectedEdgeDeclaration object)
      {
        return createUndirectedEdgeDeclarationAdapter();
      }
      @Override
      public Adapter caseRightEdgeDeclaration(RightEdgeDeclaration object)
      {
        return createRightEdgeDeclarationAdapter();
      }
      @Override
      public Adapter caseNodeList(NodeList object)
      {
        return createNodeListAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.DotLanguage <em>Dot Language</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.DotLanguage
   * @generated
   */
  public Adapter createDotLanguageAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.Graph <em>Graph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.Graph
   * @generated
   */
  public Adapter createGraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.Digraph <em>Digraph</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.Digraph
   * @generated
   */
  public Adapter createDigraphAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.DirectedStatement <em>Directed Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.DirectedStatement
   * @generated
   */
  public Adapter createDirectedStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.UndirectedStatement <em>Undirected Statement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.UndirectedStatement
   * @generated
   */
  public Adapter createUndirectedStatementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.NodeDeclaration <em>Node Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.NodeDeclaration
   * @generated
   */
  public Adapter createNodeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.NodeId <em>Node Id</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.NodeId
   * @generated
   */
  public Adapter createNodeIdAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.AttributeList <em>Attribute List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.AttributeList
   * @generated
   */
  public Adapter createAttributeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.Attribute <em>Attribute</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.Attribute
   * @generated
   */
  public Adapter createAttributeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration <em>Directed Edge Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration
   * @generated
   */
  public Adapter createDirectedEdgeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration <em>Undirected Edge Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration
   * @generated
   */
  public Adapter createUndirectedEdgeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration <em>Right Edge Declaration</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration
   * @generated
   */
  public Adapter createRightEdgeDeclarationAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link uk.ac.kcl.inf.dotLanguage.NodeList <em>Node List</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see uk.ac.kcl.inf.dotLanguage.NodeList
   * @generated
   */
  public Adapter createNodeListAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //DotLanguageAdapterFactory
