package com.leetcode.medium.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class CombinationSumThreeTest {
    CombinationSumThree obj = new CombinationSumThree();

    @Test
    public void CombinationSumThree(){
        int k = 3;
        int n = 7;
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(1,2,4));
        System.out.println("Expected Output"+ expected);
        List<List<Integer>> actual = obj.combinationSum3(k ,  n);
        System.out.println("Actual Output:   " + actual);

    }
    @Test
    public void CombinationSumThreeTwo(){
        int k = 3;
        int n = 9;
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(1,2,6),
        Arrays.asList(1,3,5),
                        Arrays.asList(2,3,4));
        System.out.println("Expected Output"+ expected);
        List<List<Integer>> actual = obj.combinationSum3(k ,  n);
        System.out.println("Actual Output:   " + actual);

    }
    @Test
    public void CombinationSumThreeThree(){
        int k = 4;
        int n = 1;
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList());
        System.out.println("Expected Output"+ expected);
        List<List<Integer>> actual = obj.combinationSum3(k ,  n);
        System.out.println("Actual Output:   " + actual);

    }
}
