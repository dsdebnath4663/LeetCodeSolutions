package com.leetcode.easy.dp;

import java.util.Arrays;

public class RemoveElement {
    public static int removeElement(int[] A, int elem) {
        int m = 0;
        for (int i = 0; i < A.length; i++) {

            if (A[i] != elem) {
                A[m] = A[i];
                m++;
            }
        }
        return m;
    }

    public static void main(String[] args){
        int [] array1 = {3,2,2,3};
        int val1 = 3;

        int [] array2 = {0,1,2,2,3,0,4,2};
        int val2 = 2;



        System.out.println((removeElement(array2 ,val2)));


    }
}
