// Ennio Gualandi

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.Set;

/**
 * The abstracted rules are as follows:
 *
 * 1. Every time that we set out to visit a new node, we will choose the node
 * with the smallest known distance/cost to visit first.
 * 
 * 2. Once we’ve moved to the node we’re going to visit, we will check each of
 * its neighboring nodes (adjacentNodes in this case).
 * 
 * 3. For each neighboring node, we’ll calculate the distance/cost for the
 * neighboring nodes by summing the cost of the edges that lead to the node
 * we’re checking from the starting node.
 * 
 * 4. Finally, if the distance/cost to a node is less than a known distance,
 * we’ll update the shortest distance and predecessor that we have on file
 * for that node.
 */

// Represents a graph data structure
public class GraphEnnio {

  // Set of nodes in the graph
  private Set<Node> nodes = new HashSet<>();

  // Getter method to return the set of nodes in the graph
  public Set<Node> getNodes() {
    return this.nodes;
  }

  // Setter method to set the nodes of the graph
  public void setNodes(Set<Node> nodes) {
    this.nodes = nodes;
  }

  // Adds a new node to the graph
  public void addNode(Node nodeA) {
    nodes.add(nodeA);
  }

  // Calculates the shortest path from a source node to all other nodes in the
  // graph
  public void calculateShortestPath(Node source) {
    // Setting the initial distance of the source node to 0
    source.setDistance(0);

    // Sets to keep track of visited and unvisited nodes
    Set<Node> visitedNodes = new HashSet<>();
    Set<Node> unvisitedNodes = new HashSet<>();

    // Initially, only the source node is unvisited
    unvisitedNodes.add(source);

    // Loop until all nodes are visited
    while (unvisitedNodes.size() != 0) {
      // Get the node with the smallest distance among unvisited nodes
      Node currentNode = getLowestDistanceNode(unvisitedNodes);
      unvisitedNodes.remove(currentNode);
      // Loop through the adjacent nodes of the current node
      for (Entry<Node, Integer> adjacencyPair : currentNode.getAdjacentNodes().entrySet()) {
        Node adjacentNode = adjacencyPair.getKey();
        Integer edgeWeight = adjacencyPair.getValue();
        // If the adjacent node hasn't been visited yet
        if (!visitedNodes.contains(adjacentNode)) {
          // Update the minimum distance to the adjacent node if necessary
          calculateMinimumDistance(adjacentNode, edgeWeight, currentNode);
          // Mark the adjacent node as unvisited
          unvisitedNodes.add(adjacentNode);
        }
      }
      // Mark the current node as visited
      visitedNodes.add(currentNode);
    }
  }

  // Returns the node with the smallest distance among a set of nodes
  private Node getLowestDistanceNode(Set<Node> unvisitedNodes) {
    Node lowestDistanceNode = null;
    int lowestDistance = Integer.MAX_VALUE;
    for (Node node : unvisitedNodes) {
      int nodeDistance = node.getDistance();
      if (nodeDistance < lowestDistance) {
        lowestDistance = nodeDistance;
        lowestDistanceNode = node;
      }
    }
    return lowestDistanceNode;
  }

  // Updates the minimum distance to a node considering a potential new path
  // through another node
  private void calculateMinimumDistance(Node currentNode, Integer edgeWeigh, Node sourceNode) {
    Integer sourceDistance = sourceNode.getDistance();
    if (sourceDistance + edgeWeigh < currentNode.getDistance()) {
      currentNode.setDistance(sourceDistance + edgeWeigh);
      currentNode.setPredecessor(sourceNode);
    }
  }

  public void printFoundNodes() {
    // Check if there are any nodes in the graph
    if (nodes.isEmpty()) {
      System.out.println("No nodes found in the graph.");
      return;
    }

    // ASCII art top border
    System.out.println("╔════════════════════════════════════════╗");
    System.out.println("║              FOUND NODES               ║");
    System.out.println("╠════════════════════════════════════════╣");

    // Print each node's name
    for (Node node : nodes) {
      System.out.println("║                   " + node.getName() + "                    ║");
    }

    // ASCII art bottom border
    System.out.println("╚════════════════════════════════════════╝");
  }

}