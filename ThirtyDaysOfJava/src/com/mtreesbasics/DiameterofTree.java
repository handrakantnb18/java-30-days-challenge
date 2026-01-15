package com.mtreesbasics;

class NodeDiameter {
    int data;
    NodeDiameter left, right;

    NodeDiameter(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class DiameterofTree {
    static int height(NodeDiameter root) {
        if (root == null)
            return 0;

        return 1 + Math.max(height(root.left) ,height(root.right));
    }

    static int diameter(NodeDiameter root) {
        if (root == null)
            return 0;

        int lheight = height(root.left);
        int rheight = height(root.right);

        int ldiameter = diameter(root.left);
        int rdiameter = diameter(root.right);

        return Math.max(lheight + rheight, Math.max(ldiameter, rdiameter));
    }
    public static void main(String[] args) {
        NodeDiameter root = new NodeDiameter(5);
        root.left = new NodeDiameter(8);
        root.right = new NodeDiameter(6);
        root.left.left = new NodeDiameter(3);
        root.left.right = new NodeDiameter(7);
        root.right.left = new NodeDiameter(9);

        System.out.println(diameter(root));
    }
}
