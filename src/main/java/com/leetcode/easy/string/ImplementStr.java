package com.leetcode.easy.string;

public class ImplementStr {

    public int strStr(String haystack, String needle) {
        int isFound;
        if (haystack.contains(needle))
            isFound = haystack.indexOf(needle);
        else
            isFound = -1;
        return isFound;
    }
}