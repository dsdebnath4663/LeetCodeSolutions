package com.leetcode.medium.graph.dfs;

import junit.framework.TestCase;
import org.junit.Test;

import java.util.List;

public class PacificAtlanticWaterFlowDFSTest  {


    PacificAtlanticWaterFlowDFS obj = new PacificAtlanticWaterFlowDFS();

    @Test
    public void pacificAtlanticTest() {
        int[][] heights = {
                {1, 2, 2, 3, 5},
                {3, 2, 3, 4, 4},
                {2, 4, 5, 3, 1},
                {6, 7, 1, 4, 5},
                {5, 1, 1, 2, 4}};
        List<List<Integer>> expected = obj.pacificAtlantic(heights);
        System.out.print(expected);
    }

    @Test
    public void pacificAtlanticTest3() {
        int[][] heights = {
                {1, 2, 2, 3, 5, 1, 1, 1, 3},
                {3, 2, 3, 4, 4, 2, 2, 2, 3},
                {2, 4, 5, 3, 2, 1, 5, 1, 4},
                {6, 7, 1, 4, 5, 1, 6, 4, 2},
                {5, 1, 1, 2, 4, 4, 1, 1, 4}};
        List<List<Integer>> expected =
                obj.pacificAtlantic(heights);
        System.out.print(expected);
    }
}