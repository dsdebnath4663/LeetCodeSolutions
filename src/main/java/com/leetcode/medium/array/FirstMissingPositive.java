package com.leetcode.medium.array;

public class FirstMissingPositive {
    public static int firstMissingPositive(int[] A) {
        int i = 0;
        while(i < A.length){
            if(A[i] == i+1 || A[i] <= 0 || A[i] > A.length) i++;
            else if(A[A[i]-1] != A[i]) swap(A, i, A[i]-1);
            else i++;
        }
        i = 0;
        while(i < A.length && A[i] == i+1) i++;
        return i+1;
    }
    private static void swap(int[] A, int i, int j){
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    public static void main(String[] args) {
       // int[] A = {1,2,0};
        //int[]A = {3,4,-1,1};
        int[]A = {7,8,9,11,12};
        System.out.println(firstMissingPositive(A));
    }
}
