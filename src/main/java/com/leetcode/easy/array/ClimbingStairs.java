package com.leetcode.easy.array;

public class ClimbingStairs {
    public static int climbingStairs(int n){
        int steps = 0;
        int n1 =0;
        int n2 =1;
        for (int i=1; i<=n; i++){
            steps = n1+n2;
            n1=n2;
            n2=steps;
        }
       return steps;
    }
    public static void main(String[]arages){
        int n = 2;
        System.out.println(climbingStairs(n));
    }
}
