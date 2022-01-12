package com.leetcode.medium.linkedlist.easy;

import com.leetcode.easy.linkedlist.IntersectionofTwoLinkedLists;
import com.leetcode.easy.linkedlist.ListNode;
import org.junit.Assert;
import org.junit.Test;

public class IntersectOfTwoLLTest {

    @Test
    public void testGetIntersectionNode() {
        ListNode newNode;

        ListNode list1 = new ListNode(4);

        ListNode list2 = new ListNode(5);
        list2.next = new ListNode(6);
        list2.next.next = new ListNode(1);


        //As 8 is common node for list1 and list2
        newNode = new ListNode(8);
        list1.next = newNode;
        list2.next.next.next = newNode;

        //As 4 is common node for list1 and list2
        newNode = new ListNode(4);
        list1.next.next = newNode;
        list2.next.next.next.next = newNode;

        //As 5 is common node for list1 and list2
        newNode = new ListNode(5);
        list1.next.next.next = newNode;
        list2.next.next.next.next.next = newNode;




        ListNode expectedList = new ListNode(8);


        IntersectionofTwoLinkedLists intersectionOfTwoLL = new IntersectionofTwoLinkedLists();
        ListNode actualOutput = intersectionOfTwoLL.getIntersectionNode(list1, list2);
        ListNode.print(actualOutput);
        Assert.assertEquals(expectedList.val, actualOutput.val);

    }
}
