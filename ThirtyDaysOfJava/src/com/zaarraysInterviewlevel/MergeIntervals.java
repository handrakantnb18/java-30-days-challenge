package com.zaarraysInterviewlevel;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeIntervals {

    // Checking All Possible Overlaps – O(n^2) Time and O(n) Space
    static ArrayList<int[]> mergeOverlap(int[][] arr) {
        int n = arr.length;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));
        ArrayList<int[]> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int start = arr[i][0];
            int end = arr[i][1];

            if (!res.isEmpty() && res.get(res.size() - 1)[1] >= end) {
                continue;
            }

            for (int j = i + 1; j < n; j++) {
                if (arr[j][0] <= end) {
                    end = Math.max(end, arr[j][1]);
                }
            }
            res.add(new int[] {start, end});
        }
        return res;
    }

    // Checking Last Merged Interval – O(n*log(n)) Time and O(n) Space
    static  ArrayList<int[]> mergedOverlap1(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[0]));

        ArrayList<int[]> res2 = new ArrayList<>();
        res2.add(new  int[]{
                arr[0][0],
                arr[0][1]
        });

        for (int i= 1; i< arr.length; i++) {
            int[] last = res2.get(res2.size() - 1);
            int[] curr = arr[i];

            if (curr[0] <= last[1])
                last[1] = Math.max(last[1], curr[1]);
            else res2.add(new int[] {
                    curr[0], curr[1]
            });
        }
        return res2;
    }

    public static void main(String[] args) {
        // Checking All Possible Overlaps – O(n^2) Time and O(n) Space

        int[][] arr = {{7, 8},{1, 5},{2, 4},{4, 6}};
        ArrayList<int[]> res = mergeOverlap(arr);

        for (int[] interval : res) {
            System.out.println(interval[0]+ " " + interval[1]);

            // Checking Last Merged Interval – O(n*log(n)) Time and O(n) Space
            int[][] arr2 = {{7, 8}, {1, 5}, {2, 4}, {4, 6}};
            ArrayList<int[]> res1 = mergedOverlap1(arr2);

            for (int[] interval1 : res1)
                System.out.println(interval[0]+ " "+ interval1[1]);
            System.out.println();

        }
    }
}
