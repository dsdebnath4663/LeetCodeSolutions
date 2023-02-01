package com.leetcode.medium.backtracking;

import java.util.LinkedList;
import java.util.List;

public class CombinationSumThree {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
        helper(k, n, new LinkedList<Integer>(), 1);
        return res;
    }
    private void helper(int len, int sum, List<Integer> comb, int curElement) {
        if (sum == 0 && len == 0) {
            res.add(new LinkedList<Integer>(comb));
            return;
        }
        if (len == 0)
            return;
        for (int i = curElement; i <= 9; i++) {
            int newSum = sum - i;
            if (newSum < 0)
                break;
            comb.add(i);
            helper(len - 1, newSum, comb, i + 1);
            comb.remove(comb.size() - 1);
        }
    }
}
