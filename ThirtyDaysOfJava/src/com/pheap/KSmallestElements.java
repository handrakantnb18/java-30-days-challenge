package com.pheap;

import java.util.ArrayList;

public class KSmallestElements {

    static int partition(int[] arr, int left, int right)
    {
        int pivot = arr[right];
        int i = left;

        for (int j = left; j < right; j++) {
            if (arr[j] <= pivot) {
                int temp = arr[i];
                arr[i] =arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[right];
        arr[right] =temp;

        return i;
    }

    static void quickSelect(int[] arr, int left, int right, int k) {
        if (left <= right) {
            int pivotIdx = partition(arr, left, right);

            int leftCnt = pivotIdx - left + 1;

            if (leftCnt == k)
                return;

            if (leftCnt > k)
                quickSelect(arr, left, pivotIdx - 1, k);

            else
                quickSelect(arr, pivotIdx + 1, right, k - leftCnt);
        }
    }

    static ArrayList<Integer> KSmallest(int[] arr, int k) {
        quickSelect(arr, 0, arr.length - 1, k);

        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < k; i++)
            res.add(arr[i]);

        return res;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 23, 12, 9, 30, 2, 50};
        int k = 3;

        ArrayList<Integer> res = KSmallest(arr, k);

        for (int ele  :res)
            System.out.println(ele+ " ");
    }
}
