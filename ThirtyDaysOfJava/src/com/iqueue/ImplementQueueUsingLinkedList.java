package com.iqueue;
//
//class Node {
//    int data;
//    Node next;
//
//    // Constructor
//    public Node(int data) {
//        this.data = data;
//        this.next = null;
//    }
//}
//
//// Queue Class
//class Queue {
//    Node front, rear;
//    int length;
//
//    // Constructor
//    public Queue() {
//        this.front = this.rear = null;
//        this.length=0;
//    }
//
//    // Adding Element in the LinkedList/Queue
//    void enqueue(int key) {
//        this.length++;
//        Node temp = new Node(key);
//
//        if (this.rear == null) {
//            this.front = this.rear = temp;
//            return;
//        }
//
//        this.rear.next = temp;
//        this.rear = temp;
//    }
//
//    // Removing Element from the top
//    void deque() {
//        if (this.front == null)
//            return;
//
//        Node temp = this.front;
//        this.front = this.front.next;
//        this.length--;
//
//        if (this.front == null)
//            this.rear = null;
//
//        temp.next = null;
//    }
//
//
//    // Checking on Front Element
//    int peek() {
//        if (this.front != null)
//            return this.front.data;
//
//        // Return Exception
//        return Integer.MIN_VALUE;
//    }
//
//    // Return the Size of Queue
//    int size(){
//        return this.length;
//    }
//
//    // Printing the Elements of Queue
//    void printQueue(){
//        Node temp=this.front;
//
//        System.out.print("Element of Queue : ");
//
//        while(temp!=null){
//            System.out.print(temp.data+" ");
//            temp=temp.next;
//        }
//        System.out.println();
//    }
//}
//
public class ImplementQueueUsingLinkedList {
    public static void main(String[] args) {
//        Queue q = new Queue();
//        q.enqueue(10);
//        q.enqueue(20);
//
//        q.printQueue();
//        System.out.println("Size :" + q.size());
//        q.deque();
//        q.deque();
//        q.enqueue(30);
//        q.enqueue(40);
//        q.enqueue(50);
//        q.printQueue();
//        System.out.println("Size :" + q.size());
//        System.out.println("Front item is: " + q.peek());
    }
}
