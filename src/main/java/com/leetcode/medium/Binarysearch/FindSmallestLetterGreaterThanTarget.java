package com.leetcode.medium.Binarysearch;

public class FindSmallestLetterGreaterThanTarget {
    public static char nextGreatestLetter(char[] letters, char target) {
        for(char letter: letters){
            if (letter > target ){
                return letter;
            }
        }
        return letters[0];
    }
    public static void main(String args[]){
        char[] letters = {'c','f','j'};
        char target = 'c' ;
        System.out.println(nextGreatestLetter (letters ,target));
    }
}
