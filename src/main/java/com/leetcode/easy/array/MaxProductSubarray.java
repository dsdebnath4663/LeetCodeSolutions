package com.leetcode.easy.array;

public class MaxProductSubarray {
    public static int maxProduct(int[] arr) {

        int n = arr.length;
        int result = arr[0];//2 default
        for (int i = 0; i < n; i++) {
            int product = arr[i];//2 default
            for (int j = i + 1; j < n; j++) {//j=1//2
                result = Math.max(result, product); //2 //(2,6)=>6 //(6,-12)=>6//
                product = product * arr[j];// 2* arr[1]=2*3=6//  6 * arr[2] = 6*-2 =-12//-12 * arr[3]=>-12*4 =-48
            }
            result = Math.max(product, result);//max(6,-48)=>6
        }
        return result;
    }

    public static void main(String[] args) {

        int[] nums = {2, 3, -2, 4};
        //            0  1  2   3
//        i    j = i+1
//        0    j=0+1=1 j++
//          0      1   2*3
//          0      2
//          0      3

        int result = maxProduct(nums);
        System.out.println("maxProduct is:  " + result);
    }


}