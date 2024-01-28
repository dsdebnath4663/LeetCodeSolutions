package com.leetcode.easy.linkedlist;

public class LinkedListDemo {

    Node head; // head of list
    class Node {
        int data;//member variable
        Node next;//member variable
        Node(int d) {
            data = d;
            next = null;
        }
    }

    /* Inserts a new Node at front of the list. */
    public void push(int new_data) {
		/* 1 & 2: Allocate the Node &
				Put in the data*/
        Node new_node = new Node(new_data);

        /* 3. Make next of new Node as head */
        new_node.next = head;

        /* 4. Move the head to point to new Node */
        head = new_node;
    }


    void deleteNode(int position) {
        // If linked list is empty
        if (head == null)
            return;

        // Store head node
        Node temp = head;

        // If head needs to be removed
        if (position == 0) {
            head = temp.next; // Change head
            return;
        }

        // Find previous node of the node to be deleted
        for (int i = 0; temp != null && i < position - 1; i++)
            temp = temp.next;

        // If position is more than number of nodes
        if (temp == null || temp.next == null)
            return;

        // Node temp->next is the node to be deleted
        // Store pointer to the next of node to be deleted
        Node next = temp.next.next;

        temp.next = next; // Unlink the deleted node from list
    }


    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }
    }


    public static void main(String[] args) {
        LinkedListDemo llist = new LinkedListDemo();

        llist.push(7);//4
        llist.push(1);//3
        llist.push(3);//2
        llist.push(2);//1
        llist.push(8);//0


        System.out.println("\nCreated Linked list is: ");
        llist.printList();

//     llist.deleteNode(3); // Delete node at position 3
//
//        System.out.println("\nLinked List after Deletion at position 4: ");
//        llist.printList();
    }
}
