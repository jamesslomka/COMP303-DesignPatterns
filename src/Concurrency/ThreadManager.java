package Concurrency;

public class ThreadManager {

    public static void main(String[] args) throws InterruptedException{

//        // Method 1
//        CountThread t = new CountThread();
//        t.start();
//
//
//        // Method 2
//        CountRun r = new CountRun();
//        new Thread(r).start();

        // Waiting for a thread:
        CountThread t1 = new CountThread();
        CountThread t2 = new CountThread();

        t1.start();
        t1.join();
        System.out.println("Thread 2 waiting on thread 1");
        t2.start();
    }
}
