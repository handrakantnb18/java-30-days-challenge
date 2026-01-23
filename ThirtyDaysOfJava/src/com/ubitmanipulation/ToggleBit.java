package com.ubitmanipulation;

public class ToggleBit {

    static int toggleBitsFromLToR(int n, int l, int r) {
        int num = ((1 << r) - 1) ^ ((1 << (l - 1)) - 1);

        return (n ^ num);
    }

    static int toggleBitsFromTORT(int N, int L, int R) {

        int res = N;
        for (int i = L; i <= R; i++) {

            if ((N & (1 << (i - 1))) != 0) {
                res = res ^ (1 << (i - 1));
            }
            else {
                res = res | (1 << (i - 1));
            }
        }
            return res;
    }

    public static void main(String[] args) {

        int n = 50;
        int l = 2;
        int r = 5;
        System.out.println(toggleBitsFromLToR(n, l, r));

        int N = 150;
        int L = 12;
        int R = 15;
        System.out.println(toggleBitsFromTORT(N, L, R));
    }
}
