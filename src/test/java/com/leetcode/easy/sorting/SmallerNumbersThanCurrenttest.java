package com.leetcode.easy.sorting;

import com.leetcode.easy.Searching.CheckIfNAndItsDoubleExist;
import org.junit.Assert;
import org.junit.Test;

public class SmallerNumbersThanCurrenttest {
    @Test
    public void testSmallerNumbersThanCurrent() {

        SmallerNumbersThanCurrent smallerNumbersThanCurrent = new SmallerNumbersThanCurrent();

        int arr[] = {8,1,2,2,3};
        int[] actualOutput = smallerNumbersThanCurrent.smallerNumbersThanCurrent(arr);
        int[] expectedOutput = new int[]{4,0,1,1,3};

     //   Assert.assertEquals(expectedOutput, actualOutput);

    }
}
