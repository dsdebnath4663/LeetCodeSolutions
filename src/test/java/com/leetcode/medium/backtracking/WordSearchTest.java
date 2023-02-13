package com.leetcode.medium.backtracking;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

public class WordSearchTest {


    WordSearch wordSearch = new WordSearch();

    @Test
    public void existTest() {
        char board[][] = new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}};
        String word = "ABCCED";
        boolean expectedResult = wordSearch.exist(board, word);
        Assert.assertEquals(expectedResult, true);
    }
@Test
    public void existTest2(){
        char board[][] = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "SEE";
        boolean expectedResult = wordSearch.exist(board,word);
        Assert.assertEquals(expectedResult,true);
}

@Test
    public void  existTest3 (){
    char board[][] = new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
    String word = "ABCB";
    boolean expectedResult = wordSearch.exist(board,word);
    Assert.assertEquals(expectedResult,false);
}
}