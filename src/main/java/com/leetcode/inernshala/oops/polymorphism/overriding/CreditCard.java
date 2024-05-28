package com.leetcode.inernshala.oops.polymorphism.overriding;

public class CreditCard extends Card{

    @Override
    void makePayment(double amount) {
        System.out.println("Making a payment of $" + amount+" credit card");
    }
}
