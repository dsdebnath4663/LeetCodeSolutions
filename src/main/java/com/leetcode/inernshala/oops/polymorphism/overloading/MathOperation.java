package com.leetcode.inernshala.oops.polymorphism.overloading;

public class MathOperation {

    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b, double c) {
        return a + b + c;
    }

    String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperation mathOperationObject = new MathOperation();

        int sum = mathOperationObject.add(1,2);
        System.out.println(sum);



        double sumOfDouble = mathOperationObject.add(1.2,2.3,3.4);
        System.out.println(sumOfDouble);


        String sumOfStrings = mathOperationObject.add("Debnath "," Saha");
        System.out.println(sumOfStrings);
    }
}
