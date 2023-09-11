package ryanandmonicajob;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RyanAndMonicaJob implements Runnable {

    BankAccount account = new BankAccount();

    public static void main(String[] args) {
        RyanAndMonicaJob theJob = new RyanAndMonicaJob();

        Thread one = new Thread(theJob);
        Thread two = new Thread(theJob);

        one.setName("Ryan");
        two.setName("Monica");

        one.start();
        two.start();

    }

    public void run() {

        for (int i = 0; i < 10; i++) {
            makeWithdrawal(10);

            if (account.getBalance() <= 0) {
                System.out.println("!!!!!!!! negative balance !!!!!!!!!!");
            }
        }

    }

    private synchronized void makeWithdrawal(int amount) {

        if (account.getBalance() >= amount) {

            System.out.println(Thread.currentThread().getName() + " is about to withdraw");
            try {
                System.out.println(Thread.currentThread().getName() + " is going to sleep & cur = " + account.getBalance());

                Thread.sleep(500);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " is WakeUp & cur = " + account.getBalance());

            account.withdraw(amount);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawl" );

        } else {

            System.out.println("Sorry, not enough for " + Thread.currentThread().getName());

        }

    }

}
