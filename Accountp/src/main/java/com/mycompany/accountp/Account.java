/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.accountp;

/**
 *
 * @author Oceane
 */
public class Account {
    private double current_balance; // All deposits
    private double available_balance; // Verified deposits
    private String accountName;
    private int accountNumber;

    public Account(String accountName, int accountNumber) {
        this.current_balance = 0;
        this.available_balance = 0;
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public double getCurrentBalance() {
        return current_balance;
    }

    public double getAvailableBalance() {
        return available_balance;
    }

    public String getAccountName() {
        return accountName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public boolean deposit(double amount) {
        if (amount % 100 != 0) {
            System.out.println("\nYou can deposit only in multiples of 100.");
            return false;
        }
        current_balance += amount;
        System.out.println("\nDeposit successful.");
        return true;
    }

    public boolean withdraw(double amount) {
        if (amount > available_balance || amount % 100 != 0) {
            System.out.println("\nInsufficient balance.");
            return false;
        }
        current_balance -= amount;
        available_balance -= amount;
        System.out.println("\nWithdrawal successful.");
        return true;
    }

    public double checkBalance() {
        return available_balance;
    }

    public boolean transfer(Account another, double amount) {
        if (amount > available_balance || amount % 100 != 0) {
            System.out.println("\nYour account has insufficient available balance.");
            return false;
        }
        this.withdraw(amount);
        another.deposit(amount);
        another.verify(); // This is just for the sake of the exercise
        System.out.println("\nTransfer successful.");
        return true;
    }

    public boolean verify() {
        if (available_balance == current_balance) {
            return false;
        }
        available_balance = current_balance;
        return true;
    }

    public void display() {
        System.out.println("Account ID: " + this.accountNumber);
        System.out.println("Account Name: " + this.accountName);
        System.out.println("Current Balance: " + this.current_balance);
        System.out.println("Available Balance: " + this.available_balance);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Account ID: ").append(this.accountNumber).append("\n");
        sb.append("Account Name: ").append(this.accountName).append("\n");
        sb.append("Current Balance: ").append(this.current_balance).append("\n");
        sb.append("Available Balance: ").append(this.available_balance);
        return sb.toString();
    }
}