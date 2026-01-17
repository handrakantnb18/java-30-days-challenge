package com.obinarysearchtree;

class NodeCeil {
    int data;
    NodeCeil right, left;

    NodeCeil(int item) {
        data = item;
        left = right = null;
    }
}

public class CeilinBST {
    static int findCeil(NodeCeil root, int input) {

        if (root == null) {
            return -1;
        }
        if (root.data == input){
            return root.data;
        }

        if (root.data < input) {
            return findCeil(root.right, input);
        }

        int ceil = findCeil(root.left, input);
        return (ceil >= input) ? ceil : root.data;
    }

    public static void main(String[] args) {
        NodeCeil root = new NodeCeil(8);
        root.left = new NodeCeil(4);
        root.right = new NodeCeil(12);
        root.left.left = new NodeCeil(2);
        root.left.right = new NodeCeil(6);
        root.right.left = new NodeCeil(10);
        root.right.right = new NodeCeil(14);

        for (int i = 0; i < 16; i++) {
            System.out.println(i + " " + findCeil(root, i));
        }
    }
}
