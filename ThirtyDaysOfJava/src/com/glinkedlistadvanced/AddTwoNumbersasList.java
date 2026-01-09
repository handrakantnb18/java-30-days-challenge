
package com.glinkedlistadvanced;

public class AddTwoNumbersasList {

    static Node head1, head2;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    Node addTowLists(Node first, Node second) {
        Node res = null;
        Node prev = null;
        Node temp = null;
        int carry = 0, sum;

        while (first != null || second != null) {
            sum = carry + (first != null ? first.data : 0) + (second != null ? second.data : 0);

            carry = (sum >= 10) ? 1 : 0;

            sum = sum % 10;

            temp = new Node(sum);

            if (res == null) {
                res = temp;
            }else {
                prev.next = temp;
            }
            prev = temp;

            if (first != null) {
                first = first.next;
            }
            if (second != null){
                second = second.next;
            }
        }
        if (carry > 0) {
            temp.next = new Node(carry);
        }
        return res;
    }
    void printList(Node head1) {
        while (head1 != null) {
            System.out.println(head1.data + " ");
            head1 = head1.next;
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        AddTwoNumbersasList list = new AddTwoNumbersasList();
        list.head1 = new Node(7);
        list.head1.next = new Node(8);
        list.head1.next.next = new Node(9);
        list.head1.next.next.next = new Node(11);

        System.out.println("First List is : ");
        list.printList(head1);

        list.head2 = new Node(2);
        list.head2 = new Node(4);
        System.out.println("Second list is : ");
        list.printList(head2);

        Node re = list.addTowLists(head1, head2);
        System.out.println("Result : ");
        list.printList(re);
    }
}
