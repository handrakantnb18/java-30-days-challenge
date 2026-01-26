package com.xjava8;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FindDuplicateUsingStreams {

    //Java program to find the duplicate

    public static <T> Set<T>
    findDuplicateStream(Stream<T> stream)
    {
        Set<T> items = new HashSet<>();

        return stream.filter(n -> !items.add(n))
                .collect(Collectors.toSet());
    }

    // Java program to find the duplicate
    // elements in a Stream using Collectors.groupingBy()

    public static <T> Set<T> findDpulicatesStr(Stream<T> stream) {
        return stream.collect(
                        Collectors.groupingBy(Function.identity(),
                                Collectors.counting()))
                .entrySet().stream()
                .filter(m -> m.getValue() > 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toSet());
    }

    // elements in a Stream
    // using Collections.frequency()

    public static <T> Set<T> findDuplicateS(List<T> list) {
        return list.stream()
                .filter(i -> Collections.frequency(list, i) > 1)
                .collect(Collectors.toSet());
    }


    public static void main(String[] args) {
        //Java program to find the duplicate

        Stream<Integer> stream = Stream.of(
                5, 13, 4, 21, 13, 27, 2, 59, 2, 59
        );

        System.out.println(findDuplicateStream(stream));

        Stream<Integer> stream1 = Stream.of(
                5, 5, 22, 56, 82, 82, 78, 98, 78
        );

        System.out.println(findDpulicatesStr(stream1));

        // elements in a Stream
        // using Collections.frequency()

        List<Integer> list = Arrays.asList(
                55, 2, 2, 55, 44, 32, 1, 5, 5
        );

        System.out.println(findDuplicateS(list));
    }
}
