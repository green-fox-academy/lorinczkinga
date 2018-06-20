package com.greenfoxacademy.bankofsimba.services;

import com.greenfoxacademy.bankofsimba.models.BankAccount;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public interface BankService {

    public BankAccount createByName(String name);
    public void addToList(BankAccount account);
    public ArrayList<BankAccount> getAllAccountList();
    public void balanceIncrease(int index);
}
