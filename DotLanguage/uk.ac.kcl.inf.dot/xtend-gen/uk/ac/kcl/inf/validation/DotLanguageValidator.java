/**
 * generated by Xtext 2.20.0
 */
package uk.ac.kcl.inf.validation;

import com.google.common.base.Objects;
import com.google.common.collect.Iterables;
import java.util.ArrayList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.CollectionLiterals;
import uk.ac.kcl.inf.dotLanguage.Attribute;
import uk.ac.kcl.inf.dotLanguage.Digraph;
import uk.ac.kcl.inf.dotLanguage.DirectedEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.DirectedStatement;
import uk.ac.kcl.inf.dotLanguage.DotLanguagePackage;
import uk.ac.kcl.inf.dotLanguage.Graph;
import uk.ac.kcl.inf.dotLanguage.NodeDeclaration;
import uk.ac.kcl.inf.dotLanguage.NodeId;
import uk.ac.kcl.inf.dotLanguage.RightEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.UndirectedEdgeDeclaration;
import uk.ac.kcl.inf.dotLanguage.UndirectedStatement;

/**
 * This class contains custom validation rules.
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#validation
 */
@SuppressWarnings("all")
public class DotLanguageValidator extends AbstractDotLanguageValidator {
  public static final String MULTIPLE_NODE_DECLARATION_GRAPH = "uk.ac.kcl.inf.dotLanguage.MULTIPLE_NODE_DECLARATION_GRAPH";
  
  public static final String MULTIPLE_NODE_DECLARATION_DIGRAPH = "uk.ac.kcl.inf.dotLanguage.MULTIPLE_NODE_DECLARATION_DIGRAPH";
  
  public static final String ISOLATED_GRAPH_NODE = "uk.ac.kcl.inf.dotLanguage.DECLARED_UNUSED_GRAPH_NODE";
  
  public static final String ISOLATED_DIGRAPH_NODE = "uk.ac.kcl.inf.dotLanguage.DECLARED_UNUSED_DIGRAPH_NODE";
  
  public static final String INVALID_ATTRIBUTE_NAME = "uk.ac.kcl.inf.dotLanguage.INVALID_ATTRIBUTE_NAME";
  
  public static final String MULTIPLE_DIGRAPH_EDGE_DECLARATION = "uk.ac.kcl.inf.dotLanguage.MULTIPLE_DIGRAPH_EDGE_DECLARATION";
  
  public static final String MULTIPLE_GRAPH_EDGE_DECLARATION = "uk.ac.kcl.inf.dotLanguage.MULTIPLE_GRAPH_EDGE_DECLARATION";
  
  /**
   * Check whether there are several declarations of the same node in directed and undirected graphs.
   */
  @Check
  public void multipleNodeDeclarations(final NodeDeclaration nodeDeclaration) {
    final EObject graph = nodeDeclaration.eContainer();
    final NodeId nodeId = nodeDeclaration.getNodeName();
    String _name = graph.eClass().getName();
    boolean _equals = Objects.equal(_name, "Graph");
    if (_equals) {
      boolean _multipleNodeDeclarationGraph = this.multipleNodeDeclarationGraph(((Graph) graph), nodeId);
      if (_multipleNodeDeclarationGraph) {
        this.error("This node has already been declared.", nodeDeclaration, 
          DotLanguagePackage.Literals.NODE_DECLARATION__NODE_NAME, 
          DotLanguageValidator.MULTIPLE_NODE_DECLARATION_GRAPH);
      }
    } else {
      boolean _multipleNodeDeclarationDigraph = this.multipleNodeDeclarationDigraph(((Digraph) graph), nodeId);
      if (_multipleNodeDeclarationDigraph) {
        this.error("This node has already been declared.", nodeDeclaration, 
          DotLanguagePackage.Literals.NODE_DECLARATION__NODE_NAME, 
          DotLanguageValidator.MULTIPLE_NODE_DECLARATION_DIGRAPH);
      }
    }
  }
  
  /**
   * Check whether there are isolated nodes in directed and undirected graphs.
   */
  @Check
  public void isolatedGraphNode(final NodeDeclaration nodeDeclaration) {
    final EObject graph = nodeDeclaration.eContainer();
    final NodeId nodeId = nodeDeclaration.getNodeName();
    String _name = graph.eClass().getName();
    boolean _equals = Objects.equal(_name, "Graph");
    if (_equals) {
      if ((this.isolatedGraphNode(((Graph) graph), nodeId) && (!this.multipleNodeDeclarationGraph(((Graph) graph), nodeId)))) {
        this.warning("This node is isolated. It is not connected to any other node via an edge.", nodeDeclaration, 
          DotLanguagePackage.Literals.NODE_DECLARATION__NODE_NAME, 
          DotLanguageValidator.ISOLATED_GRAPH_NODE);
      }
    } else {
      if ((this.isolatedDigraphNode(((Digraph) graph), nodeId) && (!this.multipleNodeDeclarationDigraph(((Digraph) graph), nodeId)))) {
        this.warning("This node is isolated. It is not connected to any other node via an edge.", nodeDeclaration, 
          DotLanguagePackage.Literals.NODE_DECLARATION__NODE_NAME, 
          DotLanguageValidator.ISOLATED_DIGRAPH_NODE);
      }
    }
  }
  
  /**
   * Check the correct naming of attributes.
   */
  @Check
  public void validAttribute(final Attribute attribute) {
    final String attributeName = attribute.getAttributeName();
    final ArrayList<String> validAttributeList = CollectionLiterals.<String>newArrayList("fillColor", "label", "lineColor");
    boolean _contains = validAttributeList.contains(attributeName);
    boolean _not = (!_contains);
    if (_not) {
      this.warning("This is not a valid attribute. This attribute will be ignored when the program is run.", attribute, DotLanguagePackage.Literals.ATTRIBUTE__ATTRIBUTE_NAME, 
        DotLanguageValidator.INVALID_ATTRIBUTE_NAME);
    }
  }
  
