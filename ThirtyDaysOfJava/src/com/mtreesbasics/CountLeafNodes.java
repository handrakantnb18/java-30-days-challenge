package com.mtreesbasics;

class NodeCountLeaf {
    int data;
    NodeCountLeaf left, right;

    NodeCountLeaf(int value) {
        data = value;
        left = right = null;
    }
}

public class CountLeafNodes {
        public static  int countLeafNodes(NodeCountLeaf root) {
            if (root == null) {
                return 0;
            }
            if (root.left == null && root.right == null) {
                return 1;
            }
            return countLeafNodes(root.left) + countLeafNodes(root.right);
        }
    public static void main(String[] args) {
        NodeCountLeaf root = new NodeCountLeaf(10);
        root.left = new NodeCountLeaf(5);
        root.right = new NodeCountLeaf(20);
        root.left.left = new NodeCountLeaf(3);
        root.left.right = new NodeCountLeaf(7);
        root.right.right = new NodeCountLeaf(30);

        int leafCount = countLeafNodes(root);
        System.out.println("Number of leaf nodes : " +leafCount);
    }
}
