/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.accountp;

/**
 *
 * @author Oceane
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Accountp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String buffer_String;
        int buffer_Int;
        double buffer_Double;
        Account acc;
        Account recipient = new Account("Recipient", 1234567890); // Dummy account for the transfer() function

        System.out.println("\nWelcome to your bank account! Before we proceed, please enter the following details: ");
        while (true) {
            try {
                System.out.print("Please enter your account name: ");
                buffer_String = input.nextLine();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                input.next();
            }
        }

        while (true) {
            try {
                System.out.print("Please enter your account number: ");
                buffer_Int = input.nextInt();
                acc = new Account(buffer_String, buffer_Int);
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input.");
                input.next();
            }
        }

        int choice = 0;
        while (choice != 6) {
            System.out.println("\nSelect action in bank account");
            System.out.print("1. Deposit\n2. Withdraw\n3. Check balance\n4. Transfer money\n5. Display account details\n6. Exit\nAction: ");
            try {
                choice = input.nextInt();
                System.out.println();
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again.");
                input.next();
            }
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount (only in multiples of 100) (press a non-decimal to cancel): ");
                    try {
                        buffer_Double = input.nextDouble();
                        acc.deposit(buffer_Double);
                        acc.verify();
                    } catch (InputMismatchException e) {
                        System.out.println("\nDeposit canceled.\n");
                    }
                    break;
                case 2:
                    if (acc.getAvailableBalance() == 0) {
                        System.out.println("You have no available balance to withdraw.");
                        break;
                    }
                    System.out.println("Enter amount (only in multiples of 100) (press a non-decimal to cancel): ");
                    try {
                        buffer_Double = input.nextDouble();
                        acc.withdraw(buffer_Double);
                    } catch (InputMismatchException e) {
                        System.out.println("\nWithdrawal canceled.\n");
                    }
                    break;
                case 3:
                    System.out.println("Your current balance is: " + acc.checkBalance());
                    break;
                case 4:
                    if (acc.getAvailableBalance() == 0) {
                        System.out.println("No balance to transfer!");
                        break;
                    }
                    System.out.println("Enter recipient's account number (press a non-digit to cancel): ");
                    try {
                        buffer_Int = input.nextInt();
                    } catch (InputMismatchException e) {
                        System.out.println("\nTransfer canceled.\n");
                        break;
                    }
                    System.out.println("Enter amount you wish to transfer (press a non-digit to cancel): ");
                    double amount;
                    try {
                        amount = input.nextDouble();
                    } catch (InputMismatchException e) {
                        System.out.println("\nTransfer canceled.\n");
                        break;
                    }
                    acc.transfer(recipient, amount);
                    break;
                case 5:
                    acc.display();
                    break;
                case 6:
                    System.out.println("Thank you for using the bank account. Goodbye!");
                    break;
            }
        }
        input.close();
    }
}