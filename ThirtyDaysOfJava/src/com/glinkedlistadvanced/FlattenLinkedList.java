package com.glinkedlistadvanced;

public class FlattenLinkedList {

    NodeF head;

    class NodeF {
        int data;
        NodeF right, down;
        NodeF(int data){
            this.data = data;
            right = null;
            down =null;
        }
    }
    NodeF merge(NodeF a, NodeF b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        NodeF result;

        if (a.data < b.data){
            result = a;
            result.down = merge(a.down, b);
        }else  {
            result = b;
            result.down = merge(a, b.down);
        }
        result.right = null;
        return result;
    }

    NodeF flatten(NodeF root) {
        if (root == null || root.right == null)
            return root;
        root.right = flatten(root.right);

        root = merge(root, root.right);

        return root;
    }

    NodeF push(NodeF head_ref, int data) {
        NodeF new_node = new NodeF(data);

        new_node.down = head_ref;
        head_ref = new_node;
        return head_ref;
    }
    void printList() {
        NodeF temp = head;
        while (temp != null) {
            System.out.println(temp.data + " ");
            temp = temp.down;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        FlattenLinkedList fl = new FlattenLinkedList();
        fl.head = fl.push(fl.head, 30);
        fl.head = fl.push(fl.head, 35);
        fl.head = fl.push(fl.head, 40);

        fl.head.right = fl.push(fl.head, 20);
        fl.head.right = fl.push(fl.head.right, 25);
        fl.head.right = fl.push(fl.head.right.right, 45);
        fl.head.right = fl.push(fl.head.right.right, 55);

        fl.head = fl.flatten(fl.head);

        fl.printList();
    }
}
