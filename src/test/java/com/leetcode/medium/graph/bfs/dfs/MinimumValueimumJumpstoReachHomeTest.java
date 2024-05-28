//package com.leetcode.medium.graph.bfs.dfs;
//
//import com.leetcode.medium.graph.dfs.MinimumValueimumJumpstoReachHome;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class MinimumValueimumJumpstoReachHomeTest {
//
//    MinimumValueimumJumpstoReachHome minimumValueimumJumpstoReachHome = new MinimumValueimumJumpstoReachHome();
//
//    @Test
//    public void minimumValueimumJumpstest() {
//        int[] forbidden = {14, 4, 18, 1, 15};
//        int a = 3, b = 15, x = 9;
//        int actualOutput = minimumValueimumJumpstoReachHome.minimumJumps (forbidden, a, b, x);
//        Assert.assertEquals(3, actualOutput);
//    }
//
//    @Test
//    public void minimumValueimumJumpstestOne() {
//        int[] forbidden = {8, 3, 16, 6, 12, 20};
//        int a = 15, b = 13, x = 11;
//        int actualOutput = minimumValueimumJumpstoReachHome.minimumJumps(forbidden, a, b, x);
//        Assert.assertEquals(-1, actualOutput);
//    }
//
//    @Test
//    public void minimumValueimumJumpstestTwo() {
//        int[] forbidden = {14, 4, 18, 1, 15};
//        int a = 3, b = 15, x = 9;
//        int actualOutput = minimumValueimumJumpstoReachHome.minimumJumps(forbidden, a, b, x);
//        Assert.assertEquals(3, actualOutput);
//    }
//}
