package Labs;
class AverageThread extends Thread {
    private final Object lock;

    public AverageThread(Object lock) {
        this.lock = lock;
    }

    @Override
    public void run() {
        synchronized (lock) {
            int sum = 0;
            for (int i = 1; i <= 10; i++) {
                sum += i;
            }
            double average = sum / 10.0;
            System.out.println("Average of the first 10 numbers: " + average);

            lock.notify();
            try {
                // Wait to allow the other thread to complete
                lock.wait();
            } catch (InterruptedException _) {
            }
        }
    }
}

// Class to print the square of numbers in the array
class SquareThread extends Thread {
    private final Object lock;
    private final int[] arr;

    public SquareThread(Object lock, int[] arr) {
        this.lock = lock;
        this.arr = arr;
    }

    @Override
    public void run() {
        synchronized (lock) {
            for (int num : arr) {
                System.out.println("Square of " + num + ": " + (num * num));
            }

            // Notify the other thread
            lock.notify();
            try {
                // Wait to allow the other thread to complete
                lock.wait();
            } catch (InterruptedException _) {

            }
        }
    }
}

// Main class
public class ThreadExample_Lab9 {
    public static void main(String[] args) {
        Object lock = new Object(); // Shared lock object for synchronization
        int[] arr = { 1, 20, 50, 15, 30 }; // Array of numbers

        Thread avgThread = new AverageThread(lock); // Thread for average calculation
        Thread squareThread = new SquareThread(lock, arr); // Thread for printing squares

        avgThread.start();
        squareThread.start();
    }
}
