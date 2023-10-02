package ThreadPool;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Processor implements Runnable{

    private int id;

    public Processor(int id) {
        this.id = id;
    }

    
    public void run(){
        
        System.out.println("Start : " + id );
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            
        }
        System.out.println("Complete : " + id );
    }
}
