public class Main {

    //Binary Search Tree - Is a tree data structure where each node is greater than its left child
    //                      but less than the right.

    //                  benefit: Easy to locate a node when they are in order
    
    //                   time complexity: best case  o(log n)
    //                                    worst case o(n)

    //                    space complexity : o(n)

    public static void main (String [] Args) {

        BinarySearchTree  tree = new BinarySearchTree();

        tree.insert(new Node(5));
        tree.insert(new Node(7));
        tree.insert(new Node(8));
        tree.insert(new Node(9));
        tree.insert(new Node(6));
        tree.insert(new Node(4));
        tree.insert(new Node(2));
        tree.insert(new Node(3));
        tree.insert(new Node(1));
        tree.insert(new Node(10));


        tree.remove(1);
        tree.display();

        System.out.println(tree.search(10));

        tree.remove(11);
    }
}
