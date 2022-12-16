package com.leetcode.easy.array;

public class LongestIncreasingSubsequence {
    public static int lengthOfLIS(int[] nums) {
        int[]tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
        }
        return size;
    }
public static void main(String[]args){
 //int [] nums = {10,9,2,5,3,7,101,18};
 int [] nums = {0,1,0,3,2,3};
    System.out.println(lengthOfLIS(nums));
}
}
