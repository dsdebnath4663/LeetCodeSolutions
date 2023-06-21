package com.leetcode.easy.array;

public class MissingNumber {
    public static int missingNumber(int[] nums) {

        int xor = 0, i = 0;
        for (i = 0; i < nums.length; i++) {
            xor = xor ^ i ^ nums[i];
        }
        return xor ^ i;
    }
    public static void main(String[] args){
       // int[] nums ={3,0,1};
        //int[] nums = {9,6,4,2,3,5,7,0,1};
        int [] nums = {0,1};
       int result =missingNumber(nums);
       System.out.println("missingNumber is:  "+result);
    }
}
