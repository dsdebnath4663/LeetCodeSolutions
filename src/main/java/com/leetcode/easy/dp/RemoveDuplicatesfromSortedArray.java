package com.leetcode.easy.dp;

import org.jetbrains.annotations.NotNull;

public class RemoveDuplicatesfromSortedArray {

    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int n : nums) {
            if (i == 0 || n > nums[i - 1]) {
                nums[i++] = n;
            }
        }
        return i;
    }

    public static void main(String[] args) {
        int[] array = {1, 1, 2};
        int[] array1 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(array1));
    }
}
//        [0,0, 1,1, 1,2,2,3,3 ,4]
//        [0,    1,  1, 2,  3  ,4]
//         [0,      1,  2,  3  ,4]
