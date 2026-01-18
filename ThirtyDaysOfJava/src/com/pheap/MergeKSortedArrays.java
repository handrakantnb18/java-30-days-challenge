package com.pheap;

import java.util.ArrayList;
import java.util.Collections;

public class MergeKSortedArrays {
    static ArrayList<Integer> mergeArrays(int[][] mat) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                res.add(mat[i][j]);
            }
        }
        Collections.sort(res);
        return res;
    }

    public static void main(String[] args) {

        int[][] mat = {
                {1, 3, 5, 7},
                {2, 4, 6, 8},
                {0, 9, 10, 11}
        };

        ArrayList<Integer> res = mergeArrays(mat);
        for (int val : res) {
            System.out.println(val + "  ");
        }

    }
}
