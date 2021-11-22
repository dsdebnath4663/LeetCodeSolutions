package com.leetcode.easy.dp;

import java.util.HashMap;

public class RomantoInteger {

    public static int romanToInt(String s) {

        HashMap<Character, Integer> romanToIntegerMap = new HashMap<Character, Integer>();

        romanToIntegerMap.put('I', 1);
        romanToIntegerMap.put('V', 5);
        romanToIntegerMap.put('X', 10);
        romanToIntegerMap.put('L', 50);
        romanToIntegerMap.put('C', 100);
        romanToIntegerMap.put('D', 500);
        romanToIntegerMap.put('M', 1000);

        char currentGreatest = s.charAt(s.length() - 1);
        int totalSum = 0;
        for (int i = s.length() - 1; i >= 0; --i) {

            if (romanToIntegerMap.get(s.charAt(i)) < romanToIntegerMap.get(currentGreatest)) {
                totalSum -= romanToIntegerMap.get(s.charAt(i));
            }
            else {
                totalSum += romanToIntegerMap.get(s.charAt(i));
                currentGreatest = s.charAt(i);
            }
        }

        return totalSum;
    }

    public static void main(String[] args) {

      //  String romanCharArr[] = {"III", "IV", "IX", "LVIII", "MCMXCIV"};
        String romanCharArr[] = {"IV"};

        for (String romanChar : romanCharArr) {
            System.out.println(romanToInt(romanChar));
        }

    }


}
