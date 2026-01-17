package com.obinarysearchtree;

import org.w3c.dom.Node;

public class InsertNode {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public void push(int new_data) {

        Node new_node = new Node(new_data);
        new_node.next = head;

        head = new_node;
    }

    public void insertAfter(Node pre_node, int new_data) {
        if (pre_node == null) {
            System.out.println("The given previous node cannot be null ");
            return;
        }

        Node new_node = new Node(new_data);

        new_node.next = pre_node.next;

        pre_node.next = new_node;
    }

    public void append(int new_data) {
        Node new_node = new Node(new_data);

        if (head == null) {
            head = new Node(new_data);
            return;
        }

        new_node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = new_node;
        return;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null)
        {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        InsertNode list1 = new InsertNode();

        list1.append(6);
        list1.push(7);
        list1.push(1);

        list1.append(4);
        list1.insertAfter(list1.head.next, 8);

        System.out.println("Created Linked list is : ");
        list1.printList();
    }
}
