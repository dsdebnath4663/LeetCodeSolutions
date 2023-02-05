package com.leetcode.medium.backtracking;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class SubsetsTest {
    Subsets obj = new Subsets();
    @Test
    public void SubsetsTest (){
 int [] nums  = {1,2,3};
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(),
                        Arrays.asList(1),
                        Arrays.asList(2),
                        Arrays.asList(1,2),
                        Arrays.asList(3),
                        Arrays.asList(1,3),
                        Arrays.asList(2,3),
                        Arrays.asList(1,2,3));

        System.out.println("Expected Output: " + expected);
        List<List<Integer>> actual = obj.subsets (nums);
        System.out.println("Actual Output:   " + actual);

    }
    @Test
    public void SubsetsTest2 (){
        int [] nums  = {0};
        List<List<Integer>> expected = Arrays.asList
                (Arrays.asList(),
                        Arrays.asList(0));

        System.out.println("Expected Output: " + expected);
        List<List<Integer>> actual = obj.subsets (nums);
        System.out.println("Actual Output:   " + actual);

    }
    }


