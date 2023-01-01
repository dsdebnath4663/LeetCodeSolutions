package com.leetcode.easy.dp;

public class    DivisorGame {
    /**
     * 1.About Complexity
     *     1.1 Time Complexity is O(n)
     *     1.2 Space Complexity is O(n)
     * 2.how I solve
     *     2.1 define a array to store calculate result
     *     2.2 set initial value
     *         2.2.1 when N = 1, there have no eligible number, result is false
     *         2.2.2 when N = 2, 1 is the eligible number, result is true
     *     2.3 double circulation, circulate 3 to N, minor circulation is circulate 1 to current number,
     *         when major number % minor number is 0 and last(major number - minor number) element, result is true
     * 3.About submit record
     *     3.1 5ms and 36.7MB memory in LeetCode China
     *     3.2 4ms and 36.4MB memory in LeetCode
     * 4.Q&A
     *
     * @param N
     * @return
     */
    public static boolean divisorGame(int number) {
        if (number == 1) {
            return false;
        }
        boolean[] res = new boolean[number + 1];
        res[1] = false;
        res[2] = true;
        for (int n = 3; n <= number; n++) {
            res[n] = false;
            for (int x= 1; x < n; x++) {
                if (n % x == 0 && !res[n - x]) {
                    res[x] = true;
                    break;
                }
            }
        }
        return res[number];
    }


    public static void main(String[] args) {

      //  System.out.println(divisorGame(3));
        System.out.println(divisorGame(4));


    }



}