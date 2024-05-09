package com.leetcode.easy.linkedlist;

public class IntersectionofTwoLinkedLists2 {
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        ListNode p1 = headA;
//        ListNode p2 = headB;
//        while (p1 != p2){
//            if (p1 == null){
//                p1 = headB;
//            }
//            else{
//                p1 = p1.next;
//            }
//            if (p2 == null){
//                p2 = headA;
//            }
//            else{
//                p2 = p2.next;
//            }
//
//        }
//        return p1;
//    }
static int x = 0;

    public static void count (int y){

        x = x +y;
        System.out.println(x);
    }
    public static void main (String args []) throws Exception{
        count(1);
        count(2);
        count(3);


    }
    }

