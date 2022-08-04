package com.leetcode.medium.string;

public class RobotBoundedInCircle {
    public static boolean isRobotBounded(String ins) {
        //           N (i=0)
        //              |
        //   W (i=1) ------ E (i=3)
        //             |
        //          S (i=2)
        int x = 0, y = 0, i = 0, dir[][] = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        for (int j = 0; j < ins.length(); ++j) {
            if (ins.charAt(j) == 'R')
                i = (i + 1) % 4; // since we are increment "i".
                // To avoid array out of bound exception, we are moduling by 4
            else if (ins.charAt(j) == 'L')
                i = (i + 3) % 4;
            else {
                x += dir[i][0];
                y += dir[i][1];
            }
        }
//        x == 0 && y == 0
//After executing each and every instruction; if the final position of robot represented by x,y is (0,0) --> this means that the robot ended up where it initially started from ie. origin. So this is a zero vector as explained by @hi-malik . No matter how many times we execute this set of instruction; it will stay at origin so its stuck in infinite circle.
//
//i!= 0
//In this solution "i" basically represents direction. i = 0 represents "N" direction in array "dir". So it says that after executing each instruction , if the robot still stays "N" i.e. i == 0; then its moving forward, it will not come back to origin. So to get robot to stuck in infinte loop, i should not be equal to 0.
        return x == 0 && y == 0 || i > 0;
    }

    public static void main(String[] args) {
        System.out.println(isRobotBounded("GL"));
    }
}
