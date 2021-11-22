package com.leetcode.easy.dp;

public class PalindromeNumber {


    public static boolean isPalindrome(int x) {

        String actualNumber = String.valueOf(x);
        char[] numbers = actualNumber.toCharArray();

        StringBuilder afterReversed = new StringBuilder();

        for (int i = numbers.length - 1; i >= 0; --i) {
            afterReversed.append(numbers[i]);
        }

        if (actualNumber.equalsIgnoreCase(afterReversed.toString())) {
            return true;
        }
        return false;


    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
    }
}
