package com.vmathnumberproblems;

public class Factorial {

    static int factorial(int n) {
        int res =  1, i;

        for (i = 2; i <= n; i++)
            res*= i;
        return res;
    }

    static int facto(int m) {
        if (m == 0)
            return 1;

        return m * facto(m - 1);
    }

    int fac(int o) {
        return (o == 1 || o == 0) ? 1 : o * fac(o - 1);

    }

    public static void main(String[] args) {
        int num = 5;
        System.out.println("Factorial of "+ num + " is " + factorial(5));

        int num1 = 7;
        System.out.println("Factorial of "+ num1 + " is "+facto(7));

        Factorial obj = new Factorial();
        int num2 = 8;
        System.out.println("Factorial is " +num2 + " is "+obj.fac(num2));


    }
}
