
package com.flinkedlist;

class NodeMerge {
    int data;
    NodeMerge next;
    NodeMerge(int data){
        this.data = data;
    }
}

public class MergeTwoSortedLists {

    public static NodeMerge merge(NodeMerge h1, NodeMerge h2) {
        if (h1 == null)
            return h2;
        if (h2 == null)
            return h1;

        if (h1.data < h2.data) {
            h1.next = merge(h1.next, h2);
            return  h1;
        }else {
            h2.next = merge(h1, h2.next);
            return h2;
        }
    }

    public static void printList(NodeMerge node) {
        while (node != null) {
            System.out.println(node.data + " ");
            node = node.next;
        }
    }

    public static void main(String[] args) {

        NodeMerge nodeMerge = new NodeMerge(1);
        nodeMerge.next = new NodeMerge(2);
        nodeMerge.next.next = new NodeMerge(3);

        NodeMerge nodeMerge1 = new NodeMerge(5);
        nodeMerge1.next = new NodeMerge(6);
        nodeMerge1.next.next = new NodeMerge(7);
        nodeMerge1.next.next.next = new NodeMerge(8);

        NodeMerge meargeHead = merge(nodeMerge, nodeMerge1);
        printList(meargeHead);
    }
}
