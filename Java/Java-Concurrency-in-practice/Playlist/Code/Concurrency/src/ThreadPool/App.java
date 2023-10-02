package ThreadPool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

public class App {

    public static void main(String[] args) {
        ExecutorService ex = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 5; i++) {
            ex.submit(new Processor(i));
        }

        ex.shutdown();

        try {
            ex.awaitTermination(1, TimeUnit.DAYS);

        } catch (InterruptedException ex1) {

        }

    }

}
