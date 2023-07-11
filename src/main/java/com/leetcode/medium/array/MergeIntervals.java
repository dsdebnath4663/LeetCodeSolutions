package com.leetcode.medium.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return new int[0][];
        }
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> merged = new ArrayList<>();
        int[] mergedInterval = intervals[0];
        for (int i = 1; i < intervals.length; i++) {
            int[] interval = intervals[i];
            if (interval[0] <= mergedInterval[1]) {
                mergedInterval[1] = Math.max(mergedInterval[1], interval[1]);
            } else {
                merged.add(mergedInterval);
                mergedInterval = interval;
            }
        }
        merged.add(mergedInterval);
        return merged.toArray(new int[merged.size()][]);
    }
    public static void main (String[] args){
        int[][] intervals ={{1,3},{2,6},{8,10},{15,18}} ;
        
System.out.println(merge(intervals));
    }
}