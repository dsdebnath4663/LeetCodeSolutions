package com.leetcode.medium.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class Subsets2Test {
    Subsets2 obj = new Subsets2();

    @Test
    public void Subsets2Test1() {
        int[] nums = {1, 2, 2};
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(),
                        Arrays.asList(),
                        Arrays.asList(1),
                        Arrays.asList(2),
                        Arrays.asList(1, 2),
                        Arrays.asList(1, 2, 2),
                        Arrays.asList(2),
                        Arrays.asList(2, 2));

        System.out.println("Expected Output: " + expected);
        List<List<Integer>> actual = obj.subsetsWithDup(nums);
        System.out.println("Actual Output:   " + actual);

    }

    @Test
    public void Subsets2Test2() {
        int[] nums = {0};
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(),
                        Arrays.asList(),
                        Arrays.asList(0));

        System.out.println("Expected Output: " + expected);
        List<List<Integer>> actual = obj.subsetsWithDup(nums);
        System.out.println("Actual Output:   " + actual);
    }
}
