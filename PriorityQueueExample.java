import java.util.*;
import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String []args){
        Queue <Double>  queue = new PriorityQueue<>();
        
        queue.offer(3.0);
        queue.offer(2.0);
        queue.offer(5.0);
        queue.offer(2.8);
        queue.offer(9.0);

        //List all items in the priority queue in order of priority
        while (!queue.isEmpty()) {
             System.out.println(queue.poll());
        }

    }
}

//         //Creating a constructor to parse  a new private class

//         new QueueExample().ascendingOrder(queue);
        
//     }
    
// }

//  class QueueExample{
//     public void ascendingOrder(Queue<Double> queue){

//         PriorityQueue<Double> reversedQueue= new PriorityQueue<>(Collections.reverseOrder());
//         reversedQueue.addAll(queue);
        
//         while(!reversedQueue.isEmpty()){
//         System.out.println(reversedQueue.poll());
//     }

//     }

   
// }
