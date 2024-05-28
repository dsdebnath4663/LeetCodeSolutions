package com.leetcode.inernshala;

import java.util.Scanner;

public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        int[][] issuedTickets = new int[100][];
        int[] totalCosts = new int[100];
        int ticketCount = 0;
        while (true) {

            System.out.println("\n--- 🐾 Zoo Ticketing System 🐾 ---");
            System.out.println("1. 🎫 Issue a new ticket");
            System.out.println("2. 🔍 Validate a ticket");
            System.out.println("3. 🚪 Exit");
            System.out.print("Choose an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    int[] tickets = issueTicket(scanner); //storing tickets for customers

                    int totalCostOfTickets = calculateTotalCostOfTickets(tickets);

                    issuedTickets[ticketCount] = tickets; //sold tickets are storing on issuedTickets array where ticketCount is the index
                    totalCosts[ticketCount] = totalCostOfTickets;//totalCostOfTickets value is stored on totalCosts array
                    ticketCount++;//incrementing index
                    displayTickets(tickets, totalCosts, ticketCount);

                    System.out.println("Ticket issued successfully");
                    break;
                case 2:
                    validateTickets(scanner, issuedTickets, ticketCount);
                    break;

                case 3:
                    System.out.println("Exiting... ");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option choosed");
                    break;
            }
        }

    }

    private static void validateTickets(Scanner scanner, int[][] issuedTickets, int ticketCount) {
        System.out.println("--:Enter ticket number to validate :---");
        int ticketNumber = scanner.nextInt();
        int[] tickets = issuedTickets[ticketCount - 1];

        if (ticketNumber <= 0 || ticketNumber > ticketCount) {
            System.out.println("It's a invalid ticket");
        } else {
            System.out.println("Ticket number is valid");
            for (int i = 0; i < tickets.length; i++) {
                System.out.println("Guest " +i+ "(age: "+tickets[i]+")");
            }
        }


    }

    private static void displayTickets(int[] tickets, int[] totalCosts, int ticketCount) {
        System.out.println("\n--- Entrance Ticket Details ---");
        for (int i = 0; i < tickets.length; i++) {
            System.out.println("Entrance Price of guest " + (i + 1) + " of age :" + tickets[i] + " is :" + ticketPriceCalculator(tickets[i]));

        }
        System.out.println("Total Entrance Price is :" + calculateTotalCostOfTickets(tickets));
    }

    private static int calculateTotalCostOfTickets(int[] tickets) {

        int totalEntrancePrice = 0;
        for (int i = 0; i < tickets.length; i++) {
            totalEntrancePrice = totalEntrancePrice + ticketPriceCalculator(tickets[i]);
        }

        return totalEntrancePrice;
    }

    private static int[] issueTicket(Scanner scanner) {

        System.out.println("Enter number of guests  : ");
        int numberOfGuests = scanner.nextInt();

        int[] ages = new int[numberOfGuests];


        for (int i = 0; i < numberOfGuests; i++) {
            System.out.print("Enter the age of guest " + (i + 1) + ": ");
            ages[i] = scanner.nextInt();// setting age in ages array of index i
        }
        return ages;
    }

    private static int ticketPriceCalculator(int age) {

        int entrancePrice = 0;
        if (age <= 2) {
            entrancePrice = 0;
        } else if (age > 2 && age < 18) {
            entrancePrice = 100;
        } else if (age >= 18 && age < 60) {
            entrancePrice = 500;
        } else {
            entrancePrice = 300;
        }

        return entrancePrice;
    }

}


