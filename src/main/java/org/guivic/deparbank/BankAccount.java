package org.guivic.deparbank;

import java.util.ArrayList;
import java.util.List;

public class BankAccount {
    private String iban;
    private String accountHolder;
    private double balance;
    private List<String> movements;

    public BankAccount(String iban, String accountHolder, double balance) {
        this.iban = iban;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.movements = new ArrayList<>();
    }

    public String getIban() {
        return iban;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public List<String> getMovements() {
        return movements;
    }

    public void deposit(double amount) {
        if (amountIsValid(amount)) {
            balance += amount;
            movements.add("Deposit of " + amount + "€ in " + iban);
            System.out.println("New Balance: " + getBalance());
            if (amountOver3k(amount)) {
                System.out.println("NOTICE: REPORT TO TAX AUTHORITIES");
            }
        }
    }

    public void withdraw(double amount) {
        if (amountIsValid(amount)) {
            if (balance - amount >= -50) {
                balance -= amount;
                movements.add("Withdraw of " + amount + "€ at " + iban);
                System.out.println("New Balance: " + getBalance());
                if (balance < 0) {
                    System.out.println("NOTICE: NEGATIVE BALANCE");
                }
                if (amountOver3k(amount)) {
                    System.out.println("NOTICE: REPORT TO TAX AUTHORITIES");
                }
            }
        } else {
            System.out.println("ERROR: NOT ENOUGH BALANCE");
        }
    }

    private static boolean amountOver3k(double amount) {
        return amount > 3000;
    }

    private static boolean amountIsValid(double amount) {
        return amount > 0;
    }
}
