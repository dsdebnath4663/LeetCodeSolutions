package com.leetcode.medium.tree;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrderTraversal {

    public static void levelOrder(TreeNode root) {
        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        TreeNode cur = null;
        while (!q1.isEmpty() || !q2.isEmpty()) {
            while (!q1.isEmpty()) {
                cur = q1.poll();
                if (cur.left != null) {
                    q2.add(cur.left);
                }
                if (cur.right != null) {
                    q2.add(cur.right);
                }
                System.out.print(cur.val + " ");
            }
            helper(q1, q2, cur);
        }

    }

    private static void helper(Queue<TreeNode> q1, Queue<TreeNode> q2, TreeNode cur) {
        while (!q2.isEmpty()) {
            cur = q2.poll();
            if (cur.left != null) {
                q1.add(cur.left);
            }
            if (cur.right != null) {
                q1.add(cur.right);
            }
            System.out.print(cur.val + " ");
        }
    }
}
