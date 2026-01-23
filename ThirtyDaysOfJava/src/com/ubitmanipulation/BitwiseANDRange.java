package com.ubitmanipulation;

import java.util.Scanner;

public class BitwiseANDRange {

    public static void main(String[] args) {

        String binary[] = {
                "0000", "0001", "0010","0011","0100","0101",
                "0110","0111","1000","1001","1010",
                "1011","1100","1101","1110","1111"
        };

        int a = 3;
        int b = 6;

        int c = a | b;
        int d = a & b;
        int e = a ^ b;


        int f = (~a & b) | (a & ~b);
        int g = ~a & 0x0f;

        System.out.println(" a = " +binary[a]);
        System.out.println(" b = " +binary[b]);
        System.out.println(" a|b = " +binary[c]);
        System.out.println(" a&b " +binary[d]);
        System.out.println(" a^b " +binary[e]);
        System.out.println(" ~a & b|a&~b= "+binary[f]);

        Scanner input = new Scanner(System.in);

        System.out.println("Enter first Number : ");
        int num1 = input.nextInt();

        System.out.println("Enter Second Number : ");
        int num2 = input.nextInt();

        System.out.println("Bitwize AND : " + (num1 & num2));

        System.out.println("Bitwize or : " + (num1 | num2));

        System.out.println("Bitwise XOR : " + (num1 ^ num2));

        System.out.println("Bitwise NOT : " + (~num1));

        System.out.println("Bitwise Left Shift : " + (num1 << 2));

        System.out.println("Bitwise Right Shift : " + (num1 >> 2));

        System.out.println("Bitwise Unsigned Right Shift : " + (num1 >>> 2));

        input.close();
    }
}
