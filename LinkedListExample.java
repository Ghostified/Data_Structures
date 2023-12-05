import java.util.LinkedList;

public class LinkedListExample {

    public static void main (String [] args) {
        LinkedList <String> linkedList = new LinkedList<String> ();

        linkedList.push("A");
        linkedList.push ("B");
        linkedList.push("C");
        linkedList.push("D");
        linkedList.push("F");

        System.out.println(linkedList);

        while(!linkedList.isEmpty()) {
            String item = linkedList.poll();
            System.out.println("The popped item is : " + item);
        }

    }
    
}
