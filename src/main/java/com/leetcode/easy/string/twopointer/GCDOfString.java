package com.leetcode.easy.string.twopointer;

public class GCDOfString {

    private static String gcdOfStrings(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if (sLength < tLength) {
            String temp = s;
            s = t;
            t = temp;

        }
        String gcd = "";
        for (int i = 1; i <= tLength; i++) {
            if (tLength % i == 0 && sLength % i == 0) { // Check if i is a divisor of both lengths
                String sub = t.substring(0, i);
                boolean foundGcd = true;
                for (int j = 0; j < sLength / i; j++) {
                    String temp = s.substring(j * i, (j + 1) * i);

                    if (!temp.equals(sub)) {
                        foundGcd = false;
                        break;
                    }
                }
                if (foundGcd) {
                    gcd = sub;
                }
            }
        }

        return gcd;

    }
    public static void main(String[] args) {
//        String str1 = "ABCABC";
//        String str2 = "ABC";

//        String str1 = "ABABAB";
//        String str2 = "ABAB";
//
        String str1 = "AAAAAAAAA";
        String str2 = "AAACCC";

        String output="";



        String gcdStr = gcdOfStrings(str1, str2);
        System.out.println("GCD of \"" + str1 + "\" and \"" + str2 + "\" is: " + gcdStr); // Output: ABC
    }


}