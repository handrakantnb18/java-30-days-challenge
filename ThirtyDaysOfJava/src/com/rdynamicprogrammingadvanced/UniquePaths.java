package com.rdynamicprogrammingadvanced;

import java.util.Arrays;

public class UniquePaths {
    static int uniquePathsRecur(int i, int j, int[][] grid, int[][] memo) {
        int r = grid.length, c = grid[0].length;

        if (i == r || j == c) {
            return 0;
        }

        if (grid[i][j] == 1) {
            return 0;
        }

        if (i == r-1 && j == c-1) {
            return 1;
        }

        if (memo[i][j] != -1) {
            return memo[i][j];
        }

        memo[i][j] = uniquePathsRecur(i + 1, j, grid, memo) + uniquePathsRecur(i, j + 1, grid, memo);

        return memo[i][j];
    }

    static int uniquePaths(int[][] grid) {
        int n = grid.length, m = grid[0].length;

        int[][] memo = new int[n][m];

        for (int i = 0; i < n; i++) {
            Arrays.fill(memo[i], -1);
        }
        return uniquePathsRecur(0, 0, grid, memo);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0}
        };
        System.out.println(uniquePaths(grid));
    }
}
