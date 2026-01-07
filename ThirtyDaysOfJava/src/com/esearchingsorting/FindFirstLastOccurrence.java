
package com.esearchingsorting;

import java.util.ArrayList;

public class FindFirstLastOccurrence {

    static ArrayList<Integer> find (int[] arr, int x) {
        int n = arr.length;

        int first = -1, last = -1;

        for (int i = 0; i < n; i++) {
            if (x != arr[i])
                continue;

            if (first == -1)
                first = i;

            last = i;
        }

        ArrayList<Integer> res = new ArrayList<>();
        res.add(first);
        res.add(last);
        return res;
    }
    public static void main(String[] args) {
        int[] arr = {1, 55, 55, 88, 5, 88, 77, 77, 77, 4, 4, 4};
        int x = 55;
        ArrayList<Integer> res = find(arr, x);
        System.out.println(res.get(0) + " " + res.get(1));
    }
}

