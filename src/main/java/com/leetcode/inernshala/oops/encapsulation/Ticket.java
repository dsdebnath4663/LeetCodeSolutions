package com.leetcode.inernshala.oops.encapsulation;

public class Ticket {

    private String eventName;
    private int numberOfTickets;
    private double pricePerTicket;


    public Ticket(String eventName,
                  int numberOfTickets,
                  double pricePerTicket) {
        this.eventName = eventName;
        this.numberOfTickets = numberOfTickets;
        this.pricePerTicket = pricePerTicket;

    }

    public double calculateTotalCost() {
        return numberOfTickets * pricePerTicket;
    }

    public void displayTicketDetails() {
        System.out.println("Event Name: " + eventName);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.println("Price Per Ticket: $" + pricePerTicket);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }



}
