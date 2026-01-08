
package com.flinkedlist;

class NodeMain {
    int data;
    NodeMain next;

    NodeMain(int new_data) {
        this.data = new_data;
        this.next = null;
    }
}

public class TraverseLinkedList {

    public static void traverseList(NodeMain head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null)
                System.out.print(" --> ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeMain head = new NodeMain(101);
        head.next = new NodeMain(102);
        head.next.next = new NodeMain(103);
        head.next.next.next = new NodeMain(104);
        head.next.next.next.next = new NodeMain(105);

        traverseList(head);
    }
}
