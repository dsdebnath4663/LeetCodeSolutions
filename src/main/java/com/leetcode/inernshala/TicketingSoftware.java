package com.leetcode.inernshala;

import java.util.Scanner;

public class TicketingSoftware {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the number of guests
        System.out.print("Enter the number of guests: ");
        int numberOfGuests = scanner.nextInt();

        int[] ages = new int[numberOfGuests];
        int totalCost = 0;

        // Get the age of each guest and calculate the total cost
        for (int i = 0; i < numberOfGuests; i++) {
            System.out.print("Enter the age of guest " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();
            totalCost = totalCost + calculatePrice(ages[i]);
        }

        // Display the ticket
        System.out.println("\n--- Entrance Ticket ---");
        for (int i = 0; i < numberOfGuests; i++) {
            System.out.println("Guest " + (i + 1) + " (Age " + ages[i] + "): INR " + calculatePrice(ages[i]));
        }
        System.out.println("Total Charges: INR " + totalCost);
    }

    // Method to calculate price based on age
    private static int calculatePrice(int age) {
        if (age <= 2) {
            return 0;
        } else if (age > 2 && age < 18) {
            return 100;
        } else if (age >= 18 && age < 60) {
            return 500;
        } else { // age >= 60
            return 300;
        }
    }
}
