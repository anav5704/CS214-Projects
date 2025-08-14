package multiThreading;

public class Main {
    public static void main(String args[]) {
        Runnable r1 = new Racer(1);
        Runnable r2 = new Racer(2);
        
        // r1.run();
        // r2.run();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
