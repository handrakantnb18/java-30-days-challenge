package com.sgraphbasics;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSGraph {

    private int A;

    private LinkedList<Integer> adj[];

    BFSGraph(int a) {
        A = a;
        adj = new LinkedList[A];
        for (int i = 0; i < a; ++i)
            adj[i] = new LinkedList<>();
    }

    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    void BFS(int s) {
        boolean visited[] = new boolean[A];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] =  true;
        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.println(s+ " ");

            Iterator<Integer> i = adj[s].listIterator();

            while (i.hasNext()) {
                int n = i.next();

                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
    }

    public static void main(String[] args) {

        BFSGraph g = new BFSGraph(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        System.out.println("Following is breath First Traversal " + "(starting from vertex 2 )");

        g.BFS(2);
    }
}
