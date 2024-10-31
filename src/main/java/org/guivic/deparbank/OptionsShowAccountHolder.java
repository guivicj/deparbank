package org.guivic.deparbank;

public class OptionsShowAccountHolder implements MenuOption {
    @Override
    public void execute(BankAccount account) {
        System.out.println("Account holder: " + account.getAccountHolder());
    }
}
