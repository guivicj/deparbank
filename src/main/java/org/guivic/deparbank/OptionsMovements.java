package org.guivic.deparbank;

public class OptionsMovements implements MenuOption {
    @Override
    public void execute(BankAccount account) {
        System.out.println("Account movements");
        for (String movement : account.getMovements()) {
            System.out.println(movement);
        }
    }
}
