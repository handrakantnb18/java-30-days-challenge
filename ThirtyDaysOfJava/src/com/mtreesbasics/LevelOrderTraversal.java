package com.mtreesbasics;

import java.util.ArrayList;

class NodeOrderLevel {
    int data;
    NodeOrderLevel left, right;
    NodeOrderLevel(int value) {
        data = value;
        left = null;
        right = null;
    }
}
public class LevelOrderTraversal {

    void levelOrderRec(NodeOrderLevel root, int level, ArrayList<ArrayList<Integer>> res) {
        if (root == null)
            return;

        if (res.size() <= level)
            res.add(new ArrayList<>());

        res.get(level).add(root.data);

        levelOrderRec(root.left, level + 1, res);
        levelOrderRec(root.right, level + 1, res);
    }

    ArrayList<ArrayList<Integer>> levelOrder(NodeOrderLevel root) {

        ArrayList<ArrayList<Integer>> res = new ArrayList<>();
        levelOrderRec(root, 0, res);
        return res;
    }

    public static void main(String[] args) {
        NodeOrderLevel root = new NodeOrderLevel(5);
        root.left = new NodeOrderLevel(12);
        root.right = new NodeOrderLevel(13);

        root.left.left = new NodeOrderLevel(7);
        root.left.right = new NodeOrderLevel(14);

        root.right.right = new NodeOrderLevel(2);

        root.left.left.left = new NodeOrderLevel(17);
        root.left.left.right = new NodeOrderLevel(23);

        root.left.right.left = new NodeOrderLevel(27);
        root.left.right.right = new NodeOrderLevel(3);

        root.right.right.right = new NodeOrderLevel(8);
        root.right.right.left = new NodeOrderLevel(11);

        LevelOrderTraversal tree = new LevelOrderTraversal();
        ArrayList<ArrayList<Integer>> res = tree.levelOrder(root);

        for (ArrayList<Integer> level : res) {
            for (int val : level) {
                System.out.println(val + " ");
            }
            System.out.println();
        }
    }
}
