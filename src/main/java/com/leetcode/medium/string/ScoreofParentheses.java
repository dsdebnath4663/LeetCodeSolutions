package com.leetcode.medium.string;

public class ScoreofParentheses {
    public static int scoreOfParentheses(String s) {
        return F(s ,0,s.length());
    }
    public static int F(String s, int i, int j){
        int ans = 0, bal = 0;
        for (int k =i; k<j; ++ k){
            bal += s.charAt(k) == '('? 1:-1;
            if (bal == 0 ){
                if (bal == 0){
                    if (k - i==1)ans++;
                    else
                        ans += 2* F(s,i+1, k);
                    i=k+1;
                }
            }

        }return ans;
    }
    public static void main(String[] args) {
        System.out.println(scoreOfParentheses("()"));
    }
}
