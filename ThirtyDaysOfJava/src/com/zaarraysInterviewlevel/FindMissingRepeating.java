package com.zaarraysInterviewlevel;

import java.util.ArrayList;

public class FindMissingRepeating {

    // Using Visited Array - O(n) Time and O(n) Space
    static ArrayList<Integer> findMissingReapiting(int[] arr) {
        int n = arr.length;

        int[] freq = new int[n + 1];
        int reapiting = -1;
        int missing = -1;

        for (int i = 0; i < n; i++){
            freq[arr[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (freq[i] == 0)
                missing= i;
            else if (freq[i] == 2)
                reapiting = i;
        }

        ArrayList<Integer> result = new ArrayList<>();
        result.add(reapiting);
        result.add(missing);
        return  result;

    }

    // Using Array Marking - O(n) Time and O(1) Space
    static ArrayList<Integer> findMissingReap(int[] arr1) {
        int n1 = arr1.length;
        int reapiting1 = -1;

        for (int i = 0; i < n1; i++) {
            int val = Math.abs(arr1[i]);

            if (arr1[val - 1] > 0) {
                arr1[val - 1] = -arr1[val - 1];
            }
            else {
                reapiting1 = val;
            }
        }

        int missing1 = -1;

        for (int i = 0; i < n1; i++){
            if (arr1[i] > 0){
                missing1 = i + 1;
                break;
            }
        }

        ArrayList<Integer> result1 = new ArrayList<>();
        result1.add(reapiting1);
        result1.add(missing1);
        return result1;
    }

    // Making Two Math Equations - O(n) Time and O(1) Space
    static ArrayList<Integer> findTwo(int[] arr2) {
        int n = arr2.length;

        int s = (n *(n + 1)) / 2;
        int ssq = (n * (n + 1) * (2 * n + 1)) / 6;

        int missing2 = 0, repeating2 = 0;

        for (int i = 0; i < n; i++) {
            s -= arr2[i];
            ssq -= arr2[i] * arr2[i];
        }

        missing2 = (s + ssq / s) / 2;
        repeating2 = missing2 - s;

        ArrayList<Integer> res2 = new ArrayList<>();
        res2.add(repeating2);
        res2.add(missing2);
        return res2;
    }

    public static void main(String[] args) {
        // Using Visited Array - O(n) Time and O(n) Space

        int[] arr = {3, 1, 3};
        ArrayList<Integer> ans = findMissingReapiting(arr);

        System.out.println(ans.get(0) + " "+ ans.get(1));

        // Using Array Marking - O(n) Time and O(1) Space
        int[] arr1 = {3, 1, 3};
        ArrayList<Integer> ans1 = findMissingReap(arr1);
        System.out.println(ans1.get(0)+ " " +ans1.get(1));

        // Making Two Math Equations - O(n) Time and O(1) Space
        int[] arr2 = {4, 1, 4, 5};
        ArrayList<Integer> ans2 = findTwo(arr2);

        System.out.println(ans2.get(0) + " " + ans2.get(1));
        System.out.println();
    }

}
