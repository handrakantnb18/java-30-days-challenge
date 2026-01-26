package com.xjava8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamFilter {
    public static void main(String[] args) {

        // filter() method with the operation of filtering out the elements divisible by 5.

        List<Integer> list = Arrays.asList(4, 5, 6, 7, 8, 9, 10, 12, 13, 14, 50, 20);

        list.stream()
                .filter(num -> num % 5 == 0)
                .forEach(System.out::println);

        // filter() method with the operation of picking the elements with an upperCase letter at index 1.
        Stream<String> stream1 = Stream.of("Chandrakant", "Priyanka", "Welcome", "in", "Software Development");

        stream1.filter(
                str -> Character.isUpperCase(str.charAt(1)))
                .forEach(System.out::println);


        // filter() method with the operation picking the elements ending with custom alphabetically letter

        Stream<String> stream2 = Stream.of(
                "ABC", "DEF", "XYZ"
        );

        stream2.filter(
                str1 -> str1.endsWith("Z"))
                .forEach(System.out::println);

    }
}
