package com.ydesignproblems;

import java.util.ArrayList;

public class Zalgorithm {

    static ArrayList<Integer> zFunction(String s) {
        int n = s.length();

        ArrayList<Integer> z = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            z.add(0);
        }
        int l = 0, r = 0;

        for (int i = 1; i < n; i++) {
            if (i <= r) {
                int k = i -1;

                z.set(i, Math.min(r - i + 1, z.get(k)));
            }

            while (i + z.get(i) < n &&
            s.charAt(z.get(i)) == s.charAt(i + z.get(i))){
                z.set(i, z.get(i) + 1);
            }
            if (i + z.get(i) - 1 > r) {
                l = i;
                r = i + z.get(i) - 1;
            }

        }

        return z;
    }

    static ArrayList<Integer> search(String text, String pattern) {
        String s = pattern + '$' + text;
        ArrayList<Integer> z = zFunction(s);
        ArrayList<Integer> pos = new ArrayList<>();
        int m = pattern.length();

        for (int i = m + 1; i < z.size(); i++) {
            if (z.get(i) == m) {
                pos.add(i - m - 1);
            }
        }
            return pos;
    }

    public static void main(String[] args) {

        String text = "aabxaabxaa";
        String pattern = "aab";

        ArrayList<Integer> matches = search(text, pattern);

        for (int pos : matches)
            System.out.println(pos + " ");
    }
}
