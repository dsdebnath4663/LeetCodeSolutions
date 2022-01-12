package com.leetcode.easy.linkedlist;


public class ListNode {

    public int key;
    public int val;

    public ListNode next;
    public ListNode prev;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
        this.next = null;
    }//constructors

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode(int key, int val) {//contructor for hashmap
        this.key = key;
        this.val = val;
    }

    public static void print(ListNode listNode) {

        if (listNode == null)
            System.out.print("null");
        while (listNode.next != null) {
            System.out.print(listNode.val + ".");
            listNode = listNode.next;
        }
        System.out.print(listNode.val);
    }

}