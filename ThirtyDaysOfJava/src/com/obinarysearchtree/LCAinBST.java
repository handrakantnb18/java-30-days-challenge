package com.obinarysearchtree;

class NodeLCA {
    int data;
    NodeLCA right, left;

    NodeLCA(int item) {
        data = item;
        left = right = null;
    }
}

public class LCAinBST {

    static NodeLCA LCA(NodeLCA root, NodeLCA num1, NodeLCA num2) {
        while (root != null)
        {
            if (root.data < num1.data && root.data < num2.data)
                root = root.right;

            else
                break;
        }
        return root;
    }

    public static void main(String[] args) {

        NodeLCA root = new NodeLCA(20);
        root.left = new NodeLCA(8);
        root.right = new NodeLCA(22);
        root.left.left = new NodeLCA(4);
        root.left.right = new NodeLCA(12);
        root.left.right.left = new NodeLCA(10);
        root.left.right.right = new NodeLCA(14);

        NodeLCA num1 = root.left.left;

        NodeLCA num2 = root.left.right.right;

        NodeLCA res = LCA(root, num1, num2);
        System.out.println(res.data);

    }
}
