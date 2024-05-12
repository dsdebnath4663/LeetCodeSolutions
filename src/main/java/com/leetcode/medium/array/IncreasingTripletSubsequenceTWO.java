package com.leetcode.medium.array;

public class IncreasingTripletSubsequenceTWO {
    public boolean increasingTriplet2(int[] nums) {
        int n = nums.length;
        if (n < 3) {
            return false;  // Array length less than 3 cannot contain an increasing triplet.
        }

        int firstMin = Integer.MAX_VALUE;  // Smallest number seen so far.
        int secondMin = Integer.MAX_VALUE;  // Second smallest number seen so far.

        for (int num : nums) {
            if (num <= firstMin) {
                firstMin = num;  // Update firstMin if num is smaller or equal.
            } else if (num <= secondMin) {
                secondMin = num;  // Update secondMin if num is smaller or equal.
            } else {
                // Found a number greater than firstMin and secondMin, hence an increasing triplet.
                return true;
            }
        }

        return false;  // No increasing triplet found.
    }


    public static void main(String args[]) {
        int[] array0 = new int[5];
        array0[0] = 1;
        array0[1] = 2;
        array0[2] = 0;
//        array0[3] = 4;
//        array0[4] = 5;
        int[] array1 = {5,4,3,2,1};
        int [] array2= {2,1,5,0,4,6};
        int[] array3={6,7,1,2};
        IncreasingTripletSubsequenceTWO increasingTripletSubsequenceTWO = new IncreasingTripletSubsequenceTWO();
        boolean result = increasingTripletSubsequenceTWO.increasingTriplet2(array0);
        System.out.println("The result is "+result);

    }
}
