package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class BankServiceImpl implements BankService {
    private static ArrayList<BankAccount> accountList;

    public BankServiceImpl() {
        accountList = new ArrayList<>();
    }

    @Override
    public BankAccount createByName(String name) {
        BankAccount account;
        if (name.equals("Simba")) {
            account = new BankAccount("Simba", 1000, "zebra", "lion", false, true);
        } else if (name.equals("Zazu")) {
            account = new BankAccount("Zazu", 1000, "fruit", "hornbill", false, true);
        } else if (name.equals("Pumbaa")) {
            account = new BankAccount("Pumbaa", 1000, "plant", "warthogs", false, true);
        } else if (name.equals("Timon")) {
            account = new BankAccount("Timon", 1000, "termite", "suricate", false, true);
        } else if (name.equals("Mufasa")) {
            account = new BankAccount("Mufasa", 10000, "zebra", "lion", true, true);
        } else if (name.equals("Scar")) {
            account = new BankAccount("Scar", 5000, "zebra", "lion", false, false);
        } else {
            account = null;
        }
        return account;
    }

    @Override
    public void addToList(BankAccount account) {
        if (account != null) {
            accountList.add(account);
        }
    }

    @Override
    public ArrayList<BankAccount> getAllAccountList() {
        return accountList;
    }

    @Override
    public void balanceIncrease(int index) {
        if (accountList.get(index).isKing()) {
            accountList.get(index).setBalance(accountList.get(index).getBalance() + 100);
        } else {
            accountList.get(index).setBalance(accountList.get(index).getBalance() + 10);
        }
        accountList.get(index).setBalanceWithCurrency();
    }
}
