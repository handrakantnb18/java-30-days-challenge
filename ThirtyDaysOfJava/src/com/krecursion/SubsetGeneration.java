package com.krecursion;

import java.util.ArrayList;

public class SubsetGeneration {
    static void subsetRecur(int i, int[] arr,
                            ArrayList<ArrayList<Integer>> res, ArrayList<Integer> subset) {
        if (i == arr.length) {
            res.add(new ArrayList<>(subset));
            return;
        }

        subset.add(arr[i]);
        subsetRecur(i + 1, arr, res, subset);

        subset.remove(subset.size() - 1);
        subsetRecur(i + 1, arr, res, subset);
    }

    static ArrayList<ArrayList<Integer>> subsets(int[] arr) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        ArrayList<Integer> subset = new ArrayList<>();

        subsetRecur(0, arr, res, subset);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        ArrayList<ArrayList<Integer>> res = subsets(arr);

        for (ArrayList<Integer> subset : res) {
            System.out.print("[");
            for (int i = 0; i < subset.size(); i++) {
                System.out.print(subset.get(i));

                if (i != subset.size() - 1)
                    System.out.print(" , ");
            }
            System.out.println("]");
        }
    }
}
