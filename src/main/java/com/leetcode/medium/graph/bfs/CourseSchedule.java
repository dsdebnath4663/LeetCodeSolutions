package com.leetcode.medium.graph.bfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Find a vertex that has indegree = 0 (no incoming edges)
 * Remove all the edges from that vertex that go outward (make it's outdegree = 0, remove outgoing edges)
 * Add that vertex to the array representing topological sorting of the graph
 * Repeat till there are no more vertices left.
 */

/**
 * ShortCut to create new testCase of a particular class : CTRL + SHIFT + T :
 */
public class CourseSchedule {
    public  boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adj.add(new ArrayList<>());
        }
        for (int pair[] : prerequisites) {
            adj.get(pair[0]).add(pair[1]);
        }
        int indegree[] = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int it : adj.get(i)) {
                indegree[it]++;
            }
        }
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                q.add(i);
            }
        }
        int count = 0;
        while (!q.isEmpty()) {
            int node = q.poll();
            count++;
            for (int it : adj.get(node)) {
                indegree[it]--;
                if (indegree[it] == 0) {
                    q.add(it);
                }
            }
        }
        return count == numCourses;
    }


}

