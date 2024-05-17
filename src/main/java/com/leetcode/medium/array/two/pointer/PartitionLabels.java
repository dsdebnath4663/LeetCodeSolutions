package com.leetcode.medium.array.two.pointer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
//        function partitionString(s):
//        result = []
        List<Integer> result = new ArrayList<>();
//        if s is null or s is empty:
//        return result
        if (s.isEmpty())
            return result;
//        lastIndexMap = {}  // Map to store the last occurrence index of each character
        Map<Character, Integer> lastIndexMap = new HashMap<>();
        int n = s.length() - 1;

//        for i from 0 to length(s) - 1:
        for (int index = 0; index <= n; index++) {
            char[] charArray = s.toCharArray(); //converting string "s" to Character array named "charArray"
            char character = charArray[index]; // extracting value from "charArray" by index "index"
            lastIndexMap.put(character, index);// Update the last occurrence index of the character
        }
//        start = 0
//        end = 0
        int start = 0;
        int end = 0;
//        for i from 0 to length(s) - 1:
        for (int index = 0; index <= n; index++) {
            char[] charArray = s.toCharArray(); //converting string "s" to Character array named "charArray"
            char currentChar = charArray[index];
            int lastIndex = lastIndexMap.get(currentChar);
            end = Math.max(end, lastIndex);  // Update the end index of the current partition
            if (index == end) {// Found the end of a partition

                result.add(end - start + 1);// Add the size of the partition to the result
                start = end + 1; // Update the start index for the next partition
            }
        }

        return result;

    }

    public static void main(String[] args) {
       // String s = "ababcbacadefegdehijhklij";
        String s ="eccbbbbdec";
        PartitionLabels partitionLabelsObj = new PartitionLabels();
        List<Integer> result = partitionLabelsObj.partitionLabels(s);
        System.out.println(result);
    }
}
