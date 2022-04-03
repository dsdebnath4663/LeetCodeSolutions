package com.leetcode.easy.tree;

import com.leetcode.medium.tree.TreeNode;

public class DiameterOfBinaryTree {
    public int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int lhs = diameterOfBinaryTree(root.left);
        int rhs = diameterOfBinaryTree(root.right);

        return Math.max(height(root.left) + height(root.right) + 2, Math.max(lhs, rhs));
    }

    public int height(TreeNode root) {
        if (root == null) return -1;

        int lhs = height(root.left);
        int rhs = height(root.right);

        return Math.max(lhs, rhs) + 1;
    }

}