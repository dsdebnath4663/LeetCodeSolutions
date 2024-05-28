package com.leetcode.inernshala.oops;

public class ObjectExample {
    public static void main(String[] args) {
        Object obj = new Object ();
        String str = "Debnath";
        String str2 = "DEBNATh";

        Integer num = 43;
        System.out.println("Object class: " + obj.getClass());
        System.out.println("String class: " + str.getClass());
        System.out.println("Integer class: " + num.getClass());

        System.out.println("String str hash code: " + str.hashCode());
        System.out.println("String str2 hash code: " + str2.hashCode());

    }
}
