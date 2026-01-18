package com.pheap;

import java.util.PriorityQueue;

public class PriorityQueueUsage {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();

        pq.add("Chandrakant");
        pq.add("Priyanka");
        pq.add("Vijay");
        pq.add("Ram");

        System.out.println("Initial PriorityQueue : " +pq);

        pq.add("Bhosale");

        System.out.println("After Remove : "+pq);

        System.out.println("Poll Method : "+pq.poll());

        System.out.println("Final PriorityQueue : "+pq);
    }
}
