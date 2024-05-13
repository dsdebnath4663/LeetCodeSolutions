package com.leetcode.medium.array.two.pointer;

public class IsSubsequence {
    //    function isSubsequence(s, t):
    public static boolean isSubsequence(String s, String t) {

//    Initialize two pointers, i for string s and j for string t, both at the beginning.
        int i = 0; //i for string s
        int j = 0; //j for string t

//    While i is less than the length of s and j is less than the length of t:
        while (i < s.length() && j < t.length()) {
            //    If s[i] is equal to t[j], move i and j to the next character in their respective strings.
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }
        return i == s.length(); // Check if i reached the end of string s

    }

    public static void main(String[] args) {
//        String s = "abc";
//        String t = "ahbgdc";

       String  s = "axc", t = "ahbgdc";
        System.out.println(isSubsequence(s, t));
    }
}
