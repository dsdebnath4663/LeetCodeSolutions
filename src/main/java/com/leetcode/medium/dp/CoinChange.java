package com.leetcode.medium.dp;

public class CoinChange {

    public int coinChange(int[] coins, int amount) {
        Integer[] dp = new Integer[amount + 1];
        dp[0] = 0;

        for (int currentAmount = 1; currentAmount <= amount; currentAmount++)
            for (int coin : coins) {
                if (currentAmount >= coin && dp[currentAmount - coin] != null) {
                    if (dp[currentAmount] != null)
                        dp[currentAmount] = Math.min(dp[currentAmount], 1 + dp[currentAmount - coin]);
                    else
                        dp[currentAmount] = 1 + dp[currentAmount - coin];
                }
            }
        return dp[amount] == null ? -1 : dp[amount];

    }
}
