package com.leetcode.inernshala.oops.inheritance.hierarchical;

import com.leetcode.inernshala.oops.inheritance.Bank;

public class CommercialBank extends Bank {
    private String servicesOffered;

    public CommercialBank(String bankName, String bankLocation, String nameOfServicesOffered) {
        super(bankName, bankLocation);
        this.servicesOffered = nameOfServicesOffered;
    }

    public String getServicesOffered() {
        return servicesOffered;
    }
}
