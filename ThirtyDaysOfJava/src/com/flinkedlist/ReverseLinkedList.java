package com.flinkedlist;

import java.util.Collections;
import java.util.LinkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        linkedList.add(6);

        System.out.println("Before Reverse : " +linkedList);
        Collections.reverse(linkedList);

        System.out.println("After Reverse : " + linkedList);
    }
}
