//package com.leetcode.medium.linkedlist.easy;
//
//import com.leetcode.easy.linkedlist.fundamental.ListNode;
//import com.leetcode.easy.linkedlist.MergeTwoSortedLists;
//
//import org.junit.Assert;
//import org.junit.Test;
//
//public class MergeTwoSortedListsTest {
//
//    @Test
//    public void testMergeTwoLists() {
//
//        MergeTwoSortedLists mergeTwoSortedLists = new MergeTwoSortedLists();
//
//        ListNode list1 = new ListNode(1);
//        list1.next= new ListNode(2, new ListNode(4));
//
//        ListNode list2 = new ListNode(1);
//        list2.next=new ListNode(3,new ListNode(4));
//
//
//        ListNode actualOutput = mergeTwoSortedLists.mergeTwoLists(list1,list2);
//
//        ListNode expectedOutput = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(4))))));
//
//      //  Assert.assertEquals(expectedOutput, actualOutput);
//
//    }
//
//
//}
