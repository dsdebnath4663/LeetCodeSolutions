package com.leetcode.medium.array.two.pointer;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0, right = height.length - 1;

        while (left < right) {
            int area = (right - left) * Math.min(height[left], height[right]);
            maxArea = Math.max(maxArea, area);
            System.out.println("Left: "+left+" Right: "+right +" Area: "+area+" maxArea: "+maxArea);

            if (height[left] <= height[right]) {
                left++;
            } else {
                right--;
            }

        }

        return maxArea;
    }

    public static void main(String[] args) {
        int[] height = { 1, 8, 6, 3 };
        int result = maxArea(height);
        System.out.println("Maximum amount of water that can be stored: " + result);
    }
}
