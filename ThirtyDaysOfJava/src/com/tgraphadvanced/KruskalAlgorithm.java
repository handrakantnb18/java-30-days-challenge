package com.tgraphadvanced;

import java.util.Arrays;

class EdgeK implements Comparable<EdgeK> {
    int src, dest, weight;

    public EdgeK(int src, int dest, int weight) {
        this.src = src;
        this.dest = dest;
        this.weight = weight;
    }

    @Override
    public int compareTo(EdgeK compareEdge) {
        return this.weight - compareEdge.weight;
    }
}

class Graph {
    int V, E;
    EdgeK[] edges;

    public Graph(int V, int E) {
        this.V = V;
        this.E = E;
        edges = new EdgeK[E];
    }

    int find(int[] parent, int i) {
        if (parent[i] == -1)
            return i;
        return find(parent, parent[i]);
    }

    void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        parent[xset] = yset;
    }

    void kruskalMST() {
        EdgeK[] result = new EdgeK[V - 1];
        int e = 0;
        int i = 0;

        Arrays.sort(edges);

        int[] parent = new int[V];
        Arrays.fill(parent, -1);

        while (e < V - 1) {
            EdgeK nextEdge = edges[i++];

            int x = find(parent, nextEdge.src);
            int y = find(parent, nextEdge.dest);

            if (x != y) {
                result[e++] = nextEdge;
                union(parent, x, y);
            }
        }

        System.out.println("Edges in the MST:");
        for (i = 0; i < e; i++) {
            System.out.println(
                    result[i].src + " - " +
                            result[i].dest + " : " +
                            result[i].weight
            );
        }
    }
}

public class KruskalAlgorithm {
    public static void main(String[] args) {
        int V = 4;
        int E = 5;

        Graph graph = new Graph(V, E);

        graph.edges[0] = new EdgeK(0, 1, 10);
        graph.edges[1] = new EdgeK(0, 2, 6);
        graph.edges[2] = new EdgeK(0, 3, 5);
        graph.edges[3] = new EdgeK(1, 3, 15);
        graph.edges[4] = new EdgeK(2, 3, 4);

        graph.kruskalMST();
    }
}
