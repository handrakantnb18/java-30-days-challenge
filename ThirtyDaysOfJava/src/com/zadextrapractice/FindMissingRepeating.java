package com.zadextrapractice;

import java.util.ArrayList;

public class FindMissingRepeating {
    static ArrayList<Integer> findTwoElement(int[] arr) {
        int n = arr.length;

        // Expected sum and sum of squares for numbers from 1 to n
        int s = (n * (n + 1)) / 2;
        int ssq = (n * (n + 1) * (2 * n + 1)) / 6;

        int missing = 0, repeating = 0;

        for (int i = 0; i < n; i++) {
            s -= arr[i];
            ssq -= arr[i] * arr[i];
        }

        missing = (s + ssq / s) / 2;
        repeating = missing - s;

        ArrayList<Integer> res = new ArrayList<>();
        res.add(repeating);
        res.add(missing);
        return res;
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findTwoElement(arr);

        System.out.println(ans.get(0) + " " + ans.get(1));
    }
}
