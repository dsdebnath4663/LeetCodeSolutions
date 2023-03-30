package com.leetcode.medium.array;

public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        //[[],[],[]]
        StringBuilder[] sbs = new StringBuilder[numRows];
        for(int i = 0; i < numRows; i++){
            sbs[i] = new StringBuilder();
        }

        char[] arr = s.toCharArray();
        int n = arr.length;
        int index = 0;

        //Traverse zig zag
        while(index < n){
            //Go down
            for(int j = 0; j < numRows && index < n; j++){
                sbs[j].append(arr[index++]);
                System.out.println("Go down : "+j+" "+sbs[j]);
            }
            //Go Up before start
            for(int j = numRows - 2; j > 0 && index < n; j--){
                sbs[j].append(arr[index++]);
                System.out.println("Go Up before start : "+j+" "+sbs[j]);
            }
        }

        //Combine all stringbuilders into one
        StringBuilder res = sbs[0];
        for(int i = 1; i < numRows; i++){
            res.append(sbs[i].toString());
        }
        System.out.println("output : "+ res.toString());
        return res.toString();
    }
    public static void main(String[] arages) {
       // String s = "PAYPALISHIRING";
       // int numRows = 3;
        String s = "PAYPALISHIRING";
        int numRows = 4 ;
        System.out.println(convert(s, numRows));
    }
}