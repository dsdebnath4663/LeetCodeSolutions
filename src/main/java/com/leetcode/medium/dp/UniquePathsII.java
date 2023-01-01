package com.leetcode.medium.dp;

public class UniquePathsII {


    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid[0][0] == 1)
            return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m + 1][n + 1];
        dp[1][1] = 1;
        //m=3
        for (int i = 1; i <= m; i++) { //i=1,   2,      3
            //n=3
            for (int j = 1; j <= n; j++) {//j=1,2,3
                //An obstacle and space is marked as 1 and 0 respectively in the grid.
                if (i == 1 && j == 1 || obstacleGrid[i - 1][j - 1] == 1)
                   continue;
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }
        return dp[m][n];
    }
}