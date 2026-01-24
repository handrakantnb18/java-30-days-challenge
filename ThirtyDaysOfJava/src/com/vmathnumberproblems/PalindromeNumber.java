package com.vmathnumberproblems;

public class PalindromeNumber {

    static int reverseNumber(int n) {
        int revered = 0;
        while (n > 0) {
            revered = revered * 10 + n % 10;
            n = n / 10;
        }
        return revered;
    }


    static int recursiveFun(int m, int rev) {
        if (m < 10) {
            return rev * 10 + m;
        }
        else {
            int last_digit = m % 10;
            rev = rev * 10 + last_digit;
            return recursiveFun(m / 10, rev);
        }

    }


    public static void main(String[] args) {
        int n = 123464321;
        int reversedd = reverseNumber(n);

        System.out.println("Reverse of n : " + reversedd);

        if (n == reversedd)
            System.out.println("Paliondrome Number. ");

        else
            System.out.println("Paliondrome not Number. ");


        int m = 12343321;
        int rev = recursiveFun(m , 0);

        System.out.println("Reverse of n = " + rev);

        if (m == rev)
            System.out.println("Palindrome number");
        else
            System.out.println("Not Palindrome number.");
    }
}
