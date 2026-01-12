package com.atm.model;

public class Account {
    private double balance;
    private String pin;

    // Constructor
    public Account(double balance, String pin) {
        this.balance = balance;
        this.pin = pin;
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
}