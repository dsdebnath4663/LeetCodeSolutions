package com.leetcode.medium.graph.dfs;

import com.leetcode.medium.graph.dfs.others.CloneGraphNode;

import java.util.HashMap;
import java.util.Map;

/**
     * @link : https://leetcode.com/problems/clone-graph/
 */


public class CloneGraph {
    public CloneGraphNode cloneGraph(CloneGraphNode node) {
        Map<Integer,CloneGraphNode> map = new HashMap<>();
        return dfs(node,map);
    }
    private CloneGraphNode dfs(CloneGraphNode node, Map<Integer,CloneGraphNode> map) {
        if (node == null) return null;
        if (map.containsKey(node.val)) {
            return map.get(node.val);
        } else {
            CloneGraphNode clone = new CloneGraphNode(node.val);
            map.put(node.val,clone);
            for (int i = 0; i < node.neighbors.size(); i++) {
                clone.neighbors.add(dfs(node.neighbors.get(i), map));
            }
            return clone;
        }
    }
}
