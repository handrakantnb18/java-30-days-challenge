package com.iqueue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseQueueCheck {

    static void ReverseQueueCheck(Queue<Integer> queue) {

        Stack<Integer> st = new Stack<>();

        while (!queue.isEmpty()) {
            st.push(queue.remove());
        }

        while (!st.isEmpty()) {
            queue.add(st.pop());
        }
    }

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.add(5);
        queue.add(10);
        queue.add(15);
        queue.add(20);
        queue.add(25);

        ReverseQueueCheck(queue);

        while (!queue.isEmpty()) {
            System.out.print(queue.remove() + " ");
        }
    }
}
