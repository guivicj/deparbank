package org.guivic.deparbank;

import java.util.Scanner;

public class OptionsDeposit implements MenuOption {

    @Override
    public void execute(BankAccount account) {
        System.out.print("Ammount to deposit: ");
        double amount = new Scanner(System.in).nextDouble();
        account.deposit(amount);
    }
}
