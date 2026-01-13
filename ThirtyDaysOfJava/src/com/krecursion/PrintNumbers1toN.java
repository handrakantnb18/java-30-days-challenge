package com.krecursion;

public class PrintNumbers1toN {
    static void printNos(int n) {
        if (n == 0)
            return;

        printNos(n - 1);
        System.out.println(n + " ");
    }
    public static void main(String[] args) {
        int n = 10;
        printNos(n);
    }
}
