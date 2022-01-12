package com.leetcode.easy.array;

public class MergeSortedArray {

    public static void merge(int[] L, int m, int[] R, int n) {

        int tempArr[] = new int[m];
        for (int i = 0; i < m; i++) {
            tempArr[i] = L[i];
        }
        int i = 0, j = 0, k = 0;
        while (i < m && j < n) {
            if (tempArr[i] <= R[j]) {
                L[k] = tempArr[i];
                i++;
            } else {
                L[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < m) {
            L[k] = tempArr[i];
            i++;
            k++;
        }
        /* Copy remaining elements of R[] if any */
        while (j < n) {
            L[k] = R[j];
            j++;
            k++;
        }
    }


    public static void main(String args[]) {
        int[] L = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] R = {2, 5, 6};
        int n = 3;
        merge(L, m, R, n);
    }
}
