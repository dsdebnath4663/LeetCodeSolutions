package com.leetcode.inernshala.oops.inheritance.multilevel.interfacee;


interface Payable{
    void processSalary();
}


interface Promotable{
    void processPromotion();
}

class Employee implements Payable,Promotable {

    private String name;
    private double salary;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
    }

    @Override
    public void processSalary() {
        System.out.println("Processing payment for " + name + " with salary: $" + salary);
    }

    @Override
    public void processPromotion() {
        salary *= 1.1; // Increase salary by 10% for promotion
        System.out.println(name + " has been promoted. New salary: $" + salary);
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Employee employeeObject = new Employee("Debnaath",30.23);
        employeeObject.processSalary();

        employeeObject.processPromotion();
    }
}
