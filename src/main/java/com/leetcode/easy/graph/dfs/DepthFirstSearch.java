package com.leetcode.easy.graph.dfs;

import java.util.Iterator;
import java.util.LinkedList;

public class DepthFirstSearch {
    private int noOfVertices; // No. of vertices

    // Array  of lists for
    // Adjacency List Representation
    private LinkedList<Integer> adj[];

    // Constructor
    @SuppressWarnings("unchecked") DepthFirstSearch(int v)
    {
        noOfVertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; ++i)
            adj[i] = new LinkedList();
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w)
    {
        adj[v].add(w); // Add w to v's list.
    }

    // A function used by DFS
    void markVisitedVertices(int vertice, boolean visited[])
    {
        // Mark the current node as visited and print it
        visited[vertice] = true;
        System.out.print(vertice + " ");

        // Recur for all the vertices adjacent to this
        // vertex
        Iterator<Integer> i = adj[vertice].listIterator();
        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                markVisitedVertices(n, visited);
        }
    }

    // The function to do DFS traversal.
    // It uses recursive
    // DFSUtil()
    void DFS(int v)
    {
        // Mark all the vertices as
        // not visited(set as
        // false by default in java)
        boolean visited[] = new boolean[noOfVertices];

        // Call the recursive helper
        // function to print DFS
        // traversal
        markVisitedVertices(v, visited);
    }

    // Driver's Code
    public static void main(String args[])
    {
        DepthFirstSearch g = new DepthFirstSearch(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println(
                "Following is Depth First Traversal "
                        + "(starting from vertex 2)");

        // Function call
        g.DFS(2);
    }
}
