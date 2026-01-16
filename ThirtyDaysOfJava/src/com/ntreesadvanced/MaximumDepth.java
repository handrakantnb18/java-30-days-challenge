package com.ntreesadvanced;

import java.util.Stack;

class NodeDepth {
    int data;
    NodeDepth left, right;

    NodeDepth(int val) {
        data = val;
        left = null;
        right = null;
    }
}

public class MaximumDepth {
    static int height(NodeDepth root){
        if (root == null)
            return -1;

        int lHeight = height(root.left);
        int rHieght = height(root.right);

        return Math.max(lHeight, rHieght) + 1;
    }

    public static void main(String[] args) {
        NodeDepth root = new NodeDepth(5);
        root.left = new NodeDepth(8);
        root.right = new NodeDepth(10);
        root.left.left = new NodeDepth(20);
        root.left.right = new NodeDepth(35);

        System.out.println(height(root));
    }
}
