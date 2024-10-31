package org.guivic.deparbank;

public class OptionsShowBalance implements MenuOption {
    @Override
    public void execute(BankAccount account) {
        System.out.println("Balance: " + account.getBalance());
    }
}
