package exceptions;

import java.sql.SQLOutput;

public class Account {

    private final int id;
    private double balance;
    private String owner;

    public Account(int id, double balance, String owner) {
        this.id = id;
        this.balance = balance;
        this.owner = owner;
    }

    public void withdraw(double amount) {
            if (amount > this.balance) {
                throw new IllegalArgumentException("Insufficient funds in account! ");
            }
            this.balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + this.balance);
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void close() {
        System.out.println(String.format("Account %d is closed%n", this.id));
    }

    public void getDetails() {
        System.out.printf("Account %d - %.2f - %s\n", this.id, this.balance, this.owner);
    }

}
