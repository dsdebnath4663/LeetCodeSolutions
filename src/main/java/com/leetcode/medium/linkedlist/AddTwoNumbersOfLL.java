package com.leetcode.medium.linkedlist;

import java.util.LinkedList;

public class AddTwoNumbersOfLL {
    static Node head1, head2;

    static class Node {

        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Adds contents of two linked lists and prints it */
    void addTwoLists(Node first, Node second) {
        //fast : 7->5->9->4->6                second: 8->4
        Node start1 = new Node(0); //0 -> null
        start1.next = first; //0->7->5->9->4->6
        Node start2 = new Node(0); //0
        start2.next = second; //0->8->4

        addPrecedingZeros(start1, start2);
        //till now I have done my debugging
        Node result = new Node(0);//result :  0->null
      /*
        start1.next,      start2.next,      result
        7->5->9->4->6     8->4               0->null
        7->5->9->4->6     0->0->0->8->4      0->null

    ┌──────────────────────────────────────────────────────────────────────────┐
    │ As preceding zeros has been added for start2 : Refer line No 89          │
    ├──────────────────┬──────────────────┬──────────────────┬─────────────────┤
    │ start1.next      │ start2.next      │ result           │                 │
    ├──────────────────┼──────────────────┼──────────────────┼─────────────────┤
    │  7->5->9->4->6   │  8->4            │ 0->null          │                 │
    ├──────────────────┼──────────────────┼──────────────────┼─────────────────┤
    │  7->5->9->4->6   │  0->0->0->8->4   │ 0->null          │                 │
    ├──────────────────┼──────────────────┼──────────────────┼─────────────────┤
    │  7->5->9->4->6   │  0->0->0->8->4   │ 0->null          │                 │
    ├──────────────────┼──────────────────┼──────────────────┼─────────────────┤
    │  7->5->9->4->6   │  8->4            │ 0->null          │                 │
    ├──────────────────┼──────────────────┼──────────────────┼─────────────────┤
    │  7->5->9->4->6   │  0->0->0->8->4   │ 0->null          │                 │
    ├──────────────────┼──────────────────┼──────────────────┼─────────────────┤



      */
        int sumOf2Nodes = sumTwoNodes(start1.next, start2.next, result);
        if (sumOf2Nodes == 1) {
            Node node = new Node(1);
            node.next = result.next;
            result.next = node;
        }
        printList(result.next);
    }
    /* Adds lists and returns the carry */
    private int sumTwoNodes(Node first, Node second, Node result) { //first 7->5->9->4->6   │ second 0->0->0->8->4 
        if (first == null) {
            return 0;
        }
        int carry= sumTwoNodes(first.next, second.next, result);
        //  <-  <- <- <-
        // 7  5  9  4  6
        int number = first.data + second.data +carry;
        Node node = new Node(number % 10);
        node.next = result.next;
        result.next = node;
        return number / 10;//carry
        /*
        +---------+------------------+-----------------------------+-----------------------------+-----------------------------+
        | number  | Node                Modified Node                       result                    carry
        +---------+------------------+-----------------------------+-----------------------------+-----------------------------+
        | 10      | 10%10=0 0->null  |       0->null                      0->0->null                 10/10=1
        +---------+------------------+-----------------------------+-----------------------------+-----------------------------+
        | 13      | 13%10=3 3->null  |      3->0->null                    0->3->0->null              13/10=1
        +---------+------------------+-----------------------------+-----------------------------+-----------------------------+
        | 10      | 10%10=0 0->null  |      0->3->0->null                 0->0->3->0->null           10/10=1
        +---------+------------------+-----------------------------+-----------------------------+-----------------------------+
        |  6      |  6%10=6 6->null  |      6->0->3->0->null              0->6->0->3->0->null        6/10=0
        +---------+------------------+-----------------------------+-----------------------------+-----------------------------+
        |  7      |  7%10=7 7->null  |      7->6->0->3->0->null           0->7->6->0->3->0->null     7/10=0
        +---------+------------------+-----------------------------+-----------------------------+-----------------------------+
        */
    }

    /* Appends preceding zeros in case a list is having lesser nodes than the other one*/
    private void addPrecedingZeros(Node start1, Node start2) {
        //start1 0 -> 7   ->5   ->9   ->4   ->6  //start2 0->8->4
        //    head  ->next->next->next->next->next
        Node next1 = start1.next; // 7   ->5   ->9   ->4   ->6
        Node next2 = start2.next; // 8  ->  4
        while (next1 != null && next2 != null) {
            next1 = next1.next;// 5->9->4->6->null // 9->4->6->null
            next2 = next2.next;// 4->null //null
        }
        if (next1 == null && next2 != null) {
            while (next2 != null) {
                Node node = new Node(0);
                node.next = start1.next;
                start1.next = node;
                next2 = next2.next;
            }
        } else if (next2 == null && next1 != null) {
            while (next1 != null) {
                Node node = new Node(0);//0->null
                node.next = start2.next;//node : 0->8->4 , new 0->0->8->4
                start2.next = node; //old strart2: 0->node ,  0->0->8->4, new 0->0->0->8->4
                next1 = next1.next;//old next1 : 9->4->6 ,  4->6 , 6 ->null,new null
            }
        }
    }

    /* Utility function to print a linked list */
    void printList(Node head) {
        while (head != null) { //7,5,3,4,6
            System.out.print(head.data + " ");
            head = head.next;
        }
        System.out.println("");
    }

    // Driver Code
    public static void main(String[] args) {
        AddTwoNumbersOfLL list = new AddTwoNumbersOfLL();

        // creating first list
        list.head1 = new Node(7);
        list.head1.next = new Node(5);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(4);
        list.head1.next.next.next.next = new Node(6);
        System.out.print("First List is ");
        list.printList(head1);//7

        // creating second list
        list.head2 = new Node(8);
        list.head2.next = new Node(4);
        System.out.print("Second List is ");
        list.printList(head2); //8

        System.out.print("Resultant List is ");
        // add the two lists and see the result
        list.addTwoLists(head1, head2);//7,8
    }
}
