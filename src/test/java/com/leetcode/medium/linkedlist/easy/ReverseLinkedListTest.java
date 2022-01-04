package com.leetcode.medium.linkedlist.easy;

import com.leetcode.easy.linkedlist.LinkedListCycle;
import com.leetcode.easy.linkedlist.ListNode;
import com.leetcode.easy.linkedlist.ReverseLinkedList;
import org.junit.Test;

public class ReverseLinkedListTest {
    @Test
    public void testGetReverseLinkedList() {
       // int[] key = {1, 2, 3};
        int[] key = {9,6,1,2,7};
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }

        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        ListNode actualOutput = reverseLinkedList.reverseList(listNodeHead);


    }
}
