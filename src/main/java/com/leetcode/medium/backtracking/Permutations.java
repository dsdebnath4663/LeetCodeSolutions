package com.leetcode.medium.backtracking;

import java.util.LinkedList;
import java.util.List;

public class Permutations {
    List<List<Integer>> res = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> list = new LinkedList<>();
        for (int num: nums){
            list.add(num);
        }
        helper(list,new LinkedList<>());
        return res;
    }
    private void helper(List<Integer>list,List<Integer> curComb){
        if (list.isEmpty()){
            List<Integer> temp = new LinkedList<>(curComb);
            res.add(temp);
            return;
        }
        for (int i = 0 ; i<list.size(); i++){
            Integer val =list.remove(i);
            curComb.add(val);
            helper(list, curComb);
            curComb.remove(curComb.size() -1);
            list.add(i, val);
        }

    }

}
