package com.leetcode.easy.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class MinimumIndexSumOfTwoLists {

    public static String[] findRestaurant(String[] array1, String[] array2) {
        HashMap<Integer, List<String>> map = new HashMap<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i].equals(array2[j])) {
                    if (!map.containsKey(i + j)) {
                        map.put(i + j, new ArrayList<String>());//[key , []]
                    }
                    map.get(i + j).add(array2[i]);
                }
            }
        }
        int min_index_sum = Integer.MAX_VALUE;
        for (int key : map.keySet()) {
            min_index_sum = Math.min(min_index_sum, key);
        }
        int arraySize = map.get(min_index_sum).size();
        String[] res = new String[arraySize];
        return map.get(min_index_sum).toArray(res);// list to string array =>  map.get(min_index_sum).toArray(res)
                                                    //                         List<String>

    }

    /**
     * [key , []]
     * map.get(key)= []
     * map.get(key).add(array2[i]);
     * [].add(1,2)
     */


    public static void main(String[] args) {
        String[] list1 = new String[]{"happy", "sad", "good"};
        String[] list2 = new String[]{"sad", "happy", "good"};
        String[] output = findRestaurant(list1, list2);
        System.out.println(Arrays.toString(output));
    }
}
