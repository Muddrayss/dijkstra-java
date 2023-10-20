// Ennio Gualandi

public class App {
    public static void main(String[] args) throws Exception {
        GraphEnnio graph = new GraphEnnio();

        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");

        nodeA.addDestination(nodeB, 10);
        nodeA.addDestination(nodeC, 15);

        nodeB.addDestination(nodeD, 12);

        graph.addNode(nodeA);
        graph.addNode(nodeB);
        graph.addNode(nodeC);
        graph.addNode(nodeD);

        graph.calculateShortestPath(nodeA);

        graph.printFoundNodes();
    }
}