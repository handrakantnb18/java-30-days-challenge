package com.zacmockinterviewcoding;

public class maxSum {

    // Maximum Sum of a Subarray with K Elements
    static int maxSumcheck(int arr[], int n, int k) {
        int max_sum = Integer.MIN_VALUE;

        for (int i = 0; i < n - k + 1; i++)
        {
            int current_sum = 0;
            for (int j = 0; j < k; j++)
                current_sum = current_sum + arr[i + j];

            max_sum = Math.max(current_sum, max_sum);
        }
        return max_sum;
    }

    // Using the Sliding Window Technique - O(n) Time and O(1) Space
    static int maxSumCheck1(int arr1[], int n1, int k1) {
        if (n1 <= k1) {
            System.out.println("Invalid");
            return -1;
        }

        int max_sum1 = 0;
        for (int i = 0; i < k1; i++)
            max_sum1 += arr1[i];

        int window_sum = max_sum1;
        for (int i = k1; i < n1; i++){
            window_sum += arr1[i] - arr1[i - k1];
            max_sum1 = Math.max(max_sum1, window_sum);
        }
        return max_sum1;
    }

    public static void main(String[] args) {
        // Maximum Sum of a Subarray with K Elements
        int arr[] = { 5, 2, -1, 0, 3 };
        int k = 3;
        int n = arr.length;
        System.out.println(maxSumcheck(arr, n, k));

        // Using the Sliding Window Technique - O(n) Time and O(1) Space
        int arr1[] = { 5, 2, -1, 0, 3 };
        int k1 = 3;
        int n1 = arr1.length;
        System.out.println(maxSumCheck1(arr1, n1, k1));
    }
}
