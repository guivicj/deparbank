package org.guivic.deparbank;

import org.guivic.exceptions.errorBalanceException;
import org.guivic.exceptions.errorHolderException;
import org.guivic.exceptions.errorIbanException;

public class Deparbank {

    private String iban;
    private String accountHolder;
    private double balance;

    public Deparbank(String iban, String accountHolder, double balance) throws errorIbanException, errorHolderException, errorBalanceException {
        if (validateIban(iban)) {
            this.iban = iban;
        } else {
            throw new errorIbanException("Error while validating iban");
        }
        if (validateHolder(accountHolder)) {
            this.accountHolder = accountHolder;
        } else {
            throw new errorHolderException("Error while validating holder");
        }
        if (validateBalance(balance)) {
            this.balance = balance;
        } else {
            throw new errorBalanceException("Error while validating balance");
        }
    }

    private boolean validateIban(String iban) {
        boolean valid = false;
        if (iban.matches("ES[\\d]{22}")) {
            valid = true;
        }
        return valid;
    }

    private boolean validateHolder(String accountHolder) {
        boolean valid = false;
        if (!accountHolder.isEmpty() && accountHolder != null) {
            valid = true;
        }
        return valid;
    }

    private boolean validateBalance(double balance) {
        boolean valid = false;
        if (balance > 0) {
            valid = true;
        }
        return valid;
    }

    public void launchBank() {

    }


}
