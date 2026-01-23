package com.ubitmanipulation;

public class FindSingleNumber {
    public static int missingNum(int[] arr) {
        int n = arr.length + 1;
        int m1 = 0, m2 = 0;

        for (int i = 0; i < n - 1; i++) {
            m2 ^= arr[i];
        }

        for (int i = 1; i <= n; i++) {
            m1 ^= i;
        }
        return m1 ^ m2;
    }
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 7, 1};
        int res = missingNum(arr);
        System.out.println(res);

    }
}
