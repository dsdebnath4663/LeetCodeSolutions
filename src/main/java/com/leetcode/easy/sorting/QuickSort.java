package com.leetcode.easy.sorting;
import java.io.*;

class QuickSort{

    static void swap(int[] arr, int i, int j)
    {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int first, int end)
    {
        int piv = arr[end];

        // Index of smaller element and
        // indicates the right position
        // of piv found so far
        int i = (first - 1);

        for(int j = first; j <= end - 1; j++)
        {
            // If current element is smaller
            // than the piv
            if (arr[j] < piv)
            {
                // Inkkcrement index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return (i + 1);
    }

    static void quickSort(int[] arr, int first, int end)
    {
        if (first < end)
        {
            int piv_pos = partition(arr, first, end);
            quickSort(arr, first, piv_pos - 1);//Left side of pivot
            quickSort(arr, piv_pos + 1, end);//right side of pivot
        }

    }

    // Function to print an array
    static void printArray(int[] arr, int size)
    {
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    // Driver Code
    public static void main(String[] args)
    {
        int[] arr = { 9,7,8,3,2,1};
        //int[] arr = { 10, 80, 30, 90, 40,50, 70 };

        int n = arr.length;

        quickSort(arr, 0, n - 1);
        System.out.println("Sorted array: ");
        printArray(arr, n);
    }
}

// This code is contributed by Ayush Choudhary
