package com.ydesignproblems;

import java.util.Stack;

public class DesignStack {
    public static void main(String[] args) {

        // Stack class maintains insertion order and allows duplicates and null values.

        Stack<Integer> stack = new Stack<>();

        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

        // With the help of push() method we can add element to the stack.

        Stack stack1 = new Stack();

        Stack<String> stack2 = new Stack<String>();

        stack1.push("5");
        stack1.push("Chandraknt");
        stack1.push("Bhosale");

        stack2.push("6");
        stack2.push("Priyanka");
        stack2.push("Bhosale");

        System.out.println(stack1);
        System.out.println(stack2);

    }
}
