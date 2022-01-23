package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.fundamental.ListNode;

public class RemoveNthNodeFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) { //n 2

        ListNode start = new ListNode(0); //1,2,3,4,5
        ListNode slow = start, fast = start;  // 0
        slow.next = head;

        //Move fast in front so that the gap between slow and fast becomes n
            for(int i=1; i<=n+1; i++)   {// i - 1 2 3
            fast = fast.next; // 1 2 3
        }
        //Move fast to the end, maintaining the gap
        while(fast != null) {
            slow = slow.next;
            fast = fast.next;
        }
        //Skip the desired node
        slow.next = slow.next.next;
        return start.next;
    }
}


















