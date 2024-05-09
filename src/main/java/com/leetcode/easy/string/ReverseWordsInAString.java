package com.leetcode.easy.string;

public class ReverseWordsInAString {


    private static String reverseWords(String str) {

        // Remove leading and trailing spaces
        String trimmedStr = str.trim();
        // Split the string into words using spaces as delimiter
        String[] words = str.split(" ");
        // Initialize an empty string to store the reversed words
        String reversedString = "";
        // Iterate through the words in reverse order
//            for i from length(words) - 1 down to 0:
        for (int i = words.length - 1; i >= 0; i--) {
            // Append the current word to the reversed string
            reversedString += words[i];

            // Append a space if it's not the last word
            if (i > 0 && !words[i - 1].isEmpty()) {
                reversedString += "-";
            }
        }
        return reversedString;

    }


    public static void main(String[] args) {
//        String s = " hello world ";
        String s = "a good   example";
        String reverseWords = reverseWords(s);
        System.out.println(reverseWords);
    }

}
