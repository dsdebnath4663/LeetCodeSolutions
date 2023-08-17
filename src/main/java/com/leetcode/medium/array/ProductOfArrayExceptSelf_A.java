package com.leetcode.medium.array;

import java.util.Arrays;

public class ProductOfArrayExceptSelf_A {
    public static int[] productExceptSelf2(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0, tmp = 1; i < nums.length; i++) {
            result[i] = tmp;
            tmp *= nums[i];
        }
        for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
            result[i] *= tmp;
            tmp *= nums[i];
        }
        return result;
    }
    public static void main(String args[]){
     //   int[] nums = {1,2,3,4};
        int [] nums ={-1,1,0,-3,3};
        int [] output = productExceptSelf2(nums);
        System.out.println(Arrays.toString(output));
    }
}
