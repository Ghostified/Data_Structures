public class Main {

    //Depth First Search = Pick a route , keep going on that route
    //                      If you reach a dead end in the route , 
    //                      or already visited a node,
    //                      Backtrack to a previous node with unvisited adjascent node

/*
 * Breadth FS VS Depth FS Comparison
 * Breadth FS traverses a graph by level while Depth FS traverses a graph branch by branch
 * Breadth FS utilizes a queue while a Depth FS utilizes a stack
 * Breadth FS is better if the destination is close to start while a Depth fs is better if destination is on average far from the start
 * Breadth FS siblisngs are visited befor children while in Depth FS children are visited befor siblings
 * Depth FS is more popular for games and puzzles
 */



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
        //System.out.println("\n");
        //System.out.println("Does an edge exist? " + graph.checkEdge(+2,1));
        //System.out.println("\n");


        //Visit a node using depthfirst seach
        //graph.depthFirstSearch(0);


        //Visit a node
        System.out.println("\n"); 
        graph.breadthFirstSearch(3);
    }
}
