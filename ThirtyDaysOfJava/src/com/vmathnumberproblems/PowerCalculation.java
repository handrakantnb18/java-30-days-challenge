package com.vmathnumberproblems;

public class PowerCalculation {
    static int power(int N, int P) {
        if (P == 0)
            return 1;
        else
            return N * power(N, P - 1);
    }

    static int power1(int A, int B) {
        int pow = 1;
        for (int i = 0; i <= B; i++)
            pow *= A;
        return pow;

    }

    static double power2(int X, int Y) {
        return Math.pow(X, Y);
    }

    public static void main(String[] args) {
        int N = 2;
        int P = 3;
        System.out.println(power(N, P));

        int A = 4;
        int B = 5;
        System.out.println(power1(A, B));

        int X = 3;
        int Y = 4;
        System.out.println(power2(X, Y));

        int base = 2;
        int power3 = 3;
        int ans = 1;

        while (power3 > 0) {
            if ((power3 & 1) == 1) {
                ans = ans * base;
            }
            base = base * base;

            power3 = power3 >> 1;
        }
        System.out.println(ans);
    }
}
