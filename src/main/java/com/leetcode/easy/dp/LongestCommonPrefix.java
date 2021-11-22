package com.leetcode.easy.dp;

public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();
        int counter = 0;
        for (int i = 0; i < strs[0].length(); i++) {
            for (int j = 1; j < strs.length; j++) {
                if (i >= strs[j].length()) {
                    return stringBuilder.toString();
                }
                if (strs[0].charAt(i) == strs[j].charAt(i)) {
                    counter++;
                } else {
                    return stringBuilder.toString();
                }
                if (counter == strs.length - 1) {
                    stringBuilder.append(strs[0].charAt(i));
                }

            }
            if (strs.length == 1) {
                stringBuilder.append(strs[0]);
            }
            counter = 0;
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {

         String[] strs ={"a"};//{"flower","flow","flight"};
       // String[] strs = {"dog", "racecar", "car"};
        System.out.println("==" + longestCommonPrefix(strs));
    }
}
