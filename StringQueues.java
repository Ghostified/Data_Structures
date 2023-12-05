import java.util.*;
public class StringQueues {
    public static void main(String []args){
        Queue <String> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer("b");
        queue.offer("a");
        queue.offer("d");
        queue.offer("c");
        queue.offer("f");
        queue.offer("f");

        while(!queue.isEmpty()){
            System.out.println(queue.poll());

        }
    }
    
}
