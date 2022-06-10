package com.leetcode.medium.string;

import java.util.Arrays;
import java.util.List;

public class WordBreak {
    public static boolean wordBreak(String s, List<String> dict) {

        boolean[] f = new boolean[s.length() + 1];

        f[0] = true;


        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if (f[j] && dict.contains(s.substring(j, i))) {
                    f[i] = true;
                    break;
                }
            }
        }

        return f[s.length()];
    }

    public static void main(String[] args) {
       // String s = "leetcode";
       // List<String> dict = Arrays.asList("leet", "code");

        String s = "catsandog";
         List<String> dict = Arrays.asList("cats","dog","sand","and","cat");
        System.out.println(wordBreak(s, dict));
    }

}