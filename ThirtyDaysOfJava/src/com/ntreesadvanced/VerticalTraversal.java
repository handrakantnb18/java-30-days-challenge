package com.ntreesadvanced;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Objects;
import java.util.Queue;

class NodeTrav {
    int data;
    NodeTrav left, right;

    NodeTrav(int value) {
        data = value;
        left = null;
        right = null;
    }
}

public class VerticalTraversal {

    static void findMaxMin(NodeTrav node, int[] min, int[] max, int num)
    {
        if (node == null)
            return;

        if (num < min[0])
            min[0] = num;
        else if (num > max[0])
            max[0] = num;

        findMaxMin(node.left, min, max, num - 1);
        findMaxMin(node.right, min, max, num + 1);
    }

    static void collectVerticalLin(NodeTrav root, int dist,
                                   ArrayList<Integer> line) {
        int num = 0;
        Queue<ArrayList<Object>> queue = new LinkedList<>();
        ArrayList<Object> first = new ArrayList<>();
        first.add(root);
        first.add(num);
        queue.add(first);

        while (!queue.isEmpty()) {
            ArrayList<Object> curr = queue.poll();
            NodeTrav node = (NodeTrav) curr.get(0);
            num = (int) curr.get(1);

            if (num == dist)
                line.add(node.data);

            if (node.left != null) {
                ArrayList<Object> leftNode = new ArrayList<>();
                leftNode.add(node.left);
                leftNode.add(num - 1);
                queue.add(leftNode);
            }

            if (node.right != null) {
                ArrayList<Object> rightNode = new ArrayList<>();
                rightNode.add(node.right);
                rightNode.add(num + 1);
                queue.add(rightNode);
            }
        }
    }

    static ArrayList<ArrayList<Integer>> verticalOrder(NodeTrav root) {
        ArrayList<ArrayList<Integer>> res = new ArrayList<>();

        int[] min = {0},
                max = {0};
        findMaxMin(root, min, max, 0);

        for (int line = min[0]; line <= max[0]; line++) {
            ArrayList<Integer> verticlaNodes = new ArrayList<>();
            collectVerticalLin(root, line, verticlaNodes);
            res.add(verticlaNodes);
        }
        return res;
    }

    public static void main(String[] args) {
        NodeTrav node = new NodeTrav(55);
        node.left = new NodeTrav(2);
        node.right = new NodeTrav(7);
        node.left.left = new NodeTrav(12);
        node.left.right = new NodeTrav(78);
        node.right.left = new NodeTrav(93);
        node.right.right = new NodeTrav(45);
        node.left.right.right = new NodeTrav(25);
        node.right.left.right = new NodeTrav(9);
        node.right.right.right = new NodeTrav(99);
        node.left.right.right.left = new NodeTrav(18);

        ArrayList<ArrayList<Integer>> res = verticalOrder(node);

        System.out.print("[ ");
        for (int i = 0; i < res.size(); i++) {
            System.out.print("[ ");
            ArrayList<Integer> line = res.get(i);
            for (int j = 0; j < line.size(); j++) {
                System.out.print(line.get(j));

                if (j != line.size() - 1)
                    System.out.print(" , ");
            }
            System.out.print(" ] ");

            if (i != res.size() - 1)
                System.out.println(" , ");
        }
        System.out.print(" ] ");
    }
}
