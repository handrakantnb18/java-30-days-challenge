package com.vmathnumberproblems;

public class ReverseNumber {

    static int reverse(int n) {
        int rev = 0;
        int rem;

        while (n > 0) {
            rem = n % 10;
            rev = (rev * 10) + rem;
            n = n / 10;
        }
        return rev;
    }

    static  int rev1 = 0;

    static void reverse1(int m) {
        if (m <= 0)
            return;

        int rem1 = m % 10;
        rev1 = (rev1 * 10) + rem1;
        reverse1(m / 10);
    }

    public static void main(String[] args) {
        int n = 4526;

        System.out.println("Reverse Number is : " +reverse(n));

        int m = 12345;
        reverse1(m);
        System.out.println("Reversed Number is : " +rev1);
    }
}
