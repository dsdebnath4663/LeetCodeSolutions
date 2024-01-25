package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class ReorderList {
    public static ListNode reorderList(ListNode head) {
        ListNode[] left =  new ListNode[1];
        left[0]  =  head;
        reorder(left,head);
        return head;
    }
    public static void reorder(ListNode left[], ListNode right){
        if(right==null){
            return ;
        }
        reorder(left,right.next);
        if(left[0].next!=null){
            ListNode leftNext =  left[0].next;
            left[0].next =  right;
            right.next =  leftNext;
            left[0] =  leftNext;
        }
        if(left[0].next == right){
            left[0].next =  null;
        }
    }
    public static void main(String args[]) {
       // int key [] = {1,2,3,4};
        int key [] = {1,2,3,4,5};
        ListNode listNodeHead = null ;
        for (int i = key.length -1; i >= 0; i--){
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
        ListNode actualOutput = reorderList(listNodeHead);
        ListNode listNodeObject = new ListNode();
        System.out.println("After Reversing :--");
        listNodeObject.print(actualOutput);
    }
}
