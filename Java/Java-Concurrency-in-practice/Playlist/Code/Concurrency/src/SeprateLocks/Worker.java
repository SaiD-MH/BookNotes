package SeprateLocks;

import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Worker {

    private ArrayList<Integer> list1 = new ArrayList<Integer>();
    private ArrayList<Integer> list2 = new ArrayList<Integer>();
    private Random rand = new Random();

    private Object lock1 = new Object();
    private Object lock2 = new Object();

    public void stageOne() throws InterruptedException {

        synchronized (lock1) {
            Thread.sleep(1);

            list1.add(rand.nextInt(100));
        }
    }

    public void stageTwo() throws InterruptedException {

        synchronized (lock2) {

            Thread.sleep(1);

            list2.add(rand.nextInt(100));
        }
    }

    public void process() throws InterruptedException {
        for (int i = 0; i < 1000; i++) {
            stageOne();
            stageTwo();
        }
    }

    public void main() throws InterruptedException {

        System.out.println("start.....");
        long st = System.currentTimeMillis();

        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    process();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        });
        th.start();
        th.join();
        long end = System.currentTimeMillis();

        System.out.println("Taken Time = " + (end - st));
        System.out.println("List1 Size = " + list1.size() + "   List2 Size =  " + list2.size());
    }

}
