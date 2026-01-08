package com.flinkedlist;

import java.util.HashSet;

class NodeDetect {
    int data;
    NodeDetect next;

    NodeDetect(int y) {
        this.data = y;
        this.next = null;
    }
}

public class DetectLoop {

    static boolean detectLoop(NodeDetect head) {
        HashSet<NodeDetect> hashSet = new HashSet<>();

        while (head != null) {
            if (hashSet.contains(head))
                return true;

            hashSet.add(head);

            head = head.next;
        }
        return false;
    }

    public static void main(String[] args) {

        NodeDetect head = new NodeDetect(5);
        head.next = new NodeDetect(6);
        head.next.next = new NodeDetect(7);

        head.next.next.next = head.next;

        if (detectLoop(head))
            System.out.println("True");
        else
            System.out.println("False");
    }
}
