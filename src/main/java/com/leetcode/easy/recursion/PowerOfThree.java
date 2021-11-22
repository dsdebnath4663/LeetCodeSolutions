package com.leetcode.easy.recursion;

public class PowerOfThree {
    public boolean isPowerOfThree(int n) {
        if (n < 0) return false; // -ve number
        if (n == 0) return false; // == 0
        if (n == 1) return true; // == 1
        if (n % 3 == 0)
            return isPowerOfThree(n / 3);
        else
            return false;
    }

}
