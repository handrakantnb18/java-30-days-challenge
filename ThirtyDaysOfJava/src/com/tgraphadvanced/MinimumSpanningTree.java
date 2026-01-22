package com.tgraphadvanced;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Edge implements Comparable<Edge> {
    int source, destination, weight;

    public Edge(int source, int destination, int weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int compareTo(Edge camparaEdge) {
        return this.weight - camparaEdge.weight;
    }
}
public class MinimumSpanningTree {
    private int findParent(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return findParent(parent, parent[i]);
    }

    private void union(int[] parent, int x, int y) {
        int xSet = findParent(parent, x);
        int ySet = findParent(parent, y);
    }

    public List<Edge> findMST(List<Edge>  edges, int numberOfVertices) {
        List<Edge> result = new ArrayList<>();
        int[] parent = new int[numberOfVertices];
        Arrays.fill(parent, -1);

        Collections.sort(edges);
        int edgeCount = 0;
        int index = 0;

        while (edgeCount < numberOfVertices -1) {
            Edge nextEdge = edges.get(index++);
            int x = findParent(parent, nextEdge.source);

            int y = findParent(parent, nextEdge.destination);
            if (x != y) {
                result.add(nextEdge);
                union(parent, x, y);
                edgeCount++;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Edge> list = new ArrayList<>();
        list.add(new Edge(0, 1, 2));
        list.add(new Edge(0, 3, 6));
        list.add(new Edge(1, 2, 3));
        list.add(new Edge(1, 3, 8));
        list.add(new Edge(1, 4, 5));
        list.add(new Edge(2, 4, 7));
        list.add(new Edge(3, 4, 9));

        int numberOfVertices = 5;

        MinimumSpanningTree mst = new MinimumSpanningTree();

        List<Edge> mstEdges = mst.findMST(list, numberOfVertices);

        System.out.println("Minimum Spanning Tree Edge.");

        for (Edge edge : mstEdges) {
            System.out.println("(" + edge.source +" , " + edge.destination+", "+edge.weight+")");
        }
    }
}
