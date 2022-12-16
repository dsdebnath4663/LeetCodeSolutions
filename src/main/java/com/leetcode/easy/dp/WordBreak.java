package com.leetcode.easy.dp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> wordDict) {
        boolean[] f = new boolean[s.length() + 1];
        f[0] = true;
        //Second DP
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && wordDict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }
        return f[s.length()];
    }

    public static void main(String[] args) {
       // String s = "leetcode";
        // String s = "applepenapple";
         String s = "catsandog";
        List<String> wordDict = new ArrayList<>();
        //wordDict.add("leet");
        //wordDict.add("code");
        // wordDict.add("apple");
        // wordDict.add("pen");
        wordDict.add("apple");
        wordDict.add("pen");
        System.out.println(wordBreak(s, wordDict));
    }
}
