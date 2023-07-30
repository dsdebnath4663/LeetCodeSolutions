package com.leetcode.medium.array;

import java.util.ArrayList;
import java.util.List;

public class FindAllDuplicatesinanArray {
    public static List<Integer> findDuplicates(int[] nums) {
        final List<Integer> duplicates = new ArrayList<Integer>();
        for(int i = 0; i < nums.length; i++) {
            final int n = Math.abs(nums[i]);
            if(nums[n - 1] < 0) {
                duplicates.add(n);
            } else {
                nums[n - 1] *= -1;
            }
        }
        return duplicates;
    }
    public static void main(String[] args){
       // int[] nums = {4,3,2,7,8,2,3,1};
       // int [] nums = {1,1,2};
        int [] nums = {1};
        System.out.println(findDuplicates(nums));
    }
}

