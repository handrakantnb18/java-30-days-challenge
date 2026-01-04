package com.barray.intermidiate;

public class MaximumSubarraySum {
    public static int maxSubArraySum(int[] array) {
        int max1 = array[0];
        int maxEnd = array[0];

        for (int i =1; i <array.length; i++) {
            maxEnd = Math.max(array[i], maxEnd + array[i]);
            max1 = Math.max(max1, maxEnd);
        }
        return max1;
    }
    public static void main(String[] args) {
        int[] array = {5, 15, 20, 44, 77, 55};
        System.out.println("Maximum subarray sum : " + maxSubArraySum(array));
    }
}
