package com.leetcode.medium.dp;

import java.util.Arrays;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int[] mOccur = new int[256];
        int maxL = 0;
        for(int i = 0, j = 0; i < s.length(); ++i){
            char character = s.charAt(i);
            ++mOccur[character];
            while(mOccur[character] > 1){
                --mOccur[s.charAt(j++)];
            }
            maxL = Math.max(maxL, i - j + 1);
        }
        return maxL;
    }

    public static void main(String[] args){
        String s="abcabcbb";
        System.out.println(lengthOfLongestSubstring(s ));


    }
}
