package Labs;
class RaceThread extends Thread {
    public RaceThread(String name) {
        super(name);
    }

    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) { // Simulating 10 iterations for the race
            System.out.println(getName() + " - Iteration: " + i);
            try {
                Thread.sleep((int) (Math.random() * 500)); // Random delay up to 500ms
            } catch (InterruptedException _) {
            }
        }
        System.out.println(getName() + " has finished the race!");
    }
}

public class RaceSimulation {
    public static void main(String[] args) {
        // Creating three threads with different names
        RaceThread racer1 = new RaceThread("Racer 1");
        RaceThread racer2 = new RaceThread("Racer 2");
        RaceThread racer3 = new RaceThread("Racer 3");

        racer1.setPriority(Thread.MAX_PRIORITY); // Highest priority
        racer2.setPriority(Thread.NORM_PRIORITY); // Normal priority
        racer3.setPriority(Thread.MIN_PRIORITY); // Lowest priority

        racer1.start();
        racer2.start();
        racer3.start();
    }
}
