package com.leetcode.easy.array;

public class ProductofArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int ans[] = new int[n];

        for(int i = 0; i < n; i++) {
            int pro = 1;
            for(int j = 0; j < n; j++) {
                if(i == j) continue;
                pro *= nums[j];
            }
            ans[i] = pro;
        }
        return ans;
    }
    public static void main (String [] arages ){
        int [] nums = {1,2,3,4};
        System.out.println(productExceptSelf(nums));
    }
}
