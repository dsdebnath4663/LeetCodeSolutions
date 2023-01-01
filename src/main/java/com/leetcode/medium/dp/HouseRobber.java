package com.leetcode.medium.dp;

public class HouseRobber {
    public static int rob(int[] nums) {
        int n = nums.length;
        int x = nums[0];
        int y = 0;
        for (int i = 1; i < n; i++) {
            int nx = y + nums[i];
            int ny = Math.max(x, y);
            x = nx;
            y = ny;
        }
        return Math.max(x, y);
    }

    public static void main(String[] args) {
        //int [] nums = {1,2,3,1};
        int[] nums = {2, 7, 9, 3, 1};

        System.out.println(rob(nums));
    }
}
