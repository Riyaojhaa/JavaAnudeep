import java.util.concurrent.locks.ReentrantLock;
import java.util.concurrent.locks.Lock;

class Stock {
    static int ProductCount = 10;
    static Lock lock = new ReentrantLock();

    public static void checkout() {

        lock.lock();
        try {
            Thread.sleep(1000);
            System.out.print(Thread.currentThread().getName());
            ProductCount--;

        } catch (Exception e) {
            System.out.print(e);
        }
        lock.unlock();
    }

}

public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello World");

        Thread[] users = new Thread[10];
        for (int i = 0; i < 10; i++) {
            users[i] = new Thread(() -> Stock.checkout());
            users[i].start();
        }
    }
}