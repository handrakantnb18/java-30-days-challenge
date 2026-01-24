package com.vmathnumberproblems;

public class GCDLCM {

    static int GCD(int u, int v) {
        if (u == 0)
            return v;
        return GCD(v % u, u);
    }

    static int LCM(int u, int v) {
        return (u / GCD(u, v)) * v;
    }

    public static void main(String[] args) {
        int u = 25;
        int v = 15;
        System.out.println("LCM of : " + u + " and "+ v + " is " + LCM(u, v));

        int a = 15;
        int b = 25;

        int ans = (a > b) ? a : b;

        while (true) {
            if (ans % a == 0 && ans % b == 0)
                break;
            ans++;

            System.out.println("LCM of : " + a + " and "+ b + " is " + ans);

        }
    }
}
