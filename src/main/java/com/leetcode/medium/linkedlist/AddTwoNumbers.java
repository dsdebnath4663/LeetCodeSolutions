package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;  //9->9->9->9->9->9->9
        ListNode c2 = l2; // 9->9->9->9
        ListNode sentinel = new ListNode(0);
        ListNode d = sentinel;//0->null
        int sum = 0;//By default carry 0
        while (c1 != null || c2 != null) {
            sum = sum / 10;//  sum /= 10; //0,1,1,1,1,1,1
            if (c1 != null) {
                sum = sum + c1.val;//sum += c1.val; // 0,1,1,1,1,1,1
                c1 = c1.next;//9->9->9->9->9->9->9
            }
            if (c2 != null) {
                sum = sum + c2.val;//18,19,19 sum += c2.val;
                c2 = c2.next;// null
            }
            d.next = new ListNode(sum % 10); //0,18%10,19%10,19%10,19%10,10%10,10%10,10%10
            d = d.next;//null  //8 ,9,9,9, 0,0,0
        }
        sum = sum / 10;
        if (sum == 1)
            d.next = new ListNode(1);
        return sentinel.next;
    }
}



























