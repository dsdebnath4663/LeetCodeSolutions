package com.leetcode.inernshala.oops.inheritance.hybrid;

public class Person {


    public String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void displayPersonDetails() {
        System.out.println("Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}');
        ;
    }

}
