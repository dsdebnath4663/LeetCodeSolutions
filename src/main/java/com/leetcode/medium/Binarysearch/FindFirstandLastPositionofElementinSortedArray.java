package com.leetcode.medium.Binarysearch;

import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {
    public static int[] searchRange(int[] nums, int target) {
        int firstOccurrence = findBound(nums, target, true);
        if (firstOccurrence == -1) {
            return new int[]{-1, -1};
        }
        int lastOccurrence = findBound(nums, target, false);
        return new int[]{firstOccurrence, lastOccurrence};
    }
    private static int findBound(int[] nums, int target, boolean isFirst) {
        int N = nums.length;
        int begin = 0, end = N - 1;
        while (begin <= end) {
            int mid = (begin + end) / 2;
            if (nums[mid] == target) {
                if (isFirst) {
                    // This means we found our lower bound.
                    if (mid == begin || nums[mid - 1] != target) {
                        return mid;
                    }
                    // Search on the left side for the bound.
                    end = mid - 1;
                } else {
                    // This means we found our upper bound.
                    if (mid == end || nums[mid + 1] != target) {
                        return mid;
                    }
                    // Search on the right side for the bound.
                    begin = mid + 1;
                }
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                begin = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args){
        int[] nums = {};
        int target = 0;
        int [] output = searchRange(nums,target);
        System.out.println(Arrays.toString(output));
    }
}
