package com.leetcode.medium.array;

import java.util.LinkedList;
import java.util.Queue;

public class DuplicateZeros {
    public static int[] duplicateZeros(int[] array) {
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 0) {
                queue.add(0);
                queue.add(0);
            } else {
                queue.add(array[i]);
            }
            Integer fist = queue.poll();
            array[i] = fist;
        }
    return array;
    }

    }
