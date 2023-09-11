package threadsplaying;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MyRun implements Runnable {

    public void go() {
        
        /* try {
        Thread.sleep(5000);
        } catch (InterruptedException ex) {
        ex.printStackTrace();
        }*/
        doMore();
    }

    public void doMore() {
        System.out.println("Thread are the top of the Stack");
    }

    public void run() {
        go();
    }

}
