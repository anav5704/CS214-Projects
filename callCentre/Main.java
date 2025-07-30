import java.util.LinkedList;
import java.util.Scanner;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<String> callerQueue = new LinkedList<String>();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Starting call center simulation...\n");

        while(true) {
            System.out.println("Please select an option:");
            System.out.println("1. New call");
            System.out.println("2. Serve call");
            System.out.println("3. View queue");
            System.out.println("4. Hang up");
            System.out.println("5. Quit app");

            String choice = scanner.nextLine();

            switch(choice) {
                case "1":  {
                    System.out.println("Enter caller number:");
                    String numberToAdd = scanner.nextLine();

                    callerQueue.add(numberToAdd);
                    System.out.println("Added " + numberToAdd + " to queue");

                    break;
                }

                case "2": {
                    if(!callerQueue.isEmpty()) {
                        System.out.println("You are now serving " + callerQueue.poll());
                    } else {
                        System.out.println("Caller not in queue");
                    }

                    break;
                }

                case "3": {
                    if(!callerQueue.isEmpty()) {
                        System.out.println("Current queue: " + callerQueue);
                    } else {
                        System.out.println("No callers in queue");
                    }

                    break;
                }

                case "4": {
                    System.out.println("Enter caller number:");
                    String  numberToRemove = scanner.nextLine();

                    if(callerQueue.remove( numberToRemove)) {
                        System.out.println( numberToRemove + " has hung up");
                    } else {
                        System.out.println("Caller not in queue");
                    }

                    break;
                }

                case "5": {
                    System.out.print("Quitting app...");
                    scanner.close();

                    return;
                }

                default: {
                    System.out.println("Invalid input");
                }
            }
        }
    }
}
