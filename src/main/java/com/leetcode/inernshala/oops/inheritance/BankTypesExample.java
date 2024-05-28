package com.leetcode.inernshala.oops.inheritance;

import com.leetcode.inernshala.oops.inheritance.hierarchical.CommercialBank;
import com.leetcode.inernshala.oops.inheritance.hierarchical.InvestmentBank;

public class BankTypesExample {
    public static void main(String[] args) {
        CommercialBank commercialBank = new CommercialBank("ICICI", "GUSKARA", "Loans, Savings Accounts");
        InvestmentBank investmentBank = new InvestmentBank("MORGAN STANLEY" ,"Mumbai", "Mergers & Acquisitions, IPOs");

        System.out.println("Commercial Bank Details:");
        System.out.println("Name: " + commercialBank.getName());
        System.out.println("Location: " + commercialBank.getLocation());
        System.out.println("Services Offered: " + commercialBank.getServicesOffered());


        System.out.println();


        System.out.println("Investment Bank Details:");
        System.out.println("Name: " + investmentBank.getName());
        System.out.println("Location: " + investmentBank.getLocation());
        System.out.println("Services Offered: " + investmentBank.getInvestmentServices());



    }
}
