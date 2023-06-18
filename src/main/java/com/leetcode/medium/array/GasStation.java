package com.leetcode.medium.array;

public class GasStation {
    public static int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length,total = 0,extra=0,start=0;
        for(int i=0;i<n;i++)
        {
            total += gas[i]-cost[i];
            extra += gas[i]-cost[i];
            if(extra<0)
            {
                extra = 0;
                start = i+1;
            }
        }
        return total >= 0 ? start : -1;
    }
public static void main (String[] args){
    int[] gas = {1,2,3,4,5};
    int[] cost = {3,4,5,1,2 };
System.out.println(canCompleteCircuit(gas,cost));
}
}
