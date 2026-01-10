package com.hstack;

import java.util.ArrayList;

class stack<T> {
    ArrayList<T> A;

    int top = -1;
    int size;

    stack(int size) {
        this.size = size;

        this.A =new ArrayList<T>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack overflow....");
        }
        else {
            top = top + 1;

            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }
    T top() {
        if (top == -1) {
            System.out.println("Stack Overflow...");
            return null;
        }
        else
            return A.get(top);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow...");
        } else
            top--;
    }

    boolean empty()
    {
        return top == -1;
    }

    public String toString()
    {
        String Ans = " ";

        for (int i =0; i < top; i++) {
            Ans += String.valueOf(A.get(i)) + " -- ";
        }
        Ans += String.valueOf(A.get(top));

        return Ans;
    }
}

public class ImplementStackUsingArray {

    public static void main(String[] args) {
        stack<Integer> s1 = new stack<>(3);

        s1.push(23);
        s1.push(20);
        s1.push(50);

        System.out.println("s1 after pushing 23, 20, 50 : \n" + s1);

        s1.pop();

        System.out.println("s1 after pop : \n" + s1);

        stack<String> s2 = new stack<>(3);

        s2.push("chandrakant");
        s2.push("Priyanka");
        s2.push("Vijay");

        System.out.println("\ns2 after pushing 3 lelements : \n " + s2);

        System.out.println("s2 after pushing 4th elements : ");

        s2.push("Bhosale");

        stack<Float> s3 = new stack<>(3);

        s3.push(20.0f);
        s3.push(30.0f);
        s3.push(40.0f);

        System.out.println("\n s3 after pushing 2 element : \n" +s3);
        System.out.println("top eleements of s3 : \n" + s3.top());
    }

}
