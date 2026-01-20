package com.rdynamicprogrammingadvanced;

import java.util.Arrays;

public class EditDistance {

    static int editDistRec(String s1, String s2, int m, int n, int[][] memo) {

        if (m == 0)
            return n;

        if (n == 0)
            return m;

        if (memo[m][n] != -1)
            return memo[m][n];

        if (s1.charAt(m - 1) == s2.charAt(n - 1))
            return memo[m][n] = editDistRec(s1, s2, m -1, n - 1, memo);

        return memo[m][n] = 1 + Math.min(
                editDistRec(s1, s2, m, n - 1, memo),
                Math.min(editDistRec(s1, s2, m - 1, n - 1, memo),
                        editDistRec(s1, s2, m - 1, n -1, memo))
        );
    }

    static int editDistance(String s1, String s2) {
        int m = s1.length(), n = s2.length();
        int[][] memo = new int[m + 1][n + 1];
        for (int[] row : memo)
            Arrays.fill(row, -1);
        return editDistRec(s1, s2, m, n, memo);
    }

    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bcfe";
        System.out.println(editDistance(s1, s2));
    }
}
