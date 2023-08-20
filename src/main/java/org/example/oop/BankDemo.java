package org.example.oop;

import java.util.ArrayList;
import java.util.List;

public class BankDemo {
    static List<BankAccount> bankAccounts = new ArrayList<>();

    public static void main(String[] args) {
        BankAccount scottSteele = new BankAccount("Scott Steele", 1_000_000);
        BankAccount danPfeiffer = new BankAccount("Dan Pfeiffer", 1);
        BankAccount jasonBerner = new BankAccount("Jason Berner", 500);

        bankAccounts.add(scottSteele);
        bankAccounts.add(danPfeiffer);
        bankAccounts.add(jasonBerner);

        displayAccounts();

        // Withdrawals

        int amount = 10;
        int scottCash = scottSteele.withdraw(amount);
        int jasonCash = jasonBerner.withdraw(amount);
        int danCash = danPfeiffer.withdraw(amount);

        displayAccounts();

        // Balances
        int scottBal = scottSteele.getBalance();
        int JasonBal = jasonBerner.getBalance();
        int danBal = danPfeiffer.getBalance();

        if (danBal < amount) {
            danPfeiffer.notifyCollections();
        }
    }

    private static void displayAccounts() {
        for (BankAccount act : bankAccounts) {
            System.out.println(act.toString());
        }
    }
}
