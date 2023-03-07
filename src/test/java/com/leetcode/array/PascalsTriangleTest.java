package com.leetcode.array;

import com.leetcode.easy.array.PascalsTriangle;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PascalsTriangleTest {

    PascalsTriangle obj = new PascalsTriangle ();

   @Test
   public void PascalsTriangle() {
       int numRows = 5;
       List<List<Integer>> expected = Arrays.asList(
               Arrays.asList(1),
               Arrays.asList(1, 1),
               Arrays.asList(1, 2, 1),
               Arrays.asList(1, 3, 3, 1),
               Arrays.asList(1, 4, 6, 4, 1)
       );

   }
}
