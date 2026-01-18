package com.pheap;

import java.util.ArrayList;
import java.util.PriorityQueue;

public class FindMedianFromStream {

    static ArrayList<Double> getMedian(int[] arr) {
        PriorityQueue<Integer> leftMAxHEap = new PriorityQueue<>((a, b) -> b - a);

        PriorityQueue<Integer> rightMinHeap = new PriorityQueue<>();

        ArrayList<Double> res = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            leftMAxHEap.add(arr[i]);

            int temp = leftMAxHEap.poll();
            rightMinHeap.add(temp);

            if (rightMinHeap.size() > leftMAxHEap.size()) {
                temp = rightMinHeap.poll();
                leftMAxHEap.add(temp);
            }

            double medium;

            if (leftMAxHEap.size() != rightMinHeap.size())
                medium = leftMAxHEap.peek();
            else
                medium = (leftMAxHEap.peek() + rightMinHeap.peek()) / 2.0;
        }
        return res;
    }

    public static void main(String[] args) {

        int[] arr = {5, 15, 1, 3, 2, 8};
        ArrayList<Double> res = getMedian(arr);
        System.out.printf("%.2f", res.get(0));

        for (int i = 1; i < res.size(); i++) {
            System.out.printf(" %.2f", res.get(i));
        }
    }
}
