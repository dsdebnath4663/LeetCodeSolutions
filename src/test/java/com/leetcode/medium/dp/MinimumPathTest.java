package com.leetcode.medium.dp;

import com.leetcode.medium.MinimumPath;
import com.leetcode.medium.recursion.DecodeString;
import org.junit.Assert;
import org.junit.Test;

public class MinimumPathTest {

    @Test
    public void testMinPathSum() {

        MinimumPath minimumPath = new MinimumPath();

        int inputGrid[][] = {
                {1, 3, 1},
                {1, 5, 1},
                {4, 2, 1}};
        int actualOutput = minimumPath.minPathSum(inputGrid);
        int expectedOutput = 7;

        Assert.assertEquals(expectedOutput, actualOutput);

    }
}
