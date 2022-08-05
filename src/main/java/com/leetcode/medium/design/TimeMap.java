package com.leetcode.medium.design;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TimeMap {

    private Map<String, TreeMap<Integer, String>> map;


    public TimeMap() {//No argument constructor of TimeMap class
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        if (!map.containsKey(key)) {
            map.put(key, new TreeMap<>());
        }
        TreeMap<Integer, String> valueForCurrentKey  = map.get(key);
        valueForCurrentKey.put(timestamp,value);
        map.get(key).put(timestamp, value);
    }
    public String get(String keyOfHashMap, int timestampAsAKeyForTreeMap) {
        TreeMap<Integer, String> treeMap = map.get(keyOfHashMap);
        if (treeMap == null) {
            return "";
        }
        Integer floor = treeMap.floorKey(timestampAsAKeyForTreeMap);
        if (floor == null) {
            return "";
        }
        return treeMap.get(floor);
    }
    public static void main(String args[]) {
        TimeMap timeMap = new TimeMap();
        timeMap.set("foo", "bar", 1);  // store the key "foo" and value "bar" along with timestamp = 1.
        String s1 = timeMap.get("foo", 1);// return "bar"
        System.out.println("s1 :"+s1);
       String s2 = timeMap.get("foo", 3); // return "bar", since there is no value corresponding to foo at timestamp 3 and timestamp 2, then the only value is at timestamp 1 is "bar".
      System.out.println("s2 :"+s2);
       timeMap.set("foo", "bar2", 4); // store the key "foo" and value "bar2" along with timestamp = 4.
       timeMap.get("foo", 4);  // return "bar2"
      String s3 = timeMap.get("foo", 5);  // return "bar2"
       System.out.println("s3 :"+s3);
      String s4 = timeMap.get("foo", 5);   // return "bar2"
       System.out.println("s4 :"+s4);
    }
}
