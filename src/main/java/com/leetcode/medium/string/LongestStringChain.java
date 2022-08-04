package com.leetcode.medium.string;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public class LongestStringChain {
    public static int longestStrChain(String[] words) {
        Map<String, Integer> dp = new HashMap<>();
        //Sort an array of strings according to string lengths
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        int res = 0;
        for (String word : words) {
            int best = 0;
            for (int i = 0; i < word.length(); ++i) {
                String prev = word.substring(0, i) + word.substring(i + 1);
                best = Math.max(best, dp.getOrDefault(prev, 0) + 1);
            }
            dp.put(word, best);
            res = Math.max(res, best);
        }
        return res;
    }

    public static void main(String[] args) {
        String[] strs = {"a", "b", "ba", "bca", "bda", "bdca"};
        System.out.println(longestStrChain(strs));
    }
}
