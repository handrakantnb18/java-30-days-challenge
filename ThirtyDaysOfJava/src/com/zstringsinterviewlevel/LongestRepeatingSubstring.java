package com.zstringsinterviewlevel;

import java.util.Arrays;

public class LongestRepeatingSubstring {

    // Using Brute Force Method - O(n^3) Time and O(n) Space

    static String longestSubstring(String s) {
        int n = s.length();

        String ans = " ";
        int len = 0;

        int i = 0, j = 0;

        while (i < n && j < n) {
            String curr = s.substring(i, j + 1);

            if (s.indexOf(curr, j + 1) != -1 && j - i + 1 > len) {
                len = j - i + 1;
                ans = curr;
            }
            else
                i++;
            j++;
        }
        return len > 0 ? ans : "-1";
    }

    // Using Top-Down DP (Memoization) - O(n^2) Time and O(n^2) Space

    static int findSuffix(int i, int j, String s1, int[][] memo) {
        if (j == s1.length())
            return 0;

        if (memo[i][j] != -1)
            return memo[i][j];

        if (s1.charAt(i) == s1.charAt(j)) {
            memo[i][j] = 1
                    + Math.min(findSuffix(i + 1, j + 1, s1, memo), j - i - 1);
        }
        else {
            memo[i][j] = 0;
        }
        return memo[i][j];
    }

    static String longestSubstr(String s1) {
        int n = s1.length();

        int[][] memo = new int [n][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                findSuffix(i, j, s1, memo);
            }
        }

        String ans = " ";
        int ansLen = 0;

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (memo[i][j] > ansLen) {
                    ansLen = memo[i][j];
                    ans = s1.substring(i, i + ansLen);
                }
            }
        }
        return ansLen > 0 ? ans : "-1";
    }

    public static void main(String[] args) {

        // Using Brute Force Method - O(n^3) Time and O(n) Space

        String s = "Chandrakantbhosale";
        System.out.println(longestSubstring(s));

        // Using Top-Down DP (Memoization) - O(n^2) Time and O(n^2) Space
        String s1 = "Chandrakantbhosale";
        System.out.println(longestSubstr(s1));
    }
}
