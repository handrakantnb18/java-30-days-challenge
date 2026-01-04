
package com.barray.intermidiate;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindMissingNumber {
    public static void main(String[] args) {
        int[] array = {0, 2, 4, 5, 6, 7, 10};

        int max = Arrays.stream(array).max().orElse(0);
        int min = Arrays.stream(array).min().orElse(0);

        Set<Integer> set = Arrays.stream(array).boxed().collect(Collectors.toSet());

        List<Integer> missingNumber = IntStream.rangeClosed(min, max)
                .filter(num -> !set.contains(num)).boxed()
                .collect(Collectors.toList());

        System.out.println("Missing Numbers : " +missingNumber);
    }
}
