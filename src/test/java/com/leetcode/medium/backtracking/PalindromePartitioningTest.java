package com.leetcode.medium.backtracking;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PalindromePartitioningTest {
    PalindromePartitioning obj =new PalindromePartitioning () ;

@Test
public void PalindromePartitioningTest(){
    String s = "aab";

    List<List<String>> expected= obj.partition(s);
    Assert.assertEquals(expected,Arrays.asList(

      Arrays.asList("a","a","b"),
            Arrays.asList("aa","b")
            ));
}
@Test
    public void PalindromePartitioningTest2 (){
    String s ="a";
    List<List<String>> expected= obj.partition(s);
Assert.assertEquals(expected,Arrays.asList(

        Arrays.asList("a")
));

}

}
