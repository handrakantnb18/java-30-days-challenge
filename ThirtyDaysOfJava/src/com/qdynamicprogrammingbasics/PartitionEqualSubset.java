package com.qdynamicprogrammingbasics;

import java.util.Arrays;

public class PartitionEqualSubset {
    static boolean isSubsetSum(int n, int[] arr, int sum, int[][] memo) {
        if (sum == 0)
            return true;
        if (n == 0)
            return false;

        if (memo[n - 1][sum] != -1)
            return memo[n - 1][sum] == 1;

        if (arr[n - 1] > sum)
            return isSubsetSum(n - 1, arr, sum, memo);

        memo[n - 1] [sum] = (isSubsetSum(n - 1, arr, sum, memo)
        || isSubsetSum(n -1, arr, sum - arr[n - 1], memo)) ? 1 : 0;
        return memo[n - 1] [sum] == 1;
    }

    static boolean equalPartition(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        if (sum % 2 != 0)
            return false;

        int[][] memo = new int[arr.length][sum + 1];

        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        return isSubsetSum(arr.length, arr, sum / 2, memo);

    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 11, 5};
        if (equalPartition(arr)) {
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}
