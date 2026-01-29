package com.zaarraysInterviewlevel;

public class SetMatrixZeroes {

    // Using Two Auxiliary Arrays - O(n*m) Time and O(n+m) Space
    static void setMatrixZeroes(int[][] mat) {
        int n = mat.length, m = mat[0].length;

        boolean[] rows = new boolean[n];
        boolean[] cols = new boolean[m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (mat[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (rows[i] ||  cols[j]) {
                    mat[i][j] = 0;
                }
            }
        }
    }

    // Using First Row and Column - O(n*m) Time and O(1) Space
    static void setMatrixZe(int[][] mat1) {
        int n = mat1.length, m = mat1[0].length;
        int c0 = 1;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (mat1[i][j] == 0) {

                    mat1[i][0] = 0;

                    if (j == 0)
                        c0 = 0;
                    else
                        mat1[0][j] =0;
                }
            }
        }

        for (int i = 1; i < n; i++) {
            for (int j = 1; j< m; j++) {

                if (mat1[i][0] == 0 || mat1[0][j] == 0) {
                    mat1[i][j] = 0;
                }
            }
        }

        if (mat1[0][0] == 0) {
            for (int j = 0; j < m; j++)
                mat1[0][j] = 0;
        }

        if (c0 == 0) {
            for (int i = 0; i < n; i++)
                mat1[i][0] = 0;
        }
    }

    public static void main(String[] args) {

        // Using Two Auxiliary Arrays - O(n*m) Time and O(n+m) Space
        int[][] mat = {
                { 0, 1, 2, 0 },
                { 3, 4, 0, 2 },
                { 1, 3, 1, 5 }
        };

        setMatrixZeroes(mat);

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[0].length; j++) {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println( " \n ");

            // Using First Row and Column - O(n*m) Time and O(1) Space
            int[][] mat1 = {
                    { 0, 1, 2, 0 },
                    { 3, 4, 0, 2 },
                    { 1, 3, 1, 5 }
            };

            setMatrixZe(mat);

            for (int z = 0; z < mat1.length; z++) {
                for (int l = 0; l < mat1[0].length; l++) {
                    System.out.print(mat1[z][l] + " ");
                }
                System.out.println( " ");
            }
        }
    }
}
