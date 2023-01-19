package com.leetcode.medium.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Permutations2Test {
    //public class Permutations2 {

    Permutations2 obj = new Permutations2();

    @Test
    public void Permutations2one() {
        int[] nums = {1, 1, 2};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 1, 2), Arrays.asList(1, 2, 1), Arrays.asList(2, 1, 1));

        System.out.println("Expected Output: " + expected);

        List<List<Integer>> actual = obj.permuteUnique(nums);
        System.out.println("Actual Output:   " + actual);
    }

     @Test

    public void Permutations2two() {
        int[] nums = {1,2,3};
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1,2,3), Arrays.asList(1,3,2), Arrays.asList(2,1,3) , Arrays.asList(2,3,1),Arrays.asList(3,1,2),Arrays.asList(3,2,1));

        System.out.println("Expected Output: " + expected);

        List<List<Integer>> actual = obj.permuteUnique(nums);
        System.out.println("Actual Output:   " + actual);
    }
}

