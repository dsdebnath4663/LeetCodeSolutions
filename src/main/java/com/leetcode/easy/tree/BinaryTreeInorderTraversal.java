package com.leetcode.easy.tree;

import com.leetcode.medium.tree.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreeInorderTraversal {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null)
            return result;
        helper(root, result);

        return result;

    }

    private void helper(TreeNode root, List<Integer> result) {

        if (root != null) {
            if (root.left != null) {
                helper(root.left, result);
            }
            result.add(root.val);
//        System.out.print(root.data + " ");
            if (root.right != null) {
                inorderTraversal(root.right);
                helper(root.right, result);

            }
        }
    }

}