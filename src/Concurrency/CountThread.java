package Concurrency;

import java.util.Date;

public class CountThread extends Thread {

    /**
     * Method 1 : declare a class to be a subclass of Thread
     */

    public void run(){

        for (int i = 0; i <=20 ; i++) {
            System.out.println("Thread :" + i);
        }

        // To pause a thread
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
