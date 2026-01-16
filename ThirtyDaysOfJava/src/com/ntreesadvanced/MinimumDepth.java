package com.ntreesadvanced;


class NodeMin {
    int data;
    NodeMin left, right;

    public NodeMin(int value) {
        data = value;
        left = right = null;
    }
}

public class MinimumDepth {

    NodeMin root;

    int minimumDepth() {
        return minimumDepth(root);
    }

    int minimumDepth(NodeMin root) {
        if (root == null)
            return 0;

        if (root.left == null && root.right == null)
            return 1;

        if (root.left == null)
            return minimumDepth(root.right) + 1;

        if (root.right == null)
            return minimumDepth(root.left) + 1;

        return Math.min(minimumDepth(root.left),
                minimumDepth(root.right)) + 1;
    }

    public static void main(String[] args) {
        MinimumDepth tree = new MinimumDepth();
        tree.root = new NodeMin(10);
        tree.root.left = new NodeMin(20);
        tree.root.right = new NodeMin(30);
        tree.root.left.left = new NodeMin(40);
        tree.root.left.right = new NodeMin(50);

        System.out.println("The minimum depth of " + "binary tree is : " + tree.minimumDepth());

    }
}
