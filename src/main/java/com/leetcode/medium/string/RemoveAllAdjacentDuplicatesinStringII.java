package com.leetcode.medium.string;

public class RemoveAllAdjacentDuplicatesinStringII {
    public static String removeDuplicates(String s, int k) {
        int i = 0, n = s.length(), count[] = new int[n];
        char[] stack = s.toCharArray();
        for (int j = 0; j < n; ++j, ++i) {
            stack[i] = stack[j];
                count[i] = i > 0 && stack[i - 1] == stack[j] ? count[i - 1] + 1 : 1;
            if (count[i] == k) i -= k;
        }
        return new String(stack, 0, i);
    }
    public static void main(String[] args){
        System.out.println(removeDuplicates("abcd", 2));
    }

}
