package com.leetcode.medium.linkedlist;

public class SumofTwoIntegers {
    public static int getSum(int a, int b) {
        while(b!=0)
        {
            int temp = (a & b) << 1;
            a = a ^ b;
            b = temp;
        }
        return a;
    }
public static void main (String[] args){
    int a = 1;
    int b=2;
    System.out.println(getSum('a','b'));
}
}

