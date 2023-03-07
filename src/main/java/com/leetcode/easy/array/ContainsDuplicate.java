package com.leetcode.easy.array;

import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicate(int[] nums) {
        if(nums==null || nums.length==0)
            return false;
        HashSet<Integer> hset = new HashSet<Integer>();
        for(int idx: nums){
            if(!hset.add(idx)){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args){
        int[]nums = {1,2,3,1};
        System.out.println(containsDuplicate(nums));
    }
}
