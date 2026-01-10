package com.hstack;

class LinkedStack<T> {
    private class Node {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }

        public String toString() {
            return data.toString();
        }
    }

    private Node top;
    public boolean isEmpty() {
        return top == null;
    }
    public void push(T ele) {
        top = new Node(ele, top);
    }

    public T pop() {
        if (top == null)
            return null;
        else {
            T elelemnt = top.data;
            top = top.next;

            return elelemnt;
        }
    }
    public T peek() {
        return top.data;
    }
    public int size()
    {
        int count = 0;
        Node temp = top;

        while (temp != null) {
            count += 1;
            temp = temp.next;
        }
        return count;
    }
    public void display()
    {
        System.out.println("The eleements of the stack are : ");

        Node temp = top;
        while (temp != null) {
            System.out.println(temp.data + "-> ");
            temp =temp.next;
        }
        System.out.println("Null.. ");

        System.out.println();
    }
}

public class ImplementStackUsingLinkedList {

    public static void main(String[] args) {
        LinkedStack<Double> ls = new LinkedStack<>();

        ls.push(15.0);
        ls.push(25.0);

        ls.display();

        ls.push(35.00);
        ls.push(45.00);

        System.out.println("After Pushing : ");

        ls.display();
        ls.pop();
        ls.pop();

        System.out.println("After pop() operations");
        ls.display();

        System.out.println("Current Topmost elelemnt of stack : " +ls.peek());

        System.out.println("Current size of the stack : " +ls.size());

        System.out.println();

        LinkedStack<String> lss = new LinkedStack<>();
        lss.push("chandraaknt");
        lss.push("Priyanka");
        lss.push("Bhosale");

        lss.display();
        lss.pop();
        System.out.println("After pop() operation ");

        lss.display();

        System.out.println("Current Topmost element of stack : "+lss.peek());

        System.out.println("current size of the stack : " +lss.size());
    }
}
