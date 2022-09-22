package com.leetcode.easy.array;

public class BestTimetoBuyandSellStockII {
    public static int maxProfit(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
             while (i < N && prices[i + 1] <= prices[i]) {
                i++;
            }
            buy = prices[i];
            while (i < N && prices[i + 1] > prices[i]) {
                i++;
            }

             sell = prices[i];
            profit += sell - buy;
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        int result = maxProfit(prices);
        System.out.println("Maximum profit  is :" + result);
    }
}
