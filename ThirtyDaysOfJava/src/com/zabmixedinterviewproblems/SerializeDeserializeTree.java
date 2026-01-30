package com.zabmixedinterviewproblems;

import java.util.ArrayList;

class NodeSerialize {
    int data;
    NodeSerialize left, right;

    NodeSerialize(int x) {
        data = x;
        left = null;
        right = null;
    }
}

public class SerializeDeserializeTree {
    static void serilizablePreOrder(NodeSerialize root, ArrayList<Integer> arr) {

        if (root == null) {
            arr.add(-1);
            return;
        }
        arr.add(root.data);
        serilizablePreOrder(root.left, arr);
        serilizablePreOrder(root.right, arr);
    }

    static ArrayList<Integer> serialize(NodeSerialize root) {
        ArrayList<Integer> arr = new ArrayList<>();
        serilizablePreOrder(root, arr);
        return arr;
    }

    static NodeSerialize deserializePreOrder(int[] i, ArrayList<Integer> arr) {
        if (arr.get(i[0]) == -1) {
            i[0]++;
            return null;
        }

        NodeSerialize root = new NodeSerialize(arr.get(i[0]));
        i[0]++;

        root.left = deserializePreOrder(i, arr);
        root.right = deserializePreOrder(i, arr);

        return root;
    }

    static NodeSerialize deSerialize(ArrayList<Integer> arr) {
        int[] i = {0};
        return deserializePreOrder(i, arr);
    }

    public static void main(String[] args) {
        NodeSerialize root = new NodeSerialize(10);
        root.left = new NodeSerialize(20);
        root.right = new NodeSerialize(30);
        root.left.left = new NodeSerialize(40);
        root.left.right = new NodeSerialize(50);

        ArrayList<Integer> arr = serialize(root);
        NodeSerialize res = deSerialize(arr);
        System.out.println(res);
    }

}
