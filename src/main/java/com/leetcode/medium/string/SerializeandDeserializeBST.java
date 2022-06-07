package com.leetcode.medium.string;

import com.leetcode.medium.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//public class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}

public class SerializeandDeserializeBST {
    private static final String NULL = "null";
    private static final String SEP = ",";

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        StringBuilder sb = new StringBuilder();
        if (root == null) return NULL;
        //traverse it recursively if you want to, I am doing it iteratively here
        Stack<TreeNode> st = new Stack<>();
        st.push(root);
        while (!st.empty()) {
            root = st.pop();
            sb.append(root.val).append(SEP);
            if (root.right != null) st.push(root.right);
            if (root.left != null) st.push(root.left);
        }
        return sb.toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if (data.equals(NULL)) return null;
        String[] strs = data.split(SEP);
        Queue<Integer> q = new LinkedList<>();
        for (String e : strs) {
            q.offer(Integer.parseInt(e));
        }
        return getNode(q);
    }

    private static TreeNode getNode(Queue<Integer> q) {
        if (q.isEmpty()) return null;
        TreeNode root = new TreeNode(q.poll());
        Queue<Integer> samllerQueue = new LinkedList<>();
        while (!q.isEmpty() && q.peek() < root.val) {
            samllerQueue.offer(q.poll());
        }
        root.left = getNode(samllerQueue);
        root.right = getNode(q);
        return root;
    }

    public static void main(String args[]) {
        TreeNode root = null;

        /* Constructing tree given in the above figure
              2
            / \
           1  3
 */
        root = new TreeNode(2);
        root.left = new TreeNode(1);
        root.right = new TreeNode(3);

        String output = serialize(root);
        System.out.println(" Encodes a tree to a single string. " +output);

      TreeNode t = deserialize(output);
       System.out.println("Decodes your encoded data to tree.");
        printInorder(t);
    }

    static void printInorder(TreeNode node)
    {
        if (node == null)
            return;

        /* first recur on left child */
        printInorder(node.left);

        /* then print the data of node */
        System.out.print(node.val + " ");

        /* now recur on right child */
        printInorder(node.right);
    }

}


