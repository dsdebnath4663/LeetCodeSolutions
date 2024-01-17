package com.leetcode.easy.TwoPointers;

import java.util.Arrays;

public class MoveZeroes {
    public static long[] moveZeroes(int[] nums) {
        int i = 0;
        for (int num:nums){
            if(num != 0){
                nums[i] = num;
                i++;
            }
        }
        while(i<nums.length){
            nums[i] = 0;
            i++;
        }
        return new long[0];
    }
    public static void main (String[] array ){
        int[] nums = {0,1,0,3,12};
        System.out.println(Arrays.toString(moveZeroes(nums)));
    }

}
