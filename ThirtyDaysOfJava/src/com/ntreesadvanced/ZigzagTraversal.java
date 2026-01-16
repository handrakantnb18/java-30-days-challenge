package com.ntreesadvanced;

import java.util.ArrayList;

class NodeZigZig {
    int data;
    NodeZigZig left, right;

    public NodeZigZig(int value) {
        data = value;
        left = right = null;
    }
}

public class ZigzagTraversal {

    static int treeHeight(NodeZigZig root) {
        if (root == null)
            return 0;

        int lHeight = treeHeight(root.left);
        int rHieght = treeHeight(root.right);
        return Math.max(lHeight, rHieght);
    }

    static void leftReightTrev(NodeZigZig root, int level, ArrayList<Integer> res) {
        if (root == null)
            return;

        if (level == 1) {
            res.add(root.data);
        }else
        {
            leftReightTrev(root.left, level - 1, res);
            leftReightTrev(root.right, level - 1, res);
        }
    }

    static void rightToLeftTrav(NodeZigZig root, int level, ArrayList<Integer> res) {
        if (root == null)
            return;

        if (level == 1) {
            res.add(root.data);
        }else
        {
            rightToLeftTrav(root.right, level - 1, res);
            rightToLeftTrav(root.left, level - 1, res);
        }
    }

    static ArrayList<Integer> zigZigTraversal(NodeZigZig root) {
        ArrayList<Integer> res = new ArrayList<>();
        boolean leftToRight = true;

        int height = treeHeight(root);

        for (int i = 1; i <= height; i++) {
            if (leftToRight)
                leftReightTrev(root, i, res);
            else
                rightToLeftTrav(root, i, res);

            leftToRight = !leftToRight;
        }
        return res;
    }

    public static void main(String[] args) {
        NodeZigZig zig = new NodeZigZig(10);
        zig.left = new NodeZigZig(5);
        zig.right = new NodeZigZig(20);
        zig.right.right = new NodeZigZig(25);
        zig.left.left = new NodeZigZig(35);
        zig.left.right = new NodeZigZig(30);
        zig.left.right.left = new NodeZigZig(50);
        zig.left.right.right = new NodeZigZig(55);

        ArrayList<Integer> res = zigZigTraversal(zig);
        for (int i : res) {
            System.out.println(i + " ");
        }
        System.out.println();
    }
}
