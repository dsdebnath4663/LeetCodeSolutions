package com.leetcode.medium.Intervals;

import java.util.ArrayList;
import java.util.List;

public class IntervalListIntersections {
public static int [][] intervalIntersection(int[][] A, int[][] B){
    int i = 0;
    int j = 0;
    List<int[] > list=new ArrayList<>();
    while(i<A.length && j<B.length){
        int lower=Math.max(A[i][0],B[j][0]);
        int upper=Math.min(A[i][1],B[j][1]);
        if(lower<=upper){
            list.add(new int[]{lower,upper});
        }
        if(A[i][1]<B[j][1]){
            i++;
        }else{
            j++;
        }
    }
    return list.toArray(new int[list.size()][]);
}
public static void main(String []array ){
    int [][] A = {{1,3},{5,9}};
    int [][] B = {{}};
    System.out.println(intervalIntersection (A,B));
}
}