package com.hstack;

import java.util.Stack;

class StackSpecial {
    Stack<Integer> si = new Stack<>();
    Stack<Integer> si1 = new Stack<>();

    public void push(int a) {
        si.push(a);

        if (si1.isEmpty() || a <= si1.peek()) {
            si1.push(a);
        }
        else {
            si1.push(si1.peek());
        }
    }
    public void pop() {
        if (si.isEmpty()) {
            return;
        }
        si.pop();
        si1.pop();
    }
    public int peek() {
        if (si.isEmpty()) {
            return -1;
        }
        return si.peek();
    }

    public int getMin() {
        if (si1.isEmpty()) {
            return -1;
        }
        return si1.peek();
    }
}
public class MinStack {

    public static void main(String[] args) {
        StackSpecial ss = new StackSpecial();

        ss.push(18);
        ss.push(45);
        ss.push(36);
        ss.push(27);
        ss.push(72);
        ss.push(63);
        ss.push(9);

        System.out.println(ss.getMin());
    }
}
