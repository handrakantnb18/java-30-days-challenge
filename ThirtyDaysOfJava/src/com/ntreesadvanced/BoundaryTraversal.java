package com.ntreesadvanced;

import java.util.ArrayList;
import java.util.List;

class NodeBoundry {
    int data;
    NodeBoundry left, right;

    NodeBoundry(int value) {
        data = value;
        left = right = null;
    }
}

public class BoundaryTraversal {
    static boolean isLeaf(NodeBoundry node) {
        return node.left == null && node.right == null;
    }

    static void collectLeft(NodeBoundry root, ArrayList<Integer> res) {

        if (root == null || isLeaf(root))
            return;

        res.add(root.data);
        if (root.left != null)
            collectLeft(root.left, res);

        else if (root.right != null)
            collectLeft(root.right, res);
    }

    static void collectLeaves(NodeBoundry root, ArrayList<Integer> res) {
        if (root == null)
            return;

        if (isLeaf(root)) {
            res.add(root.data);
            return;
        }

        collectLeaves(root.left, res);
        collectLeaves(root.right, res);
    }

    static void collectRight(NodeBoundry root, ArrayList<Integer> res) {
        if (root == null || isLeaf(root))
            return;

        if (root.right != null)
            collectRight(root.right, res);

        else if (root.left != null)
            collectRight(root.left, res);

        res.add(root.data);
    }

    static ArrayList<Integer> boundrytraversal(NodeBoundry root) {
        ArrayList<Integer> res = new ArrayList<>();

        if (root == null)
            return res;

        if (!isLeaf(root))
            res.add(root.data);

        collectLeft(root.left, res);

        collectLeaves(root, res);

        collectRight(root.right, res);

        return res;
    }
    public static void main(String[] args) {
        NodeBoundry root = new NodeBoundry(1);
        root.left = new NodeBoundry(2);
        root.right = new NodeBoundry(3);

        root.left.left = new NodeBoundry(4);
        root.left.right = new NodeBoundry(5);

        root.right.left = new NodeBoundry(6);
        root.right.right = new NodeBoundry(7);

        root.left.right.left = new NodeBoundry(8);
        root.left.right.right = new NodeBoundry(9);

        List<Integer> boundry = boundrytraversal(root);

        for (int x : boundry)
            System.out.println(x + " ");
    }
}
