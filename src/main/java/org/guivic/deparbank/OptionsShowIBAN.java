package org.guivic.deparbank;

public class OptionsShowIBAN implements MenuOption {
    @Override
    public void execute(BankAccount account) {
        System.out.println("IBAN: " + account.getIban());
    }
}
