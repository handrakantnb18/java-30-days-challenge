package com.aarray.basics;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        Integer [] arr = {15, 20, 25, 5, 56, 89};

        List<Integer> list = Arrays.asList(arr);

        System.out.println("Origanal Array: " +Arrays.toString(arr));

        Collections.reverse(list);

        System.out.println("Reverse Array : " + Arrays.toString(arr));
    }
}
