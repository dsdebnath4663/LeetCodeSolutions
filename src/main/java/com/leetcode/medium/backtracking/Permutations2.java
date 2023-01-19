package com.leetcode.medium.backtracking;

import java.util.*;

public class Permutations2 {



    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<>();
        for (int num : nums) {
            hm.put(num, hm.getOrDefault(num, 0) + 1);
        }
        helper(new LinkedList<>(), hm);
        return result ;
    }

    private void helper(List<Integer> curComb, Map<Integer, Integer> hm) {
        if (hm.isEmpty()) {
            List<Integer> temp = new LinkedList<>(curComb);
            result.add(temp);
            return;
        }
        Set<Integer> set = new HashSet<>(hm.keySet());
        for (Integer key : set) {
            if (hm.get(key) == 1) {
                hm.remove(key);
            } else {
                hm.put(key, hm.get(key) - 1);
            }
            curComb.add(key);
            helper(curComb, hm);
            curComb.remove(curComb.size() - 1);
            hm.put(key, hm.getOrDefault(key, 0) + 1);
        }
    }
}