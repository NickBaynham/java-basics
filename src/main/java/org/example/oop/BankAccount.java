package org.example.oop;

public class BankAccount {
    private String owner;
    private int balance;

    public BankAccount(String owner) {
        this.owner = owner;
        this.balance = 0;
    }

    public BankAccount(String owner, int balance) {
        this(owner);
        if (balance <= 0) System.out.println("Error: Balance must be greater than zero.");
        this.balance = Math.max(balance, 0);
    }

    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
        } else {
            System.out.println("Error: Amount must be greater than zero.");
        }
    }

    public int withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return amount;
        } else {
            System.out.println("\nError: amount must not be greater than the balance. Account: " + getOwner());
            return 0;
        }
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }

    public String toString() {
        return
                "\nName:\t" + getOwner() +
                "\nBalance:\t" + getBalance();
    }

    public void notifyCollections() {
        System.out.println("Collections Agency Notifed for account: " + owner);
    }
}
