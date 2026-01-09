
package com.glinkedlistadvanced;

public class RotateLinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node rotate(Node head, int k) {
        if (head == null || k == 0)
            return head;

        Node current = head;
        int length = 1;
        while (current.next != null) {
            current = current.next;
            length++;
        }
        k = k % length;

        if (k == 0)
            return head;

        current.next = head;

        for (int i = 0; i < length - k; i++) {
            current = current.next;
        }
        head = current.next;
        current.next = null;

        return head;
    }

    public static void printist(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);
        head.next.next.next.next = new Node(50);

        System.out.println("Orignal List : ");
        printist(head);

        int k = 2;
        head = rotate(head, k);

        System.out.println("Rotate List : ");
        printist(head);
    }
}
