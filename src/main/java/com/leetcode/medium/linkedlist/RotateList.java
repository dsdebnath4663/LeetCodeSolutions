package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class RotateList {
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode cur=head;
        if(k==0) return head;
        if(head==null) return head;
        int l=0;
        while(cur!=null){
            l++;
            cur=cur.next;
        }
        // System.out.println(l);
        cur=head;
        if(k>l) k=k%l;
        k=l-k;
        if(k==0) return head;
        // System.out.println(k);
        int i=1;
        while(i<k){
            cur=cur.next;
            i++;
        }
        if(cur==null || cur.next==null) return head;
        ListNode newhead=cur.next;
        cur.next=null;
        ListNode newcur=newhead;
        while(newcur.next!=null){
            newcur=newcur.next;
        }
        newcur.next=head;
        head=newhead;
        return head;
    }
    public static void main(String args[]) throws Exception {
        //int[] key = {1,2,3,4,5};
       // int val = 2;
        int[] key = {0,1,2};
        int val = 4;
        ListNode listNodeHead = null;
        for (int i = key.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(key[i], listNodeHead);
        }
        ListNode actualOutput = rotateRight(listNodeHead,val);
        System.out.println("After removing , modified linked list is  :--");
        ListNode.print(actualOutput,false);
    }
}
