package com.ubitmanipulation;

public class PowerOfTwo {
    public static void main(String[] args) {
        double a = 50;
        double b = 2;
        double result;
        System.out.println(Math.pow(a, b));

        result = Math.pow(2, b);
        System.out.println(result);

        a = 3;
        b = 4;
        System.out.println(Math.pow(a, b));
        result = Math.pow(1254, 0);
        System.out.println(result);

        a = 2.5;
        b = 6.9;
        System.out.println(Math.pow(a, b));
        result = Math.pow(5, 1);
        System.out.println(result);
    }
}
