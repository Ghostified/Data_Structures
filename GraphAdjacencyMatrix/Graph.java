
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
import java.util.Arrays;
import java.math.*;


public class Graph{
    public static void main(String[]Args){

        public int [][] matrix;

        public Graph( int size){
            matrix = new int[size][size];
        }

        public void  addNode ( Node node) {

        }
        public void addEdge ( int src , int dst){
            matrix [src] [dst] = 1;

        }

        public boolean checkEdge ( int src , int dst) {
            if (matrix [src ] [dst] == 1) {
                return true;
            }
        }
         public void print () {
            for (int i =0; i < matrix.length; i++) {
                for ( int j =0 ; j < matrix[i].length; j++){
                    System.out.print(matrix[i][j] + " ");
                }
                System.out.println();
            }
    
}


}
