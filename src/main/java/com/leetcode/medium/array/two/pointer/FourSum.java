package com.leetcode.medium.array.two.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        System.out.println("nums: \n" + Arrays.toString(nums));
        // Sort the array to simplify finding triplets and managing duplicates
        Arrays.sort(nums);
        System.out.println("nums after sorting : \n" + Arrays.toString(nums));
        List<List<Integer>> result = new ArrayList<>();// Initialize the list to store the unique triplets
        System.out.println("nums.length < 3: ");
        System.out.println(nums.length + " < " + 3 + " " + (nums.length < 3) + "\n\n");
        if (nums == null || nums.length < 4) {
            return result;
        }
        for (int i = 0; i < nums.length - 3; i++) {
            System.out.println("i: " + i + " , nums.length - 3 :" + (nums.length - 3) + " nums: " + Arrays.toString(nums));
            // Skip duplicate elements to ensure uniqueness in the result
            if (i > 0 && nums[i] == nums[i - 1]) {
                System.out.println("nums[" + i + "] == nums[" + i + " - " + 1 + "]");
                System.out.println(nums[i] + " == " + nums[i - 1]);
                continue;
            }
            for (int j = i + 1; j < nums.length - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    System.out.println("nums[" + j + "] == nums[" + j + " - " + 1 + "]");
                    System.out.println(nums[j] + " == " + nums[j - 1]);
                    continue;
                }
                // Initialize two pointers: one at the element right after i, and one at the end of the array
                int left = j + 1;
                int right = nums.length - 1;
                System.out.println(" i: " + i + " j: " + j + " left: " + left + " right: " + right);
                // Use two pointers to find the remaining two elements of the triplet
                while (left < right) {
                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
                    System.out.println("sum52 : " + nums[i] + "+" + nums[j] + "+" + nums[left] + "+" + nums[right] + " = " + sum);
                    System.out.println("sum53 :" + sum);
                    if (sum == target) {
                        List<Integer> innerlist = Arrays.asList(nums[i], nums[j], nums[left], nums[right]);
                        result.add(innerlist);
                        System.out.println("innerlist : " + innerlist);

                        while (left < right && nums[left] == nums[left + 1]) left++;
                        while (left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                        System.out.println("sum53 < " + target + "  " + " left++: " + left + " right  : " + right);

                    } else if (sum < target) {
                        left++;
                        System.out.println("sum57 < " + target + "  " + " left++: " + left + " right  : " + right);
                    }
                    // If the sum is greater than zero, move the right pointer to the left to decrease the sum
                    else {
                        right--;
                        System.out.println("sum70 > " + target + " " + "left  : " + left + " right--: " + right);
                    }
                }
                System.out.println("\n");
            }

        }
        System.out.println("\n\n");

        return result;

    }

    public static void main(String[] args) {
//
//        int[] nums = {1, 0, -1, 0, -2, 2};
//        int target = 0;
        int[] nums = {2, 2, 2, 2, 2};
        int target = 8;

//        int[] nums = {1000000000, 1000000000, 1000000000, 1000000000};
//        int target = -294967296;


        FourSum fourSum = new FourSum();
        List<List<Integer>> result = fourSum.fourSum(nums, target);
        System.out.println(result);
    }


}
