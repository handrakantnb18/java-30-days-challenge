package com.ubitmanipulation;

public class CountSetBits {

    static int countSetBits(int n) {
        int cout = 0;
        while (n > 0) {
            cout += n & 1;
            n >>= 1;
        }
        return cout;
    }

    public static int countSetB(int m) {
        if (m == 0)
            return 0;

        else
            return (m & 1) + countSetB(m >> 1);
    }

    public static void main(String[] args) {
        int i = 9;
        int j = 12;
        System.out.println(countSetBits(i));
        System.out.println(countSetB(j));
    }
}
