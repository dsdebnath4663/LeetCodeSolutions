package com.leetcode.easy.array;

public class SearchinRotatedSortedArray {
    public static int search(int A[],  int target) {
        int n = A.length;
        int lo=0,hi=n-1;
        while(lo<hi){
            int mid=(lo+hi)/2;
            if(A[mid]>A[hi]) lo=mid+1;
            else hi=mid;
        }
        int rot=lo;
        lo=0;hi=n-1;
        while(lo<=hi){
            int mid=(lo+hi)/2;
            int realmid=(mid+rot)%n;
            if(A[realmid]==target)return realmid;
            if(A[realmid]<target)lo=mid+1;
            else hi=mid-1;
        }
        return -1;
    }
    public static void main(String[]args) {
      int [] array = {4, 5, 6, 7, 0, 1, 2};
      int target = 0;
        System.out.println(search(array,target));
    }
}
