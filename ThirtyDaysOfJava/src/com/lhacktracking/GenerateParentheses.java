package com.lhacktracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GenerateParentheses {

    public static List<String> generatorParenthesis(int n) {
        List<String> result = new ArrayList<>();
        if (n < 0) {
            throw new IllegalArgumentException("Number of pairs cannot be negative...");
        }
        backtrack(result, " ", 0, 0, n);
        return result;
    }

    private static void backtrack(List<String> result, String current, int open, int close, int max) {

        if (current.length() == max * 2) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + " )", open, close +1 , max);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Number of pairs of parentheses...");

        try {
            int n = scanner.nextInt();
            if (n < 0) {
                System.out.println("Please enter a non-negative interview...");
                return;
            }

            List<String> combinations = generatorParenthesis(n);
            System.out.println("All valid combination...");

            for (String s : combinations) {
                System.out.println(s);
            }
        }
        catch (Exception e) {
            System.out.println("Invalid input...");
        }
        finally {
            scanner.close();
        }
    }
}
