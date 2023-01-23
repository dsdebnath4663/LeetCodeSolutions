package com.leetcode.medium.backtracking;

import java.util.LinkedList;
import java.util.List;

public class CombinationSum {
    List<List<Integer>> res = new LinkedList<>();
    int[] candidates;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        helper(target, new LinkedList<Integer>(), 0);
        return res;

    }

    private void helper(int target, List<Integer> comb, int index) {
        if (target == 0) {
            List<Integer> temp = new LinkedList<>(comb);
            res.add(temp);
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            int curSum = target - candidates[i];
            if (curSum < 0)
                continue;
            comb.add(candidates[i]);
            helper(curSum, comb, i);
            comb.remove(comb.size() - 1);
        }
    }
}
