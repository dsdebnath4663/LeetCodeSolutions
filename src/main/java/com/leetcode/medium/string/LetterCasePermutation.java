package com.leetcode.medium.string;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LetterCasePermutation {
    public static List<String> letterCasePermutation(String s) {
        if (s == null) {
            return new LinkedList<>();
        }
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) continue;
            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();
                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));
                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }
        return new LinkedList<>(queue);
    }
    public static void main(String[] args){
        System.out.println(letterCasePermutation("a1b2"));
    }
}
