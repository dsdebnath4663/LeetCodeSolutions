package com.leetcode.easy.TwoPointers.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class MiddleoftheLinkedList {
    public static ListNode middleNode(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static void main(String args[]) {
        int[] key = {1,2,3,4,5,6};
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }

        ListNode actualOutput = middleNode(listNodeHead);
        System.out.println("Middle of the Linked List : " +
                actualOutput.val);

    }
}
