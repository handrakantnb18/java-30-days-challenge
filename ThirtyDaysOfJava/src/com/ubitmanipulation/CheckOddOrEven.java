package com.ubitmanipulation;

public class CheckOddOrEven {

    static String checkOddEven(int num4) {
        if (num4 == 0)
            return "Zero";
        return ((num4 & 1) == 0) ? "Even" : "Odd";
    }
    public static void main(String[] args) {
        int num = 10;

        if (num % 2 == 0) {
            System.out.println("Number is Even.");
        }
        else {
            System.out.println("Number is Odd");
        }

        int num2 = 99;

        if ((num2 | 1) > num2 ) {
            System.out.println("Number is Even.");
        }
        else {
            System.out.println("Number is Odd.");
        }

        int num3 = 90;

        if ((num3 & 1) == 1) {
            System.out.println("Number is Odd");
        }
        else {
            System.out.println("Number is Even.");
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println(i+ " : " + checkOddEven(i));
        }
    }
}
