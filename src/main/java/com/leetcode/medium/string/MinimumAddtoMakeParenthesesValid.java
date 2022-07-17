package com.leetcode.medium.string;

public class MinimumAddtoMakeParenthesesValid {
    public static int minAddToMakeValid(String S) {
        int ans = 0 ,bal = 0;
        for (int i = 0; i < S.length(); ++i) {
            bal += S.charAt(i) == '('? 1 : -1;
            if (bal == - 1){
                ans++ ;
                bal++;
            }
        }
        return ans + bal;
    }
    public static void main(String[] args) {
        System.out.println(minAddToMakeValid("())"));
    }
}
