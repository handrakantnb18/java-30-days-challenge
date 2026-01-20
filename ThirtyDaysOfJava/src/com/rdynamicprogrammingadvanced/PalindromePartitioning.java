package com.rdynamicprogrammingadvanced;

import java.util.Arrays;

public class PalindromePartitioning {
    static boolean isPaliandrome(String s, int i, int j) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    static int palPartitionRec(String s, int i, int j, int[][] memo) {
        if (memo[i][j] != -1)
            return memo[i][j];

        if (i >= j || isPaliandrome(s, i, j))
            return memo[i][j] = 0;

        int res = Integer.MAX_VALUE, cuts;

        for (int k = i; k < j; k++) {
            cuts = 1 + palPartitionRec(s, i, k, memo)
                    + palPartitionRec(s, k + 1, j, memo);
            res = Math.min(res, cuts);
        }
        return memo[i][j] = res;
    }

    static int palPartition(String s) {
        int n = s.length();
        int[][] meme = new int[n][n];

        for (int[] row : meme)
            Arrays.fill(row, -1);

        return palPartitionRec(s, 0, n - 1, meme);
    }
    public static void main(String[] args) {
        String c = "Chandrakant";
        System.out.println(palPartition(c));
    }
}
