package com.leetcode.easy.array;

import java.util.Arrays;

public class TwoSum {

   public static int[] twoSum(int[] nums, int target) {
        int number = 0;
        for(int i=0;i<nums.length;i++) {

            for(int j=i+1;j<nums.length;j++) {

                if(nums[i]+nums[j]==target){
                    return new int[]{i,j};
                }

            }
        }
        return null;
    }



    public static void main(String[] args){
        int nums[]={2,7,11,15};
        int target = 9;

       System.out.println(Arrays.toString(twoSum(nums ,target)));


    }
}
