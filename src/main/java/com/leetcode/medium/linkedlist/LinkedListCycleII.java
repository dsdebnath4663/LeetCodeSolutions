//package com.leetcode.medium.linkedlist;
//
//import com.leetcode.easy.linkedlist.ListNode;
//
//public class LinkedListCycleII {
//
//    ListNode head;
//
//    public static ListNode detectCycle(ListNode head) {
//        // Initialize two pointers, slow and fast, to the head of the linked list.
//        ListNode slow = head;
//        ListNode fast = head;
//
//        // Move the slow pointer one step and the fast pointer two steps at a time through the linked list,
//        // until they either meet or the fast pointer reaches the end of the list.
//        while (fast != null && fast.next != null) {
//            slow = slow.next;
//            fast = fast.next.next;
//            if (slow == fast) {
//                // If the pointers meet, there is a cycle in the linked list.
//                // Reset the slow pointer to the head of the linked list, and move both pointers one step at a time
//                // until they meet again. The node where they meet is the starting point of the cycle.
//                slow = head;
//                while (slow != fast) {
//                    slow = slow.next;
//                    fast = fast.next;
//                }
//                return slow;
//            }
//        }
//
//        // If the fast pointer reaches the end of the list without meeting the slow pointer,
//        // there is no cycle in the linked list. Return null.
//        return null;
//
//    }
//
//
//    public static void main(String args[]) throws Exception {
//
//        ListNode  listNode =  testCaseOne();
//        ListNode  listNode2 =  testCaseOne2();
//        ListNode listNode3 = testCaseOne3();
//
//
//
//        ListNode.print(listNode3, true);
//
//    }
//
//
//    private static ListNode testCaseOne3(){
//        int[] llElements = {1};
//        ListNode listNodeHead = ListNode.push(llElements);
//        //insert cycle
//        return  listNodeHead;
//    }
//
//    private static ListNode testCaseOne2() {
//                int[] llElements = {1,2};
////        //                                         next
////        //          HEAD→ → → → → →   1 → → → → →  2
////        //                             ↑         ↓
////        //                              ← ← ← ←
////
//        ListNode listNodeHead = ListNode.push(llElements);
//        // insert cycle
//        listNodeHead.next= listNodeHead;
//
//        return listNodeHead;
//    }
//
//    private static ListNode testCaseOne() {
//        //                           next        next      next
//        //          HEAD→ → → → → →   3 → → → → →  2 → → → → 0
//        //                                         ↑         ↓
//        //                                          ← ← ← ← -4 next
//
//        int[] llElements = {3, 2, 0, -4};
//        ListNode listNodeHead = ListNode.push(llElements);
////         insert cycle
//        listNodeHead.next.next.next.next = listNodeHead.next;
//
//        return listNodeHead;
//    }
//}
