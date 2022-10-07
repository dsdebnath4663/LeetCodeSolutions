package com.leetcode.easy.array;

public class BestTimetoBuyandSellStockIII {
    public static int maxProfit(int[] prices) {
        int hold1 = Integer.MIN_VALUE, hold2 = Integer.MIN_VALUE;
        int release1 = 0, release2 = 0;
        for (int i : prices) {// Assume we only have 0 money at first
            release2 = Math.max(release2, hold2 + i);// The maximum if we've just sold 2nd stock so far.
            hold2 = Math.max(hold2, release1 - i);// The maximum if we've just buy  2nd stock so far.
            release1 = Math.max(release1, hold1 + i);     // The maximum if we've just sold 1nd stock so far.
            hold1 = Math.max(hold1, -i);          // The maximum if we've just buy  1st stock so far.
        }
        return release2; ///Since release1 is initiated as 0, so release2 will always higher than release1.
    }
    public static void main(String[] arges) {
        //int[] prices = {3, 3, 5, 0, 0, 3, 1, 4}; //  int[] prices = {1,2,3,4,5};
        int[] prices = {7,6,4,3,1};
        int result = maxProfit(prices);
        System.out.println("Maximum profit  is :" + result);
    }
}
