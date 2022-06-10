package com.leetcode.medium.tree;

import java.util.*;

public class LevelOrderTraversalLeetCode {

    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<Integer> levelbyLevelValueStoring = new ArrayList<Integer>();

        Queue<TreeNode> q1 = new LinkedList<>();
        Queue<TreeNode> q2 = new LinkedList<>();
        q1.add(root);
        TreeNode cur = null;
        List<List<Integer>> outPut = null;
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
                levelbyLevelValueStoring.add(cur.val);

            }
            //   return  helper(q1, q2, cur);
            outPut = new ArrayList<List<Integer>>();

            while (!q2.isEmpty()) {
                cur = q2.poll();
                if (cur.left != null) {
                    q1.add(cur.left);
                }
                if (cur.right != null) {
                    q1.add(cur.right);
                }
                System.out.print(cur.val + " ");
                levelbyLevelValueStoring.add(cur.val);
            }
            outPut.add(levelbyLevelValueStoring);
//        }
//        return helper(q1, q2, cur);
        }
        return outPut;

    }

//    private static List<List<Integer>> helper(Queue<TreeNode> q1, Queue<TreeNode> q2, TreeNode cur) {
//
//        List<List<Integer>> outPut = new ArrayList<List<Integer>>();
//        List<Integer> levelbyLevelValueStoring = new ArrayList<Integer>();
//
//        while (!q2.isEmpty()) {
//            cur = q2.poll();
//            if (cur.left != null) {
//                q1.add(cur.left);
//            }
//            if (cur.right != null) {
//                q1.add(cur.right);
//            }
//            System.out.print(cur.val + " ");
//            levelbyLevelValueStoring.add(cur.val);
//        }
//        outPut.add(levelbyLevelValueStoring);
//        return outPut;
//    }

    private static TreeNode root;


    public static void main(String args[]) {
        LevelOrderTraversalLeetCode levelOrderTraversalLeetCode = new LevelOrderTraversalLeetCode();
        levelOrderTraversalLeetCode.root = new TreeNode(3);
        levelOrderTraversalLeetCode.root.left = new TreeNode(9);
        levelOrderTraversalLeetCode.root.left.left = new TreeNode(15);
        levelOrderTraversalLeetCode.root.left.right = new TreeNode(7);

        List<List<Integer>> output = levelOrderTraversalLeetCode.levelOrder(root);


 System.out.println("Flatten Binary Tree to Linked List : " + output);
    }

}