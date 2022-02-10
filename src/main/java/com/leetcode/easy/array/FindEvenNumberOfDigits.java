package com.leetcode.easy.array;

/**
 * Find Numbers with Even Number of Digits
 * https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3237/
 */


public class FindEvenNumberOfDigits {

    public int countDigit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            ++count;
        }
        return count;
    }

    public int findNumbers(int[] nums) {

        int c = 0, maximum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (countDigit(nums[i]) % 2 == 0)//even
                c++;

            maximum = Math.max(c, maximum);
        }
        return maximum;
    }
}
