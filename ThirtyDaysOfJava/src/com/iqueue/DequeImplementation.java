package com.iqueue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeImplementation {
    public static void main(String[] args) {
        Deque<String> d = new ArrayDeque<>();

        d.addFirst("1");
        d.addFirst("2");

        String f = d.removeFirst();
        String l = d.removeFirst();

        System.out.println("First : " + f + ", Last : " +l);
    }
}
