//Queues = FIFO data structure 
//          Its a linear data structure with a head and a tail
//          add = enqueue , offer ()
//          remove = dequeue , poll()
//          peek  = examine the object at the head of the queue

import java.util.Queue;
import java.util.LinkedList;

public class QueuesExample {

    public static void main (String []args){

        //Create a queue

        Queue <String> queue = new LinkedList<String>( );

        queue.offer ("Karen");
        queue.offer("Chad");
        queue.offer("Branson");
        queue.offer("Arthur");

        //Peek at the head of the queue

        System.out.println("The object at the head of the queue is: " + queue.peek());

        //Remove a string  object at the head of the queue

        queue.poll();
        System.out.println(" ");
        System.out.println("Objects remaining are: " + queue);

        //Check if the queue is empty 

        System.out.println("Are there objects in the queue: " + queue.isEmpty());

        //Check the size of the queue

        System.out.println("The size of the queue is: " + queue.size());

        //Find if an object is contained in the queue, this is a boolean method

        System.out.println(queue.contains("Branson"));
        System.out.println(queue.contains("Humprey"));

        //Peek at the head of the queue

        System.out.println(queue.peek());
    }
    
}
