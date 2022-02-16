package com.leetcode.easy.linkedlist.fundamentals;

import com.leetcode.easy.linkedlist.fundamental.doublyll.DoublyLinkedList;
import com.leetcode.easy.linkedlist.fundamental.doublyll.DoublyLinkedListNode;
import com.leetcode.easy.linkedlist.fundamental.singlyll.SinglyLinkedList;

import com.leetcode.easy.linkedlist.fundamental.singlyll.SinglyLinkedListNode;
import com.leetcode.easy.linkedlist.fundamental.utils.LinkedListUtil;
import org.junit.Test;

public class LinkedListUtilTest {


    /**
     * Test - Insert a Node at the Tail of a Linked List
     */
    @Test
    public void insertNodeAtHeadTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistItems[] = new int[]{14, 30, 25, 42, 17, 20};
        for (int i = 0; i < llistItems.length; i++)
            llist.insertNode(llistItems[i]);

        int data = 999;

        SinglyLinkedListNode llist_head = LinkedListUtil.insertNodeAtHead(llist.head, data);
        LinkedListUtil.printSinglyLinkedList(llist_head);
    }

    /**
     * Test - Insert a Node at the Tail of a Linked List
     */
    @Test
    public void insertNodeAtTailTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistItems[] = new int[]{14, 30, 25, 42, 17};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);
        int data = 999;

        SinglyLinkedListNode llist_head = LinkedListUtil.insertNodeAtTail(llist.head, data);
        LinkedListUtil.printSinglyLinkedList(llist_head);
    }

    /**
     * Test - Insert a node at a specific position in a linked list
     */
    @Test
    public void insertNodeAtPositionTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistItems[] = new int[]{16, 13, 1};
        for (int i = 0; i < llistItems.length; i++)
            llist.insertNode(llistItems[i]);
        int data = 7;
        int position = 2;
        SinglyLinkedListNode llist_head = LinkedListUtil.insertNodeAtPosition(llist.head, data, position);
        LinkedListUtil.printSinglyLinkedList(llist_head);
    }

    /**
     * Test - Delete a node at a specific position in a linked list
     */
    @Test
    public void deleteNodeAtPositionTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistItems[] = new int[]{16, 13, 1, 5};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);
        int position = 3;
        SinglyLinkedListNode llist_head = LinkedListUtil.deleteNodeAtPosition(llist.head, position);
        LinkedListUtil.printSinglyLinkedList(llist_head);
    }

    /**
     * Test - Reverse a linked list
     */
    @Test
    public void reverseTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistItems[] = new int[]{16, 13, 1, 88};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);

        SinglyLinkedListNode llist_head = LinkedListUtil.reverse(llist.head);
        LinkedListUtil.printSinglyLinkedList(llist_head);
    }

    /**
     * Test - Compare two linked lists
     */
    @Test
    public void compareListsTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        SinglyLinkedList llist2 = new SinglyLinkedList();
        int llistItems[] = new int[]{16, 13, 1};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);
        int llistItems2[] = new int[]{16, 13, 10};
        for (int i = 0; i < llistItems2.length; i++) llist2.insertNode(llistItems2[i]);
        boolean llist_head = LinkedListUtil.compareLists(llist.head, llist2.head);
        System.out.println(llist_head);
    }

    /**
     * Test - Merge two sorted linked lists
     */
    @Test
    public void mergeListsTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        SinglyLinkedList llist2 = new SinglyLinkedList();
        int llistItems[] = new int[]{16, 19, 16};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);
        int llistItems2[] = new int[]{16, 13, 10};
        for (int i = 0; i < llistItems2.length; i++) llist2.insertNode(llistItems2[i]);
        SinglyLinkedListNode llist_head = LinkedListUtil.mergeLists(llist.head, llist2.head);
        LinkedListUtil.printSinglyLinkedList(llist_head);
    }

    /**
     * Test - Get Node Value
     */
    @Test
    public void getNodeTest() {
        SinglyLinkedList llist = new SinglyLinkedList();

        int llistItems[] = new int[]{16, 13, 45, 77};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);

        int data = LinkedListUtil.getNode(llist.head, 0);
        System.out.println(data);
    }


    /**
     * Test - Delete duplicate-value nodes from a sorted linked list
     */
    @Test
    public void removeDuplicatesTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistItems[] = new int[]{16, 13, 1, 1, 5, 7};
        for (int i = 0; i < llistItems.length; i++)
            llist.insertNode(llistItems[i]);

        llist.head.next.next = llist.head;

        SinglyLinkedListNode llist_head = LinkedListUtil.removeDuplicates(llist.head);
        LinkedListUtil.printSinglyLinkedList(llist_head);
    }

    @Test
    public void hasCycleTest() {
        SinglyLinkedList llist = new SinglyLinkedList();
        int llistItems[] = new int[]{20, 4, 15, 10};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);
        llist.head.next.next.next = llist.head;

        boolean cycle = LinkedListUtil.hasCycle(llist.head);
        if (cycle) {
            System.out.println("Cycle found");
        } else {
            System.out.println("Cycle not found");

        }
    }

    @Test
    public void findMergeNodeTest() {
        SinglyLinkedList llist1 = new SinglyLinkedList();
        SinglyLinkedList llist2 = new SinglyLinkedList();

        int llistItems[] = new int[]{2, 4, 15, 10};
        for (int i = 0; i < llistItems.length; i++) llist1.insertNode(llistItems[i]);

        int llistItems2[] = new int[]{20, 4, 1, 10};
        for (int i = 0; i < llistItems2.length; i++) llist2.insertNode(llistItems2[i]);

        int mergeNodeValue = LinkedListUtil.findMergeNode(llist1.head,llist2.head);
        System.out.println("Merge Point of Two Lists is  : " + mergeNodeValue);


    }

    /**
     * Test - Inserting a Node Into a Sorted Doubly Linked List
     */
    @Test
    public void sortedInsertTest() {
        DoublyLinkedList llist = new DoublyLinkedList();

        int llistItems[] = new int[]{1, 3, 4, 10};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);

        int data = 15;
        DoublyLinkedListNode llist_head = LinkedListUtil.sortedInsert(llist.head, data);
        LinkedListUtil.printDoublyLinkedList(llist_head);

        System.out.println("\n");

        int data2 = 12;
        DoublyLinkedListNode llist_head2 = LinkedListUtil.sortedInsert(llist.head, data2);
        LinkedListUtil.printDoublyLinkedList(llist_head2);
    }


    @Test
    public void reverseADoublyLinkedList() {
        DoublyLinkedList llist = new DoublyLinkedList();

        int llistItems[] = new int[]{16, 13, 12, 11};
        for (int i = 0; i < llistItems.length; i++) llist.insertNode(llistItems[i]);

        DoublyLinkedListNode llist_head = LinkedListUtil.reverseADoublyLinkedList(llist.head);
        LinkedListUtil.printDoublyLinkedList(llist_head);


    }
}
