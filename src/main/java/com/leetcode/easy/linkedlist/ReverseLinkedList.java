package com.leetcode.easy.linkedlist;


import com.leetcode.easy.linkedlist.fundamental.ListNode;

public class ReverseLinkedList {

    public static ListNode reverseList(ListNode current) {
        ListNode prev = null;
        while (current != null) {//9,6,1,2,7
            ListNode n = current.next;//6,1,2,7 //1,2,7/2,7/7/null
            current.next = prev;//9->null/6-9->null/1-6-9->null/2-1-6-9->null/7-2-1-6-9->null
            prev = current;//9->null /6-9->null/1-6-9->null/2-1-6-9->null/7-2-1-6-9->null
            current = n;//6,1,2,7 //1,2,7 //2,7/7/null
        }
        return prev;
    }

}
