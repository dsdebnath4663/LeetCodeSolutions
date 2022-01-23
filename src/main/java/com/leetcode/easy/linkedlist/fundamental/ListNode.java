package com.leetcode.easy.linkedlist.fundamental;


import java.util.LinkedList;

public class ListNode {

    public int key;
    public int val;

    public ListNode next;
    public ListNode prev_node;

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

    /**
     * 1) Inserts a new Node at front of the list.
     */
    public static ListNode addAtTheBegining(int[] llElements) {
        ListNode listNodeHead = null;
        for (int i = llElements.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(llElements[i], listNodeHead);
        }
        return listNodeHead;
    }

    /**
     * 2) Inserts a new Node at front of the list.
     */
    public static void addAfterAGivenNode(ListNode prev_node, int new_data) {

        if (prev_node == null) {
            System.out.println("The given previous node cannot be null");
        }
        ListNode outPut ;


        ListNode newListNodeToBeAdded = new ListNode(new_data);
        newListNodeToBeAdded.next = prev_node.next;
        prev_node.next = newListNodeToBeAdded;

    }

    public static void print(ListNode listNode) {

        if (listNode == null)
            System.out.print("null");
        while (listNode.next != null) {
            System.out.print(listNode.val + " -> ");
            listNode = listNode.next;
        }
        System.out.print(listNode.val);
    }


    public static void main(String args[]) {


        /**
         *  1) Testing Add node in front of the linked list.
         */
        int[] llElements = new int[]{14, 30, 25};
        System.out.println("Before adding ");
        ListNode outPutNode = addAtTheBegining(llElements);
        print(outPutNode);


        int[] llElements1 = new int[]{999, 14, 30, 25};
        ListNode outPutNode1 = addAtTheBegining(llElements1);
        System.out.println("\n After adding ");
        print(outPutNode1);

    }

}