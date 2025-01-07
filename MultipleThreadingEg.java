// class Abc1 extends Thread{
//     @Override
//     public void run(){
//         for(int i = 1 ; i <100 ; i++){
//             System.out.println("thread of abc-1");
//         }       
//     }
// }
// class Abc2 extends Thread{
//     @Override
//     public void run(){
//         for(int i = 1 ; i <100 ; i++){
//             System.out.println("thread of abc-2");
//         }       
//     }
// }
// public class MultipleThreadingEg {
//     public static void main(String[] args) {
//         Abc1 obj1 = new Abc1();
//         Abc2 obj2 = new Abc2();

//         //start() is the built in method of thread that help to start the thread (running state or runningqueue state)
//         obj1.start();
//         obj2.start();

//     }
// }

//RENEWABLE INTERFACE --- another method to create thread 
//Why we using renewable interface because we can't extend the class in java but we can implement the interface

class Abc1 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("thread of abc-1");
        }
    }
}

class Abc2 implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i < 100; i++) {
            System.out.println("thread of abc-2");
        }
    }
}

public class MultipleThreadingEg {
    public static void main(String[] args) {
        Abc1 obj1 = new Abc1();
        Abc2 obj2 = new Abc2();

        // start() is the built in method of thread that help to start the thread
        // (running state or readyqueue state)`
        Thread thread1 = new Thread(obj1);
        Thread thread2 = new Thread(obj2);

        // Start the threads
        thread1.start();
        thread2.start();

        // thread2.sleep(1000);

    }
}