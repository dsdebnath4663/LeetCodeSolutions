package com.leetcode.medium.backtracking;

import java.util.*;

public class LetterCombinationsofaPhoneNumber {

    Map<Character, String> phone = new HashMap<Character, String>() {{
        put('2', "abc");
        put('3', "def");
        put('4', "ghi");
        put('5', "jkl");
        put('6', "mno");
        put('7', "pqrs");
        put('8', "tuv");
        put('9', "wxyz");
    }};
    char[] digitsArr;
    List<String> res = new LinkedList<>();

    public List<String> letterCombinations(String digits) {

        System.out.println("Digits are : "+digits);
        digitsArr = digits.toCharArray();
        System.out.println("digits char Arr is : "+ Arrays.toString(digitsArr));

        //Base case
        if(digitsArr.length != 0){
            dfs(0, new StringBuilder());
        }
        return res;
    }
    private void dfs(int index, StringBuilder stringBuilder){
        System.out.println("===============================One Cycle Start from here=================================");

        System.out.println("index is : "+index+", stringBuilder is : "+stringBuilder.toString());

        System.out.println("index is : "+index+", digitsArr length is : "+digitsArr.length);

        //Base case
        if(index == digitsArr.length) {
            System.out.println("Inside case index == digitsArr.length ");
            res.add(stringBuilder.toString());
            System.out.println("Current output is :"+res);
            return;
        }
        char digit = digitsArr[index];
        System.out.println("Current digit is : "+digit);
        String characters = phone.get(digit);
        System.out.println("Current characters are  : "+characters);

        for(char curChar : characters.toCharArray()){
            System.out.println("Current curChar is : "+curChar);
            stringBuilder.append(curChar);
            System.out.println("Current stringBuilder value : "+stringBuilder.toString());
            dfs(index + 1, stringBuilder);
            stringBuilder.setLength(stringBuilder.length() - 1);
            System.out.println(" stringBuilder value after delete is : "+ stringBuilder.toString());
            System.out.println("===============================One Cycle ends here=================================");
        }

    }

}
