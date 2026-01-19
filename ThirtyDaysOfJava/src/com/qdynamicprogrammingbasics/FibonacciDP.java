package com.qdynamicprogrammingbasics;

public class FibonacciDP {

    static int fibonecii(int n) {
        if (n <= 1)
            return n;

        return fibonecii(n - 1) + fibonecii(n - 2);
    }
    public static void main(String[] args) {

        int N = 5;

        for (int i = 0; i < N; i++) {
            System.out.println(fibonecii(i) + " ");
        }
    }
}
