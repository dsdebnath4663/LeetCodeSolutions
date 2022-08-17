package com.leetcode.medium.string;

public class RemoveAllAdjacentDuplicatesInString {
    public static String removeDuplicates(String s) {
        int i = 0, n = s.length();
        char[] res = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            res[i] = res[j];
            if (i > 0 && res[i - 1] == res[i]) // count = 2
                i -= 2;
        }
        return new String(res, 0, i);
    }
    public static void main(String[] args){
        System.out.println(removeDuplicates("abbaca"));
    }
}
