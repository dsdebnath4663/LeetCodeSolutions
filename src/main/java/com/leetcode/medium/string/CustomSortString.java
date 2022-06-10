package com.leetcode.medium.string;

public class CustomSortString {
    public static String customSortString(String order, String s) {
        int[] count = new int [26];
        for (char c : s.toCharArray()) { ++count[c - 'a']; }
        StringBuilder sb = new StringBuilder();
        for (char c : order.toCharArray()) {
            while (count[c - 'a']-- > 0) { sb.append(c); }    // sort chars both in T and S by the order of S.
        }
        for (char c = 'a'; c <= 'z'; ++c) {
            while (count[c - 'a']-- > 0) { sb.append(c); }    // group chars in T but not in S.
        }
         return sb.toString();
    }
public static void main(String[] args ){
        System.out.println(customSortString("cba", "abcd"));
}
}
