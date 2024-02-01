package com.leetcode.easy.linkedlist;

public class RemoveLinkedListElements {

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return null;
        ListNode fast = head.next;
        ListNode slow = head;
        while (fast != null) {
            if (fast.val == val) {
                slow.next = fast.next;
                fast = slow.next;
            } else {
                slow = slow.next;
                fast = fast.next;
            }
        }
        if (head.val == val)
            head = head.next;
        return head;
    }
    public static void main(String args[]) throws Exception {
//        int[] key = {1,2,6,3,4,5,6};
//        int val = 6;

//        int[] key = {};
//        int val = 1;

        int[] key = {1,2,6,3,4,5,6};
        int val = 6;
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
        ListNode actualOutput = removeElements(listNodeHead,val);
        System.out.println("After removing , modified linked list is  :--");
        ListNode.print(actualOutput,false);
    }
}
