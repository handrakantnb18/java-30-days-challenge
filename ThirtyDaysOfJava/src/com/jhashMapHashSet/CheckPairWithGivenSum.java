package com.jhashMapHashSet;

import java.util.Arrays;

public class CheckPairWithGivenSum {
    static boolean binarySearch(int[] arr, int left, int right, int target) {
        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target)
                return true;

            if (arr[mid] < target)
                left = mid + 1;
            else
                right = mid + 1;
        }
        return false;
    }

    static boolean twoSum(int[] arr, int target) {
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            int complement = target - arr[i];

            if (binarySearch(arr, i + 1, arr.length - 1, complement));

            return true;
        }
        return false;
    }
    public static void main(String[] args) {

        int[] arr = {0, -1, 2, -3, 1};
        int target = -2;

        if (twoSum(arr, target)) {
            System.out.println("True...");
        }
        else {
            System.out.println("False...");
        }
    }
}
