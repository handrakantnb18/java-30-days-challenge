package com.zabmixedinterviewproblems;

import java.util.LinkedList;

public class ReviseLinkedList {
    public static void main(String[] args) {

        // Assuming you have gone through LinkedList in java and know about linked list
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Chandrakant");
        linkedList.add("Priyanka");
        linkedList.add("Bhosale");

        System.out.println("Elements before reversing : "+linkedList);

        linkedList = reversalLinkedList(linkedList);
        System.out.println("Element after reversing : "+linkedList);
    }

    public static LinkedList<String>
    reversalLinkedList(LinkedList<String> llist) {
        LinkedList<String> revLinkedList = new LinkedList<String>();

        for (int i = llist.size() - 1; i >= 0; i--) {
            revLinkedList.add(llist.get(i));
        }
        return revLinkedList;


    }

}
