package com.leetcode.medium.TopKFrequent;

import java.util.HashMap;
import java.util.Map;

public class SortCharactersByFrequency {
    public static String frequencySort(String s) {
        StringBuilder sb = new StringBuilder();
        Map<Character, Integer> charCountMap = new HashMap<>();
        int len = s.length();
        for(int i = 0; i < len; i++) {
            char ch = s.charAt(i);
            charCountMap.put(ch, charCountMap.getOrDefault(ch, 0) + 1);
        }
        charCountMap.entrySet().stream().sorted(Map.Entry.<Character,
                Integer>comparingByValue().reversed()).forEach(record -> {
            Character key = record.getKey();
            int value = record.getValue();
            for(int i = 0; i < value; i++) {
                sb.append(key);
            }
        });
        return sb.toString();
    }
    public static void main(String[] args){
        String s ="tree";
        System.out.println(frequencySort(s));
    }
}
