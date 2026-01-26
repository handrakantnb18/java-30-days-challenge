package com.xjava8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;

public class ReduceExample {
    public static void main(String[] args) {

        // Get the Longest String
        List<String> list = Arrays.asList(
                "ABC", "Chandrakant", "Bhosale", "Priyanka", "Ram"
        );

        Optional<String> longString = list.stream()
                .reduce((word1, word2) -> word1.length()
                        > word2.length() ? word1 : word2);

        longString.ifPresent(System.out::println);

        // Combine Strings
        String[] arr = {
                "Chandrakant", "Hello,"," How", "are", "you"
        };

        Optional<String>  combineString = Arrays.stream(arr)
                .reduce((str1 , str2) -> str1 + "-"+ str2);

        combineString.ifPresent(System.out::println);

        // Sum of All Elements

        List<Integer> num = Arrays.asList(11, 12, 28, -07, 88, 99);

        int sum = num.stream()
                .reduce(0, (ele1, ele2) ->  ele1 + ele2);
        System.out.println("Sum of all the elements "+ sum);

        // Product of All Numbers in a Range

        int product = IntStream.range(2, 8)
                .reduce((n1, n2) -> n1 * n2)
                .orElse(-1);
        System.out.println("The product is : "+ product);
    }
}
