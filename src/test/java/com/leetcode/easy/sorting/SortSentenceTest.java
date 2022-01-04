package com.leetcode.easy.sorting;

import org.junit.Assert;
import org.junit.Test;

public class SortSentenceTest {
    @Test
    public void testSmallerNumbersThanCurrent() {

        SortSentence sortSentenceObject = new SortSentence();

        String sentence = "is2 sentence4 This1 a3";
        String actualOutput = sortSentenceObject.sortSentence(sentence);
        String expectedOutput = "This is a sentence";

         Assert.assertEquals(expectedOutput, actualOutput);

    }
}
