package com.leetcode.easy.array;

import java.util.Arrays;

public class BestTimeToBuyAndSellStock {
    public static int maxProfit(int[] prices) {
        if (prices.length == 1) return 0;
        int maxProfit = 0, start = 0, end = 1;
        while (end < prices.length) {
            if (prices[start] < prices[end]) {
                maxProfit = Math.max(maxProfit, prices[end] - prices[start]);
            } else {
                start = end;
            }
            end++;
        }
        return maxProfit;
    }

    public static void main(String[] args) {

        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum profit  is :" + result);
    }
}
