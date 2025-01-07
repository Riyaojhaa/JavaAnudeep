package ShoppingStore;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

class stock implements Runnable {
    Lock lock = new ReentrantLock();
    public static int ProductCount = 5;

    public synchronized void checkout() { // Critical section
        lock.lock();
        try {
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

    @Override
    public void run() {
        checkout();
    }

}

public class ShoppingUsingRunnable {
    public static void main(String[] args) {
        stock obj1 = new stock();

        Thread[] users = new Thread[10];
        for (int i = 0; i < 10; i++) {
            users[i] = new Thread(obj1);
            users[i].setName("user" + i);
            users[i].start();
        }
    }
}
