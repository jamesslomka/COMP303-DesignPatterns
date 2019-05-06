package Concurrency;

public class CountRun implements Runnable {

    /**
     * Method 2 : Declare class to implement Runnable
     */


    public void run(){
        for (int i = 0; i <=20 ; i++) {
            System.out.println("Run : " + i);

            // To pause a thread
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
