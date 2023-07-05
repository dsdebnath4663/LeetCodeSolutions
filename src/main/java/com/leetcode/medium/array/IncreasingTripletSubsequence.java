package com.leetcode.medium.array;

public class IncreasingTripletSubsequence {
    public static boolean increasingTriplet(int[] nums) {
        int min = Integer.MAX_VALUE, secondMin = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= min) min = num;
            else if(num < secondMin) secondMin = num;
            else if(num > secondMin) return true;
        }
        return false;
    }
    public static void main (String[] args ){
       // int [] nums = {1,2,3,4,5};
        int [] nums = {5,4,3,2,1};
        System.out.println(increasingTriplet(nums));
    }
}
