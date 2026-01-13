package com.iqueue;

public class CircularQueue {

    private int maxSize;
    private int[] queryArray;
    private int front;
    private int rear;

    public CircularQueue(int size) {
        maxSize = size;
        queryArray = new int[maxSize];

        front = -1;
        rear = -1;
    }

    public void enqueue(int item) {
        if (isEmpty()) {
            front = 0;
            rear = 0;
            queryArray[rear] =item;
        }
        else {
            rear = (rear + 1) % maxSize;
            if (rear == front) {
                System.out.println("Queue is full. connot enqueue...");

                rear = (rear - 1 + maxSize) % maxSize;
            }
            else  {
                queryArray[rear] = item;
            }
        }
    }

    public int dequeue() {
        int item = -1;

        if (!isEmpty()) {
            item = queryArray[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            }
            else {
                front = (front + 1) % maxSize;
            }
        }
        else {
            System.out.println("Queue is Empty... Cannot dequeue...");
        }
        return item;
    }

    public int peek() {
        if (!isEmpty()) {
            return queryArray[front];
        }
        else {
            System.out.println("Queue is Empty. No peek value...");
            return -1;
        }
    }

    public boolean isEmpty() {
        return front == -1 && rear == -1;
    }

    public static void main(String[] args) {
        CircularQueue cq = new CircularQueue(5);
        cq.enqueue(5);
        cq.enqueue(6);
        cq.enqueue(7);

        System.out.println("Peek :  " +cq.peek());
        System.out.println("Dequeue : "+cq.dequeue());
        System.out.println("Peek after dequeue : "+cq.peek());
    }
}
