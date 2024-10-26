package org.guivic.main;

import org.guivic.deparbank.Deparbank;
import org.guivic.exceptions.errorBalanceException;
import org.guivic.exceptions.errorHolderException;
import org.guivic.exceptions.errorIbanException;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws errorHolderException, errorIbanException, errorBalanceException {
        String iban = "ES6621000418401234567891";
        String accountHolder = "Chemi";
        Double balance = 500.0;
        Deparbank deparbank = new Deparbank(iban, accountHolder, balance);
        deparbank.launchBank();


    }


}