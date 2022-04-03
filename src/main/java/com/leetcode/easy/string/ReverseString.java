package com.leetcode.easy.string;

public class ReverseString {
    public static void reverseString(char[] charArrayOfs) {
        helper(0, charArrayOfs.length - 1, charArrayOfs);
    }

    private static void helper(int startIndex, int endIndex, char[] charArrayOfs) {
        if (startIndex >= endIndex) {
            return;
        }

        char temp = charArrayOfs[startIndex];
        charArrayOfs[startIndex] = charArrayOfs[endIndex];
        charArrayOfs[endIndex] = temp;

        helper(++startIndex, --endIndex, charArrayOfs);
    }


    public static void main(String[] args) {
        char[] charArrayOfs = {'h', 'e', 'l', 'l', 'o'};
        reverseString(charArrayOfs);
    }
}