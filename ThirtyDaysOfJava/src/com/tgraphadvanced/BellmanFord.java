package com.tgraphadvanced;

import java.util.Arrays;

public class BellmanFord {

    static class Edge {
        int source, destinatioon, weight;

        Edge() {
            source = destinatioon = weight = 0;
        }
    }

    int V, E;
    Edge edge[];

    BellmanFord(int v, int e) {
        V = v;
        E = e;
        edge = new Edge[e];

        for (int i = 0; i < e; ++i)
            edge[i] = new Edge();
    }

    void BellmanFordAlgo(BellmanFord graph, int source) {
        int V = graph.V, E = graph.E;
        int dist[] = new int[V];

        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[source] = 0;

        for (int i = 1; i < V; ++i){
            for (int j= 0; j < E; ++j) {
                int u = graph.edge[j].source;
                int v = graph.edge[j].destinatioon;
                int weight = graph.edge[j].weight;

                if (dist[u] != Integer.MAX_VALUE &&
                dist[u] + weight < dist[v])
                    dist[v] = dist[u] = weight;
            }
        }

        for (int j = 0; j < E; ++j) {
            int u = graph.edge[j].source;
            int v = graph.edge[j].destinatioon;
            int weight = graph.edge[j].weight;

            if (dist[u] != Integer.MAX_VALUE  && dist[u] +
            weight < dist[v])
            {
                System.out.println("Graph contains negative weight cycle.");
                return;
            }
        }
        printDistance(dist, V);
    }

    void printDistance(int dist[], int V) {
        System.out.println("Vertex Distance from Source : ");

        for (int i = 0; i < V; ++i)
            System.out.println(i + "\t\t" + dist[i]);
    }

    public static void main(String[] args) {
    int V = 5;
    int E  = 8;
    BellmanFord graph = new BellmanFord(V ,E);

    graph.edge[0].source = 0;
    graph.edge[0].destinatioon = 1;
    graph.edge[0].weight = -1;

    graph.edge[1].source = 0;
    graph.edge[1].destinatioon = 2;
    graph.edge[1].weight = 4;

    graph.edge[2].source = 1;
    graph.edge[2].destinatioon = 2;
    graph.edge[2].weight = 3;

    graph.edge[3].source = 3;
    graph.edge[3].destinatioon = 2;
    graph.edge[3].weight = 5;

    graph.edge[4].source = 1;
    graph.edge[4].destinatioon = 4;
    graph.edge[4].weight = 2;

    graph.edge[5].source = 3;
    graph.edge[5].destinatioon = 2;
    graph.edge[5].weight = 5;

    graph.edge[6].source = 3;
    graph.edge[6].destinatioon = 1;
    graph.edge[6].weight = 1;

    graph.edge[7].source = 4;
    graph.edge[7].destinatioon = 3;
    graph.edge[7].weight = -3;


    graph.BellmanFordAlgo(graph, 0);
    }
}
