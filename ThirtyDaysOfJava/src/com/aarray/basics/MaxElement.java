package com.aarray.basics;

import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int [] arr = {5, 95, 200, 2, 78, 99};

        System.out.println("Origanal Elements : " + Arrays.toString(arr));

        int max = Arrays.stream(arr).max().getAsInt();

        System.out.println("Maximum Element : "+ max);
    }
}
