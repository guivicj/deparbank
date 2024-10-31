package org.guivic.deparbank;

public class Options implements MenuOption {
    @Override
    public void execute(BankAccount account) {
        System.out.println("IBAN: " + account.getIban());
        System.out.println("Account holder: " + account.getAccountHolder());
        System.out.println("Balance: " + account.getBalance());
    }
}

