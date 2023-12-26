import java.util.ArrayList;

public class GraphTwo {
    
    public class Node {
        char data;

        Node(char data) {
            this.data = data;
        }
    }

    // Instance variables should not be declared within a method.
    // Instead, declare them at the class level.
    private ArrayList<Node> nodes;
    private int[][] matrix;

    // Constructor should not have the same name as the class.
    // Instead, use the class name as the constructor.
    public GraphTwo(int size) {
        nodes = new ArrayList<>();
        matrix = new int[size][size];
    }

    // Methods should not be declared within the main method.
    // Instead, use them outside the main method.
    public void addNode(Node node) {
        nodes.add(node);
    }

    public void addEdge(int src, int dst) {
        matrix[src][dst] = 1;
    }

    public boolean checkEdge(int src, int dst) {
        return matrix[src][dst] == 1;
    }

    public void print() {
        System.out.print("  ");
        for (Node node : nodes) {
            System.out.print(node.data + " ");
        }
        System.out.println();

        for (int i = 0; i < matrix.length; i++) {
            System.out.print(nodes.get(i).data + " ");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method is static and can create an instance of the class.
    public static void main(String[] args) {
        GraphTwo graph = new GraphTwo(5);

        graph.addNode(graph.new Node('A'));
        graph.addNode(graph.new Node('B'));
        graph.addNode(graph.new Node('C'));
        graph.addNode(graph.new Node('D'));
        graph.addNode(graph.new Node('E'));

        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(2, 4);
        graph.addEdge(4, 0);
        graph.addEdge(4, 2);

        graph.print();
        System.out.println(graph.checkEdge(0, 1));
    }
}

