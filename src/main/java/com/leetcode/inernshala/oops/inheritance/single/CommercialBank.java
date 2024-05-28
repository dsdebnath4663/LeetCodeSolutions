package com.leetcode.inernshala.oops.inheritance.single;

public class CommercialBank extends  Bank{

    private String servicesOffered;

    public String getServicesOffered() {
        return servicesOffered;
    }

    public CommercialBank(String name, String location, String servicesOffered) {
        super(name, location);
        this.servicesOffered=servicesOffered;
    }

    @Override
    public void displayBankDetails() {
       super.displayBankDetails();
        System.out.println("Services Offered: " + servicesOffered);
    }



}
