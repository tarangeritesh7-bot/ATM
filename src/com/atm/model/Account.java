package com.atm.model;

import java.util.List;
import java.util.ArrayList;

public class Account {
    private double balance;
    private String pin;
    private List<String> transactions;

    // Constructor
    public Account(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;
        this.transactions = new ArrayList<>();
    }

    // Getters and Setters
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPin() {
        return pin;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public List<String> getTransactions() {
        return transactions;
    }

    public void addTransaction(String transaction) {
        transactions.add(transaction);
    }
}