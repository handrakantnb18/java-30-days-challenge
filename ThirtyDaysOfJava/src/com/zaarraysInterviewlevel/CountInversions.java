package com.zaarraysInterviewlevel;

import java.util.Arrays;

public class CountInversions {

    // Java program to count inversions
    static int arr[] = new int[] {1, 20, 6, 4, 5};

    static int getInvCount(int n) {
        int inv_count1 = 0;
        for (int i = 0; i < n- 1; i++) {
            for (int j = i + 1; j < n; j++)
                if (arr[i] > arr[j])
                    inv_count1++;

        }
        return inv_count1;
    }

    // Function to count the number of inversions

    private static int mergeandCount(int[] arr1, int l, int m, int r)
    {
        int[] left = Arrays.copyOfRange(arr1, l, m + 1);

        int[] right = Arrays.copyOfRange(arr1, m + 1, r + 1);

        int i = 0, j = 0, k = l, swaps = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j])
                arr[k++] = left[i++];

            else {
                arr[k++] = right[j++];
                swaps += (m + 1) - (l + i);
            }
        }

        while (i < left.length)
            arr1[k++] = left[i++];
        while (j < right.length)
            arr1[k++] = right[j++];
        return swaps;
    }

    private static int mergesortCount(int[] arr1, int l, int r) {
        int count = 0;

        if (l < r) {
            int m = (l + r) / 2;

            count += mergesortCount(arr1, l, m);
            count += mergesortCount(arr1, m + 1, r);
            count += mergeandCount(arr1, l, m, r);

        }
        return count;
    }
    public static void main(String[] args) {
        // Java program to count inversions
        System.out.println("Number of inversions are " + getInvCount(arr.length));

        // Function to count the number of inversions
        int[] arr1 = {1, 20, 6, 4, 5};
        System.out.println(mergesortCount(arr1, 0, arr.length - 1));

    }
}
