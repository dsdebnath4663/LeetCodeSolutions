package com.leetcode.easy.recursion;

public class PowerOfTwo {
    public static boolean isPowerOfTwo(int n) {
        if (n < 0) return false; // -ve number
        if (n == 0) return false; // == 0
        if (n == 1) return true; // == 1
        if (n % 2 == 0)
            return isPowerOfTwo(n / 2);
        else
            return false;
    }
    public static void main(String args[]) {
        int n1=16;//,3
        System.out.println(isPowerOfTwo(n1));
    }
}
