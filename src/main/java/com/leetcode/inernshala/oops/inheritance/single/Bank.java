package com.leetcode.inernshala.oops.inheritance.single;

public class Bank {

    private String name;
    private String location;

    public Bank(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public void displayBankDetails() {
        System.out.println("Bank{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}');
    }


}
