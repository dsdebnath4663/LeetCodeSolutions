package com.leetcode.easy.array;

/**
 *  Squares of a Sorted Array
 *  https://leetcode.com/explore/learn/card/fun-with-arrays/521/introduction/3240/
 */


public class SquaresofaSortedArray {
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static int partition(int[] arr, int first, int end) {
        int piv = arr[end];

        // Index of smaller element and
        // indicates the right position
        // of piv found so far
        int i = (first - 1);

        for (int j = first; j <= end - 1; j++) {
            // If current element is smaller
            // than the piv
            if (arr[j] < piv) {
                // Inkkcrement index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, end);
        return (i + 1);
    }

    static void quickSort(int[] arr, int first, int end) {
        if (first < end) {
            int piv_pos = partition(arr, first, end);
            quickSort(arr, first, piv_pos - 1);//Left side of pivot
            quickSort(arr, piv_pos + 1, end);//right side of pivot
        }

    }

    public int[] sortedSquares(int[] arr) {
        int[] squareNumbers = new int[arr.length];

        for (int i = 0; i <= arr.length - 1; i++) {
            int square = arr[i] * arr[i];
            squareNumbers[i] = square;

        }
        quickSort(squareNumbers, 0, arr.length - 1);
        return squareNumbers;
    }
}