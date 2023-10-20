// Ennio Gualandi

import java.util.HashMap;
import java.util.Map;

public class Node {
  private String name;
  private Integer distance = Integer.MAX_VALUE;
  private Node predecessor = null;
  private Map<Node, Integer> adjacentNodes = new HashMap<>();

  public Node(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Node getPredecessor() {
    return predecessor;
  }

  public void setPredecessor(Node predecessor) {
    this.predecessor = predecessor;
  }

  public Integer getDistance() {
    return distance;
  }

  public void setDistance(Integer distance) {
    this.distance = distance;
  }

  public Map<Node, Integer> getAdjacentNodes() {
    return adjacentNodes;
  }

  public void setAdjacentNodes(Map<Node, Integer> adjacentNodes) {
    this.adjacentNodes = adjacentNodes;
  }

  public void addDestination(Node destination, int distance) {
    adjacentNodes.put(destination, distance);
  }
}