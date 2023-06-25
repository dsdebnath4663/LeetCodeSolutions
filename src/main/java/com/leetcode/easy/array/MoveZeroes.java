package com.leetcode.easy.array;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        // Start with the first position
        int insertPosition = 0;

        for (int i = 0; i < nums.length; i++) {
            // FIll all non-zero numbers
            if (nums[i] != 0) {
                nums[insertPosition] = nums[i];
                insertPosition++;
            }
        }
        while (insertPosition < nums.length) {
            nums[insertPosition++] = 0;
        }
    }
    public static void main (String [] arages){
        int [] nums = {0,1,0,3,12};
        System.out.println(moveZeroes(nums));
    }
}
