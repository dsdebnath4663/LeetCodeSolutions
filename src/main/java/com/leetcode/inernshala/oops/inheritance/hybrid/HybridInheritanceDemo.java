package com.leetcode.inernshala.oops.inheritance.hybrid;


public class HybridInheritanceDemo {
    public static void main(String[] args) {
        Manager manager = new Manager("Dev", 18, 1000.29);
        manager.conductMeeting();
        manager.processPayment();
        manager.promote();

        System.out.println();

        Developer developer = new Developer( "Kunal", 21,27000.29);
        developer.writeCode();
        developer.processPayment();
        developer.displayEmployeeDetails();


    }
}
