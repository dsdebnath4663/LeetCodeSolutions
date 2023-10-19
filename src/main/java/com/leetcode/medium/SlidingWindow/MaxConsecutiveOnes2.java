package com.leetcode.medium.SlidingWindow;

import java.util.Scanner;

public class MaxConsecutiveOnes2 {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int ans = 0;
        int zeros = 0;
        for (int l = 0, r = 0; r < nums.length; ++r) {
            if (nums[r] == 0)
                ++zeros;
            while (zeros == 2)
                if (nums[l++] == 0)
                    --zeros;
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
    public static void main (String[] args){
        int[] nums = {1,0,1,0,1};
        System.out.println(findMaxConsecutiveOnes(nums));
    }

}
