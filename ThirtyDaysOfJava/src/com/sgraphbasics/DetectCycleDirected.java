package com.sgraphbasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class DCDGraph {
    private int D;
    private ArrayList<ArrayList<Integer>> adj;

    public DCDGraph(int D) {
        this.D = D;
        adj = new ArrayList<>(D);

        for (int i = 0; i < D; i++) {
            adj.add(new ArrayList<>());
        }
    }

    public void addEdge(int d, int w) {
        adj.get(d).add(w);
    }

    public boolean isCyclic() {
        int[] inDegree = new int[D];

        Queue<Integer> q = new LinkedList<>();

        int visited = 0;

        for (int u = 0; u < D; u++) {
            for (int d : adj.get(u)) {
                inDegree[d]++;
            }
        }

        for (int u = 0; u < D; u++) {
            if (inDegree[u] == 0) {
                q.add(u);
            }
        }

        while (!q.isEmpty()) {
            int u = q.poll();
            visited++;

            for (int d : adj.get(u)) {
                inDegree[d]--;

                if (inDegree[d] == 0) {
                    q.add(d);
                }
            }
        }

        return visited != D;
    }
}

public class DetectCycleDirected {
    public static void main(String[] args) {
        DCDGraph g = new DCDGraph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 3);
        g.addEdge(4, 1);
        g.addEdge(4, 5);
        g.addEdge(5, 3);

        if (g.isCyclic()) {
            System.out.println("Graph contains cycle...");
        }
        else {
            System.out.println("Graph does not contain cycle...");
        }
    }
}
