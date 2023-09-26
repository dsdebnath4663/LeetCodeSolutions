package com.leetcode.medium.string;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabel {
    public static List<Integer> partitionLabels(String s) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            map.put(ch, i);
        }
        List<Integer> res = new ArrayList<>();
        int prev = -1;
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            max = Math.max(max, map.get(ch));
            if(max == i){
                res.add(max - prev);
                prev = max;
            }
        }
        return res;
    }
    public static void main(String[] args ){
        System.out.println(partitionLabels("eccbbbbdec"));
    }
}
