package com.leetcode.inernshala.atm;

import java.util.Scanner;

public class ATMSoftware {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int currentBalance = 0;

        while (true) {

            System.out.println("\n--- ATM Menu ---");
            System.out.println("1. Check Balance ");
            System.out.println("2. Deposit Money ");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit          ");
            System.out.println("Choose an option:");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Your current balance is: $" + currentBalance);
                    break;
                case 2:
                    currentBalance = depositMoney(scanner, currentBalance);
                    break;
                case 3:
                    currentBalance = withdrawMoney(scanner, currentBalance);
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Goodbye! ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option choosed");
                    break;

            }
        }
    }

    private static int withdrawMoney(Scanner scanner, int currentBalance) {
        System.out.println("Enter amount to withdraw :");
        int withdrawAmount = scanner.nextInt();
        currentBalance = currentBalance - withdrawAmount;
        System.out.println("You have successfully withdrawn $" + withdrawAmount);
        System.out.println("Your current balance is: $" + currentBalance);
        return currentBalance;
    }

    private static int depositMoney(Scanner scanner, int currentBalance) {
        System.out.println("Enter amount to deposit:  :");
        int depositAmount = scanner.nextInt();
        currentBalance = currentBalance + depositAmount;
        System.out.println("You have successfully deposited $" + depositAmount);
        System.out.println("Your current balance is: $" + currentBalance);

        return currentBalance;
    }
}
