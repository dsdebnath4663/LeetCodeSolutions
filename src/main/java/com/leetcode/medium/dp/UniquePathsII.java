package com.leetcode.medium.dp;

public class UniquePathsII {
//    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//        int m = obstacleGrid.length;//no of rows 3
//        int n = obstacleGrid[0].length; //no of cols 3
//        int dp[][] = new int[m][n];
//
//        if (obstacleGrid[0][0] == 0) {
//            dp[0][0] = 1;
//        } else {
//            dp[0][0] = 0;
//        }
//
//        for (int i = 1; i < m; ++i) {
//            if (obstacleGrid[0][i] == 0) {
//                dp[0][i] = dp[0][i - 1];//Setting the value of first row
//            }
//        }
//
//        for (int i = 1; i < n; ++i) {
//            if (obstacleGrid[i][0] == 0) {
//                dp[i][0] = dp[i - 1][0];//Setting the value of first column
//            }
//        }
//        for (int i = 1; i < m; ++i) {
//            for (int j = 1; j < n; ++j) {
//                if (i == 1 && j == 1 || obstacleGrid[i - 1][j - 1] == 1)
//                    continue;
//                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
//            }
//                if (obstacleGrid[i][j] == 0) {
//                    dp[i][j] = dp[i - 1][j] + dp[i][j - 1]; // remaining blocks
//                }else{
//                    continue;
//                }

//        }
//        return dp[m - 1][n - 1];
//    }

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