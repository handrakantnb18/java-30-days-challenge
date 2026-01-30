package com.zabmixedinterviewproblems;

import java.util.LinkedList;
import java.util.*;

public class ReviseLinkedList1 {
    public static void main(String[] args) {
        // By writing our own function

        LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
        linkedList1.add(new Integer(10));
        linkedList1.add(new Integer(20));
        linkedList1.add(new Integer(30));
        linkedList1.add(new Integer(40));

        System.out.println("Element before reversing : " +linkedList1);
        linkedList1 = reverseLinkedList(linkedList1);
        System.out.println("Element after reversing : "+linkedList1);
    }

    public static LinkedList<Integer> reverseLinkedList(LinkedList<Integer> llist1) {

        for (int i = 0; i < llist1.size() / 2; i++) {
            Integer temp = llist1.get(i);
            llist1.set(i, llist1.get(llist1.size() - i - 1));
            llist1.set(llist1.size() - i - 1, temp);
            System.out.println();
        }
        return llist1;

    }
}
