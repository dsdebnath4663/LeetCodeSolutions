package com.leetcode.medium.backtracking;

import java.util.LinkedList;
import java.util.List;

public class Subsets {
    List <List<Integer>>res = new LinkedList<>();
    int [] nums;
    public List<List<Integer>> subsets(int[] nums) {

        this.nums=nums;
        helper (0, new LinkedList <Integer>());
        return res ;
    }
    private void helper (int index , List <Integer>comb){
        res . add(new LinkedList<>(comb));
        for(int i=index; i <nums.length;i++){
            comb.add(nums[i]);
            helper(i+1,comb);
            comb.remove(comb.size()- 1);
        }
    }
}
