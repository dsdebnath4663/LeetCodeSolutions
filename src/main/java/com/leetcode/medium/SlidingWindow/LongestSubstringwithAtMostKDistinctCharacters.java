package com.leetcode.medium.SlidingWindow;

public class LongestSubstringwithAtMostKDistinctCharacters {
    public static int lengthOfLongestSubstringKDistinct(String s, int k) {
        int ans = 0;
        int distinct = 0;
        int[] count = new int[128];

        for (int l = 0, r = 0; r < s.length(); ++r) {
            if (++count[s.charAt(r)] == 1)
                ++distinct;
            while (distinct == k + 1)
                if (--count[s.charAt(l++)] == 0)
                    --distinct;
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
    public static void main (String [] args ){
        String s= "eceba";
        // String s= "WORLD";
        int k = 3;
        // int k = 4 ;
        System.out.println(lengthOfLongestSubstringKDistinct(s,k));
    }
}
