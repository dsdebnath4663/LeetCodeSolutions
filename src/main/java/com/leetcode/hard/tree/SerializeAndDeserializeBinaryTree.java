package com.leetcode.hard.tree;


import com.leetcode.medium.tree.LevelOrderTraversal;
import com.leetcode.medium.tree.TreeNode;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class SerializeAndDeserializeBinaryTree {

    private static final String spliter = ",";
    private static final String NN = "X";

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        helper(root, sb);
        return sb.toString();
    }
    private void helper(TreeNode node, StringBuilder sb) {
        if (node == null) {
            sb.append(NN).append(spliter);
        } else {
            sb.append(node.val).append(spliter);
            helper(node.left, sb);
            helper(node.right, sb);
        }
    }


    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        Deque<String> nodes = new LinkedList<>();
        nodes.addAll(Arrays.asList(data.split(spliter)));
        return buildTree(nodes);
    }

    private TreeNode buildTree(Deque<String> nodes) {
        String val = nodes.remove();
        if (val.equals(NN)) return null;
        else {
            TreeNode node = new TreeNode(Integer.valueOf(val));
            node.left = buildTree(nodes);
            node.right = buildTree(nodes);
            return node;
        }
    }

    private static TreeNode root;

    public static void main(String args[]) {
        //Your Codec object will be instantiated and called as such:
        SerializeAndDeserializeBinaryTree tree = new SerializeAndDeserializeBinaryTree();

        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.right.left = new TreeNode(4);
        tree.root.right.right = new TreeNode(5);


        String serializedOutput = tree.serialize(root);
        System.out.println(" Serialized Binary Tree is : " + serializedOutput);


  TreeNode  deserializedOutput = tree.deserialize(serializedOutput);
   System.out.println(" Deserialize Binary Tree is : " + deserializedOutput);

    }
}
