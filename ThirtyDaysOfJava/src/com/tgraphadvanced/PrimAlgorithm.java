package com.tgraphadvanced;

import java.util.*;

class EdgeP {
    int source;
    int desc;
    int weight;

    EdgeP(int source, int desc, int weight) {
        this.source = source;
        this.desc = desc;
        this.weight = weight;
    }
}

class GraphP {
    int vertices;
    LinkedList<EdgeP>[] adjacencyList;

    GraphP(int vertices) {
        this.vertices = vertices;
        adjacencyList = new LinkedList[vertices];
        for (int i = 0; i < vertices; i++) {
            adjacencyList[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int desc, int weight) {
        EdgeP edge = new EdgeP(source, desc, weight);
        adjacencyList[source].add(edge);

        adjacencyList[desc].add(new EdgeP(desc, source, weight));
    }

    void primMST() {
        boolean[] inMST = new boolean[vertices];

        PriorityQueue<EdgeP> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));

        List<EdgeP> mst = new ArrayList<>();

        int startVertex = 0;
        inMST[startVertex] = true;

        for (EdgeP edge : adjacencyList[startVertex]) {
            priorityQueue.add(edge);
        }

        while (!priorityQueue.isEmpty()) {
            EdgeP currentEdge = priorityQueue.poll();

            if (!inMST[currentEdge.desc]) {
                mst.add(currentEdge);

                inMST[currentEdge.desc] =true;

                for (EdgeP edge : adjacencyList[currentEdge.desc]) {
                    priorityQueue.add(edge);
                }
            }
        }
        System.out.println("Minimum Spanning Tree : ");
        for (EdgeP edge : mst) {
            System.out.println("Edge : "+edge.source+" - "+edge.desc+ " Weight : "+edge.weight);
        }
    }

}

public class PrimAlgorithm {
    public static void main(String[] args) {
        GraphP graphP = new GraphP(4);
        graphP.addEdge(0, 1, 1);
        graphP.addEdge(1, 2, 2);
        graphP.addEdge(2, 3, 3);
        graphP.addEdge(0, 3, 4);

        graphP.primMST();
    }
}
