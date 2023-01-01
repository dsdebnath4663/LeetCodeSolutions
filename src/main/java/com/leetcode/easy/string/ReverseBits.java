package com.leetcode.easy.string;

public class  ReverseBits {
    public static int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result += n & 1;
            n >>>= 1;   // CATCH: must do unsigned shift
            if (i < 31) // CATCH: for last digit, don't shift!
                result <<= 1;
        }
        return result;
    }
    public static void main(String[]args) {
     //   System.out.println(reverseBits(00000010100101000001111010011100));
    }
}
