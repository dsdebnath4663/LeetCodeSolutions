package com.leetcode.medium.array;

import java.util.HashSet;
import java.util.Set;

public class FindtheDuplicateNumber {
    public static int findDuplicate(int[] nums) {
        Set<Integer> seen = new HashSet<Integer>();
        for (int num : nums) {
            if (seen.contains(num))
                return num;
            seen.add(num);
        }
        return -1;
    }
    public static void main (String[] arages){
        //int [] nums = {1,3,4,2,2};
        int[] nums ={3,1,3,4,2};
        System.out.println(findDuplicate(nums));
    }
}
