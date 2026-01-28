package com.zstringsinterviewlevel;

import java.util.Arrays;

public class WildcardMatching {

    // Using Recursion - O(2(n+m)) Time and O(n) Space
    static boolean wildCardRec(char[] txt, char[] pat, int n, int m) {

        if (m == 0)
            return (n == 0);

        if (n ==0){
            for (int i = 0; i < m; i++)
                if (pat[i] != '*')
                    return false;
            return true;
            }

        if (txt[n-1] == pat[m-1] || pat[m-1] == '?')
            return wildCardRec(txt, pat, n - 1, m - 1);

        if (pat[m - 1] == '*')
            return wildCardRec(txt, pat, n, m - 1) ||
                    wildCardRec(txt, pat, n - 1, m);

        return false;
    }

    static boolean wildCard(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        return wildCardRec(txt.toCharArray(), pat.toCharArray(), n, m);
    }

    // Using Memoization - O(n*m) Time and O(n*m) Space
    static boolean wildCardRec1(char[] txt,char[] pat, int n, int m, int[][] dp) {
        if (m == 0)
            return (n == 0);

        if (dp[n][m] != -1)
            return dp[n][m] == 1;

        if (n == 0){
            for (int i = 0; i < m; i++){
                if (pat[i] != '*') {
                    dp[n][m] = 0;
                    return false;
                }
            }
            dp[n][m] = 1;
            return true;
        }

        if (txt[n-1] == pat[m-1] || pat[m-1] == '?') {
            dp[n][m] = wildCardRec1(txt, pat,n - 1, m - 1, dp) ? 1 : 0;
            return dp[n][m] == 1;
        }

        if (pat[m-1] == '*') {
            dp[n][m] =
                    (wildCardRec1(txt, pat, n, m - 1, dp) ||
                            wildCardRec1(txt, pat, n - 1, m, dp)) ? 1 : 0;
            return dp[n][m] == 1;
        }
        dp[n][m] = 0;
        return false;
    }

    static boolean wildCard1(String txt, String pat) {
        int n = txt.length();
        int m = pat.length();
        int[][] dp = new int[n + 1][m + 1];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return wildCardRec1(txt.toCharArray(),
                pat.toCharArray(), n, m, dp);
    }

    public static void main(String[] args) {

        // Using Recursion - O(2(n+m)) Time and O(n) Space
        String txt = "abcde";
        String pat = "a?b";
        System.out.println(wildCard(txt, pat) ? "true" :  "false");

        // Using Memoization - O(n*m) Time and O(n*m) Space
        String txt1 = "abcde";
        String pat1 = "a?c";
        System.out.println(wildCard1(txt1, pat1) ? "true" : "false");
    }

}
