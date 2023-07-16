package com.leetcode.medium.array;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class QueueReconstructionbyHeight {
    public static int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> a[0] == b[0] ? a[1] - b[1] : b[0] - a[0]);

        List<int[]> ordered = new LinkedList<>();
        for (int[] p: people) ordered.add(p[1], p);

        return ordered.toArray(new int[people.length][2]);
    }
    public static void main (String [] args) {
      //  int[][] people = {{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] people = {{6,0},{5,0},{4,0},{3,2},{2,2},{1,4}};
        System.out.println(reconstructQueue(people));
    }
}
