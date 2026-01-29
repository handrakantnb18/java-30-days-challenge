package com.zaarraysInterviewlevel;

public class Three3Sum {

    public static void main(String[] args) {
        // This program demonstrates how to use the Integer.sum() method to add two integer values in Java.
        int a = 18;
        int b = 13;
        System.out.println("The sum is : " + Integer.sum(a, b));

        //  Returns an int value which is the sum of the two arguments.
        int c = 1809900018;
        int d = 1819;
        System.out.println("Sum of int : " + Integer.sum(c, d));

        // Java throws a compile-time error before execution.

        int[] arr = { 2, 4, 6, 8, 1, 12, 14, 16, 18};
        int sum = 0;

        for (int i = 0; i < arr.length; i++){
            sum = Integer.sum(sum, arr[i]);
        }
        System.out.println("Sum of the array elements is : "+ sum);
        System.out.println();
    }
}
