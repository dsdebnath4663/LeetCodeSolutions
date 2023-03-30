package com.leetcode.medium.array;

public class RobotBoundedInCircle {
    public static boolean isRobotBounded(String ins) {
        int x = 0, y = 0, i = 0, dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int j = 0; j < ins.length(); ++j) {
             if (ins.charAt(j) == 'R')
                i = (i + 1) % 4;
            else if (ins.charAt(j) == 'L')
                i = (i + 3) % 4;
            else {
                x += dir[i][0];
                y += dir[i][1];
            }
        }
        return x == 0 && y == 0 || i > 0;
    }
    public static void main(String[] args) {
       // System.out.println(isRobotBounded("GGLLGG"));
        System.out.println(isRobotBounded("GG"));
    }
}

