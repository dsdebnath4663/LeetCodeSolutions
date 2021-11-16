package com.leetcode.easy.dp;

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                stack.push(s.charAt(i));
            } else {
                if (!stack.isEmpty() && stack.peek() == '(' && s.charAt(i) == ')') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '{' && s.charAt(i) == '}') {
                    stack.pop();
                } else if (!stack.isEmpty() && stack.peek() == '[' && s.charAt(i) == ']') {
                    stack.pop();
                } else {
                    return false;
                }

            }
        }
        if (stack.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String s = "()";
        String s1 = "()[]{}";
        String s3 = "(]";
        String s4 = "([)]";
        String s5 = "{[]}";
        System.out.println(isValid(s5));
    }
}
