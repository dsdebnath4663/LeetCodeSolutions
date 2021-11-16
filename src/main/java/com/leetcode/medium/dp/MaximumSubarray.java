package com.leetcode.medium.dp;

public class MaximumSubarray {

    public static int maxSubArray(int[] A){
        int max_current =A[0],max_global =A[0];

        for(int i=1;i<A.length;i++){
            max_current=Math.max(A[i],max_current +A[i]);

            if(max_current>max_global){
                max_global=max_current;
            }
        }
        return max_global;
    }
    public static void main(String[] args) {
        int[] array = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(array));
    }
}
