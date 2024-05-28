package com.leetcode.inernshala.jalantech;
import java.util.Scanner;

class Guest {
    int age;//field / attribute

    Guest(int age) {//constructor
        this.age = age;
    }

    public int getAge() {//method
        return age;
    }
}

class Ticket {
    Guest[] guests;//field / attribute
    int totalCost;//field / attribute

    Ticket(int numGuests) {//constructor
        guests = new Guest[numGuests];
    }

    public void addGuest(int index, int age) {
        guests[index] = new Guest(age);
    }

    public void calculateTotalCost() {
        totalCost = 0;
        for (Guest guest : guests) {
            if (guest.getAge() <= 2) {
                totalCost += 0;
            } else if (guest.getAge() < 18) {
                totalCost += 100;
            } else if (guest.getAge() < 60) {
                totalCost += 500;
            } else {
                totalCost += 300;
            }
        }
    }

    public void displayTicketDetails() {
        for (int i = 0; i < guests.length; i++) {
            System.out.println("Guest " + (i + 1) + " (age: " + guests[i].getAge() + ")");
        }
        System.out.println("Total Charges: INR " + totalCost);
    }

    public void displayTicketDetailsForSecurity() {
        System.out.println("Guests:");
        for (int i = 0; i < guests.length; i++) {
            System.out.println("Guest " + (i + 1) + " (age: " + guests[i].getAge() + ")");
        }
        System.out.println("Total Charges: INR " + totalCost);
    }
}

public class ZooTicketingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Ticket ticket = null;

        while (true) {
            System.out.println("\n--- Zoo Ticketing System  ---");
            System.out.println("1.  Issue a new ticket");
            System.out.println("2.  Validate a ticket");
            System.out.println("3.  Exit");
            System.out.print("Choose an option: ");

            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    ticket = issueTicket(scanner);
                    break;
                case 2:
                    validateTicket(ticket);
                    break;
                case 3:
                    System.out.println("Exiting Zoo Ticketing System. Goodbye!");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid option. Please choose again.");
            }
        }
    }

    public static Ticket issueTicket(Scanner scanner) {
        System.out.print("Enter the number of guests: ");
        int numGuests = scanner.nextInt();
        Ticket ticket = new Ticket(numGuests);

        for (int i = 0; i < numGuests; i++) {
            System.out.print("Enter age of guest " + (i + 1) + ": ");
            int age = scanner.nextInt();
            ticket.addGuest(i, age);
        }

        ticket.calculateTotalCost();

        System.out.println("\nTicket Issued Successfully!");
        System.out.println("Ticket Details:");
        ticket.displayTicketDetails();

        return ticket;
    }

    public static void validateTicket(Ticket ticket) {
        if (ticket == null) {
            System.out.println("No ticket issued yet. Please issue a ticket first.");
        } else {
            System.out.println("\nTicket Validated Successfully!");
            System.out.println("Ticket Details:");
            ticket.displayTicketDetailsForSecurity();


        }
    }
}
