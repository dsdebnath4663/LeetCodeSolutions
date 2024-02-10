package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class AddTwoNumbers2 {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode curr1=l1,curr2=l2;
        ListNode curr3=new ListNode();
        ListNode curr=curr3;
        int carry=0,a=0,b=0;
        while(curr1!=null || curr2!=null){
            ListNode nnode=new ListNode();
            a=0;b=0;
            if(curr1!=null) a=curr1.val;
            if(curr2!=null) b=curr2.val;
            nnode.val+=carry;
            carry=(nnode.val+a+b)/10;
            nnode.val=(nnode.val+a+b)%10;
            curr3.next=nnode;
            curr3=nnode;
            if(curr1!=null) curr1=curr1.next;
            if(curr2!=null) curr2=curr2.next;
        }
        if(carry!=0){
            ListNode nnode=new ListNode();
            nnode.val=carry;
            curr3.next=nnode;
            curr3=nnode;
        }
        return curr.next;

    }
    public static void main(String args[]) throws Exception {
        int[] key = {9,9,9,9,9,9,9};
        int [] key2 =  {9,9,9,9};
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }

        ListNode listNodeHead2 = null;
        for (int j = key.length - 1; j >= 0; j--) {
            listNodeHead2 = new ListNode(key2[j], listNodeHead2);
        }

        ListNode actualOutput = addTwoNumbers(listNodeHead,listNodeHead2);
        System.out.println("After removing , modified linked list is  :--");
        ListNode.print(actualOutput, false);
    }
}
