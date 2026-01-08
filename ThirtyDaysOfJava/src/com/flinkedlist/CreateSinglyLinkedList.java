package com.flinkedlist;

import org.w3c.dom.Node;

public class CreateSinglyLinkedList {

    int data;
    Node Next;

    Node(int data) {
        this.data = data;
        this.next = next;
    }

    private Node head = null;

    public void addNode(int data) {
        Node newNode = new Node(data);
            if (head == null){
                head = newNode;
            }else {
                Node current = head;
                while (current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
    }


    public static void main(String[] args) {

    }
}
