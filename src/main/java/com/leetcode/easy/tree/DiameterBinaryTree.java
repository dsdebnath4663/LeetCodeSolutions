package com.leetcode.easy.tree;

import com.leetcode.easy.tree.common.TreeNode;

import static com.leetcode.easy.tree.SymmetricTree.root;

public class DiameterBinaryTree {
    public static int diameterOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        int lhs = diameterOfBinaryTree(root.left);
        int rhs = diameterOfBinaryTree(root.right);

        return Math.max(height(root.left) + height(root.right) + 2, Math.max(lhs, rhs));
    }

    public static int height(TreeNode root) {
       if (root == null) return -1;

        int lhs = height(root.left);
        int rhs = height(root.right);

        return Math.max(lhs, rhs) + 1;
    }

    static TreeNode root;

    public static void main(String args[]) {
        DiameterBinaryTree tree = new DiameterBinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(4);
        tree.root.left.left = new TreeNode(5);
        int output = tree.diameterOfBinaryTree(root);
        System.out.println("Maximum Depth of Binary Tree is : " + output);


    }
}
