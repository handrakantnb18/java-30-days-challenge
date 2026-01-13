package com.krecursion;

public class Factorial {
    static int factorial(int n) {
        int res = 1, i;
        for (i = 2; i <= n; i++)
            res *= i;
        return res;
    }
    public static void main(String[] args) {
        int num = 10;
        System.out.println("Factorial of the " + num + " is " + factorial(10));
    }
}
