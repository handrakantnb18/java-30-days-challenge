
package com.flinkedlist;

class NodeEnd {
    int data;
    NodeEnd next;

    NodeEnd(int x) {
        data = x;
        next = null;
    }
}

public class InsertatEnd {

    static NodeEnd insertAtFornt(NodeEnd head, int x){
        NodeEnd newNode = new NodeEnd(x);
        if (head == null) {
            return newNode;
        }

        NodeEnd last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = newNode;

        return head;
    }

    static void printList(NodeEnd head) {
        NodeEnd curr = head;

        while (curr != null) {
            System.out.print(curr.data);
            if (curr.next != null) {
                System.out.print(" -> ");
            }
            curr = curr.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        NodeEnd head = new NodeEnd(101);
        head.next = new NodeEnd(201);
        head.next.next = new NodeEnd(301);
        head.next.next.next = new NodeEnd(401);
        head.next.next.next.next = new NodeEnd(501);

        head = insertAtFornt(head, 6);

        printList(head);

//        String str1 = "Chandrakant ";
//        String str2 = "Priyanka ";
//
//        char[] chars = new char[str1.length() + str2.length()];
//        for (int i = 0; i < str2.length(); i++)
//        {
//            chars[i] = str2.charAt(i);
//        }
//        for (int i = str2.length(); i < chars.length; i++) {
//            chars[i] = str1.charAt(i - str2.length());
//        }
//        System.out.println("String after inserting : " + new String(chars));
    }
}
