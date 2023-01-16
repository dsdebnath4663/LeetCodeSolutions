package com.leetcode.medium.backtracking;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LetterCombinationsofaPhoneNumberTest  {


    LetterCombinationsofaPhoneNumber obj = new LetterCombinationsofaPhoneNumber();
    @Test
    public void letterCombinations() {
        String digits = "23";
        List<String> expected= obj.letterCombinations(digits);
        Assert.assertEquals(expected,Arrays.asList("ad","ae","af","bd","be","bf","cd","ce","cf"));
    }
    @Test
    public void letterCombinations2 (){
        String digits = "";
        List<String> actual= obj.letterCombinations(digits);
        List<String> expected = new LinkedList<>();
        Assert.assertEquals(expected,actual);
    }
    @Test
    public void letterCombinations3() {
        String digits = "2";
        List<String> actual= obj.letterCombinations(digits);
        Assert.assertEquals(Arrays.asList("a","b","c"),actual);

    }

    }