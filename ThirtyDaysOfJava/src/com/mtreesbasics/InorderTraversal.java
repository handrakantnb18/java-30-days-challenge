package com.mtreesbasics;

import java.util.ArrayList;

class NodeInorder {
    int data;
    NodeInorder left;
    NodeInorder right;

    NodeInorder(int x) {
        data = x;
        left = right = null;
    }
}

public class InorderTraversal {

    static void inOrder(NodeInorder node, ArrayList<Integer> res) {
        if (node == null)
            return;

        inOrder(node.left, res);

        res.add(node.data);

        inOrder(node.right, res);
    }

    public static void main(String[] args) {

        NodeInorder nio = new NodeInorder(1);
        nio.left = new NodeInorder(2);
        nio.right = new NodeInorder(3);
        nio.left.left = new NodeInorder(4);
        nio.left.right = new NodeInorder(5);
        nio.right.right = new NodeInorder(6);

        ArrayList<Integer> res = new ArrayList<>();
        inOrder(nio, res);

        for (int node : res)
            System.out.println(node + " ");
    }
}
