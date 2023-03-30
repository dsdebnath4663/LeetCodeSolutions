package com.leetcode.medium.array;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public static List<Integer> spiralOrder(int[][] arr) {
        List<Integer> res = new ArrayList<Integer>();
        int minR =0;
        int minC=0;
        int maxR= arr.length-1;
        int maxC = arr[0].length-1;
        int t =arr[0].length*arr.length;
        int count=0;
        while(count<t){
            for(int i =minC;i<=maxC && count<t ;i++){
                res.add(arr[minR][i]);
                count++;
            }
            minR++;
            for(int i =minR;i<=maxR && count<t;i++){
                res.add(arr[i][maxC]);
                count++;
            }
            maxC--;
            for(int i = maxC;i>=minC&&count<t;i--){
                res.add(arr[maxR][i]);
                count++;
            }
            maxR--;
            for(int i=maxR;i>=minR && count<t;i--){
                res.add(arr[i][minC]);
                count++;
            }
            minC++;
        }
        return res;
    }
    public static void main (String[] args){
        //int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        System.out.println(spiralOrder(arr));
    }
}
