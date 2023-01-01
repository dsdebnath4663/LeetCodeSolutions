package com.leetcode.medium.recursion;

public class DecodeWays {
    public static int numDecodings(String s) {
        //  return s.length() == 0 ? 0 : numDecodingsHelper(0, s);
        int result;
        if (s.length() == 0) {
            result = 0;
        } else {
            result = numDecodingsHelper(0, s);
        }
        return result;
    }

    private static int numDecodingsHelper(int p, String s) {
        int n = s.length();
        if (p == n) return 1;
        if (s.charAt(p) == '0')
            return 0;// sub string starting with 0 is not a valid encoding
        int res = numDecodingsHelper(p + 1, s);
        if (p < n - 1 && (s.charAt(p) == '1' || s.charAt(p) == '2' && s.charAt(p + 1) < '7'))
            res += numDecodingsHelper(p + 2, s);
        return res;
    }

    public static void main(String args[]) {

        // System.out.println(numDecodings("  1102"));
        //System.out.println(numDecodings("  226"));
System.out.println(numDecodings("06"));
    }
}

