package com.leetcode.medium.array.two.pointer;

import java.util.Arrays;

public class NumberofArithmeticTriplets {
    public int arithmeticTriplets(int[] nums, int diff) {
        int count = 0;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            int j = i + 1;
            int k = i + 2;
            System.out.println("i :"+i+" j :"+j+" k :"+k+" n :"+n+" diff:"+diff);
            System.out.println(Arrays.toString(nums)+"\n");
            while (j < n && k < n) {
                // Find the appropriate j such that nums[j] - nums[i] == diff
                while (j < n && nums[j] - nums[i] < diff) {
                    j++;
                }
                if (j < n && nums[j] - nums[i] == diff) {
                    // Find the appropriate k such that nums[k] - nums[j] == diff
                    while (k < n && nums[k] - nums[j] < diff) {
                        k++;
                    }
                    if (k < n && nums[k] - nums[j] == diff) {
                        count++;
                    }
                    // Move j to the next position for a new potential triplet
                    j++;
                    // Ensure k is always ahead of j
                    k = j + 1;
                } else {
                    break;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
//        int[] nums = {0, 1, 4, 6, 7, 10};
        int[] nums = {4,5,6,7,8,9};
        int diff = 2;
//       int diff = 3;
        NumberofArithmeticTriplets arithmeticTriplets = new NumberofArithmeticTriplets();
        int result = arithmeticTriplets.arithmeticTriplets(nums, diff);
        System.out.println(result);
    }

}
