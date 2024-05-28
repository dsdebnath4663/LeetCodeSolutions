package com.leetcode.inernshala.oops.inheritance.hybrid;

public class Manager extends Employee implements Promotable, Payable{

    public Manager(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void promote() {
        System.out.println("Promote manger name is :"+name);
    }

    @Override
    public void processPayment() {
        System.out.println( "Payment processed for  :"+name+ " with $."+ salary);
    }

    public void conductMeeting (){
        System.out.println(name+" can conduct meeting ");
    }
}
