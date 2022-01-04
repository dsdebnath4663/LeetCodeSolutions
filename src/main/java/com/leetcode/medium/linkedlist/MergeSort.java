package com.leetcode.medium.linkedlist;

public class MergeSort {

    // Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
    void merge(int arr[], int l, int pivot, int r) {
        // Find sizes of two subarrays to be merged
        int n1 = pivot - l + 1;  // 0 , 1 ,2 ,3 ,4
        int n2 = r - pivot;

        /* Create temp arrays */
        int L[] = new int[n1];   // 0,1,2,3,4 ,5
        int R[] = new int[n2];   // O,1,2,3,4 ,5

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)  //0 ,1 ,2,3,4 ,5
            L[i] = arr[l + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[pivot + 1 + j];

        /* Merge the temp arrays */

        // Initial indexes of first and second subarrays
        int i = 0, j = 0;

        // Initial index of merged subarray array
        int k = l;
        while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            } else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }

        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];  // k =[1, ]  L(i)= [0 ]
            i++; // (1)
            k++; // [1 ,2 ]
        }

        /* Copy remaining elements of R[] if any */
        while (j < n2) {  // j = 1,
            arr[k] = R[j];
            j++;
            k++;
        }
    }

    // Main function that sorts arr[l..r] using
    // merge()
    void sort(int arr[], int l, int r) {
        if (l < r) {
            // Find the middle point
            int pivot = l + (r - l) / 2;

            // Sort first and second halves
            sort(arr, l,pivot);
            sort(arr, pivot + 1, r);

            // Merge the sorted halves
            merge(arr, l, pivot, r);
        }
    }

    /* A utility function to print array of size n */
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
    }

    // Driver code
    public static void main(String args[]) {
//        int arr[] = { 38,27,43,3,9,82,10 };
        int arr[] = { 12, 11, 13, 5, 6, 7 };

        System.out.println("Given Array");
        printArray(arr);

        MergeSort ob = new MergeSort();
        ob.sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted array");
        printArray(arr);
    }
}
