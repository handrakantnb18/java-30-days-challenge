package com.aarray.basics;

import java.util.Arrays;

public class MinElement {
    public static void main(String[] args) {
        int [] array = {100, 55, 56, 2, 28, 4};

        System.out.println("Original Elements : "+ Arrays.toString(array));

        int min = Arrays.stream(array).min().getAsInt();

        System.out.println("Minimum Number : "+ min);

    }
}
