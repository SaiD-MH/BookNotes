package code;

import java.util.logging.Level;
import java.util.logging.Logger;

public class VirtualThreadsEx1 {

    public static void main(String[] args) {

        Runnable run = () -> {

            int res = 1;
            for (int i = 0; i < 10; i++) {
                res *= 2;
            }

            System.out.println(res);
        };

        Thread th1 = Thread.ofVirtual().start(run);

        Thread th = Thread.ofVirtual().unstarted(run);

        th.start();

        try {
            th1.join();
            th.join();
        } catch (InterruptedException ex) {
        }

    }

}