  /**
   * HELPER FUNCTIONS
   */
  public boolean isolatedGraphNode(final Graph graph, final NodeId node) {
    final Iterable<UndirectedEdgeDeclaration> edgeDeclarations = Iterables.<UndirectedEdgeDeclaration>filter(graph.getStatements(), UndirectedEdgeDeclaration.class);
    for (final UndirectedEdgeDeclaration edgeDecl : edgeDeclarations) {
      {
        final NodeId firstNode = ((UndirectedEdgeDeclaration) edgeDecl).getFirstNode();
        final RightEdgeDeclaration rightNodeDeclaration = ((UndirectedEdgeDeclaration) edgeDecl).getSecondNode();
        boolean _equals = Objects.equal(node, firstNode);
        if (_equals) {
          return false;
        }
        NodeId _secondNode = rightNodeDeclaration.getSecondNode();
        boolean _tripleNotEquals = (_secondNode != null);
        if (_tripleNotEquals) {
          NodeId _secondNode_1 = rightNodeDeclaration.getSecondNode();
          boolean _equals_1 = Objects.equal(node, _secondNode_1);
          if (_equals_1) {
            return false;
          }
        } else {
          boolean _contains = rightNodeDeclaration.getNodeList().getNodes().contains(node);
          if (_contains) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public boolean isolatedDigraphNode(final Digraph graph, final NodeId node) {
    final Iterable<DirectedEdgeDeclaration> edgeDeclarations = Iterables.<DirectedEdgeDeclaration>filter(graph.getStatements(), DirectedEdgeDeclaration.class);
    for (final DirectedEdgeDeclaration edgeDecl : edgeDeclarations) {
      {
        final NodeId firstNode = ((DirectedEdgeDeclaration) edgeDecl).getFirstNode();
        final RightEdgeDeclaration rightNodeDeclaration = ((DirectedEdgeDeclaration) edgeDecl).getSecondNode();
        boolean _equals = Objects.equal(node, firstNode);
        if (_equals) {
          return false;
        }
        NodeId _secondNode = rightNodeDeclaration.getSecondNode();
        boolean _tripleNotEquals = (_secondNode != null);
        if (_tripleNotEquals) {
          NodeId _secondNode_1 = rightNodeDeclaration.getSecondNode();
          boolean _equals_1 = Objects.equal(node, _secondNode_1);
          if (_equals_1) {
            return false;
          }
        } else {
          boolean _contains = rightNodeDeclaration.getNodeList().getNodes().contains(node);
          if (_contains) {
            return false;
          }
        }
      }
    }
    return true;
  }
  
  public boolean multipleNodeDeclarationGraph(final Graph graph, final NodeId node) {
    int counter = 0;
    final Iterable<NodeDeclaration> nodeDeclarations = Iterables.<NodeDeclaration>filter(graph.getStatements(), NodeDeclaration.class);
    for (final NodeDeclaration nodeDecl : nodeDeclarations) {
      boolean _equals = nodeDecl.getNodeName().getName().equals(node.getName());
      if (_equals) {
        if ((counter >= 1)) {
          return true;
        } else {
          counter++;
        }
      }
    }
    return false;
  }
  
  public boolean multipleNodeDeclarationDigraph(final Digraph graph, final NodeId node) {
    int counter = 0;
    final Iterable<NodeDeclaration> nodeDeclarations = Iterables.<NodeDeclaration>filter(graph.getStatements(), NodeDeclaration.class);
    for (final NodeDeclaration nodeDecl : nodeDeclarations) {
      boolean _equals = nodeDecl.getNodeName().getName().equals(node.getName());
      if (_equals) {
        if ((counter >= 1)) {
          return true;
        } else {
          counter++;
        }
      }
    }
    return false;
  }
  
  public boolean multipleEdgeDeclarationDigraph(final Digraph graph, final ArrayList<NodeId> edge) {
    final EList<DirectedStatement> statements = graph.getStatements();
    for (final DirectedStatement statement : statements) {
      String _name = statement.eClass().getName();
      boolean _equals = Objects.equal(_name, "DirectedEdgeDeclaration");
      if (_equals) {
        final NodeId firstNode = ((DirectedEdgeDeclaration) statement).getFirstNode();
        final RightEdgeDeclaration secondNode = ((DirectedEdgeDeclaration) statement).getSecondNode();
        final ArrayList<EObject> pair = CollectionLiterals.<EObject>newArrayList(firstNode, secondNode);
        boolean _equals_1 = Objects.equal(pair, edge);
        if (_equals_1) {
          return true;
        }
      }
    }
    return false;
  }
  
  public boolean multipleEdgeDeclarationGraph(final Graph graph, final ArrayList<NodeId> edge) {
    final EList<UndirectedStatement> statements = graph.getStatements();
    for (final UndirectedStatement statement : statements) {
      String _name = statement.eClass().getName();
      boolean _equals = Objects.equal(_name, "UndirectedEdgeDeclaration");
      if (_equals) {
        final NodeId firstNode = ((UndirectedEdgeDeclaration) statement).getFirstNode();
        final RightEdgeDeclaration secondNode = ((UndirectedEdgeDeclaration) statement).getSecondNode();
        final ArrayList<EObject> pair = CollectionLiterals.<EObject>newArrayList(firstNode, secondNode);
        boolean _equals_1 = Objects.equal(pair, edge);
        if (_equals_1) {
          return true;
        }
      }
    }
    return false;
  }
}
