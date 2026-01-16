package com.ntreesadvanced;


import java.util.ArrayList;
import java.util.List;

class  NodeAncestor {
    int data;
    NodeAncestor left, right;

    NodeAncestor(int value) {
        data = value;
        left = right = null;
    }
}

public class LowestcommonAncestor {
    static  NodeAncestor lca(NodeAncestor root, int num1, int num2) {
        List<NodeAncestor> path1 = new ArrayList<>();
        List<NodeAncestor> path2 = new ArrayList<>();

        if (!findPath(root, path1, num1)  ||
            !findPath(root, path2, num2))
            return null;

        int i;
        for (i =0; i < path1.size() && i< path2.size(); i++) {
            if (path1.get(i) !=path2.get(i))
                return path1.get(i-1);
        }
        return path1.get(i-1);
    }

    static boolean findPath(NodeAncestor root, List<NodeAncestor> path, int n) {
        if (root == null) {
            return false;
        }

        path.add(root);

        if (root.data == n ||
                findPath(root.left, path, n) ||
                findPath(root.right, path, n) ) {
                return true;
            }
        path.remove(path.size() - 1);

        return false;
    }

    public static void main(String[] args) {
        NodeAncestor root = new NodeAncestor(1);
        root = new NodeAncestor(1);
        root.left = new NodeAncestor(2);
        root.right = new NodeAncestor(3);
        root.left.left = new NodeAncestor(4);
        root.left.right = new NodeAncestor(5);
        root.right.left = new NodeAncestor(6);
        root.right.right = new NodeAncestor(7);
        root.right.left.left = new NodeAncestor(8);

        NodeAncestor ans = lca(root, 7, 8);

        System.out.println(ans.data);
    }
}
