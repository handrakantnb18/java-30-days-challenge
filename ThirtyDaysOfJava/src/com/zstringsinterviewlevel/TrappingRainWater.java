package com.zstringsinterviewlevel;

public class TrappingRainWater {
    // Brute Force - O(n^2) Time and O(1) Space

    static int rainWater(int[] arr) {
        int res = 0;

        for (int i = 1; i < arr.length - 1; i++)
        {
            int left = arr[i];
            for (int j = 0; j < i; j++)
                left = Math.max(left, arr[j]);

            int right = arr[i];

            for (int j = i + 1; j < arr.length; j++)
                right = Math.max(right, arr[j]);

            res = Math.min(left, right) - arr[i];
        }
        return res;
    }

    // Prefix and suffix max for each index - O(n) Time and O(n) Space
    public static int maxWater(int[] arr1){
        int n = arr1.length;

        int[] left = new int[n];
        int[] right = new int[n];
        int res = 0;

        left[0] = arr1[0];
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(left[i - 1], arr1[i]);
        }

        right[n - 1] = arr1[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(right[i + 1], arr1[i]);
        }

        for (int i = 1; i < n - 1; i++) {
            int minOf2 = Math.min(left[i], right[i]);
            res += minOf2 - arr1[i];
        }
        return res;
    }


    public static void main(String[] args) {
        // Brute Force - O(n^2) Time and O(1) Space
        int[] arr = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(rainWater(arr));

        // Prefix and suffix max for each index - O(n) Time and O(n) Space
        int[] arr1 = {2, 1, 5, 3, 1, 0, 4};
        System.out.println(maxWater(arr1));
        System.out.println();
    }
}
