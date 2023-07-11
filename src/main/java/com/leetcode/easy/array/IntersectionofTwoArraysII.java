package com.leetcode.easy.array;

import java.util.ArrayList;
import java.util.HashMap;

public class IntersectionofTwoArraysII {
    public static int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i : nums1){
            int freq = map.getOrDefault(i, 0);
            map.put(i, freq + 1);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int i : nums2){
            if(map.get(i) != null && map.get(i) > 0){
                list.add(i);
                map.put(i, map.get(i) - 1);
            }
        }
        int[] ret = new int[list.size()];
        for(int i = 0; i < list.size();i++){
            ret[i] = list.get(i);
        }
        return ret;
    }
    public static void main (String [] args){
       // int[] nums1 = {1,2,2,1};
        //int[] nums2 = {2,2};
        int [] nums1 = {4,9,5};
        int [] nums2 = {9,4,9,8,4};
System.out.println(intersect(nums1,nums2));
    }
}
