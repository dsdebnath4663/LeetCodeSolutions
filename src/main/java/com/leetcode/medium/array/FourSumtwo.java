package com.leetcode.medium.array;

import java.util.Arrays;

public class FourSumtwo {
    public static int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
        int count = 0;
        for(int i : nums1)
            for(int j : nums2)
                for(int k : nums3)
                    for(int l : nums4)
                        if(i + j + k + l == 0) count++;
        return count;
    }
    public static void main (String args[]){
        int[] nums1 ={1,2};
        int [] nums2 ={-2,-1};
        int [] nums3 ={-1,2};
        int [] nums4 ={0,2};
        System.out.println(fourSumCount(nums1,nums2,nums3,nums4));

    }
}
