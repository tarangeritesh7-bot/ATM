package com.atm.service;

import com.atm.model.Account;

public class ATMService {
    // Business logic
    public boolean authenticate(Account account, String pin) {
        return account.getPin().equals(pin);
    }

    public void withdraw(Account account, double amount) {
        if (amount > 0 && account.getBalance() >= amount) {
            account.setBalance(account.getBalance() - amount);
            account.addTransaction("Withdrawn: $" + amount + " | Balance: $" + account.getBalance());
            System.out.println("Withdrawal successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid amount or insufficient funds.");
        }
    }

    public void deposit(Account account, double amount) {
        if (amount > 0) {
            account.setBalance(account.getBalance() + amount);
            account.addTransaction("Deposited: $" + amount + " | Balance: $" + account.getBalance());
            System.out.println("Deposit successful. New balance: $" + account.getBalance());
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    public void checkBalance(Account account) {
        System.out.println("Current balance: $" + account.getBalance());
    }

    public void changePin(Account account, String newPin) {
        if (newPin != null && newPin.length() == 4 && newPin.matches("\\d{4}")) {
            account.setPin(newPin);
            account.addTransaction("PIN changed");
            System.out.println("PIN changed successfully.");
        } else {
            System.out.println("Invalid PIN. Must be 4 digits.");
        }
    }

    public void viewTransactionHistory(Account account) {
        System.out.println("Transaction History:");
        if (account.getTransactions().isEmpty()) {
            System.out.println("No transactions yet.");
        } else {
            for (String transaction : account.getTransactions()) {
                System.out.println("- " + transaction);
            }
        }
    }
}