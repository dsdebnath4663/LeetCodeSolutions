package com.leetcode.easy.array;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        if(n == 0) return "";
        String prefix = strs[0];
        for(int i = 1; i < n; i++){
            String cur = strs[i];
            while(cur.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length() - 1);
            }
        }
        return prefix;
    }
public static void main (String[]args){
    //String[] strs= {"flower","flow","flight"};
    String[] strs= {"dog","racecar","car"};
    System.out.println(longestCommonPrefix(strs));
}
}
