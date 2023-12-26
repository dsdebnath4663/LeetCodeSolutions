package com.leetcode.medium.string;

import java.util.HashMap;
import java.util.Map;

public class MapSumPairs1 {
    static Map<String, Integer> map ;
    static Map<String, Integer> score;
    public void MapSumPairs() {
        map = new HashMap();
        score = new HashMap();
    }
    public static void insert(String key, int val) {
        int delta = val - map.getOrDefault(key, 0);
        map.put(key, val);
        String prefix = "";
        for (char c : key.toCharArray()) {
            prefix += c;
            score.put(prefix, score.getOrDefault(prefix, 0) + delta);
        }
        for(Map.Entry<String,Integer> mapData:map.entrySet()){
            System.out.println("Key : "+mapData.getKey()+ " Value : "+mapData.getValue());
        }
    }
    public static int sum(String prefix) {
        int val = score.getOrDefault(prefix, 0);
        System.out.println("Current sum is : " + val);
        return val;
    }
    public static void main(String args[]) {
        MapSumPairs mapSum = new MapSumPairs();
        mapSum.insert("apple", 3);
        mapSum.sum("ap");           // return 3 (apple = 3)
        mapSum.insert("app", 2);
        mapSum.sum("ap");           // return 5 (apple + app = 3 + 2 = 5)
    }
}
