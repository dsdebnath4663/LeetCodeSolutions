package com.leetcode;

public class PureFunction {

   // static int count;//will get memory only once and retain its value

    PureFunction(int count) {
        count++;
        System.out.println(count);
    }

    public static void main(String args[]) {
        int count = 0;
        PureFunction c1 = new PureFunction(count);
        int count1 = 1;

        PureFunction c2 = new PureFunction(count1);
        int count2 = 2;

        PureFunction c = new PureFunction(count2);

    }


}
