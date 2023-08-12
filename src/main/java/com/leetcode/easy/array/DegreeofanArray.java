package com.leetcode.easy.array;

import java.util.HashMap;
import java.util.Map;

public class DegreeofanArray {
    public static int findShortestSubArray(int[] nums) {
        Map<Integer, int[]> m = new HashMap<>();
        int max = 0;
        int res = 0;
        for(int i=0;i<nums.length;i++){
            int a = nums[i];
            if(!m.containsKey(a)){
                m.put(a, new int[]{i,i,1});
                if(max == 0) max = 1;
                if(res == 0) res = 1;
            }else{
                int []x = m.get(a);
                x[1] = i;
                x[2]++;
                if(x[2]>max){
                    max = x[2];
                    res = i-x[0]+1;
                }else if(x[2] == max){
                    res = Math.min(res, i-x[0]+1);
                }
            }
        }
        return res;
    }
    public static void main (String[] args) {
       // int[] nums = {1,2,2,3,1};
        int [] nums ={1,2,2,3,1,4,2};
        System.out.println(findShortestSubArray(nums));
    }
    }
