
package com.flinkedlist;


class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}

public class InsertatBeginning {

    static Node insertAtFornt(Node head, int x){
        Node newNode = new Node(x);
        newNode.next = head;
        return newNode;
    }

    static void printList(Node head) {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(101);
        head.next = new Node(201);
        head.next.next = new Node(301);
        head.next.next.next = new Node(401);
        head.next.next.next.next = new Node(501);

        int x = 2;
        head = insertAtFornt(head, x);

        printList(head);
//        String str1 = "Chandrakant ";
//        String str2 = "Priyanka ";
//
//        char[] chars = new char[str1.length() + str2.length()];
//        for (int i = 0; i < str2.length(); i++)
//        {
//            chars[i] = str2.charAt(i);
//        }
//        for (int i = str2.length(); i < chars.length; i++) {
//            chars[i] = str1.charAt(i - str2.length());
//        }
//        System.out.println("String after inserting : " + new String(chars));
    }
}
