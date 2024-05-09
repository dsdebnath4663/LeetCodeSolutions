package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class OddEvenLinkedList {
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode curOdd = head;
        ListNode EvenList = head.next;
        ListNode curEven = EvenList;
        while (curOdd.next != null && curEven.next != null) {
            curOdd.next = curEven.next;
            curOdd = curOdd.next;
            curEven.next = curOdd.next;
            curEven = curEven.next;
        }
        curOdd.next = EvenList;
        return head;
    }
    public static void main(String args[]) throws Exception {
        int[] key = {1,2,3,4,5};
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
        ListNode actualOutput = oddEvenList(listNodeHead);
        System.out.println("After removing , modified linked list is  :--");
        ListNode.print(actualOutput, false);
    }
    }
