package Sync;

public class App {
    private int count;
    
    public synchronized void plus(){
        count++;
    }
    public static void main(String[] args) throws InterruptedException {
        App ap = new App();
        ap.doWork();
    }
    public void doWork() throws InterruptedException {
        Thread th1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    plus();
                }
            }
        });
        Thread th2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                   plus();
                }
            }
        });
        th1.start();
        th2.start();
        
        th1.join();
        th2.join();
        
        System.out.println(count);

    }

}
