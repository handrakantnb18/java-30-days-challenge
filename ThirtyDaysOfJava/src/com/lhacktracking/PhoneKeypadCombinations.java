package com.lhacktracking;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class PhoneKeypadCombinations {
    static String[] possibleWords(int[] arr) {
        String[] mp = {
                "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"
        };

        List<String> result = new ArrayList<>();

        Queue<String> q = new LinkedList<>();
        q.add(" ");

        while (!q.isEmpty()) {
            String prefix = q.poll();

            if (prefix.length() == arr.length) {
                result.add(prefix);
            }
            else {
                int digit = arr[prefix.length()];

                if (digit < 2 || digit > 9) {
                    continue;
                }

                for (char letter : mp[digit].toCharArray()) {
                    q.add(prefix + letter);
                }
            }
        }
        return result.toArray(new String[0]);
    }

    static void printArr(String[] words) {
        for (String word : words) {
            System.out.println(word + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {2, 3};
        String[] words = possibleWords(arr);
        printArr(words);
    }
}
