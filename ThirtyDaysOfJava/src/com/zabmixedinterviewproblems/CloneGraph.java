package com.zabmixedinterviewproblems;

import java.util.*;

class NodeClone {
    public int val;
    public ArrayList<NodeClone> neighbors;

    public NodeClone() {
        neighbors = new ArrayList<>();
    }

    public NodeClone(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
}


public class CloneGraph {
    public static NodeClone cloneGraph(NodeClone node) {
        if (node == null)
            return null;

        Map<NodeClone, NodeClone> mp = new HashMap<>();
        Queue<NodeClone> q = new LinkedList<>();

        NodeClone clone = new NodeClone(node.val);
        mp.put(node, clone);
        q.offer(node);

        while (!q.isEmpty()) {
            NodeClone current = q.poll();

            for (NodeClone neighbor : current.neighbors) {
                if (!mp.containsKey(neighbor)) {
                    mp.put(neighbor, new NodeClone(neighbor.val));
                    q.offer(neighbor);
                }

                mp.get(current).neighbors.add(mp.get(neighbor));
            }
        }
        return mp.get(node);
    }

    public static NodeClone buildGraph() {
        NodeClone node1 = new NodeClone(0);
        NodeClone node2 = new NodeClone(1);
        NodeClone node3 = new NodeClone(2);
        NodeClone node4 = new NodeClone(3);

        node1.neighbors.addAll(new ArrayList<>(Arrays.asList(node2, node3)));

        node2.neighbors.addAll(new ArrayList<>(Arrays.asList(node1, node3)));

        node3.neighbors.addAll(new ArrayList<>(Arrays.asList(node1, node2, node4)));

        node4.neighbors.addAll(new ArrayList<>(Arrays.asList(node3)));

        return node1;

    }

    public static boolean compareGraph(NodeClone n1, NodeClone n2, HashMap<NodeClone, NodeClone> visited) {
        if (n1 == null || n2 == null)
            return n1 == n2;

        if (n1.val != n2.val || n1 == n2)
            return false;

        visited.put(n1, n2);

        if (n1.neighbors.size() != n2.neighbors.size())
            return false;

        for (int i = 0; i < n1.neighbors.size(); i++) {
            NodeClone neighbor1 = n1.neighbors.get(i);
            NodeClone neighbor2 = n2.neighbors.get(i);

            if (visited.containsKey(neighbor1)) {
                if (visited.get(neighbor1) != neighbor2)
                    return false;
            }
            else {
                if (!compareGraph(neighbor1, neighbor2, visited));
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        NodeClone original = buildGraph();
        NodeClone cloned = cloneGraph(original);
        boolean isEqual = compareGraph(original, cloned, new HashMap<>());

        System.out.println(isEqual ? "true" : "false");
    }
}
