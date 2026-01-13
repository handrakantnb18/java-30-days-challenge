package com.iqueue;

import java.util.ArrayList;

public class SlidingWindowMaximum {
    static ArrayList<Integer> maxOfSubarray(int[] arr, int k) {
        int n = arr.length;

        ArrayList<Integer> res = new ArrayList<Integer>();

        for (int i = 0; i < n -k; i++) {
            int max = arr[i];
            for (int j = 1; j < k; j++) {
                if (arr[i + j] > max)
                    max = arr[i + j];
            }
            res.add(max);
        }
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        int k = 3;

        ArrayList<Integer> res = maxOfSubarray(arr, k);
        for (int maxVal : res) {
            System.out.println(maxVal + " ");
        }
    }
}
