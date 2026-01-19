package com.qdynamicprogrammingbasics;

import java.util.Arrays;

public class ClimbingStairs {
    static  int countWayRec(int n, int[] memo) {

        if (n == 0 || n == 1)
            return 1;

        if (memo[n] != -1)
            return memo[n];

        return memo[n] = countWayRec(n - 1, memo) + countWayRec(n - 2, memo);
    }

    static int countWays(int n) {
        int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return countWayRec(n, memo);
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(countWays(n));
    }
}
