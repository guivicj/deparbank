package org.guivic.deparbank;

import java.util.Scanner;

public class OptionsWithdraw implements MenuOption {
    private double amount;

    public OptionsWithdraw(double amount) {
        this.amount = amount;
    }

    @Override
    public void execute(BankAccount account) {
        System.out.print("Amount to withdraw: ");
        double amount = new Scanner(System.in).nextDouble();
        account.withdraw(amount);
    }
}
