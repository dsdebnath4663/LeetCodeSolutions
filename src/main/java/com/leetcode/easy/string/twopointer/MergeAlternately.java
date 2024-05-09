package com.leetcode.easy.string.twopointer;

public class MergeAlternately {
    public static void main(String[] args) {
        String word1 = "ab";
        String word2 = "pqrs";

//        String mergedString = word2 + " " + word1;
//        String mergedString = word1.concat(" ").concat(word2);


        String mergedString = mergeAlternately(word1,word2);
        System.out.println(mergedString);
    }

    private static String mergeAlternately(String str1, String str2) {

        StringBuilder result = new StringBuilder();
        int minLength = Math.min(str1.length(), str2.length());

        for (int i = 0; i < minLength; i++) {
            result.append(str1.charAt(i)).append(str2.charAt(i));
        }

        // Append remaining characters from longer string
        if (str1.length() > minLength) {
            result.append(str1.substring(minLength));
        } else if (str2.length() > minLength) {
            result.append(str2.substring(minLength));
        }

        return result.toString();
    }
}
