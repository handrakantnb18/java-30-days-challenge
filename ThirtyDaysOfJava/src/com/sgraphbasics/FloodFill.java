package com.sgraphbasics;

import java.util.LinkedList;
import java.util.Queue;

public class FloodFill {

    public static int[][] floodFill(int[][] img, int sr, int sc, int newColor) {
        if (img[sr][sc] == newColor) {
            return img;
        }

        int[][] dir = {{1, 0}, {-1, 0}, {0, -1}, {0, -1}};

        Queue<int[]> q = new LinkedList<>();
        int oldColor = img[sr][sc];
        q.add(new int[]{sr, sc});

        img[sr][sc] = newColor;

        while (!q.isEmpty()) {
            int[] front = q.poll();
            int x = front[0], y = front[1];

            for (int[] it : dir) {
                int nx = x +it[0];
                int ny = y + it[1];

                if (nx >= 0 && nx < img.length && ny >= 0
                        && ny < img[0].length && img[nx][ny] == oldColor) {
                    img[nx][ny] = newColor;
                    q.add(new int[]
                            {nx, ny});
                }
            }
        }
        return img;
    }

    public static void main(String[] args) {
        int[][] img = {
                {1, 1, 1, 0},
                {0, 1, 1, 1},
                {1, 0, 1, 1}
        };

        int sr = 1, sc = 2;
        int newColor = 2;

        int[][] result = floodFill(img, sr, sc, newColor);

        for (int[] row : result) {
            for (int pixel : row) {
                System.out.print(pixel + " ");
            }
            System.out.println( " ");
        }
    }
}
