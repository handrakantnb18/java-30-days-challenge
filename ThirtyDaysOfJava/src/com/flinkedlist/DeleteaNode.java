
package com.flinkedlist;

class NodeDelete {
    int data;
    NodeDelete next;

    public NodeDelete(int data) {
        this.data = data;
        this.next = null;
    }
}
class LinkedList {
    NodeDelete head;
    public void add(int data) {
        NodeDelete newNode = new NodeDelete(data);
        if (head == null) {
            head = newNode;
        } else {
            NodeDelete current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }

    }
    public void NodeDelete(int value) {
        if (head == null) return;

        if (head.data == value) {
            head = head.next;
            return;
        }
        NodeDelete current = head, prev = null;
        while (current != null && current.data != value) {
            prev = current;
            current = current.next;
        }
        if (current == null) return;

        prev.next = current.next;
    }

    public void display() {
        NodeDelete current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
        System.out.println("Null ");
    }
}
public class DeleteaNode {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(201);
        list.add(301);
        list.add(401);
        list.add(501);
        list.add(601);

        System.out.println("Original array : ");
        list.NodeDelete(3);

        System.out.println("Linked List value 3 : ");
        list.display();
    }
}
