package com.leetcode.easy.string;

public class LengthOfLastWord {

    public static int lengthOfLastWord(String s) {
        int length = 0;

        // We are looking for the last word so let's go backward
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // a letter is found so count
                length++;
            } else {
                if (length > 0) return length;
            }
        }
        return length;
    }

    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(lengthOfLastWord(s));
    }

}