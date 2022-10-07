package com.leetcode.easy.dp;

import java.util.Arrays;

public class CountingBits {
    public static int[] countBits(int num) {
        int[] result = new int[num + 1];
        result[0] = 0;
        for (int i = 1; i <= num; i++) {
            result[i] = result[i & (i - 1)] + 1;
        }
        return result;
    }

    public static void main(String[] args) {
       // int[] result = countBits(2);
        int[] result = countBits(5);
        System.out.println(Arrays.toString(result));
    }
}
