package com.leetcode.inernshala.oops.inheritance.multiple;


public class UniversalBank implements Bank, CommercialBankServices, InvestmentBankServices {


    private String name;
    private String location;
    private String commercialServices;
    private String investmentServices;

    public UniversalBank(String name, String location, String commercialServices, String investmentServices) {
        this.name = name;
        this.location = location;
        this.commercialServices = commercialServices;
        this.investmentServices = investmentServices;
    }


    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getLocation() {
        return location;
    }

    @Override
    public void displayBankDetails() {
        System.out.println("UniversalBank{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", commercialServices='" + commercialServices + '\'' +
                ", investmentServices='" + investmentServices + '\'' +
                '}');
    }

    @Override
    public String getCommercialServices() {
        return commercialServices;
    }

    @Override
    public String getInvestmentServices() {
        return investmentServices;
    }
}
