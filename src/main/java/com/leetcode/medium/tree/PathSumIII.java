package com.leetcode.medium.tree;

import java.util.HashMap;

public class PathSumIII {
    public int pathSum(TreeNode root, int sum) {
        HashMap<Integer, Integer> preSum = new HashMap();
        preSum.put(0, 1);
        helper(root, 0, sum, preSum);
        return count;
    }

    int count = 0;

    public void helper(TreeNode root, int currSum, int target, HashMap<Integer, Integer> preSum) {
        if (root == null) {
            return;
        }

        currSum += root.val;

        if (preSum.containsKey(currSum - target)) {
            count += preSum.get(currSum - target);
        }

        if (!preSum.containsKey(currSum)) {
            preSum.put(currSum, 1);
        } else {
            preSum.put(currSum, preSum.get(currSum)+1);
        }

        helper(root.left, currSum, target, preSum);
        helper(root.right, currSum, target, preSum);
        preSum.put(currSum, preSum.get(currSum)- 1);
    }

    private static TreeNode root;

    public static void main(String args[]) {
        PathSumIII pathSumIII = new PathSumIII();
        pathSumIII.root = new TreeNode(10);
        pathSumIII.root.left = new TreeNode(5);
        pathSumIII.root.right = new TreeNode(-3);
        pathSumIII.root.left.left= new TreeNode(3);
        pathSumIII.root.left.right= new TreeNode(2);
        pathSumIII.root.left.left.left= new TreeNode(3);
        pathSumIII.root.left.left.right= new TreeNode(-2);
        pathSumIII.root.left.right= new TreeNode(2);
        pathSumIII.root.left.right.right= new TreeNode(1);
        pathSumIII.root.right.right= new TreeNode(11);


        int targetSum = 8;
        int output = pathSumIII.pathSum(root, targetSum);
        System.out.println(" Path Sum III  is :  " + output);

    }
}
