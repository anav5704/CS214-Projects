package multiThreading;

class Racer implements Runnable {
    public int id;
    public int nums;

    public Racer(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        int[] nums = {1, 2, 3};

        for(int n: nums) {
            try{
                System.out.println("Running reacer: " + id);
                Thread.sleep(1000);
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
