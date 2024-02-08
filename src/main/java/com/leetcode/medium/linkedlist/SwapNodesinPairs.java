package com.leetcode.medium.linkedlist;
import com.leetcode.easy.linkedlist.*;

public class SwapNodesinPairs {
    public static ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null)
            return head;
        ListNode temp = head.next.next;
        ListNode second = head;
        ListNode first = head.next;
        head = first;
        head.next = second;
        head.next.next = swapPairs(temp);
        return head;
    }

    public static void main(String args[]) throws Exception {
        //int[] key = {1,2,3,4};
        int[] key = {};
        //int[] key = {1};
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
        ListNode actualOutput = swapPairs(listNodeHead);
        System.out.println("After removing , modified linked list is  :--");
        ListNode.print(actualOutput, false);
    }
}
