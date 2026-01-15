package com.mtreesbasics;

class NodeHTree {
    int data;
    NodeHTree left, right;

    NodeHTree(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class HeightofTree {

    static int height (NodeHTree root) {
        if (root == null)
            return -1;

        int lHeight = height(root.left);
        int rHeight = height(root.right);

        return Math.max(lHeight, rHeight) + 1;
    }
    public static void main(String[] args) {
        NodeHTree root = new NodeHTree(12);
        root.left = new NodeHTree(8);
        root.right = new NodeHTree(18);
        root.left.left = new NodeHTree(5);
        root.left.right = new NodeHTree(11);

        System.out.println(height(root));
    }
}
