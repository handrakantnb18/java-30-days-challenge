package com.iqueue;

import java.util.LinkedList;
import java.util.Queue;

class MyStack {
    Queue<Integer> queue1 = new LinkedList<>();
    Queue<Integer> queue2 = new LinkedList<>();

    public void push(int x) {
        queue2.add(x);

        while (!queue1.isEmpty()) {
            queue2.add(queue1.remove());
        }

        Queue<Integer> t = queue1;
        queue1 = queue2;
        queue2 = t;
    }

    public void pop() {
        if (!queue1.isEmpty()) {
            queue1.remove();
        }
    }

    public int top() {
        return queue1.isEmpty() ? -1 : queue1.peek();
    }

    public int size() {
        return queue1.size();
    }
}

public class StackUsingQueue {
    public static void main(String[] args) {
        MyStack st = new MyStack();
        st.push(10);
        st.push(20);
        st.push(30);

        System.out.println(st.top()); // 30
        st.pop();
        System.out.println(st.top()); // 20
        st.pop();
        System.out.println(st.top()); // 10

        System.out.println(st.size()); // 1
    }
}
