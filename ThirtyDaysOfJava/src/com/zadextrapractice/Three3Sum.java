package com.zadextrapractice;

public class Three3Sum {
    // Function to add two numbers and check for overflow
    static int addOvf(int a, int b) {
        int sum = a + b;

        if ((a > 0 && b > 0 && sum < 0)
                || (a < 0 && b < 0 && sum > 0)) {
            return -1;
        }
        return sum;
    }

    // Function to add two numbers and check
    static int addOvf1(int c, int d) {

        if (c >= 0 && d >= 0 && (c > Integer.MAX_VALUE - d)) {
            return -1;
        }
        else if (c < 0 && d < 0 && (c < Integer.MIN_VALUE - d)) {
            return -1;
        }
        int result = c + d;
        return result;
    }

    public static void main(String[] args) {
        int a = 100, b = 100;
        System.out.println(addOvf(a, b));

        int c = 100, d = 100;
        System.out.println(addOvf1(c, d));
    }
}
