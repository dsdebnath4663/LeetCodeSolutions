package com.leetcode.inernshala.oops.polymorphism.overriding;

public class Main {

    public static void main(String[] args) {
        Card myCard;


        myCard = new CreditCard();
        myCard.makePayment(100);

        myCard = new DebitCard();
        myCard.makePayment(200);
    }
}
