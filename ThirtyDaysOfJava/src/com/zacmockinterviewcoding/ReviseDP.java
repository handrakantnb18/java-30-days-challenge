package com.zacmockinterviewcoding;

import java.util.HashMap;
import java.util.Map;

public class ReviseDP {
    // The Fibonacci sequence is a classic example of dynamic programming.
    public static int fibonacci(int n) {
        if (n <= 1){
            return n;
        }
        return fibonacci(n -1) + fibonacci(n - 2);
    }

    // recursive approach works, it’s inefficient for large values of n due to recalculating sub-problems.
    private static Map<Integer, Integer> memo = new HashMap<>();

    public static int fabonacci1(int m) {
        if (m <= 1) {
            return m;
        }

        if (memo.containsKey(m)) {
            return memo.get(m);
        }
        int result = fabonacci1(m - 1) + fabonacci1(m - 2);
        memo.put(m, result);
        return result;
    }

    // Longest Common Subsequence (LCS)

    public static int lcs(String s1, String s2) {
        int p = s1.length();
        int q = s2.length();
        int[][] dp = new int[p + 1][q + 1];

        for (int i = 1; i <= p; i++) {
            for (int j = 1; j<= q; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] = 1;
                }
                else
                {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }
        return dp[p][q];
    }

    public static void main(String[] args) {
        // The Fibonacci sequence is a classic example of dynamic programming.
        int n = 10;
        System.out.println(fibonacci(n));

        // recursive approach works, it’s inefficient for large values of n due to recalculating sub-problems.
        int m = 15;
        System.out.println(fabonacci1(m));

        // Longest Common Subsequence (LCS)
        String s1 = "AGGTAB";
        String s2 = "GXTXAYB";

        System.out.println("Lenght of LCS : "+lcs(s1, s2));
    }
}
