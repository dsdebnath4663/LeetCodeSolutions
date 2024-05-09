package com.leetcode.easy.string;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseVowelsString {

    public String reverseString(String str) {
        String reversedStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            System.out.println(str.toCharArray()[i]);
            reversedStr += str.toCharArray()[i];
        }
        return reversedStr;

    }


    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        List<Character> vowelList = new ArrayList<>();

//    # Step 1: Extract vowels from the string and preserve their order
        for (char character : s.toCharArray()) {
            if (vowels.indexOf(character) != -1) {
                vowelList.add(character);
            }
        }
//    # Step 2: Reverse the vowelList
        Collections.reverse(vowelList);

//    # Step 3: Replace vowels in the original string with vowels from reversedVowelList
        int vowelIndex = 0;
        String result = "";

//    for char in s:
        for (char character : s.toCharArray()) {
            if (vowels.indexOf(character) != -1) {
//                Replace the vowel with the next vowel from reversedVowelList
                char nextVowel = vowelList.get(vowelIndex++);
                result += nextVowel;//from reversedVowelList
            } else {
//                # Append non-vowel characters unchanged
                result += character;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        String s = "h e ll o";
        ReverseVowelsString reverseVowelsString = new ReverseVowelsString();
        String reversedString = reverseVowelsString.reverseVowels(s);


        System.out.println("reverse String is : " + reversedString);
    }
}
