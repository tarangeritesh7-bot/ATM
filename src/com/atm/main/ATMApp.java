package com.atm.main;


import com.atm.model.Account;
import com.atm.service.ATMService;
import com.atm.util.InputUtil;

public class ATMApp {
    public static void main(String[] args) {
        ATMService atmService = new ATMService();
        Account account = new Account(1000.0, "1234"); // Sample account with initial balance and PIN

        System.out.println("Welcome to ATM Simulation System");

        String pin = InputUtil.getStringInput("Enter PIN: ");
        if (atmService.authenticate(account, pin)) {
            boolean running = true;
            while (running) {
                System.out.println("\n1. Check Balance");
                System.out.println("2. Withdraw");
                System.out.println("3. Deposit");
                System.out.println("4. Change PIN");
                System.out.println("5. View Transaction History");
                System.out.println("6. Exit");
                int choice = InputUtil.getIntInput("Choose an option: ");
                switch (choice) {
                    case 1:
                        atmService.checkBalance(account);
                        break;
                    case 2:
                        double amount = InputUtil.getDoubleInput("Enter amount to withdraw: ");
                        atmService.withdraw(account, amount);
                        break;
                    case 3:
                        amount = InputUtil.getDoubleInput("Enter amount to deposit: ");
                        atmService.deposit(account, amount);
                        break;
                    case 4:
                        String newPin = InputUtil.getStringInput("Enter new PIN (4 digits): ");
                        atmService.changePin(account, newPin);
                        break;
                    case 5:
                        atmService.viewTransactionHistory(account);
                        break;
                    case 6:
                        running = false;
                        System.out.println("Thank you for using ATM.");
                        break;
                    default:
                        System.out.println("Invalid option. Please try again.");
                }
            }
        } else {
            System.out.println("Invalid PIN. Access denied.");
        }
    }
}