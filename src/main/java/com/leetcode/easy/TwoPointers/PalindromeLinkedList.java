package com.leetcode.easy.TwoPointers;

import com.leetcode.easy.linkedlist.ListNode;

public class PalindromeLinkedList {
    public static boolean isPalindrome(String head) {
        ListNode slow = head;
        String fast = head;
        ListNode prev;
        ListNode temp;
        while (fast != null && fast.next != null ){
            slow = slow.next;
            fast = fast.next.next;
        }
        prev = slow ;
        slow = slow.next;
        prev.next= null;
        while(slow != null){
            temp = slow.next;
            slow.next = prev ;
            prev = slow;
            slow = temp ;

        }
        fast = head ;
        slow = prev;
        while (slow != null){
            if (fast.val != slow.val) return false ;
            fast = fast.next;
            slow = slow.next;
        }
        return true;
    }
    public static void main (String []args){
        String head = "1,2,2,1" ;
        System.out.println(isPalindrome(head));


    }
}
