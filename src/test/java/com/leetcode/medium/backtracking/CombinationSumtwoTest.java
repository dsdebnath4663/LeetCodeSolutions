package com.leetcode.medium.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationSumtwoTest {
    CombinationSumtwo obj = new CombinationSumtwo();
    @Test
    public void CombinationSumtwo1(){
        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(1,1,6),
                        Arrays.asList(1,2,5),
                        Arrays.asList(1,7),
                        Arrays.asList(2,6));
        System.out.println("Expected Output"+ expected);

        List<List<Integer>> actual = obj.combinationSum2(candidates,target);
        System.out.println("Actual Output:   " + actual);

    }
    @Test
    public void CombinationSumtwo2() {
        int[] candidates = {2,5,2,1,2};
        int target = 5;
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(1, 2,2),
                        Arrays.asList(5));
        System.out.println("Expected Output" + expected);

        List<List<Integer>> actual = obj.combinationSum2(candidates, target);
        System.out.println("Actual Output:   " + actual);
    }
}
