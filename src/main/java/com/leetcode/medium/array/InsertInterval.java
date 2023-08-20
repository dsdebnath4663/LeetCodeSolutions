package com.leetcode.medium.array;

import java.util.ArrayList;
import java.util.Arrays;

public class InsertInterval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        // Initialize an ArrayList to hold the merged intervals
        ArrayList<int[]> ans = new ArrayList<>();
        // Initialize a variable to track our position in the input intervals array
        int idx = 0;
        // Loop through the input intervals
        while(idx < intervals.length){
            // If the current interval starts before the new interval, add it to the answer list
            if(intervals[idx][0] < newInterval[0]){
                ans.add(intervals[idx]);
                idx++;
                // If the current interval starts after or at the same time as the new interval, exit the loop
            }else{
                break;
            }
        }
        if(ans.size() == 0 || (newInterval[0] > ans.get(ans.size()-1)[1])){
            ans.add(newInterval);
            // If the last interval in the answer list overlaps with the new interval, merge them by updating the end time of the last interval
        }else{
            int[] lastInterval = ans.get(ans.size()-1);
            lastInterval[1] = Math.max(lastInterval[1],newInterval[1]);
        }
        // Loop through the remaining intervals in the input array
        while(idx < intervals.length){
            int[] lastInterval = ans.get(ans.size()-1);
            // If the last interval in the answer list overlaps with the current interval, merge them by updating the end time of the last interval
            if(lastInterval[1] >= intervals[idx][0]){
                lastInterval[1] = Math.max(lastInterval[1], intervals[idx][1]);
            }else{
                // If the last interval does not overlap with the current interval, add it to the answer list
                ans.add(intervals[idx]);
            }
            idx++;
        }
        // Convert the ArrayList to a 2D int array and return it
        return ans.toArray(new int[ans.size()][]);
    }
    public static void main (String args []){
      //  int[][] intervals = {{1,3},{6,9}};
        int[][] intervals = {{1,2},{3,5},{6,7},{8,10},{12,16}};
        int[] newInterval = {4,8};
        int[][] output = insert(intervals,newInterval);
        System.out.println(Arrays.deepToString(output));
    }
}
