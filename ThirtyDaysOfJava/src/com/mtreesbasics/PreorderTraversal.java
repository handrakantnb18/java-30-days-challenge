package com.mtreesbasics;

import java.util.ArrayList;

class NodePreorder {
    int data;
    NodePreorder left, right;

    NodePreorder(int v) {
        data = v;
        left = right = null;
    }
}

public class PreorderTraversal {

    public static void preOrder(NodePreorder node, ArrayList<Integer> res) {
        if (node == null)
            return;

        res.add(node.data);
        preOrder(node.left, res);

        preOrder(node.right, res);
    }
    public static void main(String[] args) {
        NodePreorder root = new NodePreorder(1);
        root.left = new NodePreorder(2);
        root.right = new NodePreorder(3);
        root.left.left = new NodePreorder(4);
        root.left.right = new NodePreorder(5);
        root.right.right = new NodePreorder(6);

        ArrayList<Integer> result = new ArrayList<>();
        preOrder(root, result);

        for (int val : result) {
            System.out.println(val + " ");
        }
    }
}
