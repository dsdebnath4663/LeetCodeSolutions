package com.leetcode.medium.graph.dfs.others;

import java.util.ArrayList;
import java.util.List;

public class CloneGraphNode {
    public int val;
    public List<CloneGraphNode> neighbors;
    public CloneGraphNode() {//default constructor
        val = 0;
        neighbors = new ArrayList<CloneGraphNode>();
    }
    public CloneGraphNode(int _val) {//parametrized constructor
        val = _val;
        neighbors = new ArrayList<CloneGraphNode>();
    }
    public CloneGraphNode(int _val, ArrayList<CloneGraphNode> _neighbors) {//parametrized constructor
        val = _val;
        neighbors = _neighbors;
    }
}
