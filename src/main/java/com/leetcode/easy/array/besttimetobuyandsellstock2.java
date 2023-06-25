package com.leetcode.easy.array;
import java.util.HashMap;
import java.util.Map;

public class besttimetobuyandsellstock2 {
    static Map<String, Integer> dp = new HashMap<>();
    public static int maxProfit1(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];
            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];
            profit += sell - buy;
        }
        return profit;
    }
    public static int maxProfit(int[] prices) {
        return calculate(prices, 0, 0, false);
    }
    public static int calculate(int[] prices, int index, int max, boolean buy) {
        String key = "" + index + buy + max;
        if (dp.containsKey(key)) {
         return dp.get(key);
        }
        if (index == prices.length) {
            return max;
        }
        int newMax = buy ? max + prices[index] : max - prices[index];
        int profit = calculate(prices, index + 1, newMax, !buy);
        int profitPass = calculate(prices, index + 1, max, buy);
        dp.put(key, Math.max(profit, profitPass));
        return dp.get(key);
    }
    public static void main(String[] args) {
        int[] prices = {109,34,20,30,50,43,38,10,48,40,66,28,35,77,60,83};
        int result = maxProfit(prices);
        System.out.println("Maximum profit  is :" + result);
    }
}
