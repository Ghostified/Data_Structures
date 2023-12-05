import java.util.*;
public class reverseQueue {
    public static void main(String[] args) {
        Queue <Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        queue.offer(3.0);
        queue.offer(9.7);
        queue.offer(8.5);
        queue.offer(7.9);
        queue.offer(7.6);

        System.out.println("The  queue objects in descending order are: ");

        while (!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }  
}
