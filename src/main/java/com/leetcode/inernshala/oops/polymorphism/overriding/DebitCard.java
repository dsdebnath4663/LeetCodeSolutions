package com.leetcode.inernshala.oops.polymorphism.overriding;

public class DebitCard extends Card{

    //Runtime Polymorphism (Method Overriding)
    @Override
    void makePayment(double amount) {
        System.out.println("Making a debit card payment of $" + amount);
    }

}
