
package threadsplaying;

import java.util.logging.Level;
import java.util.logging.Logger;

public class ThreadsPlaying implements Runnable{
        
    
    
    public static void main(String[] args) {
        
        
        
        /*
        MyRun r = new MyRun();
        Thread thr = new Thread(r);
        
        thr.start();
        try {
        Thread.sleep(0);
        } catch (InterruptedException ex) {
        Logger.getLogger(ThreadsPlaying.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Back to Main :) ");*/
    
        
        
        
       ThreadsPlaying runner = new ThreadsPlaying();
       
       Thread alph  = new Thread(runner);
       Thread beta  = new Thread(runner);
       
       alph.setName("Alpa Thread");
       beta.setName("Beta Thread");
       
       alph.start();
       beta.start();
    
    }
    
    
    public void run(){
        
        for(int i=0;i<25;i++)
        {
            System.out.println(Thread.currentThread().getName() + "Is Now running");
        }
        
    }
}
