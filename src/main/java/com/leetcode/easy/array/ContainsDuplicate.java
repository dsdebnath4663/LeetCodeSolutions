package com.leetcode.easy.array;

import java.util.Arrays;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1])
                return true;
        }
        return false;
    }

}
