import java.util.LinkedList;
import java.util.Queue;

 public class Queues {
     public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();

        queue.add(1);
        queue.add(2);
        queue.add(3);

        while(!queue.isEmpty()) {
            System.out.println(queue.remove());
        }
     }
 }
