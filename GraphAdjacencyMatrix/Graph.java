
    /*
 * Adjacency matrix = An array to store 1's and 0's to represent edges in a graph
 * # of rows = # 0f unique nodes
 * # of columns = # of unique nodes
 * 
 * Runtime complexity toi check an edge : 0(1)
 * space complexity = 0(v^n )
 * 
 */
package GraphAdjacencyMatrix;
import java.util.*;
import java.math.*;
import java.util.ArrayList;


public class Graph{
    public static void main(String[]Args){

        ArrayList <Node> nodes;
          int [][] matrix;

        Graph( int size){
            nodes = new ArrayList<> ();
            matrix = new int[size][size];
        }

        public void  addNode ( Node node) {
            ArrayList nodes;
            nodes.add(node);
        }
        public void addEdge ( int src , int dst){
            int[][] matrix;
            matrix [src] [dst] = 1;

        }

        public boolean checkEdge ( int src , int dst) {
            int[][] matrix;
            if (matrix [src ] [dst] == 1) {
                return true;
            }
        }
         public void print () {
            Node[] nodes;
            System.out.print("  ");
            for ( Node node : nodes) {
                System.out.print(node.data + " ");
            }
            System.out.println();

            int[][] matrix;

            for (int i =0; i < matrix.length; i++) {
                System.out.print(nodes(i).data + " ");
                for ( int j =0 ; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    
}


}}
