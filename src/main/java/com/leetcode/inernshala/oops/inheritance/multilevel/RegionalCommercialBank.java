package com.leetcode.inernshala.oops.inheritance.multilevel;

import com.leetcode.inernshala.oops.inheritance.single.CommercialBank;

public class RegionalCommercialBank extends CommercialBank {
    private String region;

    public RegionalCommercialBank(String name, String location, String servicesOffered, String region) {
        super(name, location, servicesOffered);
        this.region = region;
    }
    @Override
    public void displayBankDetails() {
        super.displayBankDetails();
        System.out.println("Region : " + region);
    }
}
