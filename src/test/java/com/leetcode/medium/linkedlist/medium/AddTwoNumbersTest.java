//package com.leetcode.medium.linkedlist.medium;
//
//import com.leetcode.easy.linkedlist.ListNode;
//import com.leetcode.medium.linkedlist.AddTwoNumbers;
//import org.junit.Assert;
//import org.junit.Test;
//
//public class AddTwoNumbersTest {
//
//    @Test
//    public void testTwoNumbers() {
//
//
//        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(9);
//        l1.next.next = new ListNode(9);
//        l1.next.next.next = new ListNode(9);
//        l1.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next = new ListNode(9);
//        l1.next.next.next.next.next.next = new ListNode(9);
//
//
//        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode(9);
//        l2.next.next = new ListNode(9);
//        l2.next.next.next = new ListNode(9);
//
//        ListNode expectedOutput = new ListNode(8);
//        expectedOutput.next = new ListNode(9);
//        expectedOutput.next.next = new ListNode(9);
//        expectedOutput.next.next.next = new ListNode(9);
//        expectedOutput.next.next.next.next = new ListNode(0);
//        expectedOutput.next.next.next.next.next = new ListNode(0);
//        expectedOutput.next.next.next.next.next.next = new ListNode(0);
//        expectedOutput.next.next.next.next.next.next.next = new ListNode(1);
//
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
//        ListNode actualOutput = addTwoNumbers.addTwoNumbers(l1, l2);
//
//        while (actualOutput != null) {
//            Assert.assertEquals(expectedOutput.val, actualOutput.val);
//            expectedOutput = expectedOutput.next;
//            actualOutput = actualOutput.next;
//
//        }
//    }
//
//    @Test
//    public void testTwoNumbers2() {
//
//
//        ListNode l1 = new ListNode(9);
//        l1.next = new ListNode(0);
//        l1.next.next = new ListNode(9);
//
//        ListNode l2 = new ListNode(9);
//        l2.next = new ListNode(9);
//        /**
//         *    9   0   9
//         *    +   9   9
//         *   -----------
//         *   1  0  0  8
//         * As sum should be reversed as output .
//         * So , output = 8 0 0 1
//         */
//        ListNode expectedOutput = new ListNode(8);
//        expectedOutput.next = new ListNode(0);
//        expectedOutput.next.next = new ListNode(0);
//        expectedOutput.next.next.next = new ListNode(1);
//
//        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();//Object
//        ListNode actualOutput = addTwoNumbers.addTwoNumbers(l1, l2);
//
//        while (actualOutput != null) {
//            Assert.assertEquals(expectedOutput.val, actualOutput.val);
//            expectedOutput = expectedOutput.next;
//            actualOutput = actualOutput.next;
//
//        }
//
//
//    }
//
//}
