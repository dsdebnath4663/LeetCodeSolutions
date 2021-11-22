package com.leetcode.easy.dp;

public class ImplementstrStr {
    public static int maxSubArray(int[] nums) {
        int n = nums.length;
        int maxSum = Integer.MIN_VALUE; // can't be 0
        for (int i = 0; i < n; ++i) { // starts at i
            int sum = nums[i];
            maxSum = Math.max(maxSum, sum);
            for (int j = i + 1; j < n; ++j) { // starts from the next element
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

    public static void main(String[] args) {

        int[] nums = {-2,1,-3,4,-1,2,1,-5,4};
        int [] nums2 = {1};
        int[] nums3 = {5,4,-1,7,8};
        int[] nums4 = {1,-2,3};
        System.out.println("==" + maxSubArray(nums4));
    }
}
