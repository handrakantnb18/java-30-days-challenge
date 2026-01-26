package com.xjava8;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;

public class ParallelStreams {

    public static void main(String[] args) throws IOException {
        List<Integer> num = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);

        num.parallelStream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);


        // Using the parallelStream() Method

        File file = new File("abc.txt");

        List<String> lines = Files.readAllLines(file.toPath());
        lines.parallelStream()
                .forEach(System.out::println);

    }

}
