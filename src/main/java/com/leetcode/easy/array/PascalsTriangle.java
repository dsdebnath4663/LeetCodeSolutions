package com.leetcode.easy.array;

import java.util.LinkedList;
import java.util.List;

public class PascalsTriangle {
    public  List<List<Integer>> generate(int numRows) {
        List<List <Integer>>res =new LinkedList<>();
        List<Integer> firstRow = new LinkedList<>();
        firstRow.add(1);
        res.add(firstRow);
        for(int i = 1; i < numRows; i++){
            List<Integer> curRow = new LinkedList<>();
            curRow.add(1);
            List<Integer> preRow = res.get(i - 1);
            for(int j = 1; j < i; j++){
                int val = preRow.get(j) + preRow.get(j - 1);
                curRow.add(val);
            }
            curRow.add(1);
            res.add(curRow);
        }
        return res;
    }
}
