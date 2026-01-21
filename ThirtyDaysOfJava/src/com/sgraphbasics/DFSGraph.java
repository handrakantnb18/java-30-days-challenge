package com.sgraphbasics;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSGraph {

    private int D;

    private LinkedList<Integer> adj[];

    @SuppressWarnings("unckecked") DFSGraph(int d) {
        D = d;
        adj = new LinkedList[d];
        for (int i = 0; i < d; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int d, int w)
    {
        adj[d].add(w);
    }

    void DFSUtil(int d, boolean visited[])
    {
        visited[d] = true;
        System.out.println(d+ " ");

        Iterator<Integer> i = adj[d].listIterator();

        while (i.hasNext()) {
            int n = i.next();
            if (!visited[n])
                DFSUtil(n, visited);
        }
    }

    void DFS(int d) {
        boolean visited[] = new boolean[D];

        DFSUtil(d, visited);
    }

    public static void main(String[] args) {

        DFSGraph g = new DFSGraph(5);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is Depth First Traversal "+ "(starting from vertex 2 )");

        g.DFS(2);
    }
}
