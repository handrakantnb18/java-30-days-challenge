package com.xjava8;

import java.awt.*;
import java.util.Arrays;
import java.util.List;

// This code demonstrates sorting a stream of Point objects by their x coordinate using Stream.sorted()

class Point {
    Integer x, y;
    Point(Integer x, Integer y) {
        this.x = x;
        this.y = y;
    }
    public String toString() {
        return x + " " +y;
    }
}


public class SortListUsingStreams {

    public static void main(String[] args) {

        // list.stream() converts the list into a stream.

        List<Integer> list = Arrays.asList(-9, -18, 0, 25, 4);

        list.stream().sorted().forEach(System.out::println);

        // This code demonstrates how Stream.sorted() sorts elements of a stream

        List<String> list1 = Arrays.asList(
                "Chandrakant", "Priyanka", "Bhosale", "Sangli", "Pune"
        );

        list1.stream().sorted().forEach(System.out::println);

        // This code demonstrates sorting a stream of Point objects by their x coordinate using Stream.sorted()

        List<Point> list2 = Arrays.asList(
                new Point(10, 20),
                new Point(5, 110),
                new Point(1, 100),
                new Point(50, 2000)
        );

        list2.stream().sorted((p1, p2) ->
                p1.x.compareTo(p2.x))
                .forEach(System.out::println);
    }
}
