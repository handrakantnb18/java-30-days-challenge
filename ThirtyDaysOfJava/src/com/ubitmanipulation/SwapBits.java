package com.ubitmanipulation;

public class SwapBits {
    static int swapBits(int x, int p1, int p2, int n){
        int shift1, shift2, value1, value2;
        while (n > 0) {
            shift1 = 1 << p1;

            shift2 = 1 << p2;

            value1 = (x & shift1);
            value2 = (x & shift2);

            if ((value1 == 0 && value2 != 0) ||
            (value2 == 0 && value1 != 0)) {

                if (value1 != 0) {
                    x = x & (~shift1);

                    x = x | shift2;
                }
                else {
                    x = x & (~shift2);

                    x = x | shift1;
                }
            }
            p1++;
            p2++;
            n--;
        }
        return x;
    }
    public static void main(String[] args) {
        int res = swapBits(28, 0, 3, 2);
        System.out.println(res);
    }
}
