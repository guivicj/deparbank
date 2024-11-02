package org.guivic.main;

import org.guivic.deparbank.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Deparbank {

    public static void main(String[] args) {
        try {
            System.out.print("IBAN : ");
            String iban = new Scanner(System.in).nextLine();
            System.out.print("Account holder : ");
            String accountHolder = new Scanner(System.in).nextLine();
            System.out.print("Balance : ");
            Double balance = new Scanner(System.in).nextDouble();

            BankAccount bankAccount = new BankAccount(iban, accountHolder, balance);
            boolean exit = false;

            Map<Integer, MenuOption> options = new HashMap<>();

            optionsToMap(options);

            while (!exit) {
                System.out.print("""
                        MAIN MENU
                        =========
                        [ 1 ] Account details
                        [ 2 ] Show IBAN
                        [ 3 ] Show Account Holder
                        [ 4 ] Show Balance
                        [ 5 ] Deposit
                        [ 6 ] Withdraw
                        [ 7 ] Movements
                        [ 8 ] Exit
                        ---
                        Choose an option: \s""");
                int option = new Scanner(System.in).nextInt();

                MenuOption menuOption = options.get(option);
                if (menuOption != null) {
                    menuOption.execute(bankAccount);
                    System.out.print("Press any key to continue...: ");
                    String scan = new Scanner(System.in).nextLine();
                } else {
                    exit = true;
                }
            }
        } catch (Exception e) {
            System.out.println("ERROR: Incorrect Input");
        }
    }

    private static void optionsToMap(Map<Integer, MenuOption> options) {
        options.put(1, new Options());
        options.put(2, new OptionsShowIBAN());
        options.put(3, new OptionsShowAccountHolder());
        options.put(4, new OptionsShowBalance());
        options.put(5, new OptionsDeposit());
        options.put(6, new OptionsWithdraw());
        options.put(7, new OptionsMovements());
    }
}
