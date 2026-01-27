package com.ydesignproblems;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DesignQueue {
    public static void main(String[] args) {
        // The Queue interface is part of the java.util package. It extends the Collection interface.
        Queue<Integer> pq = new PriorityQueue<>();

        pq.add(50);
        pq.add(20);
        pq.add(40);
        pq.add(10);
        pq.add(30);

        System.out.println("Priority Queue elelments : " +pq);

        // The elements are stored based on the priority order which is ascending by default.

        Queue<String> pq1 = new PriorityQueue<>();

        pq1.add("Hello");
        pq1.add("Chandrakant");
        pq1.add("Bhosale");

        System.out.println(pq1);

        // The poll() method is also used to remove the head and return it.
        Queue<String> pq2 = new PriorityQueue<>();
        pq2.add("Welcome");
        pq2.add("In");
        pq2.add("Pune");

        System.out.println("Initial Queue : " +pq2);

        pq2.remove("In");

        System.out.println("After Remove : " + pq2);

        System.out.println("Poll Remove : " + pq2.poll());

        System.out.println("Final Queue : " + pq2);

        // Iterating the Queue

        Queue<String> pq3 = new PriorityQueue<>();

        pq3.add("Pune");
        pq3.add("Mumbai");
        pq3.add("Banglore");
        pq3.add("Chennai");

        Iterator iterator = pq3.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next()+ " ");
        }
    }
}
