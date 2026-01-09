package com.glinkedlistadvanced;

class NodeFormEnd {
    int data;
    NodeFormEnd next;

    NodeFormEnd(int new_data){
        data = new_data;
        next = null;
    }
}

public class FindnthNodeFromend {
    static int findNthFormLast(NodeFormEnd head, int N) {
        int len = 0, i;

        NodeFormEnd temp = head;

        while (temp != null) {
            temp = temp.next;
            len++;
        }
        if (len < N) {
            return -1;
        }
            temp = head;

            for (i = 1; i < len - N + 1; i++)
                temp = temp.next;

        return temp.data;
    }
    public static void main(String[] args) {

        NodeFormEnd head = new NodeFormEnd(50);
        head.next = new NodeFormEnd(75);
        head.next.next = new NodeFormEnd(85);
        head.next.next.next = new NodeFormEnd(5);

        System.out.println(findNthFormLast(head, 4));
    }
}
