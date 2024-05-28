package com.leetcode.inernshala.oops.inheritance.hybrid;

import javax.naming.Name;

public class Developer extends Employee implements Payable {

    public Developer(String name, int age, double salary) {
        super(name, age, salary);
    }

    @Override
    public void processPayment() {
        System.out.println("Developer " + name + "'s credited successfully with $." + salary);
    }

    public void writeCode(){
        System.out.println(name +" is writing code ");
    }
}
