package com.leetcode.easy.array;

import java.util.Arrays;

public class DuplicateZeros2 {
    public static int[] duplicateZeros(int[] arr){

        int n = arr.length;
        for(int i = 0; i<arr.length;i++ ){
            if(arr[i] == 0){
                int j;
                for(j = n-2; j>i+1; j--){
                    arr[j+1] = arr[j];
                }
                arr[j+1] =0;
                i++;
            }

        }
        return arr;
    }

    public static void main(String[] args){
        int[] arr = {1,0,2,3,0,4,5,0};
        int[] output = duplicateZeros(arr);

        System.out.println(Arrays.toString(output));
    }
}
