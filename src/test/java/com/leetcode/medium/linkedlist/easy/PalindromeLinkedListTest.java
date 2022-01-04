package com.leetcode.medium.linkedlist.easy;

import com.leetcode.easy.linkedlist.ListNode;
import com.leetcode.easy.linkedlist.PalindromeLinkedList;
import com.leetcode.easy.linkedlist.ReverseLinkedList;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeLinkedListTest {
    @Test
    public void testReverseList() {

        int[] keys = {1, 2, 3, 4, 5};
        ListNode listNodeHead = null;
        for (int i = keys.length - 1; i >= 0; i--) {
            listNodeHead = new ListNode(keys[i], listNodeHead);
        }

        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean actualOutput = palindromeLinkedList.isPalindrome(listNodeHead);

         Assert.assertEquals(false, actualOutput);


    }
}
