package com.leetcode.medium.backtracking;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PermutationsTest {
    Permutations obj = new Permutations();

    @Test
    public void PermutationsTestone() {
        int[] nums = {1, 2, 3};
        List<List<Integer>> expected  = Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(1, 3, 2),
                Arrays.asList(2, 1, 3),
                Arrays.asList(2, 3, 1),
                Arrays.asList(3, 1, 2),
                Arrays.asList(3, 2, 1));
        System.out.println("Expected Output: "+ expected);

        List<List<Integer>> actual = obj.permute(nums);
        System.out.println("Actual Output:   "+ actual);


    }

    @Test
    public void PermutationsTesttwo() {
        int[] nums = {0,1};
        List<List<Integer>> expected  = Arrays.asList(
                Arrays.asList(0,1),
                Arrays.asList(1,0));

                System.out.println("Expected Output: "+ expected);

        List<List<Integer>> actual = obj.permute(nums);
        System.out.println("Actual Output:   "+ actual);


    }


}
