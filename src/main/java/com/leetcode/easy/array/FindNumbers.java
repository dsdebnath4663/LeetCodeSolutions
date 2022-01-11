package com.leetcode.easy.array;

public class FindNumbers {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 0, maximum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1)
                c++;//c=1+1=2
                //c=2+1=3
            else            //c,max
                c = 0;        //1 ,0 Maximum->1
            //2 ,1 Maximum->2
            //0, 2  Maximum->2
            //1, 2  Maximum->2
            //2,2  Maximum->2
            //3,2  Maximum->3
            maximum = Math.max(c, maximum);
        }
        return maximum;
    }
}
