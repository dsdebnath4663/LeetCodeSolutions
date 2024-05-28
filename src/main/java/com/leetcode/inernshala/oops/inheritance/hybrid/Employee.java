package com.leetcode.inernshala.oops.inheritance.hybrid;

public class Employee extends Person {
    double salary;

    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;

    }
    public  void  displayEmployeeDetails(){
        super.displayPersonDetails();
        System.out.println("Salary :"+salary);
    }


}
