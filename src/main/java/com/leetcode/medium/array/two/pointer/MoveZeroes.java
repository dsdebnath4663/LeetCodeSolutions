package com.leetcode.medium.array.two.pointer;

import java.util.Arrays;

public class MoveZeroes {
    //    Procedure moveZeroes(nums):
    public void moveZeroes(int[] nums) {
//    left = 0  // Pointer to track the position where a non-zero element should be moved
        int left = 0;
//    For i = 0 to length(nums) - 1:
        for (int i = 0; i < nums.length; i++) {
            //    If nums[i] is not equal to 0:
            if (nums[i] != 0) {//2+1=3 nums[3]=3
                //    Swap nums[left] and nums[i]  // Move non-zero element to the left
                int temp = nums[left];//0 nums[2]=0
                nums[left] = nums[i];//num[0]=nums[1]=1 nums[2]=num[3]=2
                nums[i] = temp;//nums[1]=temp=0 {1, 0, 0, 3, 12}
                // {1, 0, 3, 3, 12}
                //nums[3]=0 

                //    Increment left by 1
                left++;//2
            }
        }
        System.out.println(Arrays.toString(nums));
    }

    public static void main(String[] args) {

        int nums[] = {0, 1, 0, 3, 12};
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(nums);
    }

}