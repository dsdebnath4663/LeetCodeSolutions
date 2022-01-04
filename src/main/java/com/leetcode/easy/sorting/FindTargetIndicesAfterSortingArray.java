package com.leetcode.easy.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndicesAfterSortingArray {
    public List<Integer> targetIndices(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        boolean found = false;
        int low = 0;
        int high = arr.length - 1;
        int fi = 0;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (target == arr[mid]) {
                fi = mid;
                found = true;
                high = mid - 1;
            } else if (target > arr[mid]) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        if (!found) {
            return res;
        }

        int low2 = 0;
        int high2 = arr.length - 1;
        int li = 0;
        while (low2 <= high2) {
            int mid = (low2 + high2) / 2;
            if (target == arr[mid]) {
                li = mid;
                low2 = mid + 1;
            } else if (target > arr[mid]) {
                low2 = mid + 1;
            } else {
                high2 = mid - 1;
            }
        }
        if (found) {
            for (int i = fi; i <= li; i++) {
                res.add(i);
            }
        }

        return res;
    }

    public List<Integer> targetIndices2(int[] arr, int target) {
        ArrayList<Integer> res = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                res.add(i);
            }
        }
        return res;
    }

}