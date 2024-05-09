package com.leetcode.medium.array;

import java.util.Arrays;

public class ProductofArrayExceptSelf {


    private int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];


//    # Initialize left and right product arrays
        int[] leftProduct = new int[n];
        int[] rightProduct = new int[n];
        Arrays.fill(leftProduct, 1);
        Arrays.fill(rightProduct, 1);


//    # Calculate left product array
        for (int i = 1; i <= n - 1; i++) {
            leftProduct[i] = leftProduct[i - 1] * nums[i - 1];
        }
//            # Calculate right product array
        for (int i = n - 2; i >= 0; i--) {
            rightProduct[i] = rightProduct[i + 1] * nums[i + 1];
        }
//            # Calculate answer array using left and right product arrays
        for (int i = 0; i <= n - 1; i++) {
            answer[i] = leftProduct[i] * rightProduct[i];
        }
        return answer;
    }


    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ProductofArrayExceptSelf productofArrayExceptSelf = new ProductofArrayExceptSelf();
        int[] result = productofArrayExceptSelf.productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }
}
