package com.leetcode.medium.graph.dfs;

import com.leetcode.medium.graph.dfs.others.NumberofIslands;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class NumberofIslandsBFSTest {

    NumberofIslands numIslands = new NumberofIslands();

    @Test
    public void NumberofIslandsTest() {
        char[][] grid = {{'1', '1', '1', '1', '0'}, {'1', '1', '0', '1', '0'}, {'1', '1', '0', '0', '0'}, {'0', '0', '0', '0', '0'}};
        int actual = numIslands.numIslands(grid);
        Assert.assertEquals(1, actual);
    }

    @Test
    public void NumberofIslandsTest2(){
        char[][] grid ={
   {'1','1','0','0','0'},
  {'1','1','0','0','0'},
  {'0','0','1','0','0'},
  {'0','0','0','1','1'}};
        int actual = numIslands.numIslands(grid);
        Assert.assertEquals(3, actual);
    }



}
