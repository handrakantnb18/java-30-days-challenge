package com.obinarysearchtree;

public class KthSmallest {

    static int kthSmallest(int[] arr, int k) {
        int maxElement = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > maxElement) {
                maxElement = arr[i];
            }
        }

        int[] freq = new int[maxElement + 1];
        for (int i = 0; i < arr.length; i++) {
            freq[arr[i]]++;
        }

        int count = 0;
        for (int i = 0; i <= maxElement; i++)
        {
            if (freq[i] != 0)
            {
                count += freq[i];
                if (count >= k){
                    return i;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // KthSmallest root = new KthSmallest();
        int[] arr = {10, 5, 4, 3, 48, 6, 2, 33,53, 10};
        int k = 4;
        System.out.println(kthSmallest(arr, k));
    }
}
