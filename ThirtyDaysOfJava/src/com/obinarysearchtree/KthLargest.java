package com.obinarysearchtree;

import java.util.PriorityQueue;

public class KthLargest {

    public static int kthLargest(int[] arr, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int val : arr) {
            pq.add(val);
            if (pq.size() > k) {
                pq.poll();
            }
        }
        return pq.peek();
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 7, 19};
        int k =2;
        System.out.println(kthLargest(arr, k));
    }
}
