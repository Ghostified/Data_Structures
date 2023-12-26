public class Main {

    //Depth First Search = Pick a route , keep going on that route
    //                      If you reach a dead end in the route , 
    //                      or already visited a node,
    //                      Backtrack to a previous node with unvisited adjascent node



    public static void main(String []Args) {
        
        Graph graph = new Graph(5);

        graph.addNode(new Node('A'));
        graph.addNode(new Node('B'));
        graph.addNode(new Node('C'));
        graph.addNode(new Node('D'));
        graph.addNode(new Node('E'));

        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(2,4);
        graph.addEdge(4,0);
        graph.addEdge(4,2);

        //Print out the matrix 
        graph.print();

        //Check if a node has an edge
        System.out.println("");
        System.out.println("Does an edge exist? " + graph.checkEdge(+2,1));
        System.out.println("");

        //Visit a node 
        graph.depthFirstSearch(4);
    }
}
