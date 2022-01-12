package com.leetcode.easy.sorting;

public class SortSentence {

    public static String sortSentence(String s) {
        String[] str = s.split(" ");
        String[] result = new String[str.length];
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (String elem : str) {
            i = (int) (elem.charAt(elem.length() - 1) - '0');
            result[i - 1] = elem.substring(0, elem.length() - 1);
        }
        for (i = 0; i < result.length - 1; i++)
            sb.append(result[i]).append(" ");
        sb.append(result[i]);
        return sb.toString();
    }
}
