package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class ReverseLinkedList2 {
    public static ListNode reverseBetween(ListNode head, int left, int right) {
        if (head == null || left == right) return head;

        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prev = dummy;

        for (int i = 0; i < left - 1; ++i) {
            prev = prev.next;
        }

        ListNode current = prev.next;

        for (int i = 0; i < right - left; ++i) {
            ListNode nextNode = current.next;
            current.next = nextNode.next;
            nextNode.next = prev.next;
            prev.next = nextNode;
        }

        return dummy.next;
    }
    public static void main(String args[]) throws Exception {

        int[] key = {1,2,3,4,5};
        int left = 2;
        int right = 4 ;
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
        ListNode actualOutput = reverseBetween(listNodeHead,left,right);
        System.out.println("After removing , modified linked list is  :--");
        ListNode.print(actualOutput,false);
    }
}
