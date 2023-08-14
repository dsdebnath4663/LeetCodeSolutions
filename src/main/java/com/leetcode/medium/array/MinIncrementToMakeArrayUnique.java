package com.leetcode.medium.array;

import java.util.*;

public class MinIncrementToMakeArrayUnique {

    static int minIncrementForUnique(int[] array) {
        Arrays.sort(array);
        return minOperations(array);
    }

    public static int minOperations(int[] nums) {
        int count = 0;
        int max = nums[0];
        for(int i = 1 ; i < nums.length ; i++){
            if(nums[i] > max){
                max = nums[i];
            }else{
                max++;
                count += max - nums[i];
            }
        }

        return count;
    }
    public static void main(String[] args) {
      ///int [] A = {1,2,2};
       int[] A = {3, 2, 1, 2, 1, 7};
        System.out.print(minIncrementForUnique(A));
    }
}