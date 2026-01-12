package com.atm.service;

import com.atm.model.Account;

public class ATMService {
    // Business logic
    public boolean authenticate(Account account, String pin) {
        return account.getPin().equals(pin);
    }

    public void withdraw(Account account, double amount) {
        if (account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());
        } else {
            System.out.println("Insufficient funds.");
        }
    }

    public void deposit(Account account, double amount) {
        account.setBalance(account.getBalance() + amount);
        System.out.println("Deposit successful. New balance: " + account.getBalance());
    }

    public void checkBalance(Account account) {
        System.out.println("Current balance: " + account.getBalance());
    }
}