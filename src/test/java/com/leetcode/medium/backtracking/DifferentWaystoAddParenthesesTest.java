package com.leetcode.medium.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DifferentWaystoAddParenthesesTest {

    DifferentWaystoAddParentheses obj = new DifferentWaystoAddParentheses();

    @Test
    public void DifferentWaystoAddParentheses() {
        String expression = "2-1-1";
        List<Integer> expected = Arrays.asList(0, 2);
        List<Integer> actual = obj.diffWaysToCompute(expression)
                //Following block of code is used to sort the list in ascending/increasing order
                .stream()
                .sorted()
                .collect(Collectors.toList());

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void DifferentWaystoAddParentheses2() {
        String expression = "2*3-4*5";
        List<Integer> expected = Arrays.asList(-34, -14, -10, -10, 10)
                .stream()
                .sorted()
                .collect(Collectors.toList());
        List<Integer> actual = obj.diffWaysToCompute(expression)
                .stream()
                .sorted()
                .collect(Collectors.toList());
        Assert.assertEquals(expected, actual);
    }
}
