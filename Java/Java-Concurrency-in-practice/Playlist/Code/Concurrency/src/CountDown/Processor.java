
package CountDown;

import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Processor implements Runnable{
    
    CountDownLatch latch;
    public Processor(CountDownLatch latch){
        this.latch = latch;
    }
        
    
    public void run(){
        
        System.out.println("Started.");
        
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            
        }
        
        latch.countDown();
        
    }
    
}
