package com.leetcode.easy.array;

public class CombinationSumIV {
    public static int combinationSum4(int[] nums, int target) {
        Integer[] memo = new Integer[target+1];
        return recurse (nums,target, memo);
    }
    public static int recurse(int[] nums, int remain, Integer[] memo){
        if(remain < 0) return 0;
        if(memo[remain] != null) return memo[remain];
        if(remain == 0) return 1;
        int ans = 0;
        for(int i = 0; i < nums.length; i++){
            ans += recurse(nums, remain - nums[i], memo);
        }
        memo[remain] = ans;
        return memo[remain];
    }
public static void main(String [] args){
    int[] nums = {1,2,3};
        int target = 4 ;
    System.out.println(combinationSum4(nums,target));

}
}
