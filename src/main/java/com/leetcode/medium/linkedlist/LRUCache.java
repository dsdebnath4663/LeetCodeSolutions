package com.leetcode.medium.linkedlist;

import com.leetcode.easy.linkedlist.ListNode;

public class LRUCache {

    class DoubleLinkedList {   //i.e. [head]⇄ [NODE]⇄[NODE]⇄[NODE]⇄[Current Node or currListNode]⇄NULL
        ListNode headOfDoubleLinkedList;    /* to track the head of the double linked list  */
        ListNode currListNode;    /* to track the latest ListNode placed in the double linked list */

        /* method to remove a ListNode from a linkedlist chain. */
        public ListNode remove(ListNode listNodeToBeDeleted) {
            //check if head is to be removed.
            if (listNodeToBeDeleted == headOfDoubleLinkedList) {
                //if head is the only element in the linkedlist chain
                if (currListNode == headOfDoubleLinkedList) {
                    currListNode = headOfDoubleLinkedList = null;
                    return listNodeToBeDeleted;
                }
                headOfDoubleLinkedList = headOfDoubleLinkedList.next;
            }

            //remove a ListNode from middle of the chain
            else if (listNodeToBeDeleted.prev != null && listNodeToBeDeleted.next != null) {
                listNodeToBeDeleted.next.prev = listNodeToBeDeleted.prev;
                listNodeToBeDeleted.prev.next = listNodeToBeDeleted.next;
            }

            //remove a ListNode from the end of the chain
            else if (listNodeToBeDeleted.next == null) {
                currListNode = listNodeToBeDeleted.prev;
                currListNode.next = null;
            }
            return listNodeToBeDeleted;
        }

        /*  method to add a ListNode to a linkedlist chain.  */
        public void add(ListNode newListNode) {
            //check if head is null and add the first element into the linkedlist chain.
            if (headOfDoubleLinkedList == null) {
                headOfDoubleLinkedList = newListNode;
                // head  val 1 key 1
                currListNode = newListNode;
            }

            //add at the end of an existing chain
            else {
                currListNode.next = newListNode;
                newListNode.prev = currListNode;
                newListNode.next = null;
                currListNode = currListNode.next;
            }
        }
    }

    ListNode[] arr;
    int currentSizeOfLRU = 0;   /*  to track the current currentSizeOfLRU of the list   */
    int capacity = 0;
    DoubleLinkedList doubleLinkedList;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.doubleLinkedList = new DoubleLinkedList();
        this.arr = new ListNode[10000];
    }

    public int get(int key) {  //key 1
        if (arr[key] == null) {
            return -1;
        }
        ListNode templistNode = arr[key];  //key 1
        if (templistNode.next != null) {
            this.doubleLinkedList.remove(templistNode);// LRU key was 2, evicts/remove key 2,
            this.doubleLinkedList.add(templistNode);
        }
        return templistNode.val;
    }

    public void put(int key, int val) {
        // key 1 2  val 1 2
        if (arr[key] != null) {
            arr[key].val = val;
            this.doubleLinkedList.remove(arr[key]);
            this.doubleLinkedList.add(arr[key]);
            return;
        }
        ListNode newListNode = null;
        this.currentSizeOfLRU++;
        //0 (0+1)=1
        /**
         * If the number of keys exceeds the capacity from this operation,
         * evict the least recently used key.
         */
        if (currentSizeOfLRU > capacity) {
            //CurrentsizeofLRU= 1     capacity= 2
            this.arr[doubleLinkedList.headOfDoubleLinkedList.key] = null;
            newListNode = this.doubleLinkedList.remove(doubleLinkedList.headOfDoubleLinkedList);
            currentSizeOfLRU--;
        }
        if (newListNode != null) {
            newListNode.key = key;
            newListNode.val = val;
        } else {
            newListNode = new ListNode(key, val);
        }
        this.doubleLinkedList.add(newListNode);
        arr[key] = newListNode;
    }

    /**
     * Your LRUCache object will be instantiated and called as such:
     */
    public static void main(String args[]) {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}


        lRUCache.get(1);    // return 1 Page Hit
        /**
         * In LRUCache there 2 elements
         *  1=1
         *  2=2
         *
         *  As we called lRUCache.get(1) , so 1 is Most  Recently Used key
         *                                and 2 is Least Recently Used(LRU) key
         */
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
//        lRUCache.get(2);    // returns -1 (not found)
//        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
//        lRUCache.get(1);    // return -1 (not found)
//        lRUCache.get(3);    // return 3
//        lRUCache.get(4);    // return 4
    }

}




























































