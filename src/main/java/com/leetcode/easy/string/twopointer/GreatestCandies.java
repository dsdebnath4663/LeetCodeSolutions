package com.leetcode.easy.string.twopointer;

import java.util.ArrayList;
import java.util.List;

public class GreatestCandies {
    public static int findMax(int[] arr) {
        int max = arr[0]; // Assume the first element is the maximum

        // Iterate through the array starting from index 1
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // Update max if a larger element is found
            }
        }

        return max;
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int maxCandisPerKids = 0;
        int n = candies.length;
        for (int i = 0; i < n; i++) {
            maxCandisPerKids = candies[i] + extraCandies;
            if (maxCandisPerKids >= findMax(candies)) {
                result.add(true);
            } else {
                result.add(false);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int candies[] = {2, 3, 5, 1,};
        int extraCandies = 3;

        GreatestCandies greatestCandies = new GreatestCandies();
        List<Boolean> result = greatestCandies.kidsWithCandies(candies, extraCandies);
        System.out.println(result);
    }
}
