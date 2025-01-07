package ShoppingStore;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class Stock {
    static int ProductCount = 10;
    private static final Lock lock = new ReentrantLock();

    public static void checkout() {
        lock.lock();
        try {
            // Thread.sleep(1000);
            // System.out.println("Purchase Success :" + Thread.currentThread().getName());
            // ProductCount--;
            // System.out.println("product left " + ProductCount);
            if (ProductCount > 0) {
                Thread.sleep(1000);
                System.out.println("Purchase Success :" + Thread.currentThread().getName());
                ProductCount--;
                System.out.println("product left " + ProductCount);
            } else {
                System.out.println("out of stock");
            }
        } catch (Exception e) {
            System.out.print(e);
        }
        lock.unlock();
    }
}

public class ShoppingMain {
    public static void main(String[] args) {
        // Thread t1 = new Thread(() -> Stock.checkout());
        // t1.start();

        // if we have more that one user then we use this method
        Thread[] users = new Thread[10];
        for (int i = 0; i < 10; i++) {
            users[i] = new Thread(() -> Stock.checkout());
            users[i].start();
        }

    }
}
