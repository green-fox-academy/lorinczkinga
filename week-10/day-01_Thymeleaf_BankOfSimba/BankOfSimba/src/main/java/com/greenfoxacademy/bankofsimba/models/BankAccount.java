package com.greenfoxacademy.bankofsimba.models;

public class BankAccount {
    private String name;
    private String balanceWithCurrency;
    private double balance;
    private String currency;
    private String animalType;
    private boolean isKing;
    private boolean isGoodGuy;

    public BankAccount() {
    }

    public BankAccount(String name, double balance, String currency, String animalType) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        setBalanceWithCurrency();
        this.animalType = animalType;
        this.isKing = false;
    }

    public String getBalanceWithCurrency() {
        return balanceWithCurrency;
    }

    public void setBalanceWithCurrency() {
        String roundedValue = "";
        String balanceWithCurrency;
        if (currency != null) {
            roundedValue = String.format("%.2f", this.balance);
            balanceWithCurrency = roundedValue + " " + currency;
        } else {
            balanceWithCurrency = Double.toString(this.balance);
        }
        this.balanceWithCurrency = balanceWithCurrency;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BankAccount(String name, double balance, String currency, String animalType, boolean isKing, boolean isGoodGuy) {
        this.name = name;
        this.balance = balance;
        this.currency = currency;
        setBalanceWithCurrency();
        this.animalType = animalType;
        this.isKing = isKing;
        this.isGoodGuy = isGoodGuy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setAnimalType(String animalType) {
        this.animalType = animalType;
    }

    public void setKing(boolean king) {
        isKing = king;
    }

    public void setGoodGuy(boolean goodGuy) {
        isGoodGuy = goodGuy;
    }

    public String getName() {
        return name;
    }

    public double getBalance() {
        return balance;
    }

    public String getAnimalType() {
        return animalType;
    }

    public boolean isKing() {
        return isKing;
    }

    public boolean isGoodGuy() {
        return isGoodGuy;
    }
}
