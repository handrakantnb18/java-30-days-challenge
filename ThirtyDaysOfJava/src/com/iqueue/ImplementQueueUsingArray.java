package com.iqueue;

import java.util.*;

class QueueArray {
    private int[] arr;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    public QueueArray(int capacity) {
        this.capacity = capacity;
        arr = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full...");
            return;
        }
        rear = (rear + 1) % capacity;
        arr[rear] =item;
        size++;
    }
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is Empty....");
            return -1;
        }
        int removeItem = arr[front];
        front = (front + 1) % capacity;
        size--;
        return removeItem;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty....");
            return -1;
        }
        return arr[front];
    }

    public boolean isEmpty() {
        return size == 0;
    }
    public boolean isFull() {
        return size == capacity;
    }
}

public class ImplementQueueUsingArray {

    public static void main(String[] args) {
        QueueArray queueArray = new QueueArray(5);
        queueArray.enqueue(100);
        queueArray.enqueue(200);
        queueArray.enqueue(300);
        queueArray.enqueue(600);
        System.out.println("Dequeued item : " +queueArray.dequeue());
        System.out.println("Front item : " +queueArray.peek());
        System.out.println("Is queue empty : "+queueArray.isEmpty());
    }

}
