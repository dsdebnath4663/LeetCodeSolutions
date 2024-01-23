package com.leetcode.easy.linkedlist;


public class ReverseLinkedList1 {
    public static ListNode reverseList(ListNode current) {
        ListNode prev = null;
        while (current != null) {
            ListNode n = current.next;
            current.next = prev;
            prev = current;
            current = n;
        }
        return prev;
    }
    public static void main(String args[]) {
         int[] key = {1, 2, 3};
        //  int[] key = {9, 6, 1, 2, 7};
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
        ListNode actualOutput = reverseList(listNodeHead);
        ListNode listNodeObject = new ListNode();
        System.out.println("After Reversing :--");
        listNodeObject.print(actualOutput);
    }
}

