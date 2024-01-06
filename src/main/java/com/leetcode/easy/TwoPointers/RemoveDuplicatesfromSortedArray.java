package com.leetcode.easy.TwoPointers;

public class RemoveDuplicatesfromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums)
            if (i == 0 || n > nums[i - 1])
                nums[i++] = n;
        return i;
    }
    public static void main (String [] args ){
        int[] nums= {1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
