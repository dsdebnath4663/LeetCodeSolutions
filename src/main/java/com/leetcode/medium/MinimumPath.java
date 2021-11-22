package com.leetcode.medium;

public class MinimumPath {

    public int minPathSum(int[][] grid) {
        int m = grid.length;//no of rows
        int n = grid[0].length; //no of cols

        //Initialisation
        int[][] dp = new int[m][n];

        //Base Case Transformation

        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = dp[0][i - 1] + grid[0][i];  // for first row
        }

        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + grid[i][0];// for first col
        }

        //Main logic

        for (int i = 1; i < m; i++) {   
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.min(dp[i][j - 1], dp[i - 1][j]) + grid[i][j];
            }
        }
        return dp[m - 1][n - 1];
    }
}