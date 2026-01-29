package com.zaarraysInterviewlevel;

import java.util.*;

public class Four4Sum {

    // Generating all quadruplets - O(n^5) Time and O(1) Space
    static ArrayList<ArrayList<Integer>> fourSum(int[] arr, int target) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        int n = arr.length;

        for (int i = 0; i < n; i++){
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    for (int l = k + 1; l < n; l++) {
                        if (arr[i] + arr[j] + arr[k] + arr[l] == target) {
                            ArrayList<Integer> curr = new
                                    ArrayList<>(Arrays.asList(arr[i], arr[j], arr[k], arr[l]));

                            Collections.sort(curr);

                            if (!res.contains(curr)) {
                                res.add(curr);
                            }
                        }
                    }
                }
            }
        }
        return res;
    }

    // Using Hashing - O(n^3) Time and O(n) Space
    static ArrayList<ArrayList<Integer>> fourSum1(int[] arr1, int target1) {
        int n = arr1.length;

        Set<ArrayList<Integer>> resSet = new HashSet<>();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {

                Set<Integer> s = new HashSet<>();
                for (int k = j + 1; k < n; k++) {
                    int sum = arr1[i] + arr1[j] + arr1[k];
                    int last1 = target1 - sum;

                    if (s.contains(last1)) {
                        ArrayList<Integer> curr = new ArrayList<>(
                                Arrays.asList(arr1[i], arr1[j], arr1[k], last1)
                        );

                        Collections.sort(curr);

                        resSet.add(curr);
                    }
                    s.add(arr1[k]);
                }
            }
        }
        return new ArrayList<>(resSet);
    }

    public static void main(String[] args) {
        // Generating all quadruplets - O(n^5) Time and O(1) Space

        int[] arr = {10, 2, 3, 4, 5, 7, 8};
        int target = 23;
        ArrayList<ArrayList<Integer>> ans = fourSum(arr, target);

        for (ArrayList<Integer> v : ans) {
            for (int x : v) {
                System.out.print(x + " ");
            }
            System.out.println(" \n");

            // Using Hashing - O(n^3) Time and O(n) Space
            int[] arr1 = {10, 2, 3, 4, 5, 7, 8};
            int target1 = 23;

            ArrayList<ArrayList<Integer>> ans1 = fourSum1(arr1, target1);
            for (ArrayList<Integer> v1 : ans1) {
                for (int x1 : v1) {
                    System.out.print(x1 + " ");
                }
                System.out.println();
            }

        }
    }
}
