package com.ubitmanipulation;

import java.util.Arrays;

public class FindTwoNonrepeatingNumbers {

    public static int[] singleNum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;

        int[] temp = new int[n];
        int idx = 0;
        int i = 0;

        while (i < n) {
            if (i + 1 < n && arr[i + 1] ==  arr[i]) {
                i += 2;
            }
            else {
                temp[idx++] = arr[i];
                i++;
            }
        }
        int[] result = new int[idx];
        for (int j = 0; j < idx; j++) {
            result[j] = temp[j];
        }
        return result;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 1, 4};
        int[] ans = singleNum(arr);

        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i] + " ");
        }
    }
}
