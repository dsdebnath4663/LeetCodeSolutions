package com.leetcode.easy.array;

import java.util.HashSet;

public class IntersectionofTwoArrays {
    public static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set1 = new HashSet<Integer>();
        for (Integer n : nums1) set1.add(n);
        HashSet<Integer> set2 = new HashSet<Integer>();
        for (Integer n : nums2) set2.add(n);

        set1.retainAll(set2);

        int [] output = new int[set1.size()];
        int idx = 0;
        for (int s : set1) output[idx++] = s;
        return output;
    }
    public static void main (String[] args){
        //int[] nums1 ={1,2,2,1};
       // int[] nums2 ={2,2};
        int[] nums1 ={4,9,5};
         int[] nums2 ={9,4,9,8,4};
        System.out.println(intersection(nums1,nums2));
    }
}
