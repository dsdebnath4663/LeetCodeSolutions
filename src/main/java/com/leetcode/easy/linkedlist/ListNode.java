package com.leetcode.easy.linkedlist;


public class ListNode {

    public int key;
    public int val;

    public ListNode next;
    public ListNode prev;
    public ListNode random;


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

    public static void print(ListNode listNode, boolean detectCycle) throws Exception {
        if (listNode == null && detectCycle) {
            throw new Exception("There is no cycle in the linked list... ");
        } else if (listNode == null) {
            throw new Exception("The linked list is empty... ");
        }
        while (listNode.next != null) {
            System.out.print(listNode.val + " -> ");
            listNode = listNode.next;
        }
        System.out.print(listNode.val);
    }

    public void push(int new_data) {

        ListNode new_node = new ListNode(new_data);
        new_node.next = random;
        random = new_node;
    }

    public static ListNode push(int[] llElements) {
        ListNode listNodeHead = null;
        for (int i = llElements.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(llElements[i], listNodeHead);
        }
        return listNodeHead;
    }
}