package com.sgraphbasics;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class DetectCycleUndirected {

    static boolean bfs(int start, ArrayList<ArrayList<Integer>>
                       adj, boolean[] visited) {
        Queue<int[] > q = new LinkedList<>();

        q.add(new int[] {
                start, -1
        });
        visited[start] = true;

        while (!q.isEmpty()) {
            int node = q.peek()[0];
            int parent = q.peek()[1];
            q.poll();

            for (int neighbor : adj.get(node)) {

                if (!visited[neighbor]) {
                    visited[neighbor] = true;
                    q.add(new int[] {
                        neighbor, node
                    });
                }
                else if (neighbor != parent) {
                    return true;
                }
            }
        }
        return false;
    }

    static  boolean isCycle(ArrayList<ArrayList<Integer>> adj) {

        int V = adj.size();

        boolean[] visited = new boolean[V];

        for (int i = 0; i < V; i++) {
            if (!visited[i]) {

                if (bfs(i, adj, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    static void addEdge(ArrayList<ArrayList<Integer>> adj, int u, int v) {
        adj.get(u).add(v);
        adj.get(v).add(u);
    }

    public static void main(String[] args) {

        int V = 4;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }

        addEdge(adj, 0, 1);
        addEdge(adj, 0, 2);
        addEdge(adj, 1, 2);
        addEdge(adj, 2, 3);

        System.out.println(isCycle(adj) ? "True" : "False");

    }
}
