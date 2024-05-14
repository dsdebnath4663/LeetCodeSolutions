package com.leetcode.medium.array.two.pointer;

import java.util.Arrays;

public class MaxNumberofKSumPairs {
    public int maxOperations(int[] nums, int k) {
       Arrays.sort(nums);
        int left= 0;
       int right= nums.length-1;
       int count = 0;
while (left<right){
    int sum = nums[left]+ nums[right];
    if (sum == k){
        count++;
        left++;
        right--;
    }else if (sum<k){
            left++;
    }else {
        right--;
    }

}
return count;
    }
    public static void main(String[] args){
        MaxNumberofKSumPairs maxOperations = new MaxNumberofKSumPairs();
//        int[] nums = { 1, 2, 3, 4, 5 };
//        int k = 5;
        int[] nums = { 3,1,3,4,3};
        int k = 6;
        int maxOperationsCount = maxOperations.maxOperations(nums, k);
        System.out.println("Maximum number of operations: " + maxOperationsCount);
    }
}