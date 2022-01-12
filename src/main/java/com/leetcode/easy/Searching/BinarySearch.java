package com.leetcode.easy.Searching;

import java.util.Arrays;

// Java implementation of recursive Binary Search
class BinarySearch {
    // Returns index of elementTobeSearch if it is present in arr[l..
    // r], else return -1
    int binarySearch(int arr[], int l, int r, int elementTobeSearch)
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle itself
            if (arr[mid] == elementTobeSearch)
                return mid;

            // If element is smaller than mid, then  it can only be present in left subarray
            if (arr[mid] > elementTobeSearch)
                return binarySearch(arr, l, mid - 1, elementTobeSearch);

            // Else the element can only be present  in right subarray
            return binarySearch(arr, mid + 1, r, elementTobeSearch);
        }

        // We reach here when element is not present
        // in array
        return -1;

    }
    public static int findDisappearedNumbers(int[] nums)
    {
        int n=nums.length;
        int sum=((n+1)*(n+2))/2;
        for(int i=0;i<n;i++)
            sum-=nums[i];
        return sum;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch ob = new BinarySearch();
      //  int arr[] = { 2,5,8,12,16,23,38,56,72,91};
        int arr[] = { 1,2,2,3};


        int n = arr.length;
        int elementTobeSearch = 2;
        int result = ob.binarySearch(arr, 0, n - 1, elementTobeSearch);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index "
                    + result);
    }
}

