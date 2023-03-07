package com.leetcode.medium.array;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class NextPermutationTest {
    NextPermutation obj = new NextPermutation ();
    @Test
    public void NextPermutation (){
        obj.nextPermutation(new int[]{1,2,3});
    }
@Test
    public void NextPermutation2 (){
        obj.nextPermutation(new int[] {3,2,1});
}
@Test
    public void NextPermutation3 (){
        obj.nextPermutation(new int[] {1,1,5});
}
}
