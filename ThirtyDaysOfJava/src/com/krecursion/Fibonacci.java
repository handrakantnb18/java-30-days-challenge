package com.krecursion;

public class Fibonacci {

    static int fibonacci(int N) {
        int n1 = 0, n2 = 1;

        for (int i = 0; i < N; i++) {
            System.out.println(n1 + " ");

            int n3 = n2 + n1;
            n1 = n2;
            n2 = n3;
        }
        return N;
    }
    public static void main(String[] args) {
        int N = 10;
        fibonacci(N);
    }
}
