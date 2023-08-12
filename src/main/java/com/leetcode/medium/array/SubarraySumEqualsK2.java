package com.leetcode.medium.array;

import java.util.HashMap;

public class SubarraySumEqualsK2 {
    public static int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        int curSum = 0;
        hm.put(0, 1);
        int Counter = 0;
        for (int i = 0; i < nums.length; i++) {
            curSum = curSum + nums[i];//curSum += nums[i];
            int ps2 = curSum - k;
            if (hm.containsKey(ps2)) {
                Counter += hm.get(ps2);
            }
            hm.put(curSum, hm.getOrDefault(curSum, 0) + 1);
        }
        return Counter;
    }

    public static void main(String[] args) {
        //int [] nums= {1,1,1};
        int[] nums = {6 , 8 ,12,13,14,15,16,18};
        int k = 7;
        System.out.println(subarraySum(nums, k));
    }

}
