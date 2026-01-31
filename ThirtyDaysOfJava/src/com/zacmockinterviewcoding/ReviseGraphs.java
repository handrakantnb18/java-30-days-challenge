package com.zacmockinterviewcoding;

import java.util.List;
import java.util.*;

class GraphRev<T> {
    private Map<T, List<T>> map = new HashMap<>();

    public void  addVertex(T s) {
        map.put(s, new LinkedList<>());
    }

    public void addEdge(T source, T destination, boolean bidirectional)
    {
        if (!map.containsKey(source))
            addVertex(source);

        if (!map.containsKey(destination))
            addVertex(destination);

        map.get(source).add(destination);
        if (bidirectional == true) {
            map.get(destination).add(source);
        }
    }

    public void getVertexCount()
    {
        System.out.println("The graph has : "+map.keySet().size() + " Vertex ");
    }

    public void  getEdgesCount(boolean bidirection)
    {
        int count = 0;
        for (T v : map.keySet()) {
            count += map.get(v).size();
        }

        if (bidirection == true) {
            count = count / 2;
        }
        System.out.println(" The graph has : "+ count + " Edges ");
    }

    public void hasVertex(T s)
    {
        if (map.containsKey(s))
        {
            System.out.println("The graph contains : " + s + " as a vertex ");
        }
        else {
            System.out.println("The graph does not contains : "+ s + " As a vertex ");
        }
    }

    public void  hasEdge(T s, T d)
    {
        if (map.get(s).contains(d))
        {
            System.out.println(" The graph has an edge between "+ s + " and "+ d + " . ");
        }
        else {
            System.out.println("The graph has not edge between "+ s + " and "+ d +" . ");
        }
    }

    public void neighbours(T s)
    {
        if (!map.containsKey(s))
            return;
        System.out.println("The neighbours of "+ s + " are ");
        for (T w:map.get(s))
            System.out.print(w+ ", ");
    }

    @Override
    public String toString()
    {
        StringBuilder builder = new StringBuilder();

        for (T v : map.keySet()) {
            builder.append(v.toString() + " : ");

            for (T w : map.get(v)) {
                builder.append(w.toString() + " ");
            }
            builder.append("\n");
        }
        return (builder.toString());
    }
}
public class ReviseGraphs {

    public static void main(String[] args) {
        GraphRev<Integer> graph = new GraphRev<Integer>();

        graph.addEdge(0, 1, true);
        graph.addEdge(0, 4, true);
        graph.addEdge(1, 2, true);
        graph.addEdge(1, 3, true);
        graph.addEdge(1, 4, true);
        graph.addEdge(2, 3, true);
        graph.addEdge(3, 4, true);

        System.out.println("Graph : \n " + graph.toString());

        graph.getVertexCount();

        graph.getEdgesCount(true);

        graph.hasEdge(3, 4);

        graph.hasVertex(5);
        graph.neighbours(1);
    }
}
