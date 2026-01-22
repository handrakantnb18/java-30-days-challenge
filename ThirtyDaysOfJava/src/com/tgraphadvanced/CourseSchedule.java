package com.tgraphadvanced;

import java.util.ArrayList;

public class CourseSchedule {

    static boolean dfs(int node, ArrayList<ArrayList<Integer>> adj, int[] visited) {
        visited[node] = 1;

        for (int neighbor : adj.get(node)) {
            if (visited[neighbor] == 1) {
                return false;
            }else if (visited[neighbor] == 0) {
                if (!dfs(neighbor, adj, visited)) {
                    return false;
                }
            }
        }
        visited[node] = 2;
        return true;
    }

    static boolean canFinish(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] pre : prerequisites) {
            int dest = pre[0];
            int src = pre[1];
            adj.get(src).add(dest);
        }

        int[] visited = new int[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] == 0) {
                if (!dfs(i, adj, visited)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n = 4;
        int[][] prerequisites = {
                {2, 0},
                {2, 1},
                {3, 2}
        };

        System.out.println(canFinish(n, prerequisites) ? "True" : "False");
    }
}
