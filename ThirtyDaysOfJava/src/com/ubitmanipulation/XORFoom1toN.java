package com.ubitmanipulation;

public class XORFoom1toN {
    static int computerXor(int n) {
        int res = 0;
        for (int i = 1; i <= n; i++) {
            res = res^i;
        }
        return res;
    }

    static int computerSOR(int m) {
        if (m % 4 == 0)
            return m;

        if (m % 4 == 1)
            return 1;

        if (m % 4 == 2)
            return m + 1;

        return 0;
    }

    public static void main(String[] args) {

        int n = 7;
        System.out.println(computerXor(n));

        int m = 5;
        System.out.println(computerSOR(m));
    }
}
