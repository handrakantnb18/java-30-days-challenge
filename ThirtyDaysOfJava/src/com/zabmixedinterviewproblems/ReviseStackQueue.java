package com.zabmixedinterviewproblems;

public class ReviseStackQueue {
    private int maxSize;
    private int[] stackArray;
    private int top;

    public ReviseStackQueue(int size) {
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public void push(int value) {
        if (top == maxSize - 1) {
            System.out.println("Stack overflow.");
            return;
        }

        stackArray[++top] = value;
        System.out.println(value+ " Pushed into the stack.");
    }

    public int pop() {
        if (top == -1) {
            System.out.println("Stack overflow");
            return -1;
        }
        int poppedElement = stackArray[top--];
        System.out.println(poppedElement+ " Popped from the stack ");
        return poppedElement;
    }

    public int top() {
        if (top == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return (top == -1);
    }

    public static void main(String[] args) {
        ReviseStackQueue stack = new ReviseStackQueue(5);

        stack.push(10);
        stack.push(20);

        System.out.println("Top element of the stack : " +stack.top());

        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println("Is stack is empty? "+stack.isEmpty());
    }
}
