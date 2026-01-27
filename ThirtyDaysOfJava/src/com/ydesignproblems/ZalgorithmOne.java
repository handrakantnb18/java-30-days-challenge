package com.ydesignproblems;

import java.util.ArrayList;

public class ZalgorithmOne {

    public static ArrayList<Integer> zFunctionOne(String s) {
        int n = s.length();
        ArrayList<Integer> z = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            z.add(0);
        }

        int l = 0, r= 0;

        for (int i = 1; i < n; i++) {
            if (i <= r) {
                int k = i - 1;

                z.set(i, Math.min(r - i + 1, z.get(k)));
            }

            while (i + z.get(i) < n &&
            s.charAt(z.get(i)) == s.charAt(i + z.get(i))) {

                z.set(i, z.get(i) + 1);
            }
        }
        return z;
    }
    public static void main(String[] args) {

        String s = "aabxaab";

        ArrayList<Integer> z = zFunctionOne(s);

        for (int x : z) {
            System.out.println(x + " ");
        }
    }
}
