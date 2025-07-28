import java.util.PriorityQueue;
import java.util.Comparator;

public class PriorityQueues {
    public static void main(String[] args) {
        Comparator<String> byLength = (a, b) -> b.length() - a.length();
        
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>(byLength);

        priorityQueue.add("Go");
        priorityQueue.add("Python");
        priorityQueue.add("TypeScript");

        while(!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }

}
