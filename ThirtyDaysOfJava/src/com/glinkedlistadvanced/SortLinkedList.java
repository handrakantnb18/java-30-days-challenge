
package com.glinkedlistadvanced;

import java.util.LinkedList;

class NodeSortLinkedList {
    int data;
    NodeSortLinkedList next;
    NodeSortLinkedList(int data) {
        this.data = data;
        this.next = null;
    }
}
public class SortLinkedList {

    NodeSortLinkedList head;

    public void addNode(int data) {
        NodeSortLinkedList newNode = new NodeSortLinkedList(data);
        if (head == null){
            head = newNode;
            return;
        }
        NodeSortLinkedList current =head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
    }

    public void sortList() {
        NodeSortLinkedList current = head;
        while (current != null){
            NodeSortLinkedList index = current.next;
            while (index != null) {
                if (current.data > index.data) {
                    int temp = current.data;
                    current.data = index.data;
                    index.data = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

    public void display() {
        NodeSortLinkedList current = head;
        while (current != null) {
            System.out.println(current.data + " ");
            current = current.next;
        }
    }
    public static void main(String[] args) {

        SortLinkedList so = new SortLinkedList();
        so.addNode(9);
        so.addNode(5);
        so.addNode(2);
        so.addNode(4);
        so.addNode(1);

        System.out.println("Orignal List : ");
        so.display();

        so.sortList();

        System.out.println(" Sorted List : ");
        so.display();

//        LinkedList list = new LinkedList<>();
//        list.add(8);
//        list.add(5);
//        list.add(6);
//        list.add(9);
//        list.add(2);
//
//        System.out.println("Orignal list : " + list);
//        list.sort(null);
//
//        System.out.println("Sorted list : " +list);
    }
}
