package com.leetcode.medium.stackandqueue;

import java.util.Stack;

public class DailyTemperatures {
    public static int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        int n = temperatures.length;
        int[] ans = new int[n];

        for(int i = n - 1; i >= 0; i--) {

            // Popping all indices with a lower or equal temperature than the current index
            while(!st.isEmpty() && temperatures[i] >= temperatures[st.peek()]) {
                st.pop();
            }

            // If the stack still has elements, then the next warmer temperature exists!
            if(!st.isEmpty()) {
                ans[i] = st.peek() - i;
            }

            // Inserting current index in the stack: monotonicity is maintained!
            st.push(i);
        }

        return ans;
    }
    public static void main(String[] args){
        int[] temperatures = {73,74,75,71,69,72,76,73};
        System.out.println(dailyTemperatures(temperatures));
    }

}
