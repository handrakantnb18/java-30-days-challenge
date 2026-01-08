package com.flinkedlist;


public class CreateSinglyLinkedList {

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
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

    public void display() {
        Node current = head;
        while (current != null) {
            System.out.println(current.data + " -> ");
            current = current.next;
        }
        System.out.println("Null");
    }

    public static void main(String[] args) {
        CreateSinglyLinkedList list = new CreateSinglyLinkedList();
        list.addNode(101);
        list.addNode(102);
        list.addNode(103);
        list.addNode(104);
    }
}
