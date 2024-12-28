/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mytime;

/**
 *
 * @author Oceane
 */

import java.util.InputMismatchException;
import java.util.Scanner;


public class MyTime {

    public static void main(String[] args) {
        Clock t = new Clock();
        Scanner input = new Scanner(System.in);
        boolean not_end = true;
        do {
            try {
                System.out.print("\nWhat would you like to do?\n 1. Display time\n 2. Set time\n 3. Advance time by seconds\n 4. Tick by seconds\n 5. Tick by minutes\n 6. Tick by hours\n 7. End\nEnter here: ");
                int choice = input.nextInt();
                
                switch (choice) {
                    case 1:
                        System.out.println("\n" + t);
                        break;
                    case 2:
                        System.out.print("Enter how many hours: ");
                        int time = input.nextInt();
                        t.setHours(time);
                        System.out.print("Enter how many minutes: ");
                        time = input.nextInt();
                        t.setMinutes(time);
                        System.out.print("Enter how many seconds: ");
                        time = input.nextInt();
                        t.setSeconds(time);
                        break;
                    case 3:
                        System.out.print("Enter by how many seconds to advance the time: ");
                        int seconds = input.nextInt();
                        t.advanceTime(seconds);
                        break;
                    case 4:
                        t.tickBySecond();
                        break;
                    case 5:
                        t.tickByMinute();
                        break;
                    case 6:
                        t.tickByHour();
                        break;
                    case 7:
                        not_end = false;
                        break;
                    default:
                        System.out.println("Invalid option. Please choose again.");
                        break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\nInvalid input.");
                input.next();
            }
        } while (not_end);
        input.close();
    }
}