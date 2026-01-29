package com.zaarraysInterviewlevel;

public class RotateMatrix {

    // Java Program to Rotate Matrix Elements
    static int r = 4;
    static int c = 4;

   static void rotate_matrix(int p, int q, int matrix[][])
    {
        int rw = 0, cl = 0;
        int prev, cur;

        while (rw < p && cl < q) {

            if (rw + 1 == p || cl + 1 == q)
                break;

             prev = matrix[rw + 1][cl];

              for (int x = cl; x < q; x++) {
                cur = matrix[rw][x];
                matrix[rw][x] = prev;
                prev = cur;
            }
            rw++;

            for (int x = rw; x < p; x++) {
                cur = matrix[x][q - 1];
                matrix[x][q - 1] = prev;
                prev = cur;
            }
            q--;

             if (rw < p) {
                for (int x = q - 1; x >= cl; x--) {
                    cur = matrix[p - 1][x];
                    matrix[p - 1][x] = prev;
                    prev = cur;
                }
            }
            p--;

              if (cl < q) {
                for (int x = p - 1; x >= rw; x--) {
                    cur = matrix[x][cl];
                    matrix[x][cl] = prev;
                    prev = cur;
                }
            }
            cl++;
        }

        for (int x = 0; x < r; x++) {
            for (int y = 0; y < c; y++)
                System.out.print(matrix[x][y] + " ");
            System.out.print("\n");
        }
    }

    public static void main(String[] args)
    {
        int b[][] = { { 5, 6, 7, 8 },
                { 1, 2, 3, 4 },
                { 0, 15, 6, 5 },
                { 3, 1, 2, 12 } };

        // Calling function(Method1) to rotate matrix
        rotate_matrix(r, c, b);
    }
}
