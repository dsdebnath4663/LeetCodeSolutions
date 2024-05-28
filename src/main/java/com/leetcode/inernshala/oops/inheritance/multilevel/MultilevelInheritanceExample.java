package com.leetcode.inernshala.oops.inheritance.multilevel;

public class MultilevelInheritanceExample {

    public static void main(String[] args) {
        // Creating an instance of RegionalCommercialBank
        RegionalCommercialBank regionalBank = new RegionalCommercialBank("XYZ Bank", "Downtown", "Loans, Savings Accounts", "Northeast");

        // Displaying details of the regional commercial bank
        System.out.println("Regional Commercial Bank Details:");
        regionalBank.displayBankDetails();
    }
}
