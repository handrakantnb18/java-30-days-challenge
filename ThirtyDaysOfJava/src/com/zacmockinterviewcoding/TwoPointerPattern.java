package com.zacmockinterviewcoding;

import  java.io.*;

public class TwoPointerPattern {

    // Two pointers is really an easy and effective technique which is typically used for searching pairs in a sorted array.
    private static int isPairSum(int A[], int N, int X) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j)
                    continue;

                if (A[i] + A[j] == X)
                    return 1;

                if (A[i] + A[j] > X)
                    break;
            }
        }
        return 0;
    }

    // the two-pointer technique works.
    public static int isPairSum1(int B[], int M, int Y) {
        int k = 0;

        int l = M - 1;

        while (k < l){
            if (B[k] + B[l] == Y)
                return 1;

            else if (B[k] + B[l] < Y)
                k++;

            else
                l--;
        }
        return 0;
    }

    public static void main(String[] args) {
        // Two pointers is really an easy and effective technique which is typically used for searching pairs in a sorted array.
        int arr[] = { 3, 5, 9, 2, 8, 10, 11 };
        int val = 17;

        System.out.println(isPairSum(arr, arr.length, val));

        // the two-pointer technique works.
        int arr1[] = { 3, 5, 9, 2, 8, 10, 11 };

        int val1 = 17;
        int arrSize = arr1.length;
        System.out.println(isPairSum1(arr1, arrSize, val1));
    }
}
