package com.qdynamicprogrammingbasics;

import java.util.Arrays;

public class HouseRobber {
    static int maxLootRec(int[] hval, int n, int[] memo)
    {
        if (n <= 0)
            return 0;

        if (n == 1)
            return hval[0];

        if (memo[n] != -1)
            return memo[n];

        int pick = hval[n - 1] + maxLootRec(hval, n - 2, memo);

        int notPck = maxLootRec(hval, n - 1, memo);

        memo[n] = Math.max(pick, notPck);
        return memo[n];
    }

    static int maxLoot(int[] hval) {
            int n = hval.length;

            int[] memo = new int[n + 1];
        Arrays.fill(memo, -1);

        return maxLootRec(hval, n, memo);
    }

    public static void main(String[] args) {
        int[] hval = {6, 7, 1, 3, 8, 2, 4};
        System.out.println(maxLoot(hval));
    }
}
