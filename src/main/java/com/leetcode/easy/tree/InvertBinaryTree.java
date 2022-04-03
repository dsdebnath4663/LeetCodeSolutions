package com.leetcode.easy.tree;

import com.leetcode.medium.tree.TreeNode;

public class InvertBinaryTree {
    public TreeNode invertTree(TreeNode root) {

        if (root == null) {
            return null;
        }

        final TreeNode left = root.left,
                right = root.right;
        root.left = invertTree(right);
        root.right = invertTree(left);
        return root;
    }
}