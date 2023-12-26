

/*
 * Adjacency list = An array/arraylist of linked List
 * Each linked List has a unique node at the head
 * All adjascent neighbours to that node are added to the node's linked list
 * 
 * runtime complexity to check an edge:  O(v)
 * space complexity : O(v + e)
 */
public class Main {
public static void main (String [] Args) {

    Graph graph = new Graph ();

    graph.addNode(new Node ('A'));
    graph.addNode(new Node ('B'));
    graph.addNode(new Node ('C'));
    graph.addNode(new Node ('D'));
    graph.addNode(new Node ('E'));

    graph.addEdge(0,1);
    graph.addEdge(1,2);
    graph.addEdge(1,4 );
    graph.addEdge(2,3);
    graph.addEdge(2,4);
    graph.addEdge(4, 0);
    graph.addEdge(4,2);

    graph.print();

}
}
