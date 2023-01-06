package com.leetcode.medium.graph.bfs;

import org.junit.Assert;
import org.junit.Test;


public class CourseScheduleTest {


    CourseSchedule courseSchedule = new CourseSchedule();


    @Test
    public void canFinishTestOne() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}};
        boolean actualOutput = courseSchedule.canFinish(numCourses, prerequisites);

        Assert.assertEquals(true, actualOutput);
    }


    @Test
    public void canFinishTestTwo() {
        int numCourses = 2;
        int[][] prerequisites = {{1, 0}, {0, 1}};
        boolean actualOutput = courseSchedule.canFinish(numCourses, prerequisites);

        Assert.assertEquals(false, actualOutput);

    }


}