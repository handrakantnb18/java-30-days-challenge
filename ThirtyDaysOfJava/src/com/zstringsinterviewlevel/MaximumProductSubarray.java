package com.zstringsinterviewlevel;

public class MaximumProductSubarray {

    // The following solution assumes that the given input array always has a positive output.
    static  int min(int x, int y){
        return x < y ? x : y;
    }

    static int max(int x, int y) {
        return x > y ? x :y;
    }

    static int maxSubarrayPro(int arr[]) {
        int n = arr.length;

        int max_ending_here = 1;

        int min_ending_here = 1;

        int max_so_far = 0;
        int flag = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                max_ending_here = max_ending_here * arr[i];

                min_ending_here = min(min_ending_here * arr[i], 1);
                flag = 1;
            }

            else if (arr[i] == 0)
            {
                max_ending_here = 1;
                min_ending_here = 1;
            }
            else {
                int temp = max_ending_here;
                max_ending_here = max(min_ending_here * arr[i], 1);
                min_ending_here = temp * arr[i];
            }

            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
        }

        if (flag == 0 && max_so_far == 0)
            return 0;
        return max_so_far;
    }

    // The idea is to traverse over every contiguous subarrays
    static int maxSubarrayProduct(int arr1[]) {
        int result = arr1[0];
        int n =  arr1.length;

        for (int i = 0; i < n; i++) {
            int mul = arr1[i];

            for (int j = i + 1; j < n; j++) {
                result = Math.max(result, mul);
                mul *= arr1[j];
            }
            result = Math.max(result, mul);
        }
        return result;
    }

    public static void main(String[] args) {

        // The following solution assumes that the given input array always has a positive output.

        int arr[] = { 1, -2, -3, 0, 7, -8, -2};
        System.out.println("Maximum Sub array product is : " +maxSubarrayPro(arr));

        // The idea is to traverse over every contiguous subarrays
        int arr1[] = { 1, -2, -3, 0, 7, -8, -2};
        System.out.println("Maximum Sub array product is "+ maxSubarrayProduct(arr1));

        System.out.println();
    }
}
