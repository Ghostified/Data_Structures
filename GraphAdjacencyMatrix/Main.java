package GraphAdjacencyMatrix;
import java.util.*;

public class Main {
    public static void main (String [] Args) {
        Graph graph = new Graph (5);

        graph.addNode(New Node ('A'));
        graph.addNode(New Node ('B'));
        graph.addNode(New Node ('C'));
        graph.addNode(New Node ('D'));
        graph.addNode(New Node ('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        graph.print();
    }
}
