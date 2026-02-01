package com.zadextrapractice;

import java.util.*;

class Node1 {
    int val;
    ArrayList<Node1> neighbors;

    Node1() {
        neighbors = new ArrayList<>();
    }

    Node1(int val) {
        this.val = val;
        neighbors = new ArrayList<>();
    }
}
public class CloneGraph {
    static HashMap<Node1, Node1> copies = new HashMap<>();

    public static Node1 cloneGraph(Node1 node) {
          if (node == null) return null;

        if (!copies.containsKey(node)) {
            Node1 clone = new Node1(node.val);
            copies.put(node, clone);
            for (Node1 neighbor : node.neighbors) {
                clone.neighbors.add(cloneGraph(neighbor));
            }
        }
        return copies.get(node);
    }

    public static Node1 buildGraph() {
        Node1 node1 = new Node1(0);
        Node1 node2 = new Node1(1);
        Node1 node3 = new Node1(2);
        Node1 node4 = new Node1(3);

        node1.neighbors.addAll(Arrays.asList(node2, node3));
        node2.neighbors.addAll(Arrays.asList(node1, node3));
        node3.neighbors.addAll(Arrays.asList(node1,node2, node4));
        node4.neighbors.addAll(Arrays.asList(node3));

        return node1;
    }
    public static boolean compareGraphs(Node1 node1, Node1 node2,
                                        HashMap<Node1, Node1> visited) {
        if (node1 == null || node2 == null)
            return node1 == node2;

        if (node1.val != node2.val || node1 == node2)
            return false;

        visited.put(node1, node2);

        if (node1.neighbors.size() != node2.neighbors.size())
            return false;

        for (int i = 0; i < node1.neighbors.size(); i++) {
            Node1 n1 = node1.neighbors.get(i);
            Node1 n2 = node2.neighbors.get(i);

            if (visited.containsKey(n1)) {
                if (visited.get(n1) != n2)
                    return false;
            } else {
                if (!compareGraphs(n1, n2, visited))
                    return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Node1 original = buildGraph();
        Node1 cloned = cloneGraph(original);

        boolean result = compareGraphs(original, cloned, new HashMap<>());
        System.out.println(result ? "true" : "false");
    }
}
