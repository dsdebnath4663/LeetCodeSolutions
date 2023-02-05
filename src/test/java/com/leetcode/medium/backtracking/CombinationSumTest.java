package com.leetcode.medium.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationSumTest {

    CombinationSum obj = new CombinationSum();
    @Test

    public void CombinationSumone(){
        int[] candidates = {2,3,6,7};
        int target = 7 ;
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(1, 1, 2),
                        Arrays.asList(2, 1, 1));

        System.out.println("Expected Output: " + expected);
        List<List<Integer>> actual = obj.combinationSum(candidates,target);
        System.out.println("Actual Output:   " + actual);

    }
    @Test
    public void CombinationSumtwo(){
        int[] candidates = {2,3,5};
        int target = 8 ;
        List<List<Integer>>expected = Arrays.asList
                (Arrays.asList(2,2,2,2),
                        Arrays.asList(2,3,3),
                        Arrays.asList(3,5));
        System.out.println("Expected Output:"+ expected);
        List<List<Integer>> actual = obj.combinationSum(candidates,target);
        System.out.println("Actual Output:   " + actual);
    }

    @Test
    public void CombinationSumthree(){
        int[] candidates = {2};
        int target = 1 ;
        List<List<Integer>>expected = Arrays.asList
                (Arrays.asList());
        System.out.println("Expected Output:"+ expected);
        List<List<Integer>> actual = obj.combinationSum(candidates,target);
        System.out.println("Actual Output:   " + actual);
    }
}
