package com.leetcode.medium.string;

public class DecodeWays {
    public static int numDecoding(String s) {
        return s.length() == 0 ? 0 : helper(0, s);
    }

    private static int helper(int p, String s) {
        int n = s.length();
        if (p == n)
            return 1;
        if (s.charAt(p) == '0')
            return 0;
        int res = helper(p + 1, s);
        if (p < n - 1 && (s.charAt(p) == '1' || s.charAt(p) == '2' && s.charAt(p + 1) < '7'))
            res += helper(p + 2, s);
        return res;
    }

    public static void main(String[] args) {
        System.out.println(numDecoding("12"));
    }
}
