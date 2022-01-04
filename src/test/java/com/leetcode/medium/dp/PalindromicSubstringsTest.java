package com.leetcode.medium.dp;

import org.junit.Assert;
import org.junit.Test;

public class PalindromicSubstringsTest {

    @Test
    public void testCountSubstrings1() {

        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

        String s = "abcc";
        int actualOutput = palindromicSubstrings.countSubstrings(s);
        int expectedOutput = 5;

        Assert.assertEquals(expectedOutput, actualOutput);

    }

    @Test
    public void testCountSubstrings() {

        PalindromicSubstrings palindromicSubstrings = new PalindromicSubstrings();

        String s = "aaa";
        int actualOutput = palindromicSubstrings.countSubstrings(s);
        int expectedOutput = 6;

        Assert.assertEquals(expectedOutput, actualOutput);

    }
}
