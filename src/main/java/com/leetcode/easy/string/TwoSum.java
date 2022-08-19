package com.leetcode.easy.string;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                result[1] = i;
                result[0] = map.get(target - numbers[i]);
                return result;
            }
            map.put(numbers[i], i);
        }
        return result;
    }
    public static void main(String[] args ){
       // int[] numbers ={2,7,11,15};
      //  int target = 9;
//        int[] numbers ={3,2,4};
//        int target = 6;
        int[] numbers ={3,3};
        int target = 6;
        int[] result = twoSum(numbers,target);
        System.out.println(Arrays.toString(result));
    }
}
