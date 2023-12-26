package com.leetcode.medium.string;

public class RobotBoundedInCircle1 {
    public static boolean isRobotBounded(String instructions) {
        if (instructions.length() == 0)
            return false;
        int x = 0;
        int y = 0;
        String directions = "North";
        for (char ch: instructions.toCharArray()) {
            if (ch == 'G') {
                if (directions.equals("North"))
                    y += 1;
                else if (directions.equals("South"))
                    y -= 1;
                else if(directions.equals("East"))
                    x += 1;
                else
                    x -= 1;
            }
            else if (ch == 'L') {
                if (directions.equals("North"))
                    directions = "West";
                else if (directions.equals("West"))
                    directions = "South";
                else if (directions.equals("South"))
                    directions = "East";
                else directions = "North";
            }
            else if (ch == 'R') {
                if (directions.equals("North"))
                    directions = "East";
                else if (directions.equals("East"))
                    directions = "South";
                else if (directions.equals("South"))
                    directions = "West";
                else directions = "North";
            }
        }
        if (x == 0 && y == 0)
            return true;
        if (directions.equals("North"))
            return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isRobotBounded("GGLLGG"));
        }
}
