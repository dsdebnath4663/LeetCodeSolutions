package com.leetcode.easy.array;

public class RansomNote {
    public static boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) return false;
        int[] alphabets_counter = new int[26];

        for (char c : magazine.toCharArray())
            alphabets_counter[c-'a']++;

        for (char c : ransomNote.toCharArray()){
            if (alphabets_counter[c-'a'] == 0) return false;
            alphabets_counter[c-'a']--;
        }
        return true;
    }
    public static void main (String [] args){
     //   String ransomNote = "a";
      //  String magazine = "b";
       // String ransomNote = "aa";
       // String magazine = "ab";
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(canConstruct(ransomNote,magazine));
    }
}
