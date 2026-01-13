package com.iqueue;

import java.util.Stack;

public class QueueUsingStack {
    static class myQueue {
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();

        void enqueue(int x) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            s1.push(x);

            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        void dequeue() {
            if (s1.isEmpty()) {
                return;
            }
            s1.pop();
        }

        int front() {
            if (s1.isEmpty()) {
                return -1;
            }
            return s1.peek();
        }

        int size() {
            return s1.size();
        }
    }

    public static void main(String[] args) {
        myQueue mq = new myQueue();
        mq.enqueue(101);
        mq.enqueue(201);
        mq.enqueue(301);

        System.out.println("Front : " +mq.front());
        System.out.println("Size : " +mq.size());

        mq.dequeue();

        System.out.println("Front : " +mq.front());
        System.out.println("Size : " +mq.size());
    }
}
