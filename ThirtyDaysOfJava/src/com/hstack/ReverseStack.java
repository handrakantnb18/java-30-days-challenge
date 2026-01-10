package com.hstack;

import java.util.*;
public class ReverseStack {

    static  void insertAtBottom(Stack<Integer> st, int x) {
        if (st.isEmpty()) {
            st.push(x);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, x);
        st.push(top);

    }

    static void reverseStack(Stack<Integer> st){
        if (st.isEmpty())
            return;

        int top = st.pop();

        reverseStack(st);
        insertAtBottom(st, top);
    }
    public static void main(String[] args) {
    Stack<Integer> rs = new Stack<>();
    rs.push(1);
    rs.push(2);
    rs.push(3);
    rs.push(4);
    rs.push(5);
    rs.push(6);

    reverseStack(rs);

    while (!rs.isEmpty()) {
        System.out.println(rs.pop() + " ");
    }
    }
}
