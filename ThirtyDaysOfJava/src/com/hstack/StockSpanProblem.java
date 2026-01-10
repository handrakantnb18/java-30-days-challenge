package com.hstack;

import java.util.Stack;

public class StockSpanProblem {

    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>();

        span[0] = 1;
        stack.push(0);

        for (int i = 1; i < n; i++){
            while (!stack.isEmpty() && prices[i] >= prices[stack.peek()]) {
                stack.pop();
            }
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            stack.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int[] prices = {10, 25, 5, 80, 75, 89, 23, 78, 56};
        int[] spans = calculateSpan(prices);

        System.out.println("Stock prices : ");
        for (int price : prices) {
            System.out.println(price + " ");
        }
        System.out.println("\n Stock Spans : ");
        for (int span : spans) {
            System.out.println(span + " Stock Price: ");
        }
    }
}
