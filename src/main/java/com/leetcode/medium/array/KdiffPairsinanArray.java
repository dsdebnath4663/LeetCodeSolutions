package com.leetcode.medium.array;

import java.util.HashMap;
import java.util.Map;

public class KdiffPairsinanArray {
    public static int findPairs(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        int result = 0;
        for (int i : map.keySet())
            if (k > 0 && map.containsKey(i + k) || k == 0 && map.get(i) > 1)
                result++;
        return result;
    }
    public static void main (String[] arages){
       // int [] nums = {3,1,4,1,5};
        //int k =2 ;
      //  int [] nums = {1,2,3,4,5};
       // int k =1 ;
        int [] nums = {1,3,1,5,4};
        int k = 0 ;
        System.out.println(findPairs(nums,k));
    }
}
