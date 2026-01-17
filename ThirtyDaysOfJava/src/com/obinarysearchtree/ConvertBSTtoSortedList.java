package com.obinarysearchtree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class NodeSortedList {
    int data;
    NodeSortedList left, right;

    NodeSortedList(int data) {
        this.data = data;
        left = right = null;
    }
}

public class ConvertBSTtoSortedList {
    static int getHeight(NodeSortedList root, int h)
    {
        if (root == null)
            return h - 1;

        return Math.max(getHeight(root.left, h),
                getHeight(root.right, h));
    }

    static void levelOrder(NodeSortedList root)
    {
        Queue<List<Object>> queue = new LinkedList<>();
        queue.offer(List.of(root, 0));

        int lastLevel = 0;

        int height = getHeight(root, 0);

        while (!queue.isEmpty()) {
            List<Object> top = queue.poll();

            NodeSortedList node = (NodeSortedList) top.get(0);
            int lvl = (int) top.get(1);

            if (lvl > lastLevel) {
                System.out.println();
                lastLevel = lvl;
            }
            if (lvl > height)
                break;

            System.out.println((node.data == -1 ? "N" : node.data) + " ");

            if (node.data == -1)
                continue;

            if (node.left == null)
                queue.offer(List.of(new NodeSortedList(-1), lvl + 1));

            else queue.offer(List.of(node.left, lvl + 1));

            if (node.right == null)
                queue.offer(List.of(new NodeSortedList(-1), lvl + 1));

            else queue.offer(List.of(node.right, lvl + 1));

        }
    }

    static void inorder(NodeSortedList root, List<Integer> values)
    {
        if (root == null)
            return;
        inorder(root.left, values);
        values.add(root.data);
        inorder(root.right, values);
    }

    static NodeSortedList buildRightSkewedTree(List<Integer> values)
    {
        NodeSortedList dummy = new NodeSortedList(-1);
        NodeSortedList prev = dummy;

        for (int val : values)
        {
            prev.right = new NodeSortedList(val);
            prev.left = null;
            prev = prev.right;
        }
        return dummy.right;
    }

    static NodeSortedList flattenBST(NodeSortedList root) {
        List<Integer> values = new ArrayList<>();
        inorder(root, values);

        return buildRightSkewedTree(values);
    }

    public static void main(String[] args) {
        NodeSortedList root = new NodeSortedList(5);
        root.left = new NodeSortedList(3);
        root.right = new NodeSortedList(7);
        root.left.left = new NodeSortedList(2);
        root.left.right = new NodeSortedList(4);
        root.right.left = new NodeSortedList(6);
        root.right.right = new NodeSortedList(8);

        NodeSortedList flatRoot = flattenBST(root);
        levelOrder(flatRoot);
    }
}
