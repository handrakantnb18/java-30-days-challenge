package com.xjava8;

import javax.crypto.spec.PSource;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        // Stream map() function with operation of number * 3 on each element of stream.

        System.out.println("The stream after applying." + " the function is : ");

        List<Integer> list = Arrays.asList(3, 6, 9, 12, 15, 18, 21, 24, 27);

        list.stream().map(
                number -> number * 3)
                .forEach(System.out::println);

        // Stream map() function with operation of converting lowercase to uppercase.

        System.out.println("The stream after applying "+ "the function is : ");

        List<String> list1 = Arrays.asList(
                "chan", "dra", "kan","t", "pri","yan","ka"
        );

        List<String> answer = list1.stream()
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println(answer);

        // Stream map() function with operation of mapping string length in place of string.
        System.out.println("The stream after applying " + " the function is: ");

        List<String> list2 = Arrays.asList(
                "Bhosale","Priyanka", "Chandrakant", "Ram", "Vijay"
        );

        list2.stream().map(
                str -> str.length())
                .forEach(System.out::println);
    }
}
