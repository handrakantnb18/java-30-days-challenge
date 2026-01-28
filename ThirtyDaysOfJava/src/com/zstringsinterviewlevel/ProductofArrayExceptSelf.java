package com.zstringsinterviewlevel;

import java.util.Arrays;

public class ProductofArrayExceptSelf {

    // Using Nested Loops - O(n^2) Time and O(n) Space
    static int[] productExpert(int[] arr){
        int n = arr.length;

        int[] res = new int[n];
        Arrays.fill(res, 1);
        for (int i = 0; i < n; i++)
        {

            for (int j = 0; j < n; j++) {
                if (i != j) {
                    res[i] *= arr[j];
                }
            }
        }
        return res;
    }

    // Using Prefix and Suffix Array - O(n) Time and O(n) Space
    static int[] prductExpertSelf(int[] arr1) {
        int n = arr1.length;
        int[] prefProduct = new int[n];
        int[] suffProduct = new int[n];
        int[] res = new int[n];

        prefProduct[0] = 1;
        for (int i = 1 ; i < n; i++)
            prefProduct[i] = arr1[i - 1] * prefProduct[i - 1];

        suffProduct[n - 1] = 1;
        for (int j = n - 2; j >= 0; j--)
            suffProduct[j] = arr1[j + 1] * suffProduct[j + 1];

        for (int i = 0; i < n; i++)
            res[i] = prefProduct[i] * suffProduct[i];

        return res;
    }

    // Using Product Array - O(n) Time and O(1) Space
        static int[] productEx(int[] arr3) {
        int zeros = 0, ids = -1, prod = 1;
        int n = arr3.length;

        for (int i = 0; i < n; i++) {
            if (arr3[i] == 0) {
                zeros++;
                ids = i;
            }
            else {
                prod *= arr3[i];
            }
        }

        int[] res3 = new int[n];
        Arrays.fill(res3, 0);

        if (zeros == 0) {
            for (int i = 0; i < n; i++)
                res3[i] = prod / arr3[i];
        }
        else if (zeros == 1)
            res3[ids] = prod;

            return  res3;
        }

    public static void main(String[] args) {

        // Using Nested Loops - O(n^2) Time and O(n) Space
        int[] arr = {10, 3, 5, 6, 2};
        int [] res = productExpert(arr);
        for (int val : res) {
            System.out.println(val + " ");
        }

        // Using Prefix and Suffix Array - O(n) Time and O(n) Space
        int[] arr1 = { 10, 3, 5, 6, 2};
        int[] res1 = prductExpertSelf(arr1);

        System.out.println(Arrays.toString(res1));

        // Using Product Array - O(n) Time and O(1) Space
        int[] arr3 = {10, 3, 5, 6, 2};
        int[] res3 = productEx(arr3);

        for (int val : res3)
        System.out.println(val + " ");
        System.out.println();
    }
}
