package com.leetcode.medium.array.two.pointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {

        System.out.println("nums: \n" + Arrays.toString(nums));
        // Sort the array to simplify finding triplets and managing duplicates
        Arrays.sort(nums);
        System.out.println("nums after sorting : \n" + Arrays.toString(nums));

        List<List<Integer>> result = new ArrayList<>();// Initialize the list to store the unique triplets
        System.out.println("nums.length < 3: ");
        System.out.println(nums.length + " < " + 3 + " " + (nums.length < 3)+"\n\n");

        if (nums == null || nums.length < 3) {
            return result;
        }

        for (int i = 0; i < nums.length - 2; i++) {
            System.out.println("i: " + i + " , nums.length - 3 :" + (nums.length - 3)+" nums: "+Arrays.toString(nums));
            // Skip duplicate elements to ensure uniqueness in the result

            if (i > 0 && nums[i] == nums[i - 1]) {
                System.out.println("nums[" + i + "] == nums[" + i + " - " + 1 + "]");
                System.out.println(nums[i] +" == "+ nums[i - 1]);

                continue;
            }
            // Initialize two pointers: one at the element right after i, and one at the end of the array
            int left = i + 1;
            int right = nums.length - 1;
            int sum = 0;
            System.out.println("left: "+left+" right: "+right+" sum: "+sum);

            // Use two pointers to find the remaining two elements of the triplet
            while (left < right) {
                sum = nums[i] + nums[left] + nums[right];
                System.out.println("sum44 : "+nums[i] +"+"+ nums[left] +"+"+ nums[right]+" = "+sum);
                System.out.println("sum44 :"+sum);

                // If the sum is zero, we found a valid triplet
                if (sum == 0) {
                    List<Integer> innerlist = Arrays.asList(nums[i], nums[left], nums[right]);
                    result.add(innerlist);
                    System.out.println("innerlist : "+innerlist);

                    // Move the left pointer to the right, skipping duplicates
                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }
                    // Move the right pointer to the left, skipping duplicates
                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }
                    // Move both pointers inward to look for new triplets
                    left++;
                    right--;
                    System.out.println("sum63 == 0 "+"left++: "+left+" right  : "+right);

                }
                // If the sum < zero, move the left pointer to the right to increase the sum
                else if (sum < 0) {
                    left++;

                    System.out.println("sum70 < 0 "+"left++: "+left+" right  : "+right);

                }
                // If the sum is greater than zero, move the right pointer to the left to decrease the sum
                else {
                    right--;
                    System.out.println("sum70 > 0 "+"left  : "+left+" right--: "+right);

                }
            }
            System.out.println("\n\n");
        }
        return result;

    }

    public static void main(String[] args) {
//        int[] nums = {1,-4,-5,3,-5,9,0}; // Example sorted array
        int[] nums = {0,0,0}; // Example sorted array

        ThreeSum threeSum = new ThreeSum();
        List<List<Integer>> result = threeSum.threeSum(nums);
        System.out.println(result);
    }
}
