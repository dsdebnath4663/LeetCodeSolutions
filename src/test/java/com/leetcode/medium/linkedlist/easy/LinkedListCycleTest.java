package com.leetcode.medium.linkedlist.easy;

import com.leetcode.easy.linkedlist.LinkedListCycle;
import com.leetcode.easy.linkedlist.fundamental.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleTest {

    @Test
    public void testGetLinkedListCycle() {
        int[] key = {10, 15, 4, 20};
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
//insert cycle in position 1
        listNodeHead.next.next.next.next = listNodeHead.next;
//        insert cycle in position 2
//        listNodeHead.next.next.next.next = listNodeHead.next.next;
//
//        insert cycle in position 3
//        listNodeHead.next.next.next.next = listNodeHead.next.next.next;
        boolean expectedOutput = true;
        LinkedListCycle linkedListCycle = new LinkedListCycle();
        boolean actualOutput = linkedListCycle.hasCycle(listNodeHead);

        Assert.assertEquals(expectedOutput, actualOutput);

    }
}
