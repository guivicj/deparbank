package org.guivic.deparbank;

import java.util.Scanner;

public class OptionsDeposit implements MenuOption {
    private double amount;

    public OptionsDeposit(double amount) {
        this.amount = amount;
    }

    @Override
    public void execute(BankAccount account) {
        System.out.print("Ammount to deposit: ");
        amount = new Scanner(System.in).nextDouble();
        account.deposit(amount);
    }
}
