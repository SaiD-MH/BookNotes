package Volatile;

public class Processor extends Thread{
    private volatile boolean running = true;
    public void run(){
        
        while(running){
            
            System.out.println("Hello , ");
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            
        }
    }
    
    public void shutdown(){
        running = false;
    }
    
}