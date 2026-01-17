package com.obinarysearchtree;

public class DeleteNode {
    Node head;

    class Node{
        int data;
        Node next;
        Node(int d) {
            data = d;
            next = null;
        }
    }

    void deleteNode(int key) {
        Node temp = head, prev = null;

        if (temp != null && temp.data == key) {
            head = temp.next;
            return;
        }

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null)
            return;

        prev.next = temp.next;
    }

    public void push(int new_data) {
        Node new_node = new Node(new_data);
        new_node.next = head;
        head = new_node;
    }

    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.println(tnode.data + " ");
            tnode = tnode.next;
        }
    }

    public static void main(String[] args) {
        DeleteNode listt = new DeleteNode();
        listt.push(7);
        listt.push(1);;
        listt.push(3);;
        listt.push(2);

        System.out.println("Created lists : " );
        listt.printList();

        listt.deleteNode(1);
        System.out.println("List after delete : ");
        listt.printList();
    }
}
