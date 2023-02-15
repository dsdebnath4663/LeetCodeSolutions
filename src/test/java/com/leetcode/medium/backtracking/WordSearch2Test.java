package com.leetcode.medium.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class WordSearch2Test {
    WordSearch2 wordSearch= new WordSearch2();
    @Test
public void existTest(){
        char board[][] = new char [][]{{'o','a','a','n'},
                {'e','t','a','e'},
                {'i','h','k','r'},
                {'i','f','l','v'}};
        String[] word = {"oath","pea","eat","rain"};
        List<String> expectedResult = wordSearch.findWords(board, word);
        Assert.assertEquals(expectedResult, Arrays.asList(
                "oath",  "eat"));
    }
    @Test
    public void existTest2(){
        char board[][] = new char [][]{{'a','b'},
                {'c','d'}};
        String[] word = {"abcb"};
        List<String> expectedResult = wordSearch.findWords(board, word);
        Assert.assertEquals(expectedResult, Arrays.asList(
                ));
    }
}
