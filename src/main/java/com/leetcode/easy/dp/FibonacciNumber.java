package com.leetcode.easy.dp;

public class FibonacciNumber {

    public static int fib(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Input is invalid");
        }
        if (n <= 1) {
            return n;
        }

        int[][] q = {{1, 1}, {1, 0}};
        int[][] result = q;
        n -= 2; // As we have already solved for n = 2. q[0][0] points to 2nd Fibonacci Number.
        while (n > 0) {
            if (n % 2 == 1) {
                result = multiplyMatrix(result, q);
                if (n == 1) {
                    break;
                }
                n--;
            }
            q = multiplyMatrix(q, q);
            n /= 2;
        }
        return result[0][0];
    }

    private static int[][] multiplyMatrix(int[][] a, int[][] b) {
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j];
            }
        }
        return c;
    }

    public static void main(String[] args){
        int n1=2;
        int n2=3;
        int n3=4;

        System.out.println(fib(n3));
    }
}
