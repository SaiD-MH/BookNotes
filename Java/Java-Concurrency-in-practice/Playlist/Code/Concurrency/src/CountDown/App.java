package CountDown;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {

        CountDownLatch latch = new CountDownLatch(3);
        ExecutorService ex = Executors.newFixedThreadPool(3);
        
        for (int i = 0; i < 3; i++) {
            ex.submit(new Processor(latch));
        }
        
        try {
            latch.await();
        } catch (InterruptedException ex1) {
            
        }
        
        ex.shutdown();
        try {
            ex.awaitTermination(1, TimeUnit.DAYS);
        } catch (InterruptedException ex1) {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex1);
        }
        System.out.println("Main Thread Continue Work !");
        
        
    }
}
