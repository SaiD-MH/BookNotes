package ryanandmonicajob;

public class BankAccount {

    private int balance = 200;

    public int getBalance() {
        return balance;
    }

    public void withdraw(int amount) {
         balance -= amount;
    }

}
