package com.zaarraysInterviewlevel;

import java.util.ArrayList;

public class SpiralMatrix {

    //  Using Simulation by Visited Matrix - O(m*n) Time and O(m*n) Space
    static ArrayList<Integer> spiralMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;

        ArrayList<Integer> res = new ArrayList<>();
        boolean[][] vis = new boolean[m][n];

        int[] dr = { 0, 1, 0, -1 };

        int[] dc = { 1, 0, -1, 0 };

        int r = 0, c = 0;
        int idx = 0;

        for (int i = 0; i < m * n; ++i) {
            res.add(mat[r][c]);
            vis[r][c] = true;

            int newR = r + dr[idx];
            int newC = c + dc[idx];

            if (0 <= newR && newR < m && 0 <= newC && newC < n && !vis[newR][newC]) {
                r = newR;
                c = newC;
            }
            else {
                idx = (idx + 1) % 4;

                r += dr[idx];
                c += dc[idx];
            }


        }
        return res;
    }

    // Using Boundary Traversal - O(m*n) Time and O(1) Space
    static ArrayList<Integer> spirallytrav(int[][] mat1) {
        int m1 = mat1.length;
        int n1 = mat1[0].length;

        ArrayList<Integer> res = new ArrayList<>();

        int top = 0, bottom = m1 - 1, left = 0, right = n1 - 1;

        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; ++i) {
                res.add(mat1[top][i]);
            }
            top++;

            for (int i = top; i <= bottom; ++i) {
                res.add(mat1[i][right]);
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i>= left; --i) {
                    res.add(mat1[bottom][i]);
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; --i) {
                    res.add(mat1[i][left]);
                }
                left++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        //  Using Simulation by Visited Matrix - O(m*n) Time and O(m*n) Space
            int[][] mat = {
                    { 1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16 }
            };
            ArrayList<Integer> res = spiralMatrix(mat);

            for (int num : res) {
                System.out.println(num + " ");
            }
            // Using Boundary Traversal - O(m*n) Time and O(1) Space
            int[][] mat1 = {
                    {1, 2, 3, 4 },
                    {5, 6, 7, 8 },
                    {9, 10, 11, 12 },
                    {13, 14, 15, 16 },
                    {17, 18, 19, 20 }
            };

            ArrayList<Integer> res1 = spirallytrav(mat1);
            for (int ele : res1){
                System.out.println(ele+ " ");
                System.out.println();
            }
    }
}
