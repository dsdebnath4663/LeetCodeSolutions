package com.leetcode.inernshala.oops.inheritance;

public class Bank {
    private String name; // fields
    private String location;


    // Default constructor
    public Bank() {
        this.name = "Default Bank";
        this.location = "Default Location";
        System.out.println("Default constructor invoked");
    }

    // Parameterized constructor
    public Bank(String bankName, String bankLocation) {
        this.name = bankName;
        this.location = bankLocation;
        System.out.println("Parameterized constructor invoked");
    }


    public String getLocation() {
        return location;
    }

    public String getName() {// Method
        return name;
    }

    // Method to display bank details
    public void displayBankDetails() {
        System.out.println("Bank Name: " + name);
        System.out.println("Location: " + location);
    }

    public static void main(String[] args) {
        Bank bankObj = new Bank("ICICI", "GUSKARA");
        System.out.println("Bank Name :" + bankObj.getName());
        System.out.println("Bank Loction :" + bankObj.getLocation());
        Bank bank2Obj = new Bank("UCO", "AUSGRAM");
        System.out.println("Bank Name :" + bank2Obj.getName() + " " + "Bank Loction :" + bank2Obj.getLocation());
    }
}
