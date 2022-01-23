package com.leetcode.easy.linkedlist;

import com.leetcode.easy.linkedlist.fundamental.ListNode;

public class PalindromeLinkedList {
    public boolean isPalindrome(ListNode head) {
      ListNode p1 = head;//1 2 3 4 5
//        ListNode p2 = ReverseLinkedList.reverseList(getRightHalf(head));//4 5 --> reverse //5 4
        ListNode p2 = reverseList(getRightHalf(head));//4 5 --> reverse //5 4
        while (p2 != null) {
            if (p1.val != p2.val) return false;
            p1 = p1.next;
            p2 = p2.next;
        }
        return true;
    }

    private ListNode getRightHalf(ListNode head) {
        if (head == null) return null;
        ListNode slow = head; //1
        ListNode fast = head.next;   // left-leaning //3/4
        while (fast != null && fast.next != null) {
            slow = slow.next;//2/3
            fast = fast.next.next;//4//null
        }
        return slow.next; // important!//slow=3 4 5 // return 4 5
    }

    public  ListNode reverseList(ListNode current) {//4 5
        ListNode prev = null;
        while (current != null) { //4//5
            ListNode n = current.next; //5//null
            current.next = prev; //null
            prev = current; //4//5
            current = n;//5//null
        }
        return prev;//5 4
    }
}
