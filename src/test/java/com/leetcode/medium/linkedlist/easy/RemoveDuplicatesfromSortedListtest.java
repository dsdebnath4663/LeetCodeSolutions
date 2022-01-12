//package com.leetcode.medium.linkedlist.easy;
//
//import com.leetcode.easy.linkedlist.ListNode;
//import org.junit.Test;
//
//public class RemoveDuplicatesfromSortedListtest {
//    @Test
//    public void removeDuplicatesfromSortedList() {
//
//        RemoveDuplicatesfromSortedList removeDuplicatesfromSortedList = new RemoveDuplicatesfromSortedList();
//
////        ListNode list1 = new ListNode(1);
////        list1.next= new ListNode(1, new ListNode(2));
//        ListNode list1 = new ListNode(1);
//        list1.next= new ListNode(1);
//        list1.next.next=new ListNode(2);
//        list1.next.next.next=new ListNode(3);
//        list1.next.next.next.next=new ListNode(3);
//
//        ListNode actualOutput = RemoveDuplicatesfromSortedList.deleteDuplicates(list1);
//
//        ListNode expectedOutput = new ListNode(1,new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(4))))));
//
//        //  Assert.assertEquals(expectedOutput, actualOutput);
//
//    }
//}
