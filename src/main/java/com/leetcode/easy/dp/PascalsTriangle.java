package com.leetcode.easy.dp;

import java.util.ArrayList;
import java.util.List;

/*
Link : https://leetcode.com/problems/pascals-triangle/
*/
public class PascalsTriangle {

    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> ans = new ArrayList<>();

        int arr[][] = new int[numRows][numRows];
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numRows; j++) {
                if (i == 0 || j == 0 || i == j) {
                    arr[i][j] = 1;
                } else {
                    arr[i][j] = arr[i - 1][j - 1] + arr[i - 1][j];
                }
            }
        }
        for (int i = 0; i < numRows; i++) {
            List<Integer> li = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                li.add(arr[i][j]);
            }
            ans.add(li);
        }
        return ans;
    }

    public static void main(String[] args) {

        int numRows = 5;
        System.out.println(generate(numRows));



    }

}
