import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Caller> callerQueue = new LinkedList<Caller>();
        
        Caller c1 = new Caller(1111111);
        Caller c2 = new Caller(2222222);
        Caller c3 = new Caller(3333333);

        // Call center recieves calls

        callerQueue.add(c1);
        callerQueue.add(c2);
        callerQueue.add(c3);

        // Consultant views callers

        System.out.println(callerQueue.size() + " caller waiting:");

        for(Caller caller: callerQueue) {
            caller.displayInfo();
        }

        // Caller hangs up and gives name and message

        c2.hangUp("Anav", "What time does the store open?");

        for(Caller caller: callerQueue) {
            caller.displayInfo();
        }
    }
}
