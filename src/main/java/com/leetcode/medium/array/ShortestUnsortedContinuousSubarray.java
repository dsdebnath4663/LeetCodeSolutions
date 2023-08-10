package com.leetcode.medium.array;

public class ShortestUnsortedContinuousSubarray {
    public static int findUnsortedSubarray(int[] nums) {
        int end = -1;
        int length = nums.length;
        int ele = nums[0];
        for (int i = 1; i < length; i++) {
            if (ele > nums[i]) {
                end = i;
            } else {
                ele = nums[i];
            }
        }
        int start = 0;
        ele = nums[length - 1];
        for (int i = length - 2; i >= 0; i--) {
            if (nums[i] > ele) {
                start = i;
            } else {
                ele = nums[i];
            }
        }
        return end - start + 1;
    }
    public static void main(String[] args) {
      int[] N = {2, 6, 4, 8, 10, 9, 15};
        System.out.println(findUnsortedSubarray(N));
    }
}
