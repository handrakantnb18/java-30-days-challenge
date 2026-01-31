package com.zacmockinterviewcoding;

import java.util.ArrayList;
import java.util.Arrays;

public class MergerIntervalPattern {

    // Checking All Possible Overlaps – O(n^2) Time and O(n) Space

    static ArrayList<int[]> mergedOverlap(int[][] arr) {
        int n = arr.length;

        Arrays.sort(arr, (a, b) -> Integer.compare(a[0], b[1]));
        ArrayList<int[]> res = new ArrayList<>();

        for (int i= 0; i < n; i++){
            int start = arr[i][0];
            int end = arr[i][1];

            if (!res.isEmpty() && res.get(res.size() - 1)[1] >= end)
            {
                continue;
            }

            for (int j = i; j < n; j++) {
                if (arr[j][0] <= end)
                {
                    end = Math.max(end, arr[j][1]);
                }
            }
            res.add(new int[]{start, end});
        }
        return res;
    }

    // Checking Last Merged Interval – O(n*log(n)) Time and O(n) Space
    static ArrayList<int[]> mergeOver(int[][] arr1) {
    Arrays.sort(arr1, (c, d) -> Integer.compare(c[0], d[1]));

    ArrayList<int[]> res1 = new ArrayList<>();
    res1.add(new int[]{arr1[0][0], arr1[0][1]});

    for (int i = 1; i < arr1.length; i++) {
        int[] last1 = res1.get(res1.size() - 1);
        int[] curr1 = arr1[i];

        if (curr1[0] <= last1[1])
            last1[1] = Math.max(last1[1], curr1[1]);
        else
            res1.add(new int[]{curr1[0], curr1[1]});
    }
    return res1;
    }

    public static void main(String[] args) {
        // Checking All Possible Overlaps – O(n^2) Time and O(n) Space

        int[][] arr = {{7, 8},{1, 5},{2, 4},{4, 6}};
        ArrayList<int[]> res = mergedOverlap(arr);

        for (int[] interval : res){
            System.out.println(interval[0]+" "+ interval[1]);
        }

        //Checking Last Merged Interval – O(n*log(n)) Time and O(n) Space
        int[][] arr1 = {{7, 8}, {1, 5},{2, 4},{4, 6}};
        ArrayList<int[]> res1 = mergeOver(arr1);

        for (int[] interval1 : res1)
            System.out.println(interval1[0]+ " " + interval1[1]);
    }
}
