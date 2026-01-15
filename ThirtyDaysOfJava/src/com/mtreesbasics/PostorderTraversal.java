package com.mtreesbasics;

import java.util.ArrayList;

class NodePostOrder {
    int data;
    NodePostOrder left;
    NodePostOrder right;

    NodePostOrder(int v) {
        data = v;
        left = null;
        right = null;
    }
}

public class PostorderTraversal {

    static void postOrder(NodePostOrder node, ArrayList<Integer> res) {
        if (node == null)
            return;

        postOrder(node.left, res);

        postOrder(node.right, res);
        res.add(node.data);
    }
    public static void main(String[] args) {
        NodePostOrder root = new NodePostOrder(1);
        root.left = new NodePostOrder(2);
        root.right = new NodePostOrder(3);
        root.left.left = new NodePostOrder(4);
        root.left.right = new NodePostOrder(5);
        root.right.right = new NodePostOrder(6);

        ArrayList<Integer> result = new ArrayList<>();
        postOrder(root, result);

        for (int val : result)
            System.out.println(val + " ");
    }
}
