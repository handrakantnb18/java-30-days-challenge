package com.pheap;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

public class KLargestElements {

    static ArrayList<Integer> KLargest(int[] arr, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>(k);

        for (int i = 0; i < k; i++) {
            minHeap.add(arr[i]);
        }

        for (int i = k; i < arr.length; i++) {
            if (arr[i] > minHeap.peek()) {
                minHeap.poll();
                minHeap.add(arr[i]);
            }
        }

        ArrayList<Integer> res = new ArrayList<>();

        while (!minHeap.isEmpty()) {
            res.add(minHeap.poll());
        }

        Collections.reverse(res);
        return res;
    }
    public static void main(String[] args) {
    int[] arr = { 1, 13, 12, 9, 30, 2, 50};
    int k = 3;

    ArrayList<Integer> res = KLargest(arr, k);

    for (int ele : res) {
        System.out.println(ele + " ");
    }
    }
}
