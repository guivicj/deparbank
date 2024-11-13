package org.guivic.gson;


import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import org.guivic.deparbank.BankAccount;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class BankStorage {

    private String jsonFile;
    private List<BankAccount> bankAccounts;

    public BankStorage() {
        this.jsonFile = "./accounts.json";
        try {
            this.bankAccounts = loadAccounts();
        } catch (IOException e) {
            this.bankAccounts = new ArrayList<>();
        }
    }

    public void saveAccounts(BankAccount bankAccount) throws IOException {
        bankAccounts.add(bankAccount);
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        FileWriter fw = new FileWriter(jsonFile);
        gson.toJson(bankAccounts, fw);
        fw.close();
    }

    public List<BankAccount> loadAccounts() throws IOException {
        Gson gson = new Gson();
        FileReader fr = new FileReader(jsonFile);

        List<BankAccount> bankAccounts = new ArrayList<>();
        BankAccount[] accounts = gson.fromJson(fr, BankAccount[].class);
        if (accounts != null) {
            bankAccounts = new ArrayList<>(List.of(accounts));
        }
        fr.close();

        return bankAccounts;
    }

}
