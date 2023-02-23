package com.leetcode.medium.array;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class DuplicateZerosTest {
    DuplicateZeros obj = new DuplicateZeros();
    @Test
    public void DuplicateZeros (){

        int[] array = {1,0,2,3,0,4,5,0};
        System.out.println("Actual Output: "+ Arrays.toString(array));

        int[] expected = obj.duplicateZeros(array);
        System.out.println("Expected Output: "+ Arrays.toString(expected));
    }
}
