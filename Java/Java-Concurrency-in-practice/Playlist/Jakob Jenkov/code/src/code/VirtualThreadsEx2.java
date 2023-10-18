package code;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class VirtualThreadsEx2 {

    public static void main(String[] args) {

        ArrayList<Thread> lst = new ArrayList<Thread>();

        int sz = 100_000;
        for (int i = 0; i < sz; i++) {
            int idx = i;
            Thread th = Thread.ofVirtual().start(() -> {
                int res = 1;
                for (int j = 0; j < 10; j++) {
                    res *= (j + 1);
                }

                System.out.println("Res of Thread[ " + idx + " ] = " + res);

            });
            lst.add(th);

        }

        for (int i = 0; i < lst.size(); i++)
            try {
            lst.get(i).join();
        } catch (InterruptedException ex) {

        }

    }

}
