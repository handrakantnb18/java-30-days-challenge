package com.zadextrapractice;

import java.util.*;

class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = null;
        right = null;
    }
}
public class SerializeDeserializeTree {
    static ArrayList<Integer> serialize(Node root) {
        ArrayList<Integer> arr = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (curr == null) {
                arr.add(-1);
                continue;
            }

            arr.add(curr.data);
            q.add(curr.left);
            q.add(curr.right);
        }
        return arr;
    }

    static Node deSerialize(ArrayList<Integer> arr) {
        if (arr.get(0) == -1) return null;
        Node root = new Node(arr.get(0));
        Queue<Node> q = new LinkedList<>();
        q.add(root);

        int i = 1;
        while (!q.isEmpty()) {
            Node curr = q.poll();

            if (arr.get(i) != -1) {
                Node left = new Node(arr.get(i));
                curr.left = left;
                q.add(left);
            }
            i++;

            if (arr.get(i) != -1) {
                Node right = new Node(arr.get(i));
                curr.right = right;
                q.add(right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        root.left = new Node(20);
        root.right = new Node(30);
        root.left.left = new Node(40);
        root.left.right = new Node(60);

        ArrayList<Integer> arr = serialize(root);
        Node res = deSerialize(arr);
        System.out.println(res);
    }

}
